package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day04;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/*
https://techproeducation.com adresine gidin
Sayfanın alt tarafına gidin
Sayfanın üst tarafına gidin
*/
public class Actions extends TestBase {
    @Test
    public void text01() {

        //https://techproeducation.com adresine gidin
        driver.get("https://techproeducation.com ");
        //Sayfanın alt tarafına gidin

        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        org.openqa.selenium.interactions.Actions actions=new org.openqa.selenium.interactions.Actions(driver);
        bekle(4);
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        //page_Down:asagi dogru inen bir methoddur,bu method senkeys icine yazilasi gerekli
        //Arrow_Down:yukariya dogru gider.
        //Sayfanın üst tarafına gidin
        actions.sendKeys(Keys.ARROW_DOWN).perform();

    }
}
