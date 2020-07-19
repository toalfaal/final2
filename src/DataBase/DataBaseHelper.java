package DataBase;

import AccountingSystem.DataBaseTransfer;
import AccountingSystem.Employee;
import AccountingSystem.JobCategory;
import AccountingSystem.LegalReceipt;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseHelper {

    private Connection con;
    private Statement stt;
    private String url = "jdbc:mysql://localhost/3306/";
    private String username = "root";
    private String password = "";
    private String[] array;

    public DataBaseHelper() {
        try {
            getConnection();
            createTableForEmployee();
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
                "maritalStatus BOOLEAN, categoryNameP, categoryNameE, postNameP, postNameE, employeeSerialCode, jobCategorySerialCode, cardNumber, PRIMARY KEY(id))");
    }


    public void writeToTableForEmployee(String[] emp) throws SQLException {
        stt.execute("INSERT INTO Employee (fName, lName, eFName, eLName," +
                "idNumber, cellphoneNumber, homeNumber, employmentYear, employmentMonth, employmentDay, employmentIDNumber, childCount" +
                " maritalStatus BOOLEAN, categoryNameP, categoryNameE, postNameP, postNameE, employeeSerialCode, jobCategorySerialCode, cardNumber)" +
                " VALUES (emp[0],emp[1],emp[2],emp[3],emp[4],emp[5],emp[6],emp[7],emp[8],emp[9],emp[10],emp[11],emp[12],emp[13],emp[14],emp[15]" +
                ",emp[16],emp[17],emp[18],emp[19])");
    }


    public Employee readFromTableForEmployeeByPN(String PFName, String PLName) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM Employee WHERE (fName = PFName && lName = PLName)");

        while (res.next()) {
            array = new String[19];
            array[0] = res.getString("fName");
            array[1] = res.getString("lName");
            array[2] = res.getString("eFName");
            array[3] = res.getString("eLName");
            array[4] = res.getString("idNumber");
            array[5] = res.getString("cellphoneNumber");
            array[6] = res.getString("homeNumber");
            array[7] = res.getString("employmentYear");
            array[8] = res.getString("employmentMonth");
            array[9] = res.getString("employmentDay");
            array[10] = res.getString("employmentIDNumber");
            array[11] = res.getString("childCount");
            array[12] = res.getString("maritalStatus");
            array[13] = res.getString("categoryNameP");
            array[14] = res.getString("categoryNameE");
            array[15] = res.getString("postNameP");
            array[16] = res.getString("postNameE");
            array[17] = res.getString("employeeSerialCode");
            array[18] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadEmployee(array);
    }

    public Employee readFromTableForEmployeeByEN(String EFName, String ELName) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM Employee WHERE (eFName = EFName && eLName = ELNAme)");

        while (res.next()) {
            array = new String[19];
            array[0] = res.getString("fName");
            array[1] = res.getString("lName");
            array[2] = res.getString("eFName");
            array[3] = res.getString("eLName");
            array[4] = res.getString("idNumber");
            array[5] = res.getString("cellphoneNumber");
            array[6] = res.getString("homeNumber");
            array[7] = res.getString("employmentYear");
            array[8] = res.getString("employmentMonth");
            array[9] = res.getString("employmentDay");
            array[10] = res.getString("employmentIDNumber");
            array[11] = res.getString("childCount");
            array[12] = res.getString("maritalStatus");
            array[13] = res.getString("categoryNameP");
            array[14] = res.getString("categoryNameE");
            array[15] = res.getString("postNameP");
            array[16] = res.getString("postNameE");
            array[17] = res.getString("employeeSerialCode");
            array[18] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadEmployee(array);
    }

    public Employee readFromTableForEmployeeByEmployeeIDNumber(String employeeIDNumber) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM Employee WHERE employmentIDNumber = employeeIDNumber");

        while (res.next()) {
            array = new String[19];
            array[0] = res.getString("fName");
            array[1] = res.getString("lName");
            array[2] = res.getString("eFName");
            array[3] = res.getString("eLName");
            array[4] = res.getString("idNumber");
            array[5] = res.getString("cellphoneNumber");
            array[6] = res.getString("homeNumber");
            array[7] = res.getString("employmentYear");
            array[8] = res.getString("employmentMonth");
            array[9] = res.getString("employmentDay");
            array[10] = res.getString("employmentIDNumber");
            array[11] = res.getString("childCount");
            array[12] = res.getString("maritalStatus");
            array[13] = res.getString("categoryNameP");
            array[14] = res.getString("categoryNameE");
            array[15] = res.getString("postNameP");
            array[16] = res.getString("postNameE");
            array[17] = res.getString("employeeSerialCode");
            array[18] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadEmployee(array);
    }

    public Employee readFromTableForEmployeeSerialCode(String serialCode) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM Employee WHERE employeeSerialCode = serialCode");

        while (res.next()) {
            array = new String[19];
            array[0] = res.getString("fName");
            array[1] = res.getString("lName");
            array[2] = res.getString("eFName");
            array[3] = res.getString("eLName");
            array[4] = res.getString("idNumber");
            array[5] = res.getString("cellphoneNumber");
            array[6] = res.getString("homeNumber");
            array[7] = res.getString("employmentYear");
            array[8] = res.getString("employmentMonth");
            array[9] = res.getString("employmentDay");
            array[10] = res.getString("employmentIDNumber");
            array[11] = res.getString("childCount");
            array[12] = res.getString("maritalStatus");
            array[13] = res.getString("categoryNameP");
            array[14] = res.getString("categoryNameE");
            array[15] = res.getString("postNameP");
            array[16] = res.getString("postNameE");
            array[17] = res.getString("employeeSerialCode");
            array[18] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadEmployee(array);
    }

    public Employee readFromTableForEmployeeByCardNumber(String cardNumber) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM Employee WHERE cardNumber = cardNumber");

        while (res.next()) {
            array = new String[19];
            array[0] = res.getString("fName");
            array[1] = res.getString("lName");
            array[2] = res.getString("eFName");
            array[3] = res.getString("eLName");
            array[4] = res.getString("idNumber");
            array[5] = res.getString("cellphoneNumber");
            array[6] = res.getString("homeNumber");
            array[7] = res.getString("employmentYear");
            array[8] = res.getString("employmentMonth");
            array[9] = res.getString("employmentDay");
            array[10] = res.getString("employmentIDNumber");
            array[11] = res.getString("childCount");
            array[12] = res.getString("maritalStatus");
            array[13] = res.getString("categoryNameP");
            array[14] = res.getString("categoryNameE");
            array[15] = res.getString("postNameP");
            array[16] = res.getString("postNameE");
            array[17] = res.getString("employeeSerialCode");
            array[18] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadEmployee(array);
    }

    public void createTableJobCategory() throws SQLException {
        stt.execute("DROP TABLE IF EXISTS jobCategory");
        stt.execute("CREATE TABLE jobCategory (id BIGINT, categoryNamePersian, categoryNameEnglish, postNamePersian," +
                " postNameEnglish, jobCategorySerialCode, PRIMARY KEY(id)");
    }

    public void writeToTableJobCategory(String[] array) throws SQLException {
        stt.execute("INSERT INTO jobCategory (categoryNamePersian, categoryNameEnglish, postNamePersian, postNameEnglish, jobCategorySerialCode)" +
                "VALUES (array[0],array[1],array[2],array[3],array[4]) ");
    }

    public ArrayList<String> getPersinCategory() throws SQLException{
        ResultSet res = stt.executeQuery("SELECT * FROM JobCategory");
        ArrayList<String> temp = new ArrayList<String>();
        while(res.next()){
            temp.add(res.getString("categoryNamePersian"));
        }
        return temp;
    }

    public ArrayList<String> getEnglishCategory() throws SQLException{
        ResultSet res = stt.executeQuery("SELECT * FROM JobCategory");
        ArrayList<String> temp = new ArrayList<String>();
        while(res.next()){
            temp.add(res.getString("categoryNameEnglish"));
        }
        return temp;
    }

    public JobCategory readFromTableJobCategoryByPN(String persianName) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM JobCategory WHERE categoryNamePersian = persianName");

        while (res.next()) {

            array = new String[5];
            array[0] = res.getString("categoryNamePersian");
            array[1] = res.getString("categoryNameEnglish");
            array[2] = res.getString("postNamePersian");
            array[3] = res.getString("postNameEnglish");
            array[4] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadJobCategory(array);
    }


    public JobCategory readFromTableJobCategoryByEN(String englishName) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM TableJobCategory WHERE categoryNameEnglish = englishName");

        while (res.next()) {

            array = new String[5];
            array[0] = res.getString("categoryNamePersian");
            array[1] = res.getString("categoryNameEnglish");
            array[2] = res.getString("postNamePersian");
            array[3] = res.getString("postNameEnglish");
            array[4] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadJobCategory(array);
    }

    public JobCategory readFromTableJobCategoryByJCSC(String serialNumber) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM TableJobCategory WHERE jobCategorySerialCode = serialNumber");

        while (res.next()) {

            array = new String[5];
            array[0] = res.getString("categoryNamePersian");
            array[1] = res.getString("categoryNameEnglish");
            array[2] = res.getString("postNamePersian");
            array[3] = res.getString("postNameEnglish");
            array[4] = res.getString("jobCategorySerialCode");
        }
        return DataBaseTransfer.dbReadJobCategory(array);
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

    public LegalReceipt readTableLegalReceipt(String serialNumber) throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM LegalReceipt WHERE legalReceiptSerialCode = serialNumber");

        while (res.next()) {

            array = new String[11];
            array[0] = res.getString("BaseAmount");
            array[1] = res.getString("childAmount");
            array[2] = res.getString("maritalStatusAmount");
            array[3] = res.getString("workExperienceAmount");
            array[4] = res.getString("extraWorkTimeAmount");
            array[5] = res.getString("totalAdditions");
            array[6] = res.getString("totalDeductions");
            array[7] = res.getString("finalSalary");
            array[8] = res.getString("taxAmount");
            array[9] = res.getString("insuranceAmount");
            array[10] = res.getString("legalReceiptSerialCode");
        }
        return DataBaseTransfer.dbReadLegalReceipt(array);
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

        array = new String[8];
        array[0] = res.getString("BaseRate");
        array[1] = res.getString("childRate");
        array[2] = res.getString("maritalStatusRate");
        array[3] = res.getString("workExperienceRate");
        array[4] = res.getString("extraWorkTimeRate");
        array[5] = res.getString("taxRate");
        array[6] = res.getString("insuranceRate");
        array[7] = res.getString("payRateSerialCode");
    }



    public static void main(String[] args) {

        new DataBaseHelper();

    }
}