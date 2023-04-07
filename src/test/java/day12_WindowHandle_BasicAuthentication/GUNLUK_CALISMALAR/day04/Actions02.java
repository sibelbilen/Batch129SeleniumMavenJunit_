package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day04;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

/*
    Amazon anasayfasına gidin
    "Account & List" üzerinde bekleyin (mouse over - hover over)
    Açılan menüde "Account" linkine tıklayın
    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
     */
public class Actions02 extends TestBase {
    @Test
    public void name() {

//    Amazon anasayfasına gidin

        driver.get("https://www.amazon.com");
//    "Account & List" üzerinde bekleyin (mouse over - hover over)

        WebElement accountAndList = driver.findElement(By.id("nav-link-accountList"));

        Actions actions=new Actions(driver);
        actions.moveToElement(accountAndList).perform();



//    Açılan menüde "Account" linkine tıklayın
       driver.findElement(By.xpath("//span[.='Account']")).click();



//    Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
String yourAccount=driver.findElement(By.xpath("//h1")).getText();
       assertEquals("Your Account",yourAccount);

    }
}
