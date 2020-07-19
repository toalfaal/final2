package AccountingSystem;

import DataBase.DataBaseHelper;

import java.util.ArrayList;

public class ActionController {


    private long employeeIDNumber = 707152500;
    private int serialCode = 300;
    private int categorySerialCode = 100;

    //arraylists
    private ArrayList<JobCategory> jobCategoryArrayList = new ArrayList<JobCategory>();
    private ArrayList<PayRate> payRateArrayList = new ArrayList<PayRate>();

    private boolean isPayRateEmployee(PayRate payRate, Employee employee) {
        return payRate.getPayRateSerialCode().equals(employee.getEmployeeSerialCode());
    }

    private boolean isPayRateEmployeeLegalReceipt(PayRate payRate, Employee employee, LegalReceipt legalReceipt) {
        if (isPayRateEmployee(payRate, employee)) {
            return employee.getEmployeeSerialCode().equals(legalReceipt.getLegalReceiptSerialCode());
        } else {
            return false;
        }
    }

    private boolean isCategory(JobCategory jobCategory, PayRate payRate) {
        return jobCategory.getJobCategorySerialCode().equals(payRate.getPayRateSerialCode());
    }

    private String generateSerialCode() {
        serialCode++;
        return "SSC" + serialCode; // SSC = Standard Serial Code
    }

    private String generateCategorySerialCoe() {
        categorySerialCode++;
        return "CSSC" + categorySerialCode; // CSSC = Category Standard Serial Code
    }


    public boolean setSerialCodes(PayRate payRate, Employee employee, LegalReceipt legalReceipt) {
        String serialCodeHold = generateSerialCode();
        payRate.setPayRateSerialCode(serialCodeHold);
        employee.setEmployeeSerialCode(serialCodeHold);
        legalReceipt.setLegalReceiptSerialCode(serialCodeHold);
        return isPayRateEmployeeLegalReceipt(payRate, employee, legalReceipt);
    }

    public boolean setCategorySerialCode(JobCategory jobCategory, PayRate payRate) {
        String hold = generateCategorySerialCoe();
        jobCategory.setJobCategorySerialCode(hold);
        payRate.setPayRateSerialCode(hold);
        return isCategory(jobCategory, payRate);
    }

    public long generateIDNumber() {
        employeeIDNumber++;
        return employeeIDNumber;
    }

    public void addJobCategoryToArrayList(JobCategory jobCategory) {
        jobCategoryArrayList.add(jobCategory);
    }

    public void addPayRateToArrayList(PayRate payRate) {
        payRateArrayList.add(payRate);
    }

    private String findJobCategorySerialCode(String categoryName_Persian, String postName_Persian) {
        for (int i = 0; i < jobCategoryArrayList.size(); i++) {
            if (jobCategoryArrayList.get(i).getCategoryName_Persian().equals(categoryName_Persian)) {
                if (jobCategoryArrayList.get(i).getPostName_Persian().equals(postName_Persian)) {
                    return jobCategoryArrayList.get(i).getJobCategorySerialCode();
                }
            }
        }
        return "not found in jobCategoryArrayList !!";
    }

    private PayRate getPayRate(String serialCode) {
        for (int i = 0; i < payRateArrayList.size(); i++) {
            if (payRateArrayList.get(i).getPayRateSerialCode().equals(serialCode)) {
                return payRateArrayList.get(i);
            }
        }
        return null;
    }

    private void copyPayRate(PayRate mainPayRate, PayRate clonePayRate) {
        clonePayRate.setBaseRate(mainPayRate.getBaseRate());
        clonePayRate.setChildRate(mainPayRate.getChildRate());
        clonePayRate.setextraWorkTimeRate(mainPayRate.getextraWorkTimeRate());
        clonePayRate.setInsuranceRate(mainPayRate.getInsuranceRate());
        clonePayRate.setMaritalStatusRate(mainPayRate.getMaritalStatusRate());
        clonePayRate.setTaxRate(mainPayRate.getTaxRate());
        clonePayRate.setWorkExperienceRate(mainPayRate.getWorkExperienceRate());
    }

    public void clonePayRate(String categoryName_Persian, String postName_Persian, PayRate clonePayRate) {
        copyPayRate(getPayRate(findJobCategorySerialCode(categoryName_Persian, postName_Persian)), clonePayRate);
    }


    public void addJobCategoryToEmployee(String categoryName_Persian, String postName_Persian, Employee employee) throws Exception {
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        JobCategory jobCategory = dataBaseHelper.readFromTableJobCategoryByPN(categoryName_Persian, postName_Persian);
        employee.setCategoryName_Persian(jobCategory.getCategoryName_Persian());
        employee.setCategoryName_English(jobCategory.getCategoryName_English());
        employee.setPostName_Persian(jobCategory.getPostName_Persian());
        employee.setPostName_English(jobCategory.getPostName_English());
        employee.setJobCategorySerialCode(jobCategory.getJobCategorySerialCode());
    }


    public static boolean isStringOnlyAlphabet(String str) {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    public int calculateWorkExperienceMonth(Employee employee) {
        return 15;
    }

    public int calculateExtraWorkTimeMinute(Employee employee) {
        return 0;
    }

    //read from database

    public Employee dbGetEmployeeByNamePersian(String fName, String lName) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableForEmployeeByPN(fName, lName);
    }

    public Employee dbGetEmployeeByNameEnglish(String fName, String lName) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableForEmployeeByEN(fName, lName);
    }

    public Employee dbGetEmployeeBySerialCode(String serialCode) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return null;
    }

    public Employee dbGetEmployeeByEmployeeSerialCode(String serialCode) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableForEmployeeByEmployeeIDNumber(serialCode);
    }

    public Employee dbGetEmployeeByCardSerialCode(String serialCode) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableForEmployeeByCardNumber(serialCode);
    }


    public JobCategory dbGetJobCategoryByNamePersian(String categoryName_Persian, String postName_Persian) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableJobCategoryByPN(categoryName_Persian, postName_Persian);
    }

    public JobCategory dbGetJobCategoryByNameEnglish(String categoryName_English, String postName_English) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableJobCategoryByEN(categoryName_English, postName_English);
    }

    public JobCategory dbGetJobCategoryBySerialCode(String serialCode) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTableJobCategoryByJCSC(serialCode);
    }

    public LegalReceipt dbGetLegalReceipt(String serialCode) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readTableLegalReceipt(serialCode);
    }

    public PayRate dbGetPayRate(String serialCode) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer();
        return dataBaseHelper.readFromTablePayRate(serialCode);
    }

    //write to database

    public void dbSetEmployee(Employee employee) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer(employee);
        dataBaseHelper.writeToTableForEmployee(dataBaseTransfer.dbWriteEmployee());
    }

    public void dbSetPayRate(PayRate payRate) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer(payRate);
        dataBaseHelper.writeToTablePayRate(dataBaseTransfer.dbWritePayRate());
    }

    public void dbSetJobCategory(JobCategory jobCategory) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer(jobCategory);
        dataBaseHelper.writeToTableJobCategory(dataBaseTransfer.dbWriteLJobCategory());
    }

    public void dbSetLegalReceipt(LegalReceipt legalReceipt) throws Exception {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        DataBaseTransfer dataBaseTransfer = new DataBaseTransfer(legalReceipt);
        dataBaseHelper.writeToTableLegalReceipt(dataBaseTransfer.dbWriteLegalReceipt());
    }


}