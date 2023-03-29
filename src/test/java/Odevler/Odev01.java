package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev01 {
    /*
    “https://www.saucedemo.com” Adresine gidin
Username kutusuna “standard_user” yazdirin
Password kutusuna “secret_sauce” yazdirin
Login tusuna basin
Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
Add to Cart butonuna basin
Alisveris sepetine tiklayin
Sectiginiz urunun basarili olarak sepete eklendigini control edin
Sayfayi kapatin
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        //https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //Username kutusuna “standard_user” yazdirin
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
//Password kutusuna “secret_sauce” yazdirin
        WebElement paasWord=driver.findElement(By.id("password"));
        paasWord.sendKeys("secret_sauce");
        //Login tusuna basin
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    WebElement UrunismiKaydetme=    driver.findElement(By.id("item_4_title_link"));
        System.out.println(UrunismiKaydetme.getText());
        driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();

        WebElement add=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
                add.click();
                //Alisveris sepetine tiklayin
        WebElement sepet =driver.findElement(By.cssSelector("a[class='shopping_cart_link']"));
        sepet.click();


        //Sectiginiz urunun basarili olarak sepete eklendigini control edin
        if (sepet.equals(sepet)){
            System.out.println("urun eklendi ");
        }else
            System.out.println("urun eklenmedi");
//Sayfayi kapatin
        driver.close();
    }

}
