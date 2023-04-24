package day21_JSExecuter;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/*
http://www.uitestpractice.com/Students/Form sayfasına git
Formu doldur
Submit tuşuna tıkla
Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
*/
public class C01_JSExecuter_Click extends TestBase {
    @Test
    public void test01() {
//        http://www.uitestpractice.com/Students/Form sayfasına git
        driver.get("http://www.uitestpractice.com/Students/Form");

//        Formu doldur
        driver.findElement(By.id("firstname")).sendKeys(Faker.instance().name().firstName());
        driver.findElement(By.id("lastname")).sendKeys(Faker.instance().name().lastName());
        driver.findElement(By.id("email")).sendKeys(Faker.instance().internet().emailAddress());
        //Gerisi ödev...

//        Submit tuşuna tıkla
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        //submitButton.click(); ==> Selenium click() çalışmadı, JS Executer deniyorum:

        //Driver'ı JavascriptExecutor classına "cast" ediyoruz:
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;

        //executeScript() metodu ile uygun script'i çalıştırıyoruz:
        jsExecuter.executeScript("arguments[0].click();",submitButton);

        //clickByJS metodu oluşturarak gerekli yerlerde tıklama yapabiliriz:


//        Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
        assertEquals("http://www.uitestpractice.com/Students/Form?",driver.getCurrentUrl());

    }
}
