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
    public void test01() throws InterruptedException {
    /*
    https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
    Bir metod olusturun: acceptAlert
    1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
    Bir metod olusturun: dismissAlert
    2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
    “successfuly” icermedigini test edin.
    Bir metod olusturun: sendKeysAlert
    3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
     */

            // https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
            driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
            //    1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
            driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
            Thread.sleep(4000);
            driver.switchTo().//Geçmek,Değiştirmek
                    alert().//Alert'e geçiş yaptı
                    accept();//Çıkan uyarıda OK yada TAMAM butonuna basar
            Thread.sleep(4000);
            String actualText = driver.findElement(By.xpath("//*[@id='result']")).getText();
            String expectedText = "You successfully clicked an alert";
            Assert.assertEquals(expectedText, actualText);
        }
        @Test
        public void dismissAlert () throws InterruptedException {
            driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
            //    2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
            driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
            Thread.sleep(4000);
            driver.switchTo().alert().dismiss();
            //    “successfuly” icermedigini test edin.
            Thread.sleep(4000);
            String actualText = driver.findElement(By.xpath("//*[@id='result']")).getText();
            String expectedText = "successfuly";
            Assert.assertFalse(actualText.contains(expectedText));
        }
        @Test
        public void sendKeysAlert () throws InterruptedException {
            driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
            //    3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
            //    tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
            driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
            driver.switchTo().alert().sendKeys("Erol");
            driver.switchTo().alert().accept();
            Thread.sleep(3000);
            WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
            Assert.assertTrue(result.getText().contains("Erol"));
            System.out.println(result.getText());
        }
    }

