package day13_ActionsClass;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class C01_Actions01 extends TestBase {
 /*
https://the-internet.herokuapp.com/context_menu  sitesine gidin
Kutuya sağ tıklayın
Alert'te cikan yazinin "You selected a context menu" oldugunu test edin
Tamam diyerek alert'i kapatın
 */

    @Test
    public void actions() {

//        https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

//        Kutuya sağ tıklayın

        //Sağ tık işlemi için contextClick() methoduna ihtiyacımız var. Bunun için Actions objesi oluşturulmalıdır.
        //1. adım: Actions objesi oluşturun
        Actions actions = new Actions(driver);

        //2. adım: Üzerinde işlem yapılacak WebElement'i locate edin
        WebElement kutu = driver.findElement(By.id("hot-spot"));

        //3. adım: İşlemi uygulayın
        actions.contextClick(kutu).perform();

//        Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        String alertYazisi = driver.switchTo().alert().getText();
        assertEquals("You selected a context menu", alertYazisi);

//        Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();

    }

    }

