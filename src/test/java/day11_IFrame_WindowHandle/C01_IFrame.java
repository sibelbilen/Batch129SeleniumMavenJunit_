package day11_IFrame_WindowHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
https://the-internet.herokuapp.com/iframe sayfasına gidiniz
Kalın yazının "Editor" kelimesimi içerdiğini doğrulayınız
Textbox içindeki yazıyı siliniz.
Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
 */

public class C01_IFrame extends TestBase {

    @Test

    public void test01(){

//https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
//Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
String sayfaBasligi=driver.findElement(By.xpath("//h3")).getText();
     Assert.assertTrue(sayfaBasligi.contains("Editor"));

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
