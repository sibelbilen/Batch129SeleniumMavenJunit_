package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

/*
https://the-internet.herokuapp.com/dynamic_loading/1
Start buttonuna tıklayın
Hello World! Yazının sitede oldugunu test edin
 */

public class FluentWait01 extends TestBase {
    @Test
    public void name() {

//https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


//Start buttonuna tıklayın
        driver.findElement(By.xpath("//div[@id='start']/button")).click();


//Hello World! Yazının sitede oldugunu test edin





    }
}
