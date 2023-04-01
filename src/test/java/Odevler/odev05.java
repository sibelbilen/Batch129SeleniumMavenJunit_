package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev05 {
    /*

1.Bir Class olusturalim YanlisEmailTesti
2.http://automationpractice.com/index.php sayfasina gidelim
3.Sign in butonuna basalim
4.Email kutusuna @isareti olmayan bir mail yazip enter’a
bastigimizda “Invalid email address” uyarisi ciktigini test edelim*/

    WebDriver driver;
    @Before

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationexercise.com/");
    }

    @After

    public void kapama() throws InterruptedException {
        Thread.sleep(3000);
        //    driver.close();

    }

@Test

    public void test01(){

//    2.http://automationpractice.com/index.php sayfasina gidelim
//    3.Sign in butonuna basalim

    driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
//    4.Email kutusuna @isareti olmayan bir mail yazip enter’a
    driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("sibelbilengmail.com", Keys.ENTER);
//    bastigimizda “Invalid email address” uyarisi ciktigini test edelim*/
String olan=driver.getTitle();
String istenilen="Invalid email address";

if (olan.contains(istenilen)){
    System.out.println("Invalid email address kelime var");
}else
    System.out.println("Invalid email address kelime yok");
}


}
