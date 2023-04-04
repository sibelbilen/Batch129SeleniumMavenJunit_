package Odevler;


import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
//● https://the-internet.herokuapp.com/iframe adresine
//gidin.
//● Bir metod olusturun: iframeTest
//○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
//○Text Box’a “Merhaba Dunya!” yazin.
//○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur
//oldugunu dogrulayin ve konsolda yazdirin
 */
public class Odev10_Infame extends TestBase {
    @Test
    public void test01() {

    //● https://the-internet.herokuapp.com/iframe adresine
driver.get("https://the-internet.herokuapp.com/iframe");

    ////○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        WebElement erisilme= driver.findElement(By.xpath("//h3"));
       Assert.assertTrue(erisilme.isEnabled());
        erisilme.getText();
    ////○Text Box’a “Merhaba Dunya!” yazin.
        WebElement iframe= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement textBox= driver.findElement(By.xpath("//*[text()='Your content goes here.']"));
textBox.clear();
      textBox.sendKeys("merhaba dunya!");
    ////○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur
      driver.switchTo().parentFrame();
      WebElement ElementSelenium= driver.findElement(By.linkText("Elemental Selenium"));
      Assert.assertTrue(ElementSelenium.isDisplayed());
        System.out.println(ElementSelenium.getText());

    ////oldugunu dogrulayin ve konsolda yazdirin
}
}
