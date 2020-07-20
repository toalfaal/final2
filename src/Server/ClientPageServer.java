package Server;

import AccountingSystem.Employee;
import AccountingSystem.LegalReceipt;
import DataBase.DataBaseHelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

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
        Employee employee =null;
//        try {
//            employee = new DataBaseHelper().readFromTableForEmployeeByEmployeeIDNumber(id);
//        } catch (SQLException e) {
//            System.out.println("ClientPageServer.doPost");
//            e.printStackTrace();
//        }
        switch (syntax){
            case "loadPersonalInfo":
                 dispatcher= request.getRequestDispatcher("ClientPersonalInfo.jsp");
                //loadData and pass into attribute
//                request.setAttribute("data",employee);
                dispatcher.forward(request, response);
                break;
            case "loadLegalReceipt": dispatcher= request.getRequestDispatcher("ClientLegalReceipt.jsp");
                //loadData and pass into attribute
//                LegalReceipt legalReceipt=null;
//                try {
//                    assert employee != null:"employee null point";
//                    legalReceipt = new DataBaseHelper().readTableLegalReceipt(employee.getEmployeeSerialCode());
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                request.setAttribute("data",legalReceipt);
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