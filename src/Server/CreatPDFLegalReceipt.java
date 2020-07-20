package Server;

import AccountingSystem.Employee;
import AccountingSystem.LegalReceipt;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.scene.text.TextAlignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatPDFLegalReceipt {

    String path;
    Employee employee;

    public String getPath() {
        return path;
    }

    public CreatPDFLegalReceipt setPath(String path) {
        this.path = path;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public CreatPDFLegalReceipt setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public CreatPDFLegalReceipt(Employee employee) {
        this.employee = employee;
    }

    private static String FILE = "c:/temp/FirstPdf.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 14,
            Font.BOLD);
    private static Font smallItalic = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.ITALIC);

    void create() throws IOException, DocumentException {

        File pdf = new File("C:\\Users\\jinos\\Desktop\\pdf.pdf");
        if (pdf.exists())
            pdf.delete();
        else
            pdf.createNewFile();

        // 1. Create document
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);

        // 2. Create PdfWriter
        PdfWriter.getInstance(document, new FileOutputStream(pdf));

        // 3. Open document
        document.open();

        // 4. Add content
        LegalReceipt legalReceipt = new LegalReceipt();
        legalReceipt.setTaxAmount(136);
        legalReceipt.setInsuranceAmount(350);
        legalReceipt.setBaseAmount(1700);
        legalReceipt.setChildAmount(0.0);
        legalReceipt.setMaritalStatusAmount(0.0);
        legalReceipt.setWorkExperienceAmount(0);
        legalReceipt.setExtraWorkTimeAmount(960);
        legalReceipt.setTotalAdditions(2660);
        legalReceipt.setTotalDeductions(486);
        legalReceipt.setLegalReceiptSerialCode("SSC301");
        legalReceipt.setFinalSalary(2174);

         employee = new Employee();
        employee.setName_Persian("علی");
        employee.setName_English("Ali");
        employee.setLastName_Persian("فرقانی");
        employee.setLastName_English("Forghani");
        employee.setEmployeeIDNumber(Long.parseLong("985361042"));
        employee.setEmployment_Year(1399);
        employee.setEmployment_Month(1);
        employee.setEmployment_Day(9);
        employee.setMaritalStatus(false); // ایشالا کی بیجور دی (((:
        employee.setCellPhoneNumber("09145030651");
        employee.setHomeNumber("04135528773");
        employee.setChildCount(0);
        employee.setIdNumber("985361042");


        document.add(new Paragraph("Person Info",catFont));
        document.add(new Paragraph("Full Name:",smallItalic));
        document.add(new Paragraph(employee.getName_English()+" "+employee.getLastName_English(),subFont));
        document.add(new Paragraph("Employment Date",smallItalic));
        document.add(new Paragraph(employee.getEmployment_Year()+"\\\\"+employee.getEmployment_Month()
                +"\\\\"+employee.getEmployment_Day(),subFont));
        document.add(new Paragraph("ID Number",smallItalic));
        document.add(new Paragraph(employee.getIdNumber(),subFont));
        document.add(new Paragraph("Employee ID Number",smallItalic));
        document.add(new Paragraph(employee.getEmployeeIDNumber()+"",subFont));
        document.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------"));
        document.add(new Paragraph("Legal Receipt", catFont));
        document.add(new Paragraph("Tax Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getTaxAmount()), subFont));
        document.add(new Paragraph("Insurance Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getInsuranceAmount()), subFont));
        document.add(new Paragraph("Base Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getBaseAmount()), subFont));
        document.add(new Paragraph("Child Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getChildAmount()), subFont));
        document.add(new Paragraph("Marital Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getMaritalStatusAmount()), subFont));
        document.add(new Paragraph("Work Experience Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getWorkExperienceAmount()), subFont));
        document.add(new Paragraph("Extra Work Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getExtraWorkTimeAmount()), subFont));
        document.add(new Paragraph("Total Additions Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getTotalAdditions()), subFont));
        document.add(new Paragraph("Total Deductions Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getTotalDeductions()), subFont));
        document.add(new Paragraph("Final Salary Pay : ", smallItalic));
        document.add(new Paragraph(String.valueOf(legalReceipt.getFinalSalary()), subFont));


        // 5. Close document
        document.close();

    }

    public static void main(String[] args) throws IOException, DocumentException {
        CreatPDFLegalReceipt creatPDFLegalReceipt = new CreatPDFLegalReceipt(null);
        creatPDFLegalReceipt.create();
    }

}
