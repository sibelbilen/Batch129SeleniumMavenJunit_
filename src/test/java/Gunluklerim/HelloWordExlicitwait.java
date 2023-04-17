package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelloWordExlicitwait extends TestBase {
    @Test
    public void test01() {
   //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Start buttonuna tıklayın
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        //Hello World! Yazının sitede oldugunu test edin
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement helloWord=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4")));
        Assert.assertTrue(helloWord.isDisplayed());



    }
}
