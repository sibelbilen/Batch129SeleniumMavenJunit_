package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day02;

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

public class Assertion {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //        1)https://amazon.com adresinegidin
        driver.get("https://amazon.com");
    }

    @After

    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
    //    driver.close();


    }

    @Test

    public void test01() {

//            ○ title Test  => Sayfa başlığının "Amazon" kelimesinin oldugunu test edin
        String actuelTittle=driver.getTitle();
        String expTitle="Amazon";

        Boolean kelime=actuelTittle.contains(expTitle);
        assertTrue(kelime);



    }

    @Test

    public void test02(){
        //            ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin

        WebElement imege=driver.findElement(By.xpath("//*[@id='nav-logo-sprites']"));
        assertTrue(imege.isDisplayed());


    }


    @Test

    public  void test03(){
        //            ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())

        WebElement arama=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        assertTrue(arama.isEnabled());
    }
    @Test

    public void test04(){
        //            ○ wrongTitleTest => Sayfa basliginin "amazon" olmadigini dogrulayin

        String actueltitle= driver.getTitle();
        String exptitle="amazon";


        assertFalse(actueltitle.contains(exptitle));
    }
}
