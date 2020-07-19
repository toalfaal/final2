package Server;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ManagerPageServer extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String syntax= request.getParameter("syntax");
        String id = request.getParameter("");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = (String) request.getAttribute("id");
        String syntax = (String) request.getAttribute("syntax");
        request.setAttribute("id",id);
        RequestDispatcher dispatcher;
        switch (syntax){
            case "loadDefine":
                dispatcher= request.getRequestDispatcher("ManagerDefine.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
                break;
            case "loadChange": dispatcher= request.getRequestDispatcher("ManagerChange.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
                break;
            case "loadAttend": dispatcher= request.getRequestDispatcher("ManagerAttend.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
                break;
            case "exit":
                response.sendRedirect("welcome");
                break;
            default: dispatcher= request.getRequestDispatcher("ManagerMain.jsp");
                dispatcher.forward(request, response);
        }
    }
}
