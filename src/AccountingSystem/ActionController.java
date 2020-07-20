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

        int current_Year = 1399;
        int current_Month = 4;
        int current_Day = 29;

        int employee_Year = employee.getEmployment_Year();
        int employee_Month = employee.getEmployment_Month();
        int employee_Day = employee.getEmployment_Day();

        int result_Year = 0;
        int result_Month = 0;
        int result_Day = 0;

        int finalResult = 0;

        if (current_Month > employee_Month) {
            current_Year--;
            current_Month += 12;
        }

        if (current_Day > employee_Day) {
            current_Month--;
            current_Day += 31;
        }

        result_Year = current_Year - employee_Year;
        result_Month = current_Month - employee_Month;
        result_Day = current_Day - employee_Day;

        finalResult = result_Year * 365 + result_Month * 30 + result_Day;

        return finalResult;
    }

    public int calculateExtraWorkTimeMinute(Employee employee) {
//        Math.random()
        return 129;
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

    static void forghaniJob() {
        JobCategory contractEmployee = new JobCategory();
        contractEmployee.setCategoryName_Persian("قراردادی");
        contractEmployee.setCategoryName_English("contract");
        contractEmployee.setPostName_Persian("قراردادی");
        contractEmployee.setPostName_English("contract");

        PayRate payRateJobCategory = new PayRate();
        payRateJobCategory.setBaseRate(1700);
        payRateJobCategory.setextraWorkTimeRate(1);
        payRateJobCategory.setTaxRate(8);
        payRateJobCategory.setInsuranceRate(350);
        payRateJobCategory.setMaritalStatusRate(200);
        payRateJobCategory.setChildRate(135);
        payRateJobCategory.setWorkExperienceRate(30);

        new ActionController().setCategorySerialCode(contractEmployee, payRateJobCategory);

        Employee employee = new Employee();
        employee.setName_Persian("علی");
        employee.setName_English("Ali");
        employee.setLastName_Persian("فرقانی");
        employee.setLastName_English("Forghani");
        employee.setEmployeeIDNumber(Long.parseLong("985361042"));
        employee.setEmployment_Year(1399);
        employee.setEmployment_Month(04);
        employee.setEmployment_Day(27);
        employee.setMaritalStatus(false); // ایشالا کی بیجور دی (((:
        employee.setCellPhoneNumber("09145030651");
        employee.setHomeNumber("04135528773");
        employee.setChildCount(0);
        employee.setIdNumber("985361042");
        employee.setCategoryName_Persian(contractEmployee.getCategoryName_Persian());
        employee.setCategoryName_English(contractEmployee.getCategoryName_English());
        employee.setPostName_Persian(contractEmployee.getPostName_Persian());
        employee.setPostName_English(contractEmployee.getPostName_English());

        PayRate payRatEmployee = new PayRate();

        LegalReceipt legalReceipt_Farvardin = new LegalReceipt();
        LegalReceipt legalReceipt_Ordibehesht = new LegalReceipt();
        LegalReceipt legalReceipt_Khordad = new LegalReceipt();
        LegalReceipt legalReceipt_Tir = new LegalReceipt();

        ArrayList<LegalReceipt> legalReceiptArrayList = new ArrayList<LegalReceipt>();

        new ActionController().setSerialCodes(payRateJobCategory, employee, legalReceipt_Farvardin);
        legalReceipt_Ordibehesht.setLegalReceiptSerialCode(legalReceipt_Farvardin.getLegalReceiptSerialCode());
        legalReceipt_Khordad.setLegalReceiptSerialCode(legalReceipt_Ordibehesht.getLegalReceiptSerialCode());
        legalReceipt_Tir.setLegalReceiptSerialCode(legalReceipt_Khordad.getLegalReceiptSerialCode());

        new ActionController().copyPayRate(payRateJobCategory, payRatEmployee);

        legalReceipt_Farvardin.setFinalSalary(1304);
        legalReceipt_Farvardin.setTotalAdditions(1790);
        legalReceipt_Farvardin.setExtraWorkTimeAmount(0);
        new AccountingProcessing().setPayRateToLegalReceipt(payRateJobCategory, employee, legalReceipt_Farvardin);
        legalReceiptArrayList.add(legalReceipt_Farvardin);

        legalReceipt_Ordibehesht.setFinalSalary(1304);
        legalReceipt_Ordibehesht.setTotalAdditions(1790);
        legalReceipt_Ordibehesht.setExtraWorkTimeAmount(0);
        new AccountingProcessing().setPayRateToLegalReceipt(payRateJobCategory, employee, legalReceipt_Ordibehesht);
        legalReceiptArrayList.add(legalReceipt_Ordibehesht);

        legalReceipt_Khordad.setExtraWorkTimeAmount(840);
        legalReceipt_Khordad.setTotalAdditions(2630);
        legalReceipt_Khordad.setFinalSalary(2144);
        new AccountingProcessing().setPayRateToLegalReceipt(payRateJobCategory, employee, legalReceipt_Khordad);
        legalReceiptArrayList.add(legalReceipt_Khordad);

        legalReceipt_Tir.setExtraWorkTimeAmount(960);
        legalReceipt_Tir.setTotalAdditions(2750);
        legalReceipt_Tir.setFinalSalary(2264);
        new AccountingProcessing().setPayRateToLegalReceipt(payRateJobCategory, employee, legalReceipt_Tir);
        legalReceiptArrayList.add(legalReceipt_Tir);

        for (int i = 0; i < legalReceiptArrayList.size(); i++) {
            System.out.println(legalReceiptArrayList.get(i).toString());
        }
        System.out.println("legalReceipt_Farvardin = " + legalReceipt_Farvardin.toString());
        System.out.println("legalReceipt_Ordibehesht = " + legalReceipt_Ordibehesht.toString());
        System.out.println("legalReceipt_Khordad = " + legalReceipt_Khordad.toString());
        System.out.println("legalReceipt_Tir = " + legalReceipt_Tir.toString());

    }

    public static void main(String[] args) {
        forghaniJob();
    }


}