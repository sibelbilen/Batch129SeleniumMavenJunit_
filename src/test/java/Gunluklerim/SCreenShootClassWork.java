package Gunluklerim;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//     //Techproeducation sayfasına gidelim
//        driver.get("https://techproeducation.com");
//        //sayfanın resmini alalım
//        //Arama bölümünde java aratalım
//        //ve sonuc yazısının resmini alalım
//        //Yeni bir sekmede amazona gidelim
//        //sayfanın resmini alalım
//        //arama bölümde iphone aratalım
//        //tekrar tecpro sayfasına geçelim ve sayfa resmini alalım
public class SCreenShootClassWork extends TestBase {

    @Test
    public void test01() throws IOException {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //sayfanın resmini alalım
        TakesScreenshot ts=(TakesScreenshot) driver;
        String tarih =new SimpleDateFormat("ddmmyyyy").format(new Date());
        String dosyaYolu="TestOutput/Tekrardersi"+"  " +tarih;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
        //Arama bölümünde java aratalım
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java", Keys.ENTER);
        //ve sonuc yazısının resmini alalım
        WebElement sonucYazisi=driver.findElement(By.xpath("//h1"));
        String tarihalma=new SimpleDateFormat("ddmmyyyy").format(new Date());
        String dosyayolu="TestOutput/sonucyazisiekranresmitechpro"+" "+tarih;
        FileUtils.copyFile(sonucYazisi.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));

        //Yeni bir sekmede amazona gidelim
        driver.switchTo().newWindow(WindowType.TAB).get("http://amazon.com");
        //sayfanın resmini alalım
        String tarihh=new SimpleDateFormat("_hh_ss_mm_ddmmyyyy").format(new Date());
        String resimAlmaDsoya="TestOutput/amazonEkranresmi "+ tarihh;


        //arama bölümde iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //ve sonuc yazısının resmini alalım
        WebElement sonucYazisi2 = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        String tarh=new SimpleDateFormat("_hh_ss_mm_ddmmyyyy").format(new Date());
        String dsyayolu="TestOutput/amazonSonucSayisi"    +tarh;
        //tekrar tecpro sayfasına geçelim ve sayfa resmini alalım
        window(0);
        tumSayfaResmi();
    }
}
