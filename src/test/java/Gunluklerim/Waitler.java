package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waitler extends TestBase {
    // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
    // Textbox'in etkin olmadıgını(enable) test edin
    // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
    // It's enable! mesajının goruntulendigini test edin
    // Textbox'in etkin oldugunu(enable) test edin

    @Test
    public void name() {
        // https://the-internet.herokuapp.com/dynamic_controls adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");



        // Textbox'in etkin olmadıgını(enable) test edin
     WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println(textBox.isDisplayed());



        // Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin

        WebElement enable= driver.findElement(By.xpath("//*[text()='Enable']"));
        enable.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(enable));
        // It's enable! mesajının goruntulendigini test edin
        WebElement itEnable= driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(itEnable.isDisplayed());
        // Textbox'in etkin oldugunu(enable) test edin
        driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();

    }
}
