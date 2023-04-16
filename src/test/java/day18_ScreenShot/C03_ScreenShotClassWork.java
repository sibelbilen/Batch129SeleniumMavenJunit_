package day18_ScreenShot;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class C03_ScreenShotClassWork extends TestBase {


        @Test
        public void classWork() {
            //Techproeducation sayfasına gidelim
            driver.get("https://techproeducation.com");
            bekle(3);
            driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum
            //sayfanın resmini alalım
            tumSayfaResmi();
            //Arama bölümünde java aratalım
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java", Keys.ENTER);
            //ve sonuc yazısının resmini alalım
            WebElement sonucYazisi = driver.findElement(By.xpath("//h1"));
            webElementResmi(sonucYazisi);//Method kullanarak Webelementin resmini aldık
            //Yeni bir sekmede amazona gidelim
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://amazon.com");
            //sayfanın resmini alalım
            tumSayfaResmi();
            //arama bölümde iphone aratalım
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
            //ve sonuc yazısının resmini alalım
            WebElement sonucYazisi2 = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
            webElementResmi(sonucYazisi2);//Method kullanarak Webelementin resmini aldık
            //tekrar tecpro sayfasına geçelim ve sayfa resmini alalım
            window(0);
            tumSayfaResmi();
        }

}
