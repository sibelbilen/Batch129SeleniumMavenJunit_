package day16_Exceptions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_StaleElementException extends TestBase {
    @Test
    public void staleElementExceptionTest(){

        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        driver.navigate().refresh();

        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
        lmsLogin.click();//Çalıştı

    }

    @Test
    public void staleElementExceptionTest2(){

        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
        driver.navigate().refresh();
        lmsLogin.click();//org.openqa.selenium.StaleElementReferenceException
        //Locator doğru fakat adres refresh sonrası silindiği için "lmsLogin" container'ı artık kullanılamaz. Yeniden locate gerekir.
    }

    @Test
    public void staleElementExceptionTest3(){

        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
        lmsLogin.click();

        driver.navigate().back();//techproeducation.com sayfasına geri döndüm--sayfa yeniden yuklndigi icin locator adresi yenilendi
        lmsLogin.click();
    }

    @Test
    public void staleElementExceptionTest4(){

        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
        lmsLogin.click();

        driver.navigate().back();//techproeducation.com sayfasına geri döndüm ==> Sayfa yeniden yüklendiği için locator adresi silindi.
        driver.navigate().refresh();

        lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));//Tekrar locate işlemi yaparak lmsLogin objesine yeni adres veriliyor.
        lmsLogin.click();//Çalıştı

    }

    @Test
    public void staleElementExceptionTest5(){

        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
        lmsLogin.click();

        driver.navigate().back();//techproeducation.com sayfasına geri döndüm ==> Sayfa yeniden yüklendiği için locator adresi silindi.
        driver.navigate().refresh();

        lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));//Tekrar locate işlemi yaparak lmsLogin objesine yeni adres veriliyor.
        lmsLogin.click();//Çalıştı

    }
    }


