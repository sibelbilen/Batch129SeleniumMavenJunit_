package day16_Exceptions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_NoSuchElementException extends TestBase {

    @Test
    public void noSuchElement() {
        driver.get("https://www.techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum


        driver.findElement(By.xpath("//input[@type='searchh']")).//org.openqa.selenium.NoSuchElementException: Web element bulunamadığında alınır.
                sendKeys("QA" + Keys.ENTER);



    }
}
