package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day05;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase_Actions extends TestBase {
    /*
    2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. 'Kaydol / Giriş Yap' düğmesine tıklayın
5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
6. Doğru e-posta adresini ve şifreyi girin
7. 'Giriş' düğmesine tıklayın
8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
9. 'Hesabı Sil' düğmesini tıklayın
10. 'HESAP SİLİNDİ!' görünür
     */

    @Test
    public void test01() {

        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement anaSayfa= driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(anaSayfa.isDisplayed());
        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        WebElement giris= driver.findElement(By.xpath("//*[text()=' Signup / Login']"));

        Actions actions=new Actions(driver);
        actions.click(giris).perform();
        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
Assert.assertTrue(driver.findElement(By.xpath("//h2[.='Login to your account']")).isDisplayed());

        //6. kayit olunuz
WebElement kayit= driver.findElement(By.xpath("//input[@type='text']"));
actions.clickAndHold(kayit).sendKeys("sibel").sendKeys(Keys.TAB).sendKeys("sibel@gmail.com").sendKeys(Keys.ENTER).perform();

WebElement form= driver.findElement(By.xpath("//div[@id='uniform-id_gender2']"));
actions.click(form).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys("sibelcan").
        sendKeys(Keys.TAB).
        sendKeys("2").
        sendKeys(Keys.TAB).
        sendKeys("December").
        sendKeys(Keys.TAB).
        sendKeys("1998").

        click().
        sendKeys(Keys.TAB).
        click().
        sendKeys("sibel").
        sendKeys(Keys.TAB).
        sendKeys("bilen").
        sendKeys(Keys.TAB).perform();



        //7. 'Giriş' düğmesine tıklayın
        //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        //9. 'Hesabı Sil' düğmesini tıklayın
        //10. 'HESAP SİLİNDİ!' görünür
    }
}
