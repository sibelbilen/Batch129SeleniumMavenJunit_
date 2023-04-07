package Odevler;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Odev12_Actions extends TestBase {
    @Test
    public void test01() {
        //http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");
        //- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz

        WebElement cizim = driver.findElement(By.tagName("canvas"));
        Actions ekrandaGorunenler = new Actions(driver);
        ekrandaGorunenler.clickAndHold(cizim)//clickAndHold() metodu canvas elementine tıklamak için kullanılır
                .moveByOffset(40, 50)//moveByOffset() metodu, çizgiyi çizmek için imlecin konumunu değiştirir.
                .moveByOffset(60, -40)
                .moveByOffset(-60, -60)
                .moveByOffset(-70, 50)
                .release()//fare tıklama işlemini bırakır
                .perform();
        //- Çizimden sonra clear butonuna basınız


        bekle(3);
        WebElement clear= driver.findElement(By.xpath("//button[text()='Clear']"));
        clear.click();
        //- Sayfayi kapatiniz
     driver.close();
    }
}
