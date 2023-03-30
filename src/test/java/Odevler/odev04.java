package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

public class odev04 {
    /*
    1)https://www.youtube.com adresine gidin
2)Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
=> Sayfa başlığının “YouTube” oldugunu test edin
=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
○Search Box 'in erisilebilir oldugunu test edin (isEnabled())
○wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
     */
WebDriver driver;
    @Before

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    }

    @After

    public void kapama() throws InterruptedException {
        Thread.sleep(3000);
    //    driver.close();

    }







    @Test

    public void test02(){
        //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin

WebElement resim=driver.findElement(By.xpath("//*[@id='logo-icon']"));
assertTrue(resim.isDisplayed());
    }

    @Test

    public void test03(){
    //    ○Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement search= driver.findElement(By.xpath("//*[@id='logo-icon']"));
      assertTrue(search.isEnabled());
    }

    @Test

    public void test04(){
        //○wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

        String actuelTitle= driver.getTitle();
        String exptitle="youtube";
        assertFalse(actuelTitle.contains(exptitle));

    }

}
