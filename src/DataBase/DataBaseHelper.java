import java.sql.*;

public class DataBaseHelper{
    public DataBaseHelper{
    private Connection con;
    private statement stt;
    private String url;
    private String username = "root";
    private String password = "";
    }

    public static void getConnection(){
        Class.forName.getConnection("jdbc:mysql://localhost/3306/");
        con = DriverManager

    }


    public static void main(String[] args){

    }
}