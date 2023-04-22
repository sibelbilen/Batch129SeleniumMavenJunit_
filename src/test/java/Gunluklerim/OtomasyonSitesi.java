package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OtomasyonSitesi extends TestBase {
    //1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    //4. Sayfayı aşağıya doğru kaydırın
    //5. 'ABONELİK'in görünür olduğunu doğrulayın
    //6. Sayfayı yukarı kaydır
    //7. Sayfanın yukarı kaydırıldığını ve 'Otomasyon Mühendisleri için Tam Teşekküllü uygulama web sitesi' metninin ekranda göründüğünü doğrulayın


    @Test
    public void test01 () {

        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement AnaSayfa= driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(AnaSayfa.isDisplayed());

        //4. Sayfayı aşağıya doğru kaydırın
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).perform();
        //5. 'ABONELİK'in görünür olduğunu doğrulayın
        WebElement abonelik= driver.findElement(By.xpath("//*[text()='Subscription']"));
        System.out.println(abonelik.isDisplayed());
        //6. Sayfayı yukarı kaydır
        actions.sendKeys(Keys.PAGE_UP).perform();
        //7. Sayfanın yukarı kaydırıldığını ve 'Otomasyon Mühendisleri için Tam Teşekküllü uygulama web sitesi' metninin ekranda göründüğünü doğrulayın
    }
}
