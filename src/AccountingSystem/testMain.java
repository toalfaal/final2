
public class testMain {

    //creating ActionController
    static ActionController actionController = new ActionController();

    static void step_1() {

        //creating JobCategory object
        JobCategory jobCategory = new JobCategory();
        jobCategory.setCategoryName_Persian("حوزه ریاست");
        jobCategory.setCategoryName_English("Presidency Department");
        jobCategory.setPostName_Persian("مدیر کل");
        jobCategory.setPostName_English("General Manager");

        //creating PayRate object
        PayRate payRate = new PayRate();
        payRate.setBaseRate(100.0);
        payRate.setChildRate(60.0);
        payRate.setextraWorkTimeRate(0.50);
        payRate.setInsuranceRate(120.0);
        payRate.setMaritalStatusRate(220.0);
        payRate.setTaxRate(1.0); // in percent
        payRate.setWorkExperienceRate(50);

        //generating serial code for JobCategory and PayRate
        actionController.setCategorySerialCode(jobCategory, payRate);

        //add JobCategory to the ArrayList
        actionController.addJobCategoryToArrayList(jobCategory);

        //add PayRate to the ArrayList
        actionController.addPayRateToArrayList(payRate);

        printStep_1(jobCategory, payRate);

    }

    static void step_2() {

        // creating Employee object
        Employee employee = new Employee();
        employee.setName_Persian("علی");
        employee.setName_English("Ali");
        employee.setLastName_Persian("فرقانی");
        employee.setLastName_English("Forghani");
//        employee.setEmployeeIDNumber(actionController.generateIDNumber());
        employee.setEmployment_Year(1399);
        employee.setEmployment_Month(04);
        employee.setEmployment_Day(27);
        employee.setMaritalStatus(false); // ایشالا کی بیجور دی (((:
        employee.setCellPhoneNumber("+989145030651");
        employee.setHomeNumber("+984152000000");
        employee.setChildCount(0);
        employee.setIdNumber("985361031");

        //creating PayRate object
        PayRate payRate = new PayRate();

        //creating  LegalReceipt object
        LegalReceipt legalReceipt = new LegalReceipt();

        //generating serial code for 3 object
        actionController.setSerialCodes(payRate, employee, legalReceipt);

        //clone PayRate
        actionController.clonePayRate("حوزه ریاست", "مدیر کل", payRate);

        //add Job Category to Employee


        //creating AccountingProcessing object
        AccountingProcessing accountingProcessing = new AccountingProcessing();

        //initialize LegalReceipt
        accountingProcessing.setPayRateToLegalReceipt(payRate, employee, legalReceipt);

        printStep_2(employee, payRate, legalReceipt, accountingProcessing);
    }

    static void printStep_1(JobCategory jobCategory, PayRate payRate) {

        System.out.println("Job Category : \n" + jobCategory.toString() + "\n******************");
        System.out.println("Job Category's Pay Rate : \n" + payRate.toString() + "\n******************");
    }

    static void printStep_2(Employee employee, PayRate payRate, LegalReceipt legalReceipt, AccountingProcessing accountingProcessing) {

        System.out.println("Employee : \n" + employee.toString() + "\n******************");
        System.out.println("Employee's Pay Rate : \n" + payRate.toString() + "\n******************");
        System.out.println("Employee's Legal Receipt : \n" + legalReceipt.toString() + "\n******************");
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        step_1();
        step_2();
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("execution time : " + totalTime);
    }
}