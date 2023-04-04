package PRATICE_DERSI.DAY01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DropDownOptions {

    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Baby" secenegini secin
    // sectiginiz option'i yazdirin
    // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin
    // dropdown'daki optionların tamamını yazdırın

static WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws Exception {
      //  driver.close();
    }



    @Test
    public void name() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://www.amazon.com/ ");
        // dropdown'dan "Baby" secenegini secin

        //DropDown 3 adımda handle edilir
        //1-)DropDown Locate Edilmelidir
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2-)Select Objesi Olusturulur
        Select select = new Select(ddm);


        //3-)Opsiyonlardan Bir Tanesi Secilir
        select.selectByVisibleText("Baby");

        // sectiginiz option'i yazdirin

        String sectigimOption=select.getFirstSelectedOption().getText();
        System.out.println("sectigimOption = " + sectigimOption);
        // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin

        List<WebElement> tumOptionlar=select.getOptions();
       int expectedOptionSayisi= 28;
      int actuelOptionalSayisi= tumOptionlar.size();
       Assert.assertEquals(expectedOptionSayisi,actuelOptionalSayisi);
        // dropdown'daki optionların tamamını yazdırın

        int sayac=1;
        for (WebElement w: tumOptionlar) {
            System.out.println(sayac+".option = " + w.getText());
            sayac++;
        }

    }
}
