package Server;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClientPageServer extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = (String) request.getAttribute("id");
        String syntax = (String) request.getAttribute("syntax");
        request.setAttribute("id",id);
        System.out.println("ClientPageServer.doPost");
        System.out.println("syntax = " + syntax);
        RequestDispatcher dispatcher;
        switch (syntax){
            case "loadPersonalInfo":
                 dispatcher= request.getRequestDispatcher("ClientPersonalInfo.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
                break;
            case "loadLegalReceipt": dispatcher= request.getRequestDispatcher("ClientLegalReceipt.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
                break;
            case "loadScheduleTime": dispatcher= request.getRequestDispatcher("ClientScheduleTime.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
                break;
            case "exit":
                response.sendRedirect("welcome");
                break;
            default: dispatcher= request.getRequestDispatcher("ClientMain.jsp");
                //loadData and pass into attribute
                dispatcher.forward(request, response);
        }
    }
}