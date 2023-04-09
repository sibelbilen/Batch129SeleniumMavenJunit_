package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
public class Action extends TestBase {


    @Test
    public void test01() {
        //        http://zero.webappsecurity.com sayfasına gidin
driver.get("http://zero.webappsecurity.com");

//        Signin buttonuna tıklayın
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
//        Login alanına  "username" yazdırın
        //        Password alanına "password" yazdırın
        Actions actions=new Actions(driver);
        WebElement login= driver.findElement(By.xpath("//input[@id='user_login']"));
        actions.sendKeys("sibel").
                sendKeys(Keys.TAB).
                sendKeys("sibel").perform();
bekle(4);


//        Sign in buttonuna tıklayın
        WebElement signinButton2 = driver.findElement(By.id("user_remember_me"));
        actions.moveToElement(signinButton2).click().sendKeys(Keys.TAB).click().perform();


    }
}
