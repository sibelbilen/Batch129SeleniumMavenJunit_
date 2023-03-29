package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
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
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//       / 1https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com");
//        2Arama kutusunu locate edelim
     WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

//        3“Samsung headphones” ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
//        4Bulunan sonuç yazisiniz sayısını yazdıralım
        WebElement sonucSayisi= driver.findElement(By.xpath("(//div[@class='sg-col-inner'])"));
        System.out.println(sonucSayisi.getText());
//        5İlk ürünü tıklayalım
        WebElement ilkUrun= driver.findElement(By.xpath("(//img[@class='s-image'])"));
        ilkUrun.click();
        //        İlk ürünü tıklayalım
        //Tüm arama sonucu ürünleri list içini koyup ilk elemanı tıklıyoruz
   //     List<WebElement> urunlistesi = driver.findElements(By.xpath("//img[@class='s-image']"));
     //   urunlistesi.get(0).click();
//        6Sayfadaki tüm başlıkları yazdıralım
List<WebElement>Basliklar=  driver.findElements(By.xpath("//h2"));
  //      for (WebElement w : Basliklar) {
     //       System.out.println(w.getText());
        //}
        //lambda kullanarak tum basliklari yazdiriniz?
        Basliklar.stream().forEach(t-> System.out.println(t.getText()));

        driver.close();
    }
}
