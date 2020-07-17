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


    public void addJobCategoryToEmployee(String categoryName_Persian, String postName_Persian) {

    }


    public int calculateWorkExperienceMonth(Employee employee) {
        return 15;
    }

    public int calculateExtraWorkTimeMinute(Employee employee) {
        return 180;
    }

}