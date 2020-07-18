package DataBase;

import java.sql.*;

public class DataBaseHelper {

    private Connection con;
    private Statement stt;
    private String url = "jdbc:mysql://localhost/3306/";
    private String username = "root";
    private String password = "";

    public DataBaseHelper() {
        try {
            getConnection();
            createTableForEmployee();
            writeToTableForEmployee();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url, username, password);

        stt = con.createStatement();
        stt.execute("CREATE DATABASE IF NOT EXISTS 2alfagp");
        stt.execute("USE 2alfagp");
    }

    public void createTableForEmployee() throws SQLException {

        stt.execute("DROP TABLE IF EXISTS Employee");
        stt.execute("CREATE TABLE Employee (id BIGINT NOT NULL AUTO_INCREMENT , fName, lName, eFName, eLName," +
                " idNumber, cellphoneNumber, homeNumber, employmentYear, employmentMonth, employmentDay, employmentIDNumber, childCount," +
                "maritalStatus BOOLEAN, categoryNameP, categoryNameE, postNameP, postNameE, employeeSerialCode, jobCategorySerialCode, PRIMARY KEY(id))");
    }

    public void writeToTableForEmployee() throws SQLException {
        stt.execute("INSERT INTO Employee (fName, lName, eFName, eLName," +
                "idNumber, cellphoneNumber, homeNumber, employmentYear, employmentMonth, employmentDay, employmentIDNumber, childCount" +
                " maritalStatus BOOLEAN, categoryNameP, categoryNameE, postNameP, postNameE, employeeSerialCode, jobCategorySerialCode) VALUES ...");
        //nages
    }

    public void readFromTableForEmployee(String serialNumber) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM Employee WHERE employeeSerialCode = serialNumber");

        while (res.next()) {
            String namePersian = ("name persian//" + res.getString("fName"));
            String lastNamePersian = "lastname persian//" + res.getString("lName");
            String nameEnglish = "name english//" + res.getString("eFName");
            String lastNameEnglish = "lastname english//" + res.getString("eLName");
            String idNumber = "id number//" + res.getString("idNumber");
            String cellphoneNumber ="cellphone number//" + res.getString("cellphoneNumber");
            String homeNumber = "home number//" + res.getString("homeNumber");
            String employmentYear = "employment year//" + res.getInt("employmentYear");
            String employmentMonth = "employment Month//" + res.getInt("employmentMonth");
            String employmentDay = "employment day//" + res.getInt("employmentDay");
            String employmentIDNumbe = "employment id number//" + res.getLong("employmentIDNumbe");
            String childCount = "child count//" + res.getInt("childCount");
            String maritalStatus = "marital status//" + res.getBoolean("maritalStatus");
            String categoryNamePersian = "category Name Persian//" + res.getString("categoryNameP");
            String categoryNameEnglish = "category Name english//" + res.getString("categoryNameE");
            String postNamePersian = "post name persian//" + res.getString("postNameP");
            String postNameEnglish = "post name english//" + res.getString("postNameE");
            String employeeSerialCode = "employee serial code//" + res.getString("employeeSerialCode");
            String jobCategorySerialCode = "job vategory serial code//" + res.getString("jobCategorySerialCode");



        }
    }

    public void createTableJobCategory() throws SQLException {
        stt.execute("DROP TABLE IF EXISTS jobCategory");
        stt.execute("CREATE TABLE jobCategory (id BIGINT, categoryNamePersian, categoryNameEnglish, postNamePersian, postNameEnglish, jobCategorySerialCode, PRIMARY KEY(id)");
    }

    public void writeToTableJobCategory() throws SQLException {
        stt.execute("INSERT INTO jobCategory (categoryNamePersian, categoryNameEnglish, postNamePersian, postNameEnglish, jobCategorySerialCode)" +
                "VALUES ... ");
        //NAGES
    }

    public void readFromTableJobCategory(String serialNumber) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM TableJobCategory WHERE jobCategorySerialCode = serialNumber");

        while (res.next()) {

            String categoryNamePersian = res.getString("categoryNamePersian");
            String categoryNameEnglish = ("categoryNameEnglish");
            String postNamePersian = ("postNamePersian");
            String postNameEnglish = ("postNameEnglish");
            String JobCategorySerialCode = ("jobCategorySerialCode");
        }
    }



    public void CreateTableLegalReceipt() throws SQLException {
        stt.execute("DROP TABLE IF EXIST LegalReceipt");
        stt.execute("CREATE TABLE LegalReceipt (id BIGINT, BaseAmount, childAmount, maritalStatusAmount, workExperienceAmount, eextraWorkTimeAmount, totalAdditions, " +
                "totalDeductions, finalSalary,taxAmount, insuranceAmount, legalReceiptSerialCode, PRIMARY KEY(id))");
    }

    public void writeToTableLegalReceipt() throws SQLException {
        stt.execute("INSERT INTO LegalReceipt (BaseAmount, childAmount, maritalStatusAmount, workExperienceAmount, extraWorkTimeAmount," +
                " totalAdditions,totalDeductions, finalSalary,taxAmount, insuranceAmount, legalReceiptSerialCode) VALUES...");
    }

    public void readTableLegalReceipt(String serialNumber) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM LegalReceipt WHERE legalReceiptSerialCode = serialNumber");

        while (res.next()) {

            double BaseAmount = res.getDouble("BaseAmount");
            double childAmount = res.getDouble("childAmount");
            double maritalStatusAmount = res.getDouble("maritalStatusAmount");
            double workExperienceAmount = res.getDouble("workExperienceAmount");
            double extraWorkTimeAmount = res.getDouble("extraWorkTimeAmount");
            double totalAdditions = res.getDouble("totalAdditions");
            double totalDeductions = res.getDouble("totalDeductions");
            double finalSalary = res.getDouble("finalSalary");
            double taxAmount = res.getDouble("taxAmount");
            double insuranceAmount = res.getDouble("insuranceAmount");
            String legalReceiptSerialCode = res.getString("legalReceiptSerialCode");
        }
    }

    public void createTablePayRate() throws SQLException {
        stt.execute("DROP TABLE IF EXIST PayRate");
        stt.execute("CREATE TABLE PayRate(id BIGINT, BaseRate, childRate, maritalStatusRate, workExperienceRate," +
                " extraWorkTimeRate, taxRate, insuranceRate, payRateSerialCode, PRIMARY KEY(id))");
    }

    public void writeToTablePayRate() throws SQLException {
        stt.execute("INSERT INTO PayRate (BaseRate, childRate, maritalStatusRate, workExperienceRate," +
                "extraWorkTimeRate, taxRate, insuranceRate, payRateSerialCode) VALUES ...");
    }

    public void readFromTablePayRate(String serialNumber) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM PayRate WHERE payRateSerialCode = serialNumber");

        double BaseRate = res.getDouble("BaseRate");
        double childRate = res.getDouble("childRate");
        double maritalStatusRate = res.getDouble("maritalStatusRate");
        double WorkExperienceRate = res.getDouble("workExperienceRate");
        double extraWorkTimeRate = res.getDouble("extraWorkTimeRate");
        double taxRate = res.getDouble("taxRate");
        double insuranceRate = res.getDouble("insuranceRate");
        String payRateSerialCode = res.getString("payRateSerialCode");
    }

    public static void main(String[] args) {

        new DataBaseHelper();

    }
}