package GUNLUK_CALISMALAR.day03_Iframe_WindowsHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class C02_WindowHandle extends TestBase {
      /*
    https://the-internet.herokuapp.com/windows adresine gidin.
    İlk sayfanın ID'sini alın.
    Sayfadaki textin "Opening a new window" olduğunu doğrulayın.
    Sayfa başlığının(title) "The Internet" olduğunu doğrulayın.
    "Click Here" butonuna tıklayın.
    Açılan pencereye geçin.
    Açılan yeni pencerenin sayfa başlığının(title) "New Window" olduğunu doğrulayın.
    Bir önceki pencereye dönüp sayfa başlığının "The Internet" olduğunu  doğrulayın.
    2. pencereye tekrar geçin.
    1. pencereye tekrar dönün.
     */

    @Test
    public void WindowHandle() {


        //    https://the-internet.herokuapp.com/windows adresine gidin.

        driver.get(" https://the-internet.herokuapp.com/windows");

        //    İlk sayfanın ID'sini alın.

   String   ilkSayfaId=driver.getWindowHandle();
        System.out.println("ilkSayfaId = " + ilkSayfaId);
        //    Sayfadaki textin "Opening a new window" olduğunu doğrulayın.

        WebElement window1Text = driver.findElement(By.xpath("//h3[.='Opening a new window']"));
        assertEquals("Opening a new window",window1Text.getText());



        //    Sayfa başlığının(title) "The Internet" olduğunu doğrulayın.

     String sayfaBasligi  = driver.getTitle();
    assertEquals("The Internet",sayfaBasligi);


        //    "Click Here" butonuna tıklayın.

driver.findElement(By.linkText("Click Here")).click();
bekle(3);


        //    Açılan pencereye geçin.
//bu safhada iki pencere acik 2.pencereye gecis yapiyorum!
        Set<String>allWindowhandles=driver.getWindowHandles();
        System.out.println("allWindowhandles = " + allWindowhandles);
        for (String w : allWindowhandles) {
            if (!w.equals(ilkSayfaId)){
                driver.switchTo().window(w);
            }
        }
        //    Açılan yeni pencerenin sayfa başlığının(title) "New Window" olduğunu doğrulayın.
        Assert.assertEquals("New Window",driver.getTitle());
      String ikinciPencere=  driver.getWindowHandle();
        //    Bir önceki pencereye dönüp sayfa başlığının "The Internet" olduğunu  doğrulayın.
        driver.switchTo().window(ilkSayfaId);
        Assert.assertEquals("The Internet",driver.getTitle());
        //    2. pencereye tekrar geçin.
        driver.switchTo().window(ikinciPencere);
        //    1. pencereye tekrar dönün.
        driver.switchTo().window(ilkSayfaId);

    }
}
