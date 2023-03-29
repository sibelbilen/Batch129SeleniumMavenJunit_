package GUNLUK_CALISMALAR;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
     /*
    1https://www.amazon.com/ sayfasına gidelim
2Arama kutusunu locate edelim
3“Samsung headphones” ile arama yapalım
4Bulunan sonuç sayısını yazdıralım
5İlk ürünü tıklayalım
6Sayfadaki tüm başlıkları yazdıralım
     */
     public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();

         //    1https://www.amazon.com/ sayfasına gidelim
         driver.get("https://www.amazon.com");
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

     }
}
