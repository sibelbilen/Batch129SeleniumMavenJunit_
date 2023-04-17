package Gunluklerim;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentsReportTest extends TestBase {
    /*
    ExtentReport kullanabilmemiz icin:
    1.pom.xml dosyasina extentreports dependency'si eklenir.
     2-ExtentRepportsClassindan bir obje olusturlur.
     3-HTML formatinda duzenlenecegi icin ExtentHtmlReporter classindan obje olusturur.
     4-rapora test ile ilgili bilgiler girebilmek icin
     */

    ExtentReports extentReports;//--raporlamyi baslatir.
    ExtentHtmlReporter extentHtmlReporter;//--raporu html formatinda duzenler
    ExtentTest extentTest;//tum test asamalarinda extentTestobjesi ile bilgi ekleriz.

    @Test
    public void testRaporlari() {
        extentReports=new ExtentReports();
        String tarih=new SimpleDateFormat("ddmmyyyy").format(new Date());
        String dosyaYolu="TestOutput/reports/extentReport_"+tarih+".html";
        extentHtmlReporter=new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);

    }
}
