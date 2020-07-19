//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestManager extends HttpServlet {
    public RequestManager() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String syntax = request.getParameter("syntax");
        String id = request.getParameter("id");
        String adminID = this.getServletConfig().getInitParameter("admin");
        System.out.println("adminID = " + adminID);
        System.out.println("id = " + id);
        System.out.println("syntax = " + syntax);
        if (id != null) {
            if (id.equals(adminID)) {
                request.setAttribute("syntax", syntax);
                request.setAttribute("id", id);
                ManagerPageServer managerPageServer = new ManagerPageServer();
                managerPageServer.doPost(request, response);
            } else {
                request.setAttribute("syntax", syntax);
                request.setAttribute("id", id);
                ClientPageServer clientPageServer = new ClientPageServer();
                clientPageServer.doPost(request, response);
            }
        }

    }

}
