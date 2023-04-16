package day18_ScreenShot;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C04_ExtentsReportTest extends TestBase {
    /*
       EXTENTREPORT kullanabilmemiz için;
           1-pom.xml dosyasına extentreports dependency'si eklenir
           2-ExtentReports class'ından bir obje oluşturulur
           3-HTML formatında düzenleneceği için ExtentHtmlReporter class'ından obje oluşturulur
           4-Rapora test ile ilgili bilgiler girebilmek için ExtentTest class'ından bir obje oluşturulur
        */
    ExtentReports extentReports; //Raporlamayı başlatır
    ExtentHtmlReporter extentHtmlReporter;//Raporu HTML formatında düzenler
    ExtentTest extentTest;//Tüm test aşamalarında extentTest objesi ile bilgi ekleriz
    @Test
    public void extentReportTest() {
        extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/reports/extentReport_"+tarih+".html";
        extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);

        //Raporda gözükmesini istediğimiz bilgiler için
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Teste","Erol");
        extentHtmlReporter.config().setDocumentTitle("Extent Report");
        extentHtmlReporter.config().setReportName("Smoke Test Raporu");
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");

        driver.get("https://amazon.com");
        extentTest.info("Amazon sayfasına gidildi");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        extentTest.info("Amazon sayfasında iphone araması yapıldı");
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(sonucYazisi.getText());
        extentTest.info("Sonuc yazısı konsola yazdırıldı");
        extentTest.pass("Sayfa kapatıldı");





        extentReports.flush();

    }
}
