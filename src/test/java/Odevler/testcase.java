package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testcase {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        /*
        1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. 'Kaydol / Giriş Yap' düğmesine tıklayın
5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
6. Adı ve e-posta adresini girin
7. 'Kaydol' düğmesini tıklayın
8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın
9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
10. 'Bültenimize kaydolun!' onay kutusunu seçin.
11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
13. 'Hesap Oluştur düğmesini' tıklayın
14. 'HESAP OLUŞTURULDU!' görünür
15. 'Devam Et' düğmesini tıklayın
16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
17. 'Hesabı Sil' düğmesini tıklayın
18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
         */
    }
}
