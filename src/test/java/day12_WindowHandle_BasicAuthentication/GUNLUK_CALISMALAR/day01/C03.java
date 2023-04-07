package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.youtube.com");

        WebElement aramakutusu = driver.findElement(By.xpath("//input[@id='search']"));
        aramakutusu.sendKeys("Nerdesin Teyzeler Remix");
        aramakutusu.submit();
        Thread.sleep(2000);
driver.findElement(By.id("video-title")).click();
        driver.navigate().back();
        aramakutusu.sendKeys("kismetse olur");
        aramakutusu.submit();
    }
}
