package Odevler;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TASK10 extends TestBase {
    //https://www.selenium.dev/downloads/ adresine gidelim
    //Sayfanın resmini alalım
    //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim
    //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
    //Documentation webelementinin resmini alalım
    //All versions available in Downloads altında Latest stable release olan linki tıklayalım
    //Açılan pencerede chromedriver'i indirelim
    //Driver'in indiğini doğrulayalım
    //İndirmiş olduğumuz dosyayı silelim
    //Silindiğini doğrulayalım
    //Not: Bu task'in her adımı için Html rapor oluşturalım(Extent Report)


    @Test
    public void test01() throws IOException {
        extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/reports/extentReport_"+tarih+".html";
        extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);

        extentTest=extentReports.createTest("extent test","test raporu");

        //https://www.selenium.dev/downloads/ adresine gidelim
        driver.get("https://www.selenium.dev/downloads/");

extentTest.info("https://www.selenium.dev/downloads/ sayfasina gidildi");

        //Sayfanın resmini alalım

//        String tarih=new SimpleDateFormat("_hh_mm_ss_ddmmyyyy").format(new Date());
//        String dosyaYolu="TestOutput/Odev"+tarih;
//
//
//        TakesScreenshot ts=(TakesScreenshot) driver;
//        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));

        extentTest.info("sayfa resmi alindi");

        //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim

        Actions actions=new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).

                perform();
extentTest.info("actions methoduyla sayfa asagiya kadar indirildi");

        //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
        driver.findElement(By.xpath("//*[@id=\"platforms-supported-by-selenium\"]/div/div/p[2]/button")).click();
      WebElement documentation= driver.findElement(By.cssSelector("#supported-browsers > div:nth-child(5) > div > div.col-md-10 > div > p > a"));
      documentation.click();
      extentTest.info("linke tiklandi");
        //Documentation webelementinin resmini alalım
//        String tarih =new SimpleDateFormat("hh_mm_ss_dd_mm_yyyy").format(new Date());
//        String dosyaYolu="TestOutput/Odev"+tarih;
//        TakesScreenshot ts=(TakesScreenshot) driver;
//        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
extentTest.info("Documentation webelementinin resmi alindi");
        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
        driver.findElement(By.xpath("//*[text()='ChromeDriver 112.0.5615.49']")).click();

        extentTest.info("All versions available in Downloads altında Latest stable release olan linki tıklandi");
        //Açılan pencerede chromedriver'i indirelim
        WebElement latestReleaseLink = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[2]/a"));
        latestReleaseLink.click();

        //Driver'in indiğini doğrulayalım


        //İndirmiş olduğumuz dosyayı silelim
        //Silindiğini doğrulayalım

    }
}
