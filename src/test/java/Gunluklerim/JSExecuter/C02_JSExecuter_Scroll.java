package Gunluklerim.JSExecuter;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_JSExecuter_Scroll extends TestBase {
        /*
Techpro education ana sayfasına git
We Offer elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
Aynı sayfada Enroll Free elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
Aynı sayfada WHY US? elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
Aynı sayfada tekrar Enroll Free elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
 */

    @Test
    public void name() throws IOException {

        //Techpro education ana sayfasına git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();



        //We Offer elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
        bekle(3);
      WebElement WeOffer= driver.findElement(By.xpath("//*[text()='we offer']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",WeOffer);

        //ekranGoruntusu:
        String tarih=new SimpleDateFormat("_hh_mm_ss_ddmmyyyy").format(new Date());
        String dosyaYolu="TestOutput"+tarih;
        TakesScreenshot ts=(TakesScreenshot) driver;
     FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));



        //Aynı sayfada Enroll Free elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
        bekle(3);
WebElement enrollFree= driver.findElement(By.xpath("//*[text()='Enroll Free Course']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",enrollFree);

        //ekran

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        String dosya="TestOutput"+tarih;
      FileUtils.copyFile(takesScreenshot.getScreenshotAs(OutputType.FILE),new File(dosya));

        //Aynı sayfada WHY US? elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
        bekle(3);
WebElement scrooll= driver.findElement(By.xpath("//*[text()='Favorite Courses']"));

  JavascriptExecutor je=(JavascriptExecutor) driver;
  je.executeScript("arguments[0].scrollIntoView(true);",scrooll);

  TakesScreenshot takesScreenshot1=(TakesScreenshot) driver;
  String dosyacik="TestOutput"+tarih;
  FileUtils.copyFile(takesScreenshot1.getScreenshotAs(OutputType.FILE),new File(dosyacik));

        //Aynı sayfada tekrar Enroll Free elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
        bekle(3);
        WebElement enrollFreee= driver.findElement(By.xpath("//*[text()='Enroll Free Course']"));
        JavascriptExecutor jss=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",enrollFree);


    }
}
