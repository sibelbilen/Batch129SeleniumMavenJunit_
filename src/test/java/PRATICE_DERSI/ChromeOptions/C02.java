package PRATICE_DERSI.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
// https://www.google.com/ adresine gidin
// sayfa baslıgının "Google" kelimesini icerdigini test edin
// arama cubuguna "Nutella" yazıp aratın
// bulunan sonuc sayısını yazdırın
// sonuc sayısının 100000000  fazla oldugunu test edin
// sayfayı kapatın
public class C02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        // sayfa baslıgının "Google" kelimesini icerdigini test edin

        String googleTitle=driver.getTitle();

        if (googleTitle.contains("Google")){
            System.out.println("Title Google iceriyor");
        }else
            System.out.println("Title Google icermiyor");
        // arama cubuguna "Nutella" yazıp aratın
        WebElement aramaCubugu=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaCubugu.sendKeys("Nutella");
        aramaCubugu.submit();
        // bulunan sonuc sayısını yazdırın
   WebElement sonucYazisi  =   driver.findElement(By.xpath("//div[@id='result-stats']")) ;
      //  System.out.println(sonucYazisi.getText());
      String arr[]=  sonucYazisi.getText().split(" ");
       String sonuc=arr[1];
        System.out.println(sonuc);
        // sonuc sayısının 100000000  fazla oldugunu test edin

        String sonucSayiisi1000denfazlaolanlar=sonuc.replaceAll("\\D","");
        if (Integer.parseInt(sonucSayiisi1000denfazlaolanlar)>10000000){
            System.out.println("sonuc sayisi 1000000'dan fazla");
        }else
            System.out.println("sonuc sayisi 1000000'dan fazla degil");
        // sayfayı kapatın
        driver.close();
    }
}
