package GUNLUK_CALISMALAR.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {


    WebDriver driver;


    @Before


    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    }

@After
    public void kapama() throws InterruptedException {
        Thread.sleep(5000);
     driver.close();
}

@Test

public void selectByIndex() throws InterruptedException {
    //1. Locate Dropdown Element

WebElement year= driver.findElement(By.xpath("//select[@id='year']"));

    //2. Select objesi oluştur

Select arama=new Select(year);
arama.selectByIndex(2);

    //Select objesini kullanarak 3 farklı şekilde seçim yapabiliriz:



    //Ay şeçimi:
    Thread.sleep(7000);
WebElement ay=driver.findElement(By.xpath("//select[@id='month']"));

Select month=new Select(ay);
month.selectByVisibleText("July");

    //Gün Seçimi

WebElement gun= driver.findElement(By.xpath("//select[@id='day']"));

Select day=new Select(gun);
day.selectByValue("3");
}

}
