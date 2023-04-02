package Odevler;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
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
public class Odev09 extends TestBase {

    @Test
    public void name() {
    }

    @Test
    public void test01() throws InterruptedException {
        // -http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html ");
//-Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
        WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        alert.click();

        //-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
        @Test
        public void test02() throws InterruptedException {
            // -http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
            driver.get("http://demo.automationtesting.in/Alerts.html ");
            //-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            //-Çıkan alert'te iptal butonuna basınız
            Thread.sleep(3000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(3000);
        }


      @Test
    public void test03() throws InterruptedException {
          // -http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
          driver.get("http://demo.automationtesting.in/Alerts.html ");
        //-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız

        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
        Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
//-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
          driver.switchTo().alert().sendKeys("sibel");
          driver.switchTo().alert().accept();
          Thread.sleep(3000);
          //-Çıkan mesajı konsola yazdırınız


          //-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
          driver.findElement(By.xpath("//*[text()='Hello sibel How are you today']"));

          String mesaj=driver.findElement(By.xpath("//*[text()='Hello sibel How are you today']")).getText();
          String olmasiIstenilen="Hello sibel How are you today";
          Assert.assertEquals(mesaj,olmasiIstenilen);


    }
}

