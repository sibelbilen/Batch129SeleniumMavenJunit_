package YoutubeMuzikAcma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.youtube.com");
     WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='search']"));
     aramaKutusu.sendKeys("Dua Lipa");
     aramaKutusu.submit();

 WebElement acmaButonu=driver.findElement(By.xpath("//*[@id='video-title'][1]"));
acmaButonu.submit();

    }
}
