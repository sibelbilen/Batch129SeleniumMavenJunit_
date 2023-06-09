package Odevler;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task_10 extends TestBase {
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
ExtentReports extentReports;//--raporlamayi baslatir
    ExtentHtmlReporter extentHtmlReporter;//raporlamyi htmll formatinda duzenler
    ExtentTest extentTest;//tum test asamalrinda extent test objesi ile bilgi verir.

    @Test
    public void test01() throws IOException {


        extentReports=new ExtentReports();
        String extetntRaporYolu="TestOutput/reports/odev";
        extentHtmlReporter=new ExtentHtmlReporter(extetntRaporYolu);
        extentReports.attachReporter(extentHtmlReporter);
        //https://www.selenium.dev/downloads/ adresine gidelim
        driver.get("https://www.selenium.dev/downloads/");

        //Sayfanın resmini alalım


        String tarih2 =new SimpleDateFormat("hh_mm_ss_dd_mm_yyyy").format(new Date());
        String dosyaYolu2="TestOutput/Odev"+tarih2;
        TakesScreenshot tss=(TakesScreenshot) driver;
        FileUtils.copyFile(tss.getScreenshotAs(OutputType.FILE),new File(dosyaYolu2));

        //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim
        Actions actions=new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();

        //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
        driver.findElement(By.xpath("//*[@id=\"platforms-supported-by-selenium\"]/div/div/p[2]/button")).click();
       WebElement chrome= driver.findElement(By.xpath("(//*[text()='documentation'])[5]"));
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].click;",chrome);
       clickByJS(chrome);

        //Documentation webelementinin resmini alalım

        String tarih=new SimpleDateFormat("ddmmyyyy").format(new Date());
        String dosyacik="TestOutput/Odevcik"+tarih;
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        FileUtils.copyFile(takesScreenshot.getScreenshotAs(OutputType.FILE),new File(dosyacik));

        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
      WebElement latest= driver.findElement(By.xpath("//*[text()='ChromeDriver 112.0.5615.49']"));
        latest.click();


      List<String> pencereler = new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(pencereler.get(1));


        //Açılan pencerede chromedriver'i indirelim
     WebElement chromeDriver=   driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']"));
     JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
     javascriptExecutor.executeScript("arguments[0].click;",chromeDriver);
     clickByJS(chromeDriver);


        //Driver'in indiğini doğrulayalım

        //"C:\Users\Casper\Downloads\chromedriver_win32 (3).zip"
        String dosyayol=System.getProperty("user.home")+"//Downloads//chromedriver_win32 (3).zip";
       assert Files.exists(Paths.get(dosyayol));



        //İndirmiş olduğumuz dosyayı silelim
     File file=new File(dosyayol);
     if (Files.exists(Paths.get(dosyayol))){
         file.delete();
     }else
         System.out.println("dosya yok");


        }

        //Silindiğini doğrulayalım

        //Not: Bu task'in her adımı için Html rapor oluşturalım(Extent Report)


    }

