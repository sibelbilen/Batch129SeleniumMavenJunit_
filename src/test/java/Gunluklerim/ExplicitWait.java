package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
https://the-internet.herokuapp.com/dynamic_loading/1
Start buttonuna tıklayın
Hello World! Yazının sitede oldugunu test edin
*/
public class ExplicitWait extends TestBase {
    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Start buttonuna tıklayın
driver.findElement(By.xpath("//div[@id='start']/button")).click();
        //Hello World! Yazının sitede oldugunu test edin
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement helloText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));

        WebElement helloWordtest= driver.findElement(By.xpath("//div[@id='finish']/h4"));
        Assert.assertTrue(helloWordtest.isDisplayed());
    }
}
