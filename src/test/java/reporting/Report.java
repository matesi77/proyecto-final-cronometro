package reporting;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Report {
    public static void main(String []args) throws InterruptedException {

        Thread.sleep(20000);

        //donde va a generar file.json
        String ruta = new File(".").getAbsolutePath().replace(".", "") + "build\\reports\\cucumber\\";
        //String ruta = "C:\\Users\\IBM GAMER\\Desktop\\DIP-TESTING\\Modulo3-clase2\\build\\reports\\cucumber\\";
        File reportFolder = new File(ruta + "UCBMovileReport");

        List<String> jsonList = new ArrayList<>();
        jsonList.add(ruta + "report.json");

        //configuraciones
        Configuration configuration = new Configuration(reportFolder, "Modulo3-clase2");
        configuration.setBuildNumber("00001");
        configuration.addClassifications("Owner", "USB");
        configuration.addClassifications("Branch", "Master");
        configuration.addClassifications("OS", "Windows10");
        configuration.addClassifications("Suite","Appium");


        //creacion del reporte
        ReportBuilder reportBuilder = new ReportBuilder(jsonList, configuration);
        reportBuilder.generateReports();
    }
}
