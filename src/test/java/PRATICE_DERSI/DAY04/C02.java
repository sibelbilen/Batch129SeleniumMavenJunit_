package PRATICE_DERSI.DAY04;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02 extends TestBase {

    // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
    // Textbox'in etkin olmadıgını(enable) test edin
    // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
    // It's enable! mesajının goruntulendigini test edin
    // Textbox'in etkin oldugunu(enable) test edin


    @Test
    public void test01() {

        // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        // Textbox'in etkin olmadıgını(enable) test edin
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(textBox.isEnabled());


        // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        WebElement enableButonu = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButonu.click();

        /*
        daha fazla bekleme suresi gerektiren belirli webelementler icin wait kullanılır.
         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(textBox));


        // It's enable! mesajının goruntulendigini test edin
        WebElement itsEnableYazisi = driver.findElement(By.xpath("//p[text()=\"It's enabled!\"]"));
        Assert.assertTrue(itsEnableYazisi.isDisplayed());



        // Textbox'in etkin oldugunu(enable) test edin
        Assert.assertTrue(textBox.isEnabled());




    }

        }

