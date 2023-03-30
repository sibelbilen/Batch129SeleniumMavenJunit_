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

import java.time.Duration;

import static Odevler.JunitOdev.driver;

public class Odev02 {
    /*
    https://www.google.com/ adresine gidin  3- cookies uyarisini kabul ederek kapatin
Sayfa basliginin “Google” ifadesi icerdigini test edin
Arama cubuguna “Nutella” yazip aratin
Bulunan sonuc sayisini yazdirin
sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
Sayfayi kapatin
     */
    static WebDriver driver;

    @After

    public void donus() {
        driver.close();
    }

    @Before

    public void test01() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

    }

    @BeforeClass

    public static void webchrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test

    public void arama() {
//        3- cookies uyarisini kabul ederek kapatin


//        Sayfa basliginin “Google” ifadesi icerdigini test edin


        String title = driver.getTitle();

        if (title.contains("Google")) {
            System.out.println("Sayfa basligi “Google” ifadesi iceriyor...");

        } else
            System.out.println("Sayfa basligi “Google” ifadesi icermiyor");


//        Arama cubuguna “Nutella” yazip aratin

        WebElement aramaCubugu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaCubugu.sendKeys("Nutella");
        aramaCubugu.submit();

//        Bulunan sonuc sayisini yazdirin
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        //  System.out.println(sonucSayisi.getText());

        String arr[] = sonucSayisi.getText().split(" ");
        String sonuc = arr[1];
        System.out.println(sonuc);

//        sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucSayisii = sonuc.replaceAll("\\D", "");
        if (Integer.parseInt(sonucSayisii) > 1000000) {
            System.out.println("sonuc sayisi 1000000'dan fazla");
        }else
        System.out.println("sonuc sayisi 1000000'dan fazla degil");
//        Sayfayi kapatin
    }

}
