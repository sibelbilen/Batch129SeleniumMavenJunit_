package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Sepetekleme extends TestBase {
    //2. 'http://automationexercise.com' URL'sine gidin

    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    //4. 'Ürünler' düğmesini tıklayın
    //5. İlk ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
    //6. 'Alışverişe Devam Et' düğmesini tıklayın
    //7. İkinci ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
    //8. 'Sepeti Görüntüle' düğmesini tıklayın
    //9. Her iki ürünün de Sepete eklendiğini doğrulayın
    //10. Fiyatlarını, miktarlarını ve toplam fiyatlarını doğrulayın

    @Test
    public void test01() {
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");


        //4. 'Ürünler' düğmesini tıklayın

WebElement tiklmaa=driver.findElement(By.xpath("//*[text()=' Products']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click;",tiklmaa);
        clickByJS(tiklmaa);

        driver.navigate().refresh();
        //5. İlk ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın



        driver.navigate().refresh();
        //6. 'Alışverişe Devam Et' düğmesini tıklayın
        //7. İkinci ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
        //8. 'Sepeti Görüntüle' düğmesini tıklayın
        //9. Her iki ürünün de Sepete eklendiğini doğrulayın
        //10. Fiyatlarını, miktarlarını ve toplam fiyatlarını doğrulayın
    }
}
