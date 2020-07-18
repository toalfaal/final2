package AccountingSystem;

public class LegalReceipt {

    //fields
    private double BaseAmount = -1;
    private double childAmount = -1;
    private double maritalStatusAmount = -1;
    private double workExperienceAmount = -1;
    private double extraWorkTimeAmount = -1;
    private double totalAdditions = -1;
    private double totalDeductions = -1;
    private double finalSalary = -1;

    private double taxAmount = -1;
    private double insuranceAmount = -1;

    //system
    private String legalReceiptSerialCode = "null";
//    private int legalReceiptSize = 0;

    //constructor
    public LegalReceipt() {

//        legalReceiptSize++;
    }

    public double getBaseAmount() {
        return BaseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        BaseAmount = baseAmount;
    }

    public double getChildAmount() {
        return childAmount;
    }

    public void setChildAmount(double childAmount) {
        this.childAmount = childAmount;
    }

    public double getMaritalStatusAmount() {
        return maritalStatusAmount;
    }

    public void setMaritalStatusAmount(double maritalStatusAmount) {
        this.maritalStatusAmount = maritalStatusAmount;
    }


    public double getExtraWorkTimeAmount() {
        return extraWorkTimeAmount;
    }

    public void setExtraWorkTimeAmount(double extraWorkTimeAmount) {
        this.extraWorkTimeAmount = extraWorkTimeAmount;
    }

    public String getLegalReceiptSerialCode() {
        return legalReceiptSerialCode;
    }

    public void setLegalReceiptSerialCode(String legalReceiptSerialCode) {
        this.legalReceiptSerialCode = legalReceiptSerialCode;
    }

//    public int getLegalReceiptSize() {
//        return legalReceiptSize;
//    }

//    public void setLegalReceiptSize(int legalReceiptSize) {
//        this.legalReceiptSize = legalReceiptSize;
//    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public double getWorkExperienceAmount() {
        return workExperienceAmount;
    }

    public void setWorkExperienceAmount(double workExperienceAmount) {
        this.workExperienceAmount = workExperienceAmount;
    }

    public double getTotalAdditions() {
        return totalAdditions;
    }

    public void setTotalAdditions(double totalAdditions) {
        this.totalAdditions = totalAdditions;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    @Override
    public String toString() {
        return "LegalReceipt{" +
                "BaseAmount=" + BaseAmount +
                ", childAmount=" + childAmount +
                ", maritalStatusAmount=" + maritalStatusAmount +
                ", workExperienceAmount=" + workExperienceAmount +
                ", extraWorkTimeAmount=" + extraWorkTimeAmount +
                ", totalAdditions=" + totalAdditions +
                ", totalDeductions=" + totalDeductions +
                ", taxAmount=" + taxAmount +
                ", insuranceAmount=" + insuranceAmount +
                ", legalReceiptSerialCode='" + legalReceiptSerialCode +
                ", finalSalary=" + finalSalary + '\'' +
                '}';
    }
}
