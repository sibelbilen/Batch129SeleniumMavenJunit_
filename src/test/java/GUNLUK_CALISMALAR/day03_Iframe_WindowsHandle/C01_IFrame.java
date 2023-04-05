package GUNLUK_CALISMALAR.day03_Iframe_WindowsHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class C01_IFrame extends TestBase {
    /*
https://the-internet.herokuapp.com/iframe sayfasına gidiniz
Kalın yazının "Editor" kelimesimi içerdiğini doğrulayınız
Textbox içindeki yazıyı siliniz.
Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
 */

    @Test
    public void iframe() {

        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
        //Kalın yazının "Editor" kelimesimi içerdiğini doğrulayınız


     String baslik=driver.findElement(By.xpath("//h3")).getText();
     assertTrue(baslik.contains("Editor"));

        //Texbox iframe icerisinde yer aldigi icin once iframe gecis yapmaliyiz
     WebElement iframe= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
     driver.switchTo().frame(iframe);


        //Textbox içindeki yazıyı siliniz.
        WebElement textbox= driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        textbox.clear();




        //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.

        textbox.sendKeys("Bu textbox iFrame içinde yer almaktadır");
        //Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.


        //WebElementimiz defult page(varsayilansayfa)yer aldigi icin once driver'i iframe disina almaliyiz yani sayfamiza almaliyiz.
        driver.switchTo().parentFrame();//ust iFrame yani bir onceki sayfaya doner
        WebElement ElementalSelenium=driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(ElementalSelenium.isDisplayed());
    }
}
