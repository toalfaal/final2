
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

    public static Employee dbReadEmployee(String[] array) {

        if (array.length == 19) {
            Employee returnEmployee = new Employee();
            returnEmployee.setName_Persian(array[0]);
            returnEmployee.setLastName_Persian(array[1]);
            returnEmployee.setName_English(array[2]);
            returnEmployee.setLastName_English(array[3]);
            returnEmployee.setIdNumber(array[4]);
            returnEmployee.setCellPhoneNumber(array[5]);
            returnEmployee.setHomeNumber(array[6]);
            returnEmployee.setEmployment_Year(Integer.parseInt(array[7]));
            returnEmployee.setEmployment_Month(Integer.parseInt(array[8]));
            returnEmployee.setEmployment_Day(Integer.parseInt(array[9]));
            returnEmployee.setEmployeeIDNumber(Long.parseLong(array[10]));
            returnEmployee.setChildCount(Integer.parseInt(array[11]));
            returnEmployee.setMaritalStatus(Boolean.parseBoolean(array[12]));
            returnEmployee.setCategoryName_Persian(array[13]);
            returnEmployee.setCategoryName_English(array[14]);
            returnEmployee.setPostName_Persian(array[15]);
            returnEmployee.setPostName_English(array[16]);
            returnEmployee.setEmployeeSerialCode(array[17]);
            returnEmployee.setJobCategorySerialCode(array[18]);
            return returnEmployee;
        } else {
            return new Employee();
        }
    }

    public String[] dbWritePayRate(PayRate payRate) {

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

    public PayRate dbReadPayRate(String[] array) {

        if (array.length == 8) {
            PayRate returnPayRate = new PayRate();
            returnPayRate.setBaseRate(Double.parseDouble(array[0]));
            returnPayRate.setChildRate(Double.parseDouble(array[1]));
            returnPayRate.setMaritalStatusRate(Double.parseDouble(array[2]));
            returnPayRate.setWorkExperienceRate(Double.parseDouble(array[3]));
            returnPayRate.setextraWorkTimeRate(Double.parseDouble(array[4]));
            returnPayRate.setTaxRate(Double.parseDouble(array[5]));
            returnPayRate.setInsuranceRate(Double.parseDouble(array[6]));
            returnPayRate.setPayRateSerialCode(array[7]);
            return returnPayRate;
        } else {
            return new PayRate();
        }
    }

    public String[] dbWriteLegalReceipt(LegalReceipt legalReceipt) {

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

    public LegalReceipt dbReadLegalReceipt(String[] array) {

        if (array.length == 11) {
            LegalReceipt returnLegalReceipt = new LegalReceipt();
            returnLegalReceipt.setBaseAmount(Double.parseDouble(array[0]));
            returnLegalReceipt.setChildAmount(Double.parseDouble(array[1]));
            returnLegalReceipt.setMaritalStatusAmount(Double.parseDouble(array[2]));
            returnLegalReceipt.setWorkExperienceAmount(Double.parseDouble(array[3]));
            returnLegalReceipt.setExtraWorkTimeAmount(Double.parseDouble(array[4]));
            returnLegalReceipt.setTotalAdditions(Double.parseDouble(array[5]));
            returnLegalReceipt.setTotalDeductions(Double.parseDouble(array[6]));
            returnLegalReceipt.setFinalSalary(Double.parseDouble(array[7]));
            returnLegalReceipt.setTaxAmount(Double.parseDouble(array[8]));
            returnLegalReceipt.setInsuranceAmount(Double.parseDouble(array[9]));
            returnLegalReceipt.setLegalReceiptSerialCode(array[10]);
            return returnLegalReceipt;
        } else {
            return new LegalReceipt();
        }
    }

    public String[] dbWriteLJobCategory(JobCategory jobCategory) {

        String[] array = new String[5];

        array[0] = jobCategory.getCategoryName_Persian();
        array[1] = jobCategory.getCategoryName_English();
        array[2] = jobCategory.getPostName_Persian();
        array[3] = jobCategory.getPostName_English();
        array[4] = jobCategory.getJobCategorySerialCode();

        return array;
    }

    public JobCategory dbReadJobCategory(String[] array) {

        if (array.length == 5) {
            JobCategory returnJobCategory = new JobCategory();
            returnJobCategory.setCategoryName_Persian(array[0]);
            returnJobCategory.setCategoryName_English(array[1]);
            returnJobCategory.setPostName_Persian(array[2]);
            returnJobCategory.setPostName_English(array[3]);
            returnJobCategory.setJobCategorySerialCode(array[4]);
            return returnJobCategory;
        } else {
            return new JobCategory();
        }
    }

}
