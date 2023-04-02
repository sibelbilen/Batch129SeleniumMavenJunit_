package day09;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C03_Alert  extends TestBase {
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



    @Test
    public void alerts() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//Bir metod olusturun: acceptAlert
//1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();

        //    1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        Thread.sleep(4000);
        driver.switchTo().//Geçmek,Değiştirmek
                alert().//Alert'e geçiş yaptı
                accept();//Çıkan uyarıda OK yada TAMAM butonuna basar
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedText = "You successfully clicked an alert";
        Assert.assertEquals(expectedText,actualText);



//Bir metod olusturun: sendKeysAlert
//3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
//tıklayın ve result mesajında isminizin görüntülendiğini doğ

    }
    @Test
    public void dismissAlert() throws InterruptedException {
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
}
