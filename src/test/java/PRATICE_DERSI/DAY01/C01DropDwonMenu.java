package PRATICE_DERSI.DAY01;

import Utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Books" secenegini secin
// arama cubuguna "Java" aratın
// arama sonuclarinin Java icerdigini test edin
public class C01DropDwonMenu {
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
        driver.close();
    }

    @Test

    public void test01() {

        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");




        // dropdown'dan "Books" secenegini secin

        //DropDown 3 adımda handle edilir
        //1-)DropDown Locate Edilmelidir
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2-)Select Objesi Olusturulur
        Select select = new Select(ddm);


        //3-)Opsiyonlardan Bir Tanesi Secilir
        select.selectByVisibleText("Books");





        // arama cubuguna "Java" aratın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java" + Keys.ENTER);



        // arama sonuclarinin Java icerdigini test edin
        WebElement aramaSonucElementi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));

        String aramaSonucYazisi = aramaSonucElementi.getText();

        Assert.assertTrue(aramaSonucYazisi.contains("Java"));




    }
}