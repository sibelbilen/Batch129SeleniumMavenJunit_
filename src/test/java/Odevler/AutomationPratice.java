package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. 'Kaydol / Giriş Yap' düğmesine tıklayın
5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
6. Doğru e-posta adresini ve şifreyi girin
7. 'Giriş' düğmesine tıklayın
8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
9. 'Çıkış' düğmesini tıklayın
10. Kullanıcının oturum açma sayfasına yönlendirildiğini doğrulayın

 */
public class AutomationPratice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);


//        2. 'http://automationexercise.com' URL'sine gidin

        driver.get("http://automationexercise.com");


//        3. Ana sayfanın başarıyla göründüğünü doğrulayın

WebElement logoElement=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));

        System.out.println("anasayfa gorunuyor:::"+logoElement.isDisplayed());

//        4. 'Kaydol / Giriş Yap' düğmesine tıklayın

        WebElement kaydolLinki= driver.findElement(By.xpath("//*[text()=' Signup / Login']"));
kaydolLinki.click();


//        5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın

WebElement girisKontrolu=driver.findElement(By.xpath("//*[text()='Login to your account']"));
        System.out.println("girisimiz gozukuyor"+girisKontrolu.isDisplayed());


//        6. Doğru e-posta adresini ve şifreyi girin
        WebElement eposta=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        eposta.sendKeys("sibelinko33@gmail.com");

        WebElement sifre=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        sifre.sendKeys("sibelcan33");
//        7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//        8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        WebElement oturumAcildi=driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        System.out.println("oturum acildi"+oturumAcildi.isDisplayed());

    }
}
