package day13_ActionsClass;

import Utilities.TestBase;
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
public class C02_Action02 extends TestBase {

    @Test
    public void actions02() {
        //        Amazon anasayfasına gidin
        driver.get("https://www.amazon.com");

//        "Account & List" üzerinde bekleyin (mouse over - hover over)
        WebElement accountAndList = driver.findElement(By.id("nav-link-accountList"));

        Actions actions = new Actions(driver);
        actions.moveToElement(accountAndList).perform();


//        Açılan menüde "Account" linkine tıklayın

        driver.findElement(By.linkText("Account")).click();

//        Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın

        String sayfaBasligi = driver.getTitle();
        assertEquals("Your Account", sayfaBasligi);
    }
}
