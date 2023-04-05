package Odevler;

import Utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testcase  extends TestBase {


/*
1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin
3. 'Ürünler' düğmesine tıklayın
4. Sol taraftaki çubukta Markaların göründüğünü doğrulayın
5. Herhangi bir marka adına tıklayın
6. Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın.
7. Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklayın
8. Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın
 */

    @Test
    public void name() {



        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. 'Ürünler' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()=' Products']")).click();
        //4. Sol taraftaki çubukta Markaların göründüğünü doğrulayın
        WebElement urunler= driver.findElement(By.xpath("//*[text()='Brands']"));
        Assert.assertTrue(urunler.isDisplayed());
        //5. Herhangi bir marka adına tıklayın

driver.findElement(By.xpath("//*[text()='H&M']")).click();
        //6. Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın...

        //7. Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklayın
        //8. Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın

    }
}

