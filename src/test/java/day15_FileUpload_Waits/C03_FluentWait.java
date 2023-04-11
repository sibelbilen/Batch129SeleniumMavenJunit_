package day15_FileUpload_Waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_FluentWait  extends TestBase {
/*
https://the-internet.herokuapp.com/dynamic_loading/1
Start buttonuna tıklayın
Hello World! Yazının sitede oldugunu test edin
 */

    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/dynamic_loading/1

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Start buttonuna tıklayın
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        //Hello World! Yazının sitede oldugunu test edin
        WebElement helloWordTest=  driver.findElement(By.xpath("//div[@id='finish']/h4"));
        Assert.assertTrue(helloWordTest.isDisplayed());
    }
}
