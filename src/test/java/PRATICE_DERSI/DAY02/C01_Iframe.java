package PRATICE_DERSI.DAY02;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;
// https://html.com/tags/iframe sayfasına gidiniz
// Videoyu görecek kadar asagiya ininiz
// Videoyu izlemek icin Play tusuna basiniz
// Videoyu calistirdiginizi test ediniz
// 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz

public class C01_Iframe extends TestBase {

    @Test
    public void test01() {
        // https://html.com/tags/iframe sayfasına gidiniz
        driver.get("https://html.com/tags/iframe");




        // Videoyu görecek kadar asagiya ininiz
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();




        // Videoyu izlemek icin Play tusuna basiniz
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe);

WebElement playTusu= driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
playTusu.click();
   /*
        Play'i dogru locate edip click yapmamıza ragmen videoyu calıstırmadı
        bunun uzerine HTML kodlarını inceleyince
        play'in aslında bir iframe icerisinde oldugunu gorduk
        bu durumda once iframe'i locate edip
        switchTo() ile o iframe'e gectik
         */

        // Videoyu calistirdiginizi test ediniz
        WebElement youTubeYazisi = driver.findElement(By.xpath("//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
        assertTrue(youTubeYazisi.isDisplayed());

        // 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz
        driver.switchTo().parentFrame();
        WebElement powerYazisi = driver.findElement(By.xpath("//span[@id='Powerful_but_easy_to_misuse']"));
        assertTrue(powerYazisi.isDisplayed());
    }
}
