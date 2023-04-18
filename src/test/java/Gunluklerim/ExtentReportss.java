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
ExtentReports extentReports;//--->raporlamayi baslatir.
    ExtentHtmlReporter extentHtmlReporter;//----->raporlamyi html formatinda duzenler.
    ExtentTest extentTest;//--->Tum Test asamalarinda extest objesi ile bilgi ekleriz

    @Test
    public void name() {
        extentReports=new ExtentReports();
        String tarih=new SimpleDateFormat("_hh_ss_dd_dd/mm/yyyy").format(new Date());
        String dosyaYolu="TestOutput/reports/sibelTekrar"+tarih;
        extentHtmlReporter=new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);

        //raporda ggozukmaisni istedigimiz bilgiler
        extentReports.setSystemInfo("chrome","edge");
        extentReports.setSystemInfo("tester","sibel guler");
        extentHtmlReporter.config().setReportName("bakalim nerede");
        extentHtmlReporter.config().setReportName("rapor ismi herhalde");
        extentTest=extentReports.createTest("test ismi","test ra");



        driver.get("https://amazon.com");

        extentTest.info("amazon sayfasina giris yapildi");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        extentTest.info("amazon sayfasinda iphone aramasi yapildi");
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(sonucYazisi.getText());
        extentTest.info("test yazisi konsola yazildi");
        extentTest.pass("sayfa kapatildi");





        extentReports.flush();
    }
}

