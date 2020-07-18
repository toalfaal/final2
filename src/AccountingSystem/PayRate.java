package AccountingSystem;

public class PayRate {

    //fields
    private double BaseRate = -1;
    private double childRate = -1;
    private double maritalStatusRate = -1;
    private double WorkExperienceRate = -1;
    private double extraWorkTimeRate = -1;

    private double taxRate = -1;
    private double insuranceRate = -1;

    //system
    private String payRateSerialCode = "null";
//    private int payRateCount = 0;

    public PayRate() {

    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(double insurance) {
        this.insuranceRate = insurance;
    }


    public double getBaseRate() {
        return BaseRate;
    }

    public void setBaseRate(double baseRate) {
        BaseRate = baseRate;
    }

    public double getChildRate() {
        return childRate;
    }

    public void setChildRate(double childRate) {
        this.childRate = childRate;
    }

    public double getMaritalStatusRate() {
        return maritalStatusRate;
    }

    public void setMaritalStatusRate(double maritialStatusRate) {
        this.maritalStatusRate = maritialStatusRate;
    }

    public double getWorkExperienceRate() {
        return WorkExperienceRate;
    }

    public void setWorkExperienceRate(double workTimeRate) {
        this.WorkExperienceRate = workTimeRate;
    }

    public double getextraWorkTimeRate() {
        return extraWorkTimeRate;
    }

    public void setextraWorkTimeRate(double extraWorkRate) {
        this.extraWorkTimeRate = extraWorkRate;
    }

    public String getPayRateSerialCode() {
        return payRateSerialCode;
    }

    public void setPayRateSerialCode(String payRateSerialCode) {
        this.payRateSerialCode = payRateSerialCode;
    }

//    public int getPayRateCount() {
//        return payRateCount;
//    }

//    public void setPayRateCount(int payRateCount) {
//        this.payRateCount = payRateCount;
//    }

    @Override
    public String toString() {
        return "PayRate{" +
                "BaseRate=" + BaseRate +
                ", childRate=" + childRate +
                ", maritalStatusRate=" + maritalStatusRate +
                ", WorkExperienceRate=" + WorkExperienceRate +
                ", extraWorkTimeRate=" + extraWorkTimeRate +
                ", taxRate=" + taxRate +
                ", insuranceRate=" + insuranceRate +
                ", payRateSerialCode='" + payRateSerialCode + '\'' +
                '}';
    }
}
