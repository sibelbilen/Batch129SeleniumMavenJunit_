package Gunluklerim.JSExecuter;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Js_Executer_Click extends TestBase {
    /*
http://www.uitestpractice.com/Students/Form sayfasına git
Formu doldur
Submit tuşuna tıkla
Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
*/

    @Test
    public void name() {
        //http://www.uitestpractice.com/Students/Form sayfasına git
        driver.get("http://www.uitestpractice.com/Students/Form");
        //Formu doldur
        Actions actions=new Actions(driver);

      driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Faker.instance().name().firstName());
actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB).perform();
driver.findElement(By.xpath("//*[@class='radio-inline']")).click();
driver.findElement(By.xpath("//input[@type='checkbox']")).click();

WebElement ddm=driver.findElement(By.xpath("//select[@id='sel1']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Canada");

        actions.sendKeys("258795555").sendKeys(Keys.TAB).sendKeys("12/02/1996").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("sibel").sendKeys(Keys.TAB).
                sendKeys("sibelcan33@gmail.com").sendKeys(Keys.TAB).sendKeys("sibelcan@gmail.com").
                sendKeys(Keys.TAB).sendKeys("ssss").sendKeys(Keys.TAB).sendKeys("ss").perform();

        //Submit tuşuna tıkla
WebElement button=driver.findElement(By.xpath("//*[text()='Submit']"));
        JavascriptExecutor jsexecutor=(JavascriptExecutor) driver;
        jsexecutor.executeScript("arguments[0].click;",button);
        clickByJS(button);

        //Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
    //    assertEquals("http://www.uitestpractice.com/Students/Form?",driver.getCurrentUrl());

    }
}
