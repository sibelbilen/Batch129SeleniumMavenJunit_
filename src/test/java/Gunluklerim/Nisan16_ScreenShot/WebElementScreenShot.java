package Gunluklerim.Nisan16_ScreenShot;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebElementScreenShot extends TestBase {
    @Test
    public void     ScreenShot() throws IOException {
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Arama bölümünde iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //Sonuc yazısının resmini alınız
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
   String tarih=new SimpleDateFormat("ddmmyyyy").format(new Date());
   String dosyaYolu="TestOutput/deneme"+tarih+".png";
   FileUtils.copyFile(sonucYazisi.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
    }
}
