package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//        http://zero.webappsecurity.com sayfasına gidin
//        Signin buttonuna tıklayın
//        Login alanına  "username" yazdırın
//        Password alanına "password" yazdırın
//        Sign in buttonuna tıklayın
//        Pay Bills sayfasına gidin
//        Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın
//        Date kısmına "2023-03-27" yazdırın
//        Pay buttonuna tıklayın
//        "The payment was successfully submitted." mesajının çıktığını kontrol edin
public class C02_MavenClassWork {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        http://zero.webappsecurity.com sayfasına gidin
        driver.get("http://zero.webappsecurity.com");

//        Signin buttonuna tıklayın
        driver.findElement(By.id("signin_button")).click();

//        Login alanına  "username" yazdırın
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");

//        Password alanına "password" yazdırın
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

//        Sign in buttonuna tıklayın
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();

//        Pay Bills sayfasına gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();//OnlineBanking linline tıklıyoruz
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();//PayBill linlini tıklıyoruz
//        Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("340");
//        Date kısmına "2023-03-27" yazdırın
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2023-03-27");
//        Pay buttonuna tıklayın
        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        "The payment was successfully submitted." mesajının çıktığını kontrol edin
        WebElement mesaj = driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']"));
        if (mesaj.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

//        Sayfayı kapatın


    }
}
