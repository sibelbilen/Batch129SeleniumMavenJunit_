package Odevler;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        String tarih1=new SimpleDateFormat("_hh_mm_ss_ddmmyyyy").format(new Date());
        String dosyaYolu1="TestOutput/Odev"+tarih1;


        TakesScreenshot ts=(TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu1));

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
      documentation.submit();
      extentTest.info("linke tiklandi");
        //Documentation webelementinin resmini alalım
        String tarih2 =new SimpleDateFormat("hh_mm_ss_dd_mm_yyyy").format(new Date());
        String dosyaYolu2="TestOutput/Odev"+tarih2;
        TakesScreenshot tss=(TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu2));
extentTest.info("Documentation webelementinin resmi alindi");
        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
        driver.findElement(By.xpath("//*[text()='ChromeDriver 112.0.5615.49']")).click();

        extentTest.info("All versions available in Downloads altında Latest stable release olan linki tıklandi");
        //Açılan pencerede chromedriver'i indirelim

        //Driver'in indiğini doğrulayalım


        //İndirmiş olduğumuz dosyayı silelim
        //Silindiğini doğrulayalım

    }
    @Test
    public void name() throws InterruptedException {
        //https://www.selenium.dev/downloads/ adresine gidelim
        driver.get("https://www.selenium.dev/downloads/");
        //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim
        Actions actions = new Actions(driver);
        WebElement browser = driver.findElement(By.xpath("(//p//button)[81]"));
        actions.moveToElement(browser).perform();
        //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
        browser.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[text()='documentation'])[5]")).click();
        Thread.sleep(1000);
        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
        driver.findElement(By.xpath("(//*[@class='XqQF9c'])[4]")).click();
        List<String> pencereler = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(pencereler.get(1));

        //Açılan pencerede chromedriver'i indirelim
        driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();
        Thread.sleep(10000);
        //Driver'in indiğini doğrulayalım
        //"C:\Users\Lenovo\Downloads\chromedriver_win32.zip"
        String dosyaYolu = System.getProperty("user.home")+"/Downloads/chromedriver_win32.zip";
        assert Files.exists(Paths.get(dosyaYolu));
        Thread.sleep(2000);
        File file = new File(dosyaYolu);
        if (Files.exists(Paths.get(dosyaYolu))){
            file.delete();
        }else System.out.println("Dosya yok");
        Assert.assertFalse(Files.exists(Paths.get(dosyaYolu)));

    }
}
