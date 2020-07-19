package Server;

import AccountingSystem.Employee;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.scene.text.TextAlignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatePDF {
    String path;
    Employee employee;

    public String getPath() {
        return path;
    }

    public CreatePDF setPath(String path) {
        this.path = path;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public CreatePDF setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public CreatePDF(Employee employee) {
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

        File pdf = new File("C:\\Users\\jinos\\Desktop\\ideaProjects\\final2\\src\\Storage\\pdf.pdf");
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
        employee = new Employee();
        employee.setName_Persian("علی");
        employee.setName_English("Ali");
        employee.setLastName_Persian("فرقانی");
        employee.setLastName_English("Forghani");
        employee.setEmployeeIDNumber(12121212L);
        employee.setEmployment_Year(1399);
        employee.setEmployment_Month(04);
        employee.setEmployment_Day(27);
        employee.setMaritalStatus(false); // ایشالا کی بیجور دی (((:
        employee.setCellPhoneNumber("+989145030651");
        employee.setHomeNumber("+984152000000");
        employee.setChildCount(0);
        employee.setIdNumber("985361031");

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
        document.add(new Paragraph("Legal Receipt",catFont));



        // 5. Close document
        document.close();

    }

    public static void main(String[] args) throws IOException, DocumentException {
        CreatePDF createPDF = new CreatePDF(null);
        createPDF.create();
    }
}
