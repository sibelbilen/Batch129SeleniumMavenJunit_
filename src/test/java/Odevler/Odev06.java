package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Odev06 {
/*
-Amazon sayfasına gidelim
-Arama Kutusundaki Dropdown menuyu yazdıralım
-Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
Not: Select Class'ı kullanalım
 */

    WebDriver driver;

    @Before

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://amazon.com");
    }

    @After

    public void kapama() throws InterruptedException {
        Thread.sleep(7000);
        //    driver.close();

    }

    @Test
    public void test01() throws InterruptedException {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Dropdown menuyu yazdıralım
        Select select = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        for (WebElement w:select.getOptions()) {
            System.out.println(w.getText());
        }
        System.out.println("***********************************************");

        //Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip başlık altındakileri aratalım.
        //Her aramada sayfa başlığını yazdıralım
        int sayac=1;
        for (WebElement w:select.getOptions()) {
            Select option = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
            option.selectByIndex(sayac);
            driver.findElement(By.xpath("//*[@type='submit']")).click();
            System.out.println(driver.getTitle());
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            sayac++;
            if (sayac>=6){
                break;
            }
        }
    }
    }



