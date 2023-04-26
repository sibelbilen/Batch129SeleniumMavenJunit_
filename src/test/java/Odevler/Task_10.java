package Odevler;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    @Test
    public void test01() throws IOException {
        //https://www.selenium.dev/downloads/ adresine gidelim
        driver.get("https://www.selenium.dev/downloads/");

        //Sayfanın resmini alalım


//        String tarih2 =new SimpleDateFormat("hh_mm_ss_dd_mm_yyyy").format(new Date());
//        String dosyaYolu2="TestOutput/Odev"+tarih2;
//        TakesScreenshot tss=(TakesScreenshot) driver;
//        FileUtils.copyFile(tss.getScreenshotAs(OutputType.FILE),new File(dosyaYolu2));

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

//        String tarih=new SimpleDateFormat("ddmmyyyy").format(new Date());
//        String dosyacik="TestOutput/Odevcik"+tarih;
//        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
//        FileUtils.copyFile(takesScreenshot.getScreenshotAs(OutputType.FILE),new File(dosyacik));

        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
        WebElement latest= driver.findElement(By.xpath("//*[text()='ChromeDriver 112.0.5615.49']"));
        latest.click();


        //Açılan pencerede chromedriver'i indirelim


        //Driver'in indiğini doğrulayalım
        //İndirmiş olduğumuz dosyayı silelim
        //Silindiğini doğrulayalım
        //Not: Bu task'in her adımı için Html rapor oluşturalım(Extent Report)


    }
}
