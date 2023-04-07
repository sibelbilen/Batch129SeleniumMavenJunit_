package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
Unutulan parola için test senaryoları nasıl yazılır?
Oturum açma ekranında parolayı unut bağlantısının olması gerektiğini doğrulayın .
Parolayı unut bağlantısına tıkladığınızda parolayı unut sayfasının açılması gerektiğini doğrulayın.
Parolayı kurtarmak için parolayı unut sayfasında e-posta alanının bulunduğunu doğrulayın .
Kullanıcı güncelleme şifresi olarak doğrulayın, kullanıcı tüm tarayıcılardan ve cihazlardan çıkış yapmalıdır .
Parolayı unuttuğunda veritabanı için bu depolamayı doğrulayın .
E-posta alanına bir e-posta doğrulamasının eklendiğini doğrulayın .
Doğrula Gönder düğmesi sayfada bulunmalıdır .
Yalnızca düğme metninin değil , tüm düğmenin tıklanabilir olması gerektiğini doğrulayın .
Kullanıcıya gönderilen bağlantının belirli bir süre sonra sona ermesi gerektiğini doğrulayın .
Bağlantıya birden çok kez tıklandığında veya belirtim ve gereksinime göre gönderilen parola bağlantısının devre dışı bırakılması gerektiğini doğrulayın.
Kayıtlı olmayan bir kullanıcı e-posta kimliği girdikten sonra hata mesajının görüntülenmesi gerektiğini doğrulayın .
Kayıtlı olmayanlar için görüntülenen hata mesajının anlamlı olması gerektiğini doğrulayın .
Kayıtlı e-posta kimliğini girerek düğmesine tıkladıktan sonra şifreyi kurtarmak için e-postanızı kontrol edin onay mesajını doğrulayın .
Parolayı unut alanına geçerli bir e-posta kimliği girdikten sonra kullanıcının bir e-posta alacağını doğrulayın .
Kullanıcının parolasını unuttuğunda aldığı e-postanın spam klasöründe değil, gelen kutusunda görüntülenmesi gerektiğini doğrulayın .
E-posta kimliğini girmeden kurtar düğmesine tıklandığında hata mesajının görüntülenmesi gerektiğini doğrulayın .
Kullanıcının, info@sitename.com adresinden şifremi unuttum e-postasını alacağını doğrulayın .
Parolayı unut ekranında görüntülenen başlığın " Parolayı Unut " olması gerektiğini doğrulayın.
Alana boşluk girildiğinde ve Gönder düğmesine tıklandığında hata mesajının görüntülenmesi gerektiğini doğrulayın .
Parolamı unuttum e-postasında görüntülenen konu adının "Yeni Parolanız" olması gerektiğini doğrulayın .
Kullanıcının eski parolayla değil, yeni parolayla başarılı bir şekilde oturum açması gerektiğini doğrulayın .
E-postada geçici bir şifre gönderilmişse, profilde doğrulama mesajının gösterilmesi gerekir, şifrenizi değiş
 */
public class TestCase {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Before

    public void DriverGet(){
        // https://www.google.com/ adresine gidin
        driver.get("https://www.facebook.com/");
    }

@After
    public void after() throws InterruptedException {
     //   driver.close();
        Thread.sleep(2000);
}

@Test

    public void test01(){
        //Oturum açma ekranında parolayı unut bağlantısının olması gerektiğini doğrulayın .

    //Parolayı unut bağlantısına tıkladığınızda parolayı unut sayfasının açılması gerektiğini doğrulayın.


}

}
