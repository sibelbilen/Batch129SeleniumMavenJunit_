package GUNLUK_CALISMALAR;

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

    Select yearDropDown=new Select(year);

    //Select objesini kullanarak 3 farklı şekilde seçim yapabiliriz:

    Thread.sleep(7000);
yearDropDown.selectByIndex(2);

    //Ay şeçimi:
    Thread.sleep(7000);
    WebElement month = driver.findElement(By.xpath("//select [@id='month']"));
Select monthDropDown=new Select(month);
monthDropDown.selectByVisibleText("July");


    //Gün Seçimi

    WebElement day= driver.findElement(By.xpath("//select [@id='day']"));
Select dayDropDown=new Select(day);
dayDropDown.selectByValue("2");

}

@Test

    public void printall(){

     WebElement state=driver.findElement(By.xpath("//select [@id='state']"));

     Select eyalet=new Select(state);
    List<WebElement>stateList=eyalet.getOptions();

    stateList.stream().forEach(t-> System.out.println(t.getText()));
}

}
