package Gunluklerim;

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

public class ExtentReportss extends TestBase {
    ExtentReports extentReports;//====>>>raporlamyi baslatir.
    ExtentHtmlReporter extentHtmlReporter;//====>>raporlari html formatinda duzenler.
    ExtentTest extentTest;//==>tum test asamalarinda extentTest classindan bir obje olusturur.

    @Test
    public void extentReport() {
     extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/reports/extentReportTEKRAR"+tarih+".html";
        extentHtmlReporter=new ExtentHtmlReporter(dosyaYolu);

extentReports.attachReporter(extentHtmlReporter);

extentReports.setSystemInfo("chrome","edge");
extentReports.setSystemInfo("QA","sibel guler");
extentHtmlReporter.config().setReportName("extent rapor");
extentHtmlReporter.config().setReportName("smoke test");
extentTest=extentReports.createTest("bakim");
driver.get("https://amazon.com");
extentTest.info("amazon sayfasina gidilid");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        extentTest.info("Amazon sayfasında iphone araması yapıldı");
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(sonucYazisi.getText());
        extentTest.info("Sonuc yazısı konsola yazdırıldı");
        extentTest.pass("Sayfa kapatıldı");
        extentReports.flush();


    }
}
