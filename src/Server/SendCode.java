package Server;

import Extras.CodeGenerator;
import Extras.SMS;
import Logic.DataBase;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SendCode extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("id");
        String phoneNumber = new DataBase().getPhoneNumber(username);
        SMS sms = new SMS(phoneNumber);
        CodeGenerator codeGenerator = new CodeGenerator(4);
        String serverCode= codeGenerator.getCode();
        sms.sendCode(serverCode);
        ForgetPassword forgetPassword = new ForgetPassword();
        request.setAttribute("serverCode", serverCode);
        request.setAttribute("id",username);
        forgetPassword.doGet(request,response);
    }
}