package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JunitOdev {
    /*
    1.Bir class oluşturun : RadioButtonTest
2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
- https://www.facebook.com adresine gidin
- Cookies’i kabul edin
- “Create an Account” button’una basin
- “radio buttons” elementlerini locate edin
- Secili degilse cinsiyet butonundan size uygun olani
secin
     */
    static WebDriver driver;
    @BeforeClass

    public static void tearDown(){
        WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     //@Before class olusturdum neden ?:bir classtaki tum testlerden dolayi once yapilmasi gereken islemden dolayi

    }

    @After

    public void after(){

     //   driver.close();
        //@After kullnadim neden ?:her test methodundan sonra calisacak
    }

    @Before

    public void setup() throws InterruptedException {
        Thread.sleep(15);
        driver.get("https://www.facebook.com ");//Buraya bu @Before methodu koydum neden ?her test methodundan once calsiir
    }

    @Test

    public  void test01(){
//        - Cookies’i kabul edin


//                - “Create an Account” button’una basin
       driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//        - “radio buttons” elementlerini locate edin


//                - Secili degilse cinsiyet butonundan size uygun olani
    //    secin
    WebElement secim=    driver.findElement(By.xpath("//input[@class='_8esa']"));
secim.submit();

    }

}
