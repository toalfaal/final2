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
        System.out.println("Login.doGet");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        String usernameForgetPassword = request.getParameter("usernameForgetPassword");
        System.out.println("Login.doPost");
        if (username != null) {
            Entrance entrance = new Entrance(username, password);

            boolean status  = entrance.login();
            if (status){
           RequestManager requestManager = new RequestManager();
           request.setAttribute("id",username);
           requestManager.doGet(request, response);
            }else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage.jsp");
                request.setAttribute("status", "false");
                dispatcher.forward(request, response);
            }

        }
//        else if (usernameForgetPassword != null) {
//            RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage.jsp");
//            request.setAttribute("syntax", "forgetPass");
//            dispatcher.forward(request, response);
//        }

    }
}
