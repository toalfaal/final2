package Server;

import AccountingSystem.ActionController;
import AccountingSystem.JobCategory;
import AccountingSystem.PayRate;
import org.jcp.xml.dsig.internal.dom.DOMUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PostManagerDefine extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double[] mk = new double[7];
        double[] md = new double[7];
        double[] g = new double[7];
        double[] k = new double[7];
        mk[0] = Double.parseDouble(request.getParameter("MKBase"));
        mk[1] = Double.parseDouble(request.getParameter("MKExtra"));
        mk[2] = Double.parseDouble(request.getParameter("MKTax"));
        mk[3] = Double.parseDouble(request.getParameter("MKInsure"));
        mk[4] = Double.parseDouble(request.getParameter("MKMar"));
        mk[5] = Double.parseDouble(request.getParameter("MKChild"));
        mk[6] = Double.parseDouble(request.getParameter("MKWork"));
        k[0] = Double.parseDouble(request.getParameter("KBase"));
        k[1] = Double.parseDouble(request.getParameter("KExtra"));
        k[2] = Double.parseDouble(request.getParameter("KTax"));
        k[3] = Double.parseDouble(request.getParameter("KInsure"));
        k[4] = Double.parseDouble(request.getParameter("KMar"));
        k[5] = Double.parseDouble(request.getParameter("KChild"));
        k[6] = Double.parseDouble(request.getParameter("KWork"));
        g[0] = Double.parseDouble(request.getParameter("GBase"));
        g[1] = Double.parseDouble(request.getParameter("GExtra"));
        g[2] = Double.parseDouble(request.getParameter("GTax"));
        g[3] = Double.parseDouble(request.getParameter("GInsure"));
        g[4] = Double.parseDouble(request.getParameter("GMar"));
        g[5] = Double.parseDouble(request.getParameter("GChild"));
        g[6] = Double.parseDouble(request.getParameter("GWork"));
        md[0] = Double.parseDouble(request.getParameter("MDBase"));
        md[1] = Double.parseDouble(request.getParameter("KDExtra"));
        md[2] = Double.parseDouble(request.getParameter("KDTax"));
        md[3] = Double.parseDouble(request.getParameter("KDInsure"));
        md[4] = Double.parseDouble(request.getParameter("KDMar"));
        md[5] = Double.parseDouble(request.getParameter("KDChild"));
        md[6] = Double.parseDouble(request.getParameter("KDWork"));

        JobCategory jobCategoryG = new JobCategory();

        jobCategoryG.setPostName_Persian("قراردادی");
        jobCategoryG.setPostName_English("gararDady");
        jobCategoryG.setCategoryName_Persian("قراردادی");
        jobCategoryG.setCategoryName_English("gararDady");

        JobCategory jobCategoryMK = new JobCategory();
        jobCategoryMK.setPostName_English("modirKol");
        jobCategoryMK.setPostName_Persian("مدیرکل");
        jobCategoryMK.setCategoryName_Persian("مدیرکل");
        jobCategoryMK.setCategoryName_English("modirKol");

        JobCategory jobCategoryMD = new JobCategory();
        jobCategoryMD.setPostName_Persian("مدیر داخلی");
        jobCategoryMD.setPostName_English("modirDakheli");
        jobCategoryMD.setCategoryName_Persian("مدیر داخلی");
        jobCategoryMD.setCategoryName_English("modirDakheli");

        JobCategory jobCategoryK = new JobCategory();
        jobCategoryK.setPostName_Persian("کارمند");
        jobCategoryK.setPostName_English("karmand");
        jobCategoryK.setCategoryName_Persian("کارمند");
        jobCategoryK.setCategoryName_English("karmand");

        PayRate gPay = new PayRate();
        gPay.setBaseRate(g[0]);
        gPay.setextraWorkTimeRate(g[1]);
        gPay.setTaxRate(g[2]);
        gPay.setInsuranceRate(g[3]);
        gPay.setMaritalStatusRate(g[4]);
        gPay.setChildRate(g[5]);
        gPay.setWorkExperienceRate(g[6]);

        PayRate kPay = new PayRate();
        kPay.setBaseRate(k[0]);
        kPay.setextraWorkTimeRate(k[1]);
        kPay.setTaxRate(k[2]);
        kPay.setInsuranceRate(k[3]);
        kPay.setMaritalStatusRate(k[4]);
        kPay.setChildRate(k[5]);
        kPay.setWorkExperienceRate(k[6]);

        PayRate mkPay = new PayRate();
        mkPay.setBaseRate(mk[0]);
        mkPay.setextraWorkTimeRate(mk[1]);
        mkPay.setTaxRate(mk[2]);
        mkPay.setInsuranceRate(mk[3]);
        mkPay.setMaritalStatusRate(mk[4]);
        mkPay.setChildRate(mk[5]);
        mkPay.setWorkExperienceRate(mk[6]);

        PayRate mdPay = new PayRate();
        mdPay.setBaseRate(md[0]);
        mdPay.setextraWorkTimeRate(md[1]);
        mdPay.setTaxRate(md[2]);
        mdPay.setInsuranceRate(md[3]);
        mdPay.setMaritalStatusRate(md[4]);
        mdPay.setChildRate(md[5]);
        mdPay.setWorkExperienceRate(md[6]);


        ActionController actionController = new ActionController();
        actionController.setCategorySerialCode(jobCategoryG,gPay);
        actionController.setCategorySerialCode(jobCategoryMD,mdPay);
        actionController.setCategorySerialCode(jobCategoryMK,mkPay);
        actionController.setCategorySerialCode(jobCategoryK,kPay);

        try {
            actionController.dbSetJobCategory(jobCategoryG);
            actionController.dbSetJobCategory(jobCategoryK);
            actionController.dbSetJobCategory(jobCategoryMD);
            actionController.dbSetJobCategory(jobCategoryMK);
            actionController.dbSetPayRate(mdPay);
            actionController.dbSetPayRate(mkPay);
            actionController.dbSetPayRate(kPay);
            actionController.dbSetPayRate(gPay);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ManagerMain.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

