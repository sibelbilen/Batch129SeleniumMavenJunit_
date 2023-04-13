package day16_Exceptions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class C02_TimeOutException extends TestBase {

    @Test
    public void TimeOutExceptionTest() {
        driver.get("https://www.techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum


    }
}
