package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class odev08 {


    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://the-internet.herokuapp.com");
    }

    @After

    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
   //driver.close();
    }

    @Test
    public void test01() {
        WebElement tiklama= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        // Add Element butonuna 100 defa basınız
        WebElement addButton = driver.findElement(By.xpath("//*[text()='Add Element']"));

        for (int i = 0; i < 100; i++) {
            addButton.click();
        }

        // 100 defa basıldığını test ediniz
        List<WebElement> deleteButton = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        Assert.assertEquals(100,deleteButton.size());

        // 90 defa delete butonuna basınız

        for (int i = 0; i < 90; i++) {
            driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();
        }

        // 90 defa basıldığını doğrulayınız
        List<WebElement> deleteButtonList = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int kalanDeleteButton = deleteButton.size()-90;
        Assert.assertEquals(kalanDeleteButton,deleteButtonList.size());
    }
}
