package DataBase;

import AccountingSystem.*;

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
            createTableJobCategory();
            CreateTableLegalReceipt();
            createTablePayRate();
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
        stt.execute("CREATE TABLE Employee (id BIGINT NOT NULL AUTO_INCREMENT,fName VARCHAR(50),lName VARCHAR(50),eFName VARCHAR(50),eLName VARCHAR(50)," +
                " idNumber VARCHAR(50), cellphoneNumber VARCHAR(50),homeNumber VARCHAR(50),employmentYear VARCHAR(50),employmentMonth VARCHAR(50)," +
                "employmentDay VARCHAR(50),employmentIDNumber VARCHAR(50),childCount VARCHAR(50),maritalStatus BOOLEAN,categoryNameP VARCHAR(50)," +
                "categoryNameE VARCHAR(50),postNameP VARCHAR(50),postNameE VARCHAR(50),employeeSerialCode VARCHAR(50),jobCategorySerialCode VARCHAR(50)" +
                ",cardNumber VARCHAR(50),PRIMARY KEY(id))");
    }


    public void writeToTableForEmployee(String[] array) throws SQLException {
        if (array[12].equals("false")) {
            stt.execute("INSERT INTO Employee (fName,lName,eFName,eLName,idNumber,cellphoneNumber,homeNumber,employmentYear,employmentMonth,employmentDay" +
                    ",employmentIDNumber,childCount,maritalStatus,categoryNameP,categoryNameE,postNameP,postNameE,employeeSerialCode,jobCategorySerialCode," +
                    "cardNumber) VALUES (array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8],array[9],array[10],array[11],false," +
                    "array[13],array[14],array[15],array[16],array[17],array[18],array[19])");
        }
        if (array[12].equals("true")) {
            stt.execute("INSERT INTO Employee (fName,lName,eFName,eLName,idNumber,cellphoneNumber,homeNumber,employmentYear,employmentMonth,employmentDay" +
                    ",employmentIDNumber,childCount,maritalStatus,categoryNameP,categoryNameE,postNameP,postNameE,employeeSerialCode,jobCategorySerialCode," +
                    "cardNumber) VALUES (array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8],array[9],array[10],array[11],true," +
                    "array[13],array[14],array[15],array[16],array[17],array[18],array[19])");
        }
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
        stt.execute("CREATE TABLE jobCategory (id BIGINT NULL AUTO_INCREMENT,categoryNamePersian VARCHAR(50),categoryNameEnglish VARCHAR(50),postNamePersian VARCHAR(50)," +
                "postNameEnglish VARCHAR(50),jobCategorySerial_Code VARCHAR(50),PRIMARY KEY(id))");
    }

    public void writeToTableJobCategory(String[] array) throws SQLException {
        stt.execute("INSERT INTO jobCategory (categoryNamePersian, categoryNameEnglish, postNamePersian, postNameEnglish, jobCategorySerial_Code)" +
                "VALUES (array[0],array[1],array[2],array[3],array[4]) ");
    }

    public ArrayList<String> getPersinCategory() throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM JobCategory");
        ArrayList<String> temp = new ArrayList<String>();
        while (res.next()) {
            temp.add(res.getString("categoryNamePersian"));
        }
        return temp;
    }

    public ArrayList<String> getEnglishCategory() throws SQLException {
        ResultSet res = stt.executeQuery("SELECT * FROM JobCategory");
        ArrayList<String> temp = new ArrayList<String>();
        while (res.next()) {
            temp.add(res.getString("categoryNameEnglish"));
        }
        return temp;
    }

    public JobCategory readFromTableJobCategoryByPN(String persianName, String postNamePersian) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM JobCategory WHERE (categoryNamePersian = persianName && postNamePersian = postNamePersian");

        while (res.next()) {

            array = new String[5];
            array[0] = res.getString("categoryNamePersian");
            array[1] = res.getString("categoryNameEnglish");
            array[2] = res.getString("postNamePersian");
            array[3] = res.getString("postNameEnglish");
            array[4] = res.getString("jobCategorySerial_Code");
        }
        return DataBaseTransfer.dbReadJobCategory(array);
    }


    public JobCategory readFromTableJobCategoryByEN(String englishName, String postNameEnglish) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM TableJobCategory WHERE (categoryNameEnglish = englishName && postNameEnglish=postNameEnglish");

        while (res.next()) {

            array = new String[5];
            array[0] = res.getString("categoryNamePersian");
            array[1] = res.getString("categoryNameEnglish");
            array[2] = res.getString("postNamePersian");
            array[3] = res.getString("postNameEnglish");
            array[4] = res.getString("jobCategorySeria_lCode");
        }
        return DataBaseTransfer.dbReadJobCategory(array);
    }

    public JobCategory readFromTableJobCategoryByJCSC(String serialNumber) throws SQLException {

        ResultSet res = stt.executeQuery("SELECT * FROM TableJobCategory WHERE jobCategorySerial_Code = serialNumber");

        while (res.next()) {

            array = new String[5];
            array[0] = res.getString("categoryNamePersian");
            array[1] = res.getString("categoryNameEnglish");
            array[2] = res.getString("postNamePersian");
            array[3] = res.getString("postNameEnglish");
            array[4] = res.getString("jobCategorySerial_Code");
        }
        return DataBaseTransfer.dbReadJobCategory(array);
    }


    public void CreateTableLegalReceipt() throws SQLException {
            stt.execute("DROP TABLE IF EXISTS LegalReceipt");
            stt.execute("CREATE TABLE LegalReceipt (id BIGINT,BaseAmount VARCHAR(50),childAmount VARCHAR(50),maritalStatusAmount VARCHAR(50)" +
                    ",workExperienceAmount VARCHAR(50),extraWorkTimeAmount VARCHAR(50),totalAdditions VARCHAR(50),totalDeductions VARCHAR(50)," +
                    "finalSalary VARCHAR(50),taxAmount VARCHAR(50),insuranceAmount VARCHAR(50),legalReceiptSerialCode VARCHAR(50),PRIMARY KEY(id))");
        }

        public void writeToTableLegalReceipt (String[]arrays) throws SQLException {
            stt.execute("INSERT INTO LegalReceipt (BaseAmount, childAmount, maritalStatusAmount, workExperienceAmount, extraWorkTimeAmount," +
                    " totalAdditions,totalDeductions, finalSalary,taxAmount, insuranceAmount, legalReceiptSerialCode) VALUES (arrays[0],arrays[1]" +
                    ",arrays[2],arrays[3],arrays[4],arrays[5],arrays[6],arrays[7],arrays[8],arrays[9],arrays[10])");
        }

        public LegalReceipt readTableLegalReceipt (String serialNumber) throws SQLException {
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

        public void createTablePayRate () throws SQLException {
            stt.execute("DROP TABLE IF EXISTS PayRate");
            stt.execute("CREATE TABLE PayRate(id BIGINT,BaseRate VARCHAR(50),childRate VARCHAR(50),maritalStatusRate VARCHAR(50)," +
                    "workExperienceRate VARCHAR(50),extraWorkTimeRate VARCHAR(50),taxRate VARCHAR(50),insuranceRate VARCHAR(50),payRateSerialCode VARCHAR(50),PRIMARY KEY(id))");
        }

        public void writeToTablePayRate (String[]arrays) throws SQLException {
            stt.execute("INSERT INTO PayRate (BaseRate,childRate,maritalStatusRate,workExperienceRate," +
                    "extraWorkTimeRate,taxRate,insuranceRate,payRateSerialCode) VALUES (arrays[0],arrays[1],arrays[2],arrays[3]" +
                    ",arrays[4],arrays[5],arrays[6],arrays[7])");
        }

        public PayRate readFromTablePayRate (String serialNumber) throws SQLException {
            ResultSet res = stt.executeQuery("SELECT * FROM PayRate WHERE payRateSerialCode = serialNumber");
            while (res.next()) {
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
            return DataBaseTransfer.dbReadPayRate(array);
        }


        public static void main (String[]args){

            new DataBaseHelper();

        }
    }