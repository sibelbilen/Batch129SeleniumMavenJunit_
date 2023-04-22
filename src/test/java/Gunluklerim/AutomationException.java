package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//2. 'http://automationexercise.com' URL'sine gidin
//3. Ana sayfanın başarıyla göründüğünü doğrulayın
//4. 'Bize Ulaşın' düğmesine tıklayın
//5. "İLETİŞİME GEÇİN" ifadesinin görünür olduğunu doğrulayın
//6. Adı, e-postayı, konuyu ve mesajı girin
//7. Dosya yükleyin
//8. 'Gönder' düğmesini tıklayın
//9. Tamam düğmesine tıklayın
//10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
//11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın
public class AutomationException extends TestBase {
    @Test
    public void name() {


        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");


        //3. Ana sayfanın başarıyla göründüğünü doğrulayın

        WebElement AnaSayfa= driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(AnaSayfa.isDisplayed());

        //4. 'Bize Ulaşın' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()=' Contact us']")).click();


        //5. "İLETİŞİME GEÇİN" ifadesinin görünür olduğunu doğrulayın
WebElement iletisim= driver.findElement(By.xpath("//div[@class='col-sm-12']"));
        System.out.println(iletisim.isDisplayed());



        //6. Adı, e-postayı, konuyu ve mesajı girin
        Actions actions =new Actions(driver);

        WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
    name.sendKeys("sibel");
        actions.sendKeys("bilen").sendKeys(Keys.TAB).sendKeys("Bilen33@gmail.com").sendKeys(Keys.TAB).sendKeys("hhhhh")
                .sendKeys(Keys.TAB).sendKeys("hhhh").perform();
        //7. Dosya yükleyin
        WebElement uploadFile = driver.findElement(By.xpath("//input[@name='upload_file']"));
        uploadFile.sendKeys("C:/Users/Casper/Desktop/logo.jpeg");


        //8. 'Gönder' düğmesini tıklayın

        driver.findElement(By.xpath("//input[@name='submit']")).click();
        //9. Tamam düğmesine tıklayın
        driver.switchTo().alert().accept();
        //10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
        WebElement mesaj=driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        System.out.println(mesaj.isDisplayed());
        //11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın
        WebElement anaSayfa=driver.findElement(By.xpath("//div[@id='form-section']"));
        System.out.println(anaSayfa.isDisplayed());
    }
}
