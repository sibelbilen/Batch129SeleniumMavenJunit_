package PRATICE_DERSI.DAY01;

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

import static org.junit.Assert.assertTrue;

public class C03_CheckBox {
    // https://demo.guru99.com/test/radio.html adresine gidin
    // checkbox elementlerini locate edin
    // checkbox1 ve checkbox3  secili degil ise secin
    // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
    // checkbox2 elementinin secili olmadıgını test edin


    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
       // driver.close();
    }

    @Test

    public void test01() {

        // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html ");
        // checkbox elementlerini locate edin
        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
        WebElement checkBox2= driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        WebElement checkBox3= driver.findElement(By.xpath("//input[@id='vfb-6-2']"));

        // checkbox1 ve checkbox3  secili degil ise secin
        if(!checkBox1.isSelected()){
            checkBox1.click();
        }
        if(!checkBox3.isSelected()){
            checkBox3.click();
        }
        // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
      //  Assert.assertTrue(checkBox1.isSelected() && checkBox3.isSelected());

        assertTrue(checkBox1.isSelected());
        assertTrue(checkBox3.isSelected());
        // checkbox2 elementinin secili olmadıgını test edin

        Assert.assertFalse(checkBox2.isSelected());



    }
    }