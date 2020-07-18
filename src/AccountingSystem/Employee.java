package AccountingSystem;

public class Employee {

    // personal
    private String name_Persian = "null name_Persian";
    private String lastName_Persian = "nul lastName_Persian";
    private String name_English = "null name_English";
    private String lastName_English = "null lastName_English";
    private String idNumber = "null";
    private String cellPhoneNumber = "-1";
    private String homeNumber = "-1";
    private int employment_Year = -1;
    private int employment_Month = -1;
    private int employment_Day = -1;
    private long employeeIDNumber = -1;
    private int childCount = -1;
    private boolean maritalStatus;

    //job category
    private String categoryName_Persian = "null";
    private String categoryName_English = "null";
    private String postName_Persian = "null";
    private String postName_English = "null";

    //system
//    private int totalEmployeeCount = 0;
    private String employeeSerialCode = "null";
    private String jobCategorySerialCode = "null";

    public Employee() {

        ActionController actionController = new ActionController();

//        totalEmployeeCount++;

        employeeIDNumber = actionController.generateIDNumber();


    }

    private void calculateTotalAge(int currentYear, int currentMonth, int currentDay) {

    }

    public String getEmployeeSerialCode() {
        return employeeSerialCode;
    }

    public void setEmployeeSerialCode(String employeeSerialCode) {
        this.employeeSerialCode = employeeSerialCode;
    }

    public String getName_Persian() {
        return name_Persian;
    }

    public void setName_Persian(String name_Persian) {
        this.name_Persian = name_Persian;
    }

    public String getLastName_Persian() {
        return lastName_Persian;
    }

    public void setLastName_Persian(String lastName_Persian) {
        this.lastName_Persian = lastName_Persian;
    }

    public String getName_English() {
        return name_English;
    }

    public void setName_English(String name_English) {
        this.name_English = name_English;
    }

    public String getLastName_English() {
        return lastName_English;
    }

    public void setLastName_English(String lastName_English) {
        this.lastName_English = lastName_English;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getEmployment_Year() {
        return employment_Year;
    }

    public void setEmployment_Year(int employment_Year) {
        this.employment_Year = employment_Year;
    }

    public int getEmployment_Month() {
        return employment_Month;
    }

    public void setEmployment_Month(int employmeny_Month) {
        this.employment_Month = employmeny_Month;
    }

    public int getEmployment_Day() {
        return employment_Day;
    }

    public void setEmployment_Day(int employment_Day) {
        this.employment_Day = employment_Day;
    }

    public long getEmployeeIDNumber() {
        return employeeIDNumber;
    }

    public void setEmployeeIDNumber(long employeeIDNumber) {
        this.employeeIDNumber = employeeIDNumber;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

//    public int getTotalEmployeeCount() {
//        return totalEmployeeCount;
//    }

//    public void setTotalEmployeeCount(int totalEmployeeCount) {
//        this.totalEmployeeCount = totalEmployeeCount;
//    }


    public String getCategoryName_Persian() {
        return categoryName_Persian;
    }

    public void setCategoryName_Persian(String categoryName_Persian) {
        this.categoryName_Persian = categoryName_Persian;
    }

    public String getCategoryName_English() {
        return categoryName_English;
    }

    public void setCategoryName_English(String categoryName_English) {
        this.categoryName_English = categoryName_English;
    }

    public String getPostName_Persian() {
        return postName_Persian;
    }

    public void setPostName_Persian(String postName_Persian) {
        this.postName_Persian = postName_Persian;
    }

    public String getPostName_English() {
        return postName_English;
    }

    public void setPostName_English(String postName_English) {
        this.postName_English = postName_English;
    }

    public String getJobCategorySerialCode() {
        return jobCategorySerialCode;
    }

    public void setJobCategorySerialCode(String jobCategorySerialCode) {
        this.jobCategorySerialCode = jobCategorySerialCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name_Persian='" + name_Persian + '\'' +
                ", lastName_Persian='" + lastName_Persian + '\'' +
                ", name_English='" + name_English + '\'' +
                ", lastName_English='" + lastName_English + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", employment_Year=" + employment_Year +
                ", employment_Month=" + employment_Month +
                ", employment_Day=" + employment_Day +
                ", employeeIDNumber=" + employeeIDNumber +
                ", childCount=" + childCount +
                ", maritalStatus=" + maritalStatus +
                ", employeeSerialCode='" + employeeSerialCode + '\'' +
                '}';
    }
}