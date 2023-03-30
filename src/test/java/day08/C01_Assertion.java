package day08;

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

public class C01_Assertion {
    WebDriver driver;
    /*
  1)https://amazon.com adresinegidin
    2)Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleriyapin
            ○ title Test  => Sayfa başlığının "Amazon" kelimesinin oldugunu test edin
            ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
            ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
            ○ wrongTitleTest => Sayfa basliginin "amazon" olmadigini dogrulayin

     */

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }

    @After

    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.close();


    }

    @Test

    public void test01() {
        // ○ title Test  => Sayfa başlığının "Amazon" kelimesinin oldugunu test edin
        String actualtitle = driver.getTitle();
        String expectedTitle = "Amazon";
        boolean iceriyorMu = actualtitle.contains(expectedTitle);
        Assert.assertTrue(iceriyorMu);
    }
@Test
        public void test02(){
            //  ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin

            WebElement resim = driver.findElement(By.id("nav-logo-sprites"));
            assertTrue(resim.isDisplayed());
        }
@Test
public void test03(){
    //  ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
    WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    assertTrue(searchBox.isEnabled());

}
@Test
      public void  test04(){
          // ○ wrongTitleTest => Sayfa basliginin "amazon" icermeidigini  olmadigini dogrulayin

    String actuelTitle= driver.getTitle();
    String expectedTitle="amazon";

    assertFalse(actuelTitle.contains(expectedTitle));
      }

    }

