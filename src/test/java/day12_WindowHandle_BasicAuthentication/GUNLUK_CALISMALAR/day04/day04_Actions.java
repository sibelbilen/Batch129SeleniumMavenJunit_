package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day04;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class day04_Actions extends TestBase {
    
    /*
https://the-internet.herokuapp.com/context_menu  sitesine gidin
Kutuya sağ tıklayın
Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
Tamam diyerek alert'i kapatın
 */


    @Test
    public void actions01() {

//https://the-internet.herokuapp.com/context_menu  sitesine gidin

        driver.get("https://the-internet.herokuapp.com/context_menu");


//Kutuya sağ tıklayın

        WebElement sagTiklama=driver.findElement(By.xpath("//div[@id='hot-spot']"));

        Actions actions=new Actions(driver);
        bekle(4);
        actions.contextClick(sagTiklama).perform();

//Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
        String allert=driver.switchTo().alert().getText();

       assertEquals("You selected a context menu",allert);
//Tamam diyerek alert'i kapatın
        bekle(6);
        driver.switchTo().alert().accept();
    }
}
