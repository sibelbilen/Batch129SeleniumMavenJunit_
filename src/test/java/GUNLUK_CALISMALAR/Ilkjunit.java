package GUNLUK_CALISMALAR;




import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ilkjunit {
        WebDriver driver;
        @Before
        public void test02(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }




        @After

     //gonderdim



        public void tearDown(){
            driver.close();
        }

        @Test
                public void test01(){

        }

}