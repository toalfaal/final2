
public class AccountingProcessing {


    public AccountingProcessing() {

    }

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

    private double calculateSalaryAdditions(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            double additions = getFinalSalaryBase(payRate, employee);
            additions += getFinalSalaryChild(payRate, employee);
            additions += getFinalSalaryMaritalStatus(payRate, employee);
            additions += getFinalSalaryWorkExperience(payRate, employee);
            additions += getFinalSalaryExtraWorkTimeMinute(payRate, employee);
            return additions;
        } else {
            return -1;
        }
    }

    private double getFinalSalaryBase(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            return payRate.getBaseRate();
        } else {
            return -1;
        }
    }

    private double getFinalSalaryChild(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            double finalTax = 0.0;
            for (int i = 0; i < employee.getChildCount(); i++) {
                finalTax += payRate.getChildRate();
            }
            return finalTax;
        } else {
            return -1;
        }
    }

    private double getFinalSalaryMaritalStatus(PayRate payRate, Employee employee) {

        if (isPayRateEmployee(payRate, employee)) {
            if (employee.isMaritalStatus()) {
                return payRate.getMaritalStatusRate();
            } else {
                return 0.0;
            }
        } else {
            return -1;
        }
    }

    private double getFinalSalaryWorkExperience(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            int factor = new ActionController().calculateWorkExperienceMonth(employee);
            return payRate.getWorkExperienceRate() * factor;
        } else {
            return -1;
        }
    }


    private double getFinalSalaryExtraWorkTimeMinute(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            int factor = new ActionController().calculateExtraWorkTimeMinute(employee);
            return payRate.getextraWorkTimeRate() * factor;
        } else {
            return -1;
        }
    }


    private double calculateDeductions(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            double deductions = getFinalSalaryInsurance(payRate, employee);
            deductions += getFinalSalaryTax(payRate, employee);
            return deductions;
        } else {
            return -1;
        }
    }

    private double getFinalSalaryInsurance(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            return payRate.getInsuranceRate();
        } else {
            return -1;
        }
    }


    private double getFinalSalaryTax(PayRate payRate, Employee employee) {
        if (isPayRateEmployee(payRate, employee)) {
            return payRate.getBaseRate() / 100 * payRate.getTaxRate();
        } else {
            return -1;
        }
    }


    private double getFinalSalary(PayRate payRate, Employee employee) {
        return calculateSalaryAdditions(payRate, employee) - calculateDeductions(payRate, employee);
    }


    public boolean setPayRateToLegalReceipt(PayRate payRate, Employee employee, LegalReceipt legalReceipt) {
        if (isPayRateEmployeeLegalReceipt(payRate, employee, legalReceipt)) {
            legalReceipt.setBaseAmount(getFinalSalaryBase(payRate, employee));
            legalReceipt.setChildAmount(getFinalSalaryChild(payRate, employee));
            legalReceipt.setExtraWorkTimeAmount(getFinalSalaryExtraWorkTimeMinute(payRate, employee));
            legalReceipt.setMaritalStatusAmount(getFinalSalaryMaritalStatus(payRate, employee));
            legalReceipt.setWorkExperienceAmount(getFinalSalaryWorkExperience(payRate, employee));
            legalReceipt.setInsuranceAmount(getFinalSalaryInsurance(payRate, employee));
            legalReceipt.setTaxAmount(getFinalSalaryTax(payRate, employee));
            legalReceipt.setTotalAdditions(calculateSalaryAdditions(payRate, employee));
            legalReceipt.setTotalDeductions(calculateDeductions(payRate, employee));
            legalReceipt.setFinalSalary(getFinalSalary(payRate, employee));
            return true;
        } else {
            return false;
        }
    }
}
