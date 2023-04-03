package day11_IFrame_WindowHandle;
/*
    https://the-internet.herokuapp.com/windows adresine gidin.
    İlk sayfanın ID'sini alın.
    Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    "Click Here" butonuna tıklayın.
    Açılan pencereye geçin.
    Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.
    Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın.
    2. pencereye tekrar geçin.
    1. pencereye tekrar dönün.
     */


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
        public void windowHandle() throws InterruptedException {
//        https://the-internet.herokuapp.com/windows adresine gidin.
            driver.get("https://the-internet.herokuapp.com/windows");

//        İlk sayfanın ID'sini alın.
            String window1Handle = driver.getWindowHandle();
            System.out.println("window1Handle = " + window1Handle);

//        Sayfadaki textin "Opening a new window" olduğunu doğrulayın.
            WebElement window1Text = driver.findElement(By.xpath("//h3[.='Opening a new window']"));
            assertEquals("Opening a new window", window1Text.getText());

//        Sayfa başlığının(title) "The Internet" olduğunu doğrulayın.
            String sayfaBasligi = driver.getTitle();
            assertEquals("The Internet", sayfaBasligi);

//        "Click Here" butonuna tıklayın.
            driver.findElement(By.linkText("Click Here")).click();
            Thread.sleep(3000);

//        Açılan pencereye geçin.
            //Bu safhada 2 pencere açık. 2. pencereye geçiş yapıyorum:
            Set<String> allWindowHandles = driver.getWindowHandles();
            System.out.println("allWindowHandles = " + allWindowHandles);

            for (String w : allWindowHandles) {// [BAE165ED9B38E1EA8A56FD6E531BEBD1, 6C25CADBD5912223D3AC0D600C204D8A]
                if (!w.equals(window1Handle)) {
                    driver.switchTo().window(w);
                }
            }

            //Bu noktada driver 2. sayfadadır:
//        Açılan yeni pencerenin sayfa başlığının(title) "New Window" olduğunu doğrulayın.
            assertEquals("New Window", driver.getTitle());
            String window2Handle = driver.getWindowHandle();

//        Bir önceki pencereye dönüp sayfa başlığının "The Internet" olduğunu  doğrulayın.
            Thread.sleep(2000);
            driver.switchTo().window(window1Handle);
            assertEquals("The Internet", driver.getTitle());

//        2. pencereye tekrar geçin.
            Thread.sleep(2000);
            driver.switchTo().window(window2Handle);

//        1. pencereye tekrar dönün.
            Thread.sleep(2000);
            driver.switchTo().window(window1Handle);

        }
    }