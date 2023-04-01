package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev03 {
    /*
    -BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin
-Before methodunda http://www.google.com adresine gidin
-Üç farklı test methodu ile;
-arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
-arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
-arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
-NOT: Çıkan sonuç sayılarını After methodunda yazdırınız
-AfterClass ile kapatın
     */
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Before

    public void before() throws InterruptedException {

        Thread.sleep(3000);
        driver.get("http://www.google.com");
    }
@AfterClass
public static void kapama() {
        driver.close();
}
 @After
    public void testSonuc() {
   String sonuc[]=driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
        System.out.println("sonuc sayisi"+sonuc[1]);

    }

    @Test
    public void test01() {
//        -Üç farklı test methodu ile;
//        -arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaKutusu.sendKeys("The God Father", Keys.ENTER);

    }

      @Test
    public void test02(){
//                -arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
          WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
          aramaKutusu.sendKeys("Lord of the Rings",Keys.ENTER);

      }


    @Test
    public void test03() {
        //                -arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaKutusu.sendKeys("Kill Bill");
        aramaKutusu.submit();
    }
//                -NOT: Çıkan sonuç sayılarını After methodunda yazdırınız


    }

