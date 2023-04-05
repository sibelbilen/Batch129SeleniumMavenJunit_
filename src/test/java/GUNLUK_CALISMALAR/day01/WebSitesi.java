package GUNLUK_CALISMALAR.day01;

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

public class WebSitesi {
    /*
    1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. Sepete ürün ekleyin
5. 'Sepet' düğmesine tıklayın
6. Sepet sayfasının görüntülendiğini doğrulayın
7. Ödeme İşlemine Devam Et'i tıklayın
8. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
9. Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun
10. 'HESAP OLUŞTURULDU!'nu doğrulayın! ve 'Devam Et' düğmesini tıklayın
11. Üstte "Kullanıcı adı olarak oturum açıldı"yı doğrulayın
12.'Sepet' düğmesine tıklayın
13. 'Ödeme İşlemine Devam Et' düğmesini tıklayın
14. Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
15. Açıklama metin alanına açıklamayı girin ve 'Sipariş Ver'i tıklayın
16. Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi
17. 'Öde ve Siparişi Onayla' düğmesine tıklayın
18. Başarı mesajını doğrulayın 'Siparişiniz başarıyla verildi!'
19. 'Hesabı Sil' düğmesini tıklayın
20. 'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın
     */
WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("http://automationexercise.com");
    }

    @After
    public void tearDown() throws Exception {
      //  driver.close();
    }

    @Test
    public void test01() {
// Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement  anaSayfa=driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
        System.out.println(anaSayfa.isDisplayed());

    }

    @Test
    public void test02() throws InterruptedException {
        //4. Sepete ürün ekleyin

        driver.findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]")).click();
        //5. Click 'Cart' button
        driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
        //6. Sepet sayfasının görüntülendiğini doğrulayın
     WebElement sepetEkleme=   driver.findElement(By.xpath("//*[@id='cart_items']"));
        assertTrue(sepetEkleme.isDisplayed());
        //Ödeme İşlemine Devam Et'i tıklayın
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();

        //8. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın

        driver.findElement(By.xpath("//*[text()='Register / Login']")).click();
        //  9. Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sibelcan");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sibelcan33@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).submit();
       // 9. Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun

        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        WebElement userName = driver.findElement(By.xpath("//input[@id='name']"));
        userName.clear();
        userName.sendKeys("name");
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
        userPassword.sendKeys("passwords");
        WebElement date = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        date.click();
        date.sendKeys("3");
        WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        month.click();
        month.sendKeys("may");
        WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        year.click();
        year.sendKeys("1980");
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        firstName.sendKeys("sibel");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        lastName.sendKeys("bilen");
        WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        company.sendKeys("cosmos");
        WebElement adresses = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        adresses.sendKeys("mersin");
        WebElement adresses2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        adresses2.sendKeys("merkez");
        WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        country.click();
        country.sendKeys("canada".toLowerCase());
        WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        state.sendKeys("mersin");
        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.sendKeys("mersin");
        WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
        zipcode.sendKeys("0033");
        WebElement mobileNumber = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
        mobileNumber.sendKeys("123456789");
        driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
        //10. 'HESAP OLUŞTURULDU!'nu doğrulayın! ve 'Devam Et' düğmesini tıklayın
WebElement hesapOlusturma=driver.findElement(By.xpath("//*[text()='Hesap oluşturuldu!']"));
Assert.assertTrue(hesapOlusturma.isDisplayed());
driver.findElement(By.xpath("//*[@data-qa='continue-button']")).submit();

//11. Üstte "Kullanıcı adı olarak oturum açıldı"yı doğrulayın

    }


}
