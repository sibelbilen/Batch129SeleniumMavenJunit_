package Odevler;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Odev_RenkDegistirme extends TestBase {
    /*
    -https://jqueryui.com/slider/#colorpicker adrese gidiniz
-Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız
-Sarı olduğunu test edelim
     */

    @Test
    public void test01() {
        //-https://jqueryui.com/slider/#colorpicker adrese gidiniz
        driver.get("https://jqueryui.com/slider/#colorpicker");

        // // sayfanın yüklenmesini bekleyin

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //iframe olan kismi gecmeliyiz
        WebElement iframe= driver.findElement(By.xpath("//iframe[@src='/resources/demos/slider/colorpicker.html']"));
driver.switchTo().frame(iframe);

        //-Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız

        WebElement renkSecimi= driver.findElement(By.xpath("//div[@id='green']"));
        Actions actions=new Actions(driver).clickAndHold(renkSecimi);
        bekle(2);
        actions.moveByOffset(75,60).release().perform();
        bekle(2);
actions.moveByOffset(255,60).release().perform();
        //-Sarı olduğunu test edelim
       WebElement sari= driver.findElement(By.xpath("//div[@id='swatch']"));


    }
}
