package Accounting

public class DataBaseTransfer {

    //constructor
    public DataBaseTransfer() {

    }

    //methods

    public String[] dbWriteEmployee(Employee employee) {

        String[] array = new String[19];

        array[0] = employee.getName_Persian();
        array[1] = employee.getLastName_Persian();
        array[2] = employee.getName_English();
        array[3] = employee.getLastName_English();
        array[4] = employee.getIdNumber();
        array[5] = employee.getCellPhoneNumber();
        array[6] = employee.getHomeNumber();
        array[7] = String.valueOf(employee.getEmployment_Year());
        array[8] = String.valueOf(employee.getEmployment_Month());
        array[9] = String.valueOf(employee.getEmployment_Day());
        array[10] = String.valueOf(employee.getEmployeeIDNumber());
        array[11] = String.valueOf(employee.getChildCount());
        array[12] = String.valueOf(employee.isMaritalStatus());
        array[13] = employee.getCategoryName_Persian();
        array[14] = employee.getCategoryName_English();
        array[15] = employee.getPostName_Persian();
        array[16] = employee.getPostName_English();
        array[17] = employee.getEmployeeSerialCode();
        array[18] = employee.getJobCategorySerialCode();

        return array;
    }

    void dbReadEmployee() {

    }

    String[] dbWritePayRate(PayRate payRate) {

        String[] array = new String[8];

        array[0] = String.valueOf(payRate.getBaseRate());
        array[1] = String.valueOf(payRate.getChildRate());
        array[2] = String.valueOf(payRate.getMaritalStatusRate());
        array[3] = String.valueOf(payRate.getWorkExperienceRate());
        array[4] = String.valueOf(payRate.getextraWorkTimeRate());
        array[5] = String.valueOf(payRate.getTaxRate());
        array[6] = String.valueOf(payRate.getInsuranceRate());
        array[7] = String.valueOf(payRate.getPayRateSerialCode());

        return array;
    }

    void dbReadPayRate() {

    }

    String[] dbWriteLegalReceipt(LegalReceipt legalReceipt) {

        String[] array = new String[11];

        array[0] = String.valueOf(legalReceipt.getBaseAmount());
        array[1] = String.valueOf(legalReceipt.getChildAmount());
        array[2] = String.valueOf(legalReceipt.getMaritalStatusAmount());
        array[3] = String.valueOf(legalReceipt.getWorkExperienceAmount());
        array[4] = String.valueOf(legalReceipt.getExtraWorkTimeAmount());
        array[5] = String.valueOf(legalReceipt.getTotalAdditions());
        array[6] = String.valueOf(legalReceipt.getTotalDeductions());
        array[7] = String.valueOf(legalReceipt.getFinalSalary());
        array[8] = String.valueOf(legalReceipt.getTaxAmount());
        array[9] = String.valueOf(legalReceipt.getInsuranceAmount());
        array[10] = legalReceipt.getLegalReceiptSerialCode();

        return array;
    }

    void dbReadLegalReceipt() {

    }

    String[] dbWriteLJobCategory(JobCategory jobCategory) {

        String[] array = new String[5];

        array[0] = jobCategory.getCategoryName_Persian();
        array[1] = jobCategory.getCategoryName_English();
        array[2] = jobCategory.getPostName_Persian();
        array[3] = jobCategory.getPostName_English();
        array[4] = jobCategory.getJobCategorySerialCode();

        return array;
    }

    void dbReadJobCategory() {

    }

}
