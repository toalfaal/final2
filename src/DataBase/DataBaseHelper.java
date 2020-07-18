import java.sql.*;

public class DataBaseHelper {
    public DataBaseHelper {
        private Connection con;
        private statement stt;
        private String url = "jdbc:mysql://localhost/3306/";
        private String username = "root";
        private String password = "";
    }

    public static void getConnection() {
        Class.forName.getConnection("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url, username, password);

        stt = con.ceateStatement();
        stt.execute("CREATE DATABASE IF NOT EXISTS 2alfagp");
        stt.execute("USE 2alfagp");
    }

    public static void createTableForEmployee() {

        stt.execute("DROP TABLE IF EXISTS Employee");
        stt.execute("CREATE TABLE people (id BIGINT NOT NULL AUTO_INCREMENT , fName, lName, eFName, eLName," +
                " idNumber, cellphoneNumber, homeNumber, employmentYear, employmentMonth, employmentDay, employmentIDNumber, childCount," +
                "maritalStatus BOOLEAN, categoryNameP, categoryNameE, postNameP, postNameE, employeeSerialCode, jobCategorySerialCode)");
    }

    public static void writeToTableForEmployee() {
        stt.execute("INSERT INTO Employee (id BIGINT NOT NULL AUTO_INCREMENT , fName, lName, eFName, eLName," +
                "idNumber, cellphoneNumber, homeNumber, employmentYear, employmentMonth, employmentDay, employmentIDNumber, childCount" +
                " maritalStatus BOOLEAN, categoryNameP, categoryNameE, postNameP, postNameE, employeeSerialCode, jobCategorySerialCode) VALUES ...")
                //nages
    }

    public static void readFromTableForEmployee(){
        ResultSet res = stt.executeQuery("SELECT * FROM people WHERE fName = '...'");

        while(res.next()){
            System.out.println(res.getString("fName") + "  " + res.getInt("id"));
            //...
            //nages
        }
    }


    public static void main(String[] args) {

    }
}