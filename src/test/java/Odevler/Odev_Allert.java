package Odevler;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
-Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
-Çıkan alert'te iptal butonuna basınız
-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
-Çıkan mesajı konsola yazdırınız
-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
 */
public class Odev_Allert extends TestBase {

    @Test
    public void Allert(){
        //-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html");
        //-Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
        WebElement display= driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
        display.click();
        //-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        driver.switchTo().alert().accept();

        //-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
        //-Çıkan alert'te iptal butonuna basınız

        WebElement iptal= driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
        iptal.click();
        driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
        bekle(2);
alertDismiss();
        //-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
      WebElement yeniAd=  driver.findElement(By.cssSelector("button[onclick='promptbox()']"));
      yeniAd.click();
        //-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
       driver.switchTo().alert().sendKeys("sibel");
       alertAccept();
        //-Çıkan mesajı konsola yazdırınız
        System.out.println(driver.findElement(By.xpath("//*[text()='Hello sibel How are you today']")).getText());
        //-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
        Assert.assertEquals("Hello sibel How are you today",driver.findElement(By.xpath("//*[text()='Hello sibel How are you today']")).getText());
    }
}
