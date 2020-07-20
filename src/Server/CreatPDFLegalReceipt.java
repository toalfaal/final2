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

        File pdf = new File("C:\\Users\\ASUS\\Desktop\\pdf.pdf");
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
        legalReceipt.setTaxAmount(1.0);
        legalReceipt.setInsuranceAmount(120.0);
        legalReceipt.setBaseAmount(100.0);
        legalReceipt.setChildAmount(0.0);
        legalReceipt.setMaritalStatusAmount(0.0);
        legalReceipt.setWorkExperienceAmount(150.0);
        legalReceipt.setExtraWorkTimeAmount(0.0);
        legalReceipt.setTotalAdditions(250.0);
        legalReceipt.setTotalDeductions(121.0);
        legalReceipt.setLegalReceiptSerialCode("SSC301");
        legalReceipt.setFinalSalary(129.0);


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

}
