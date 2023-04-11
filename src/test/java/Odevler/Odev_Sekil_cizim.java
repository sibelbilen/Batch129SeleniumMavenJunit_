package Odevler;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//- http://szimek.github.io/signature_pad/ sayfasına gidiniz
//        - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
//        - Çizimden sonra clear butonuna basınız
//        - Sayfayi kapatiniz
public class Odev_Sekil_cizim extends TestBase {

    @Test
    public void test01() {

        //- http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");
        //- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        WebElement cizim = driver.findElement(By.xpath("//canvas"));

        Actions actions=new Actions(driver).clickAndHold(cizim);

        for (int i = 0; i <10 ; i++) {
            actions.moveByOffset(-5,-5);

        }
        for (int i = 0; i <10 ; i++) {
            actions.moveByOffset(0,5);
        }
        for (int i = 0; i <10 ; i++) {
            actions.moveByOffset(5,0);
        }
        actions.release().build().perform();

        //- Çizimden sonra clear butonuna basınız


        driver.findElement(By.xpath("//*[text()='Clear']")).click();
        //- Sayfayi kapatiniz
   driver.close();


    }


}
