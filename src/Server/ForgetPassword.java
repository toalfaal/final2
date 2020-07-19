//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Server;

import Logic.DataBase;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgetPassword extends HttpServlet {
    static String code;
    static String id;

    public ForgetPassword() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("ForgetPassword.jsp");
        code = (String)request.getAttribute("serverCode");
        id = (String)request.getAttribute("id");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String clientCode = request.getParameter("code");
        String serverCode = code;
        String newPassword = request.getParameter("newPassword");
        String confirmNewPassword = request.getParameter("confirmNewPassword");
        String id = ForgetPassword.id;
        if (serverCode != null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("ForgetPassword.jsp");
            request.setAttribute("serverCode", serverCode);
            if (clientCode != null && clientCode.length() > 0) {
                if (newPassword != null && newPassword.length() > 0) {
                    if (!newPassword.equals(confirmNewPassword)) {
                        request.setAttribute("alert", "رمز عبور و تکرار مطبقت ندارد.");
                    } else if (serverCode.equals(clientCode)) {
                        if (newPassword.length() < 6) {
                            request.setAttribute("alert", "رمز عبور حداقل 6 کاراکتر باشد.");
                        } else {
                            DataBase dataBase = new DataBase();
                            dataBase.changePassword(id, newPassword);
                            request.setAttribute("alert", "رمز عبور تغییر یافت.");
                        }
                    } else {
                        request.setAttribute("alert", "کد پامک شده مغتبر نیست");
                    }
                } else {
                    request.setAttribute("alert", "رمز عبور جدید را وارد کنید.");
                }
            } else {
                System.out.println("we havent fucking client-code");
                request.setAttribute("alert", "کد تایید را وارد کنید.");
            }

            dispatcher.forward(request, response);
        }

    }
}
