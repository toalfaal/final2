package Server;

import Logic.DataBase;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.StringJoiner;

public class AttendingSystem extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {
        String cardID = request.getParameter("cardID");
        String time = request.getParameter("time");
        response.setContentType("application/json; charset=UTF-8");


        DataBase dataBase = new DataBase();
        String id = dataBase.getID(cardID);
        String fullName = dataBase.getFullName(id);
        String picturePath = dataBase.getPicturePath(id);

        System.out.println("client: "+fullName+"  id: "+id);

        StringJoiner joiner = new StringJoiner("@","@","")
                .add("fullName").add(fullName)
                .add("id").add(id)
                .add("picturePath").add(picturePath);


        PrintWriter writer = response.getWriter();
        writer.println(joiner.toString());
        writer.close();


    }
}
