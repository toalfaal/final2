//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Server;

import Logic.Entrance;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    public Login() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage.jsp");
        request.setAttribute("status", "null");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usernameForgetPassword = request.getParameter("usernameForgetPassword");
        if (username != null) {
            Entrance entrance = new Entrance(username, password);
            RequestDispatcher dispatcher = null;
            if (entrance.isClient()) {
                request.setAttribute("syntax", 1);
            } else {
                String status = String.valueOf(entrance.login());
                request.setAttribute("status", status);
                ((RequestDispatcher)dispatcher).forward(request, response);
                System.out.println("try to login");
            }
        } else if (usernameForgetPassword != null) {
            System.out.println("try to send code");
            RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage.jsp");
            request.setAttribute("syntax", "forgetPass");
            dispatcher.forward(request, response);
        }

    }
}
