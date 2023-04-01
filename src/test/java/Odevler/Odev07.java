package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev07 {
    /*
    *** Aşağıdaki Task'i Junit framework'u ile yapınız
- ebay sayfasına gidiniz
- electronics bölümüne tıklayınız
- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
- Her sayfanın sayfa başlığını yazdıralım
- sayfayı kapatalım
     */

    WebDriver driver;
    static List<WebElement> genislikUzunluk;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  - ebay sayfasına gidiniz
        driver.get("https://ebay.com");
    }

    @After

    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
      driver.close();


    }

    @Test
    public void test01() throws InterruptedException {

      //  - electronics bölümüne tıklayınız
        driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();
        genislikUzunluk = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
        for (int i = 0; i < genislikUzunluk.size() ; i++) {

               genislikUzunluk= driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
               genislikUzunluk.get(i).click();
               Thread.sleep(2000);
                System.out.println(i+1 +".Basligi:"+driver.getTitle());
                Thread.sleep(2000);
               driver.navigate().back();
                Thread.sleep(2000);
            }

        }
    }

