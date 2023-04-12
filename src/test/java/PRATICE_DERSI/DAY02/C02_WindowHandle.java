package PRATICE_DERSI.DAY02;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import static org.junit.Assert.assertTrue;

public class C02_WindowHandle extends TestBase {


    // 1- https://www.amazon.com sayfasina gidelim
    // 2- url'in 'amazon' icerdigini test edelim
    // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
    // 4- title'in 'Best Buy' icerdigini test edelim
    // 5- ilk sayfaya(amazon) donup sayfada java aratalım
    // 6- arama sonuclarının 'Java' icerdigini test edelim
    // 7- ikinci sayfaya(bestbuy) donelim
    // 8- logonun gorundugunu test edelim


    @Test
    public void name() {

        // 1- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
      String sayfa1=  driver.getWindowHandle();
        System.out.println("sayfa1 = " + sayfa1);
        // 2- url'in 'amazon' icerdigini test edelim


     String url=driver.getCurrentUrl();
        assertTrue(url.contains("amazon"));


        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.bestbuy.com");
        String sayfa2Handle = driver.getWindowHandle();
        // 4- title'in 'Best Buy' icerdigini test edelim

        String title= driver.getTitle();
        assertTrue(title.contains("Best Buy"));


        // 5- ilk sayfaya(amazon) donup sayfada java aratalım
        driver.switchTo().window(sayfa1);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java" + Keys.ENTER);

        // 6- arama sonuclarının 'Java' icerdigini test edelim
        WebElement aramaSonucu = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(aramaSonucu.getText().contains("Java"));

        // 7- ikinci sayfaya(bestbuy) donelim
        driver.switchTo().window(sayfa2Handle);

        // 8- logonun gorundugunu test edelim
        WebElement logo = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());


    }
}
