package Gunluklerim.Nisan16_ScreenShot;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01 extends TestBase {

    /*
    ----------------NOTE-----------
    1-tum ekran goruntusunu seleniumdan gelen "getScreenShotAs" methodu ile aliriz.
    2-Bu methoddaki TakesScreenShot arayuzunden(INTERFACEDEN)gelir.

    ADIMLAR-->

    1.ADIM : ILK OLARAK EKRAN RESMI ALACAGIMIZ dosayayi nereye kaydecegimizi belirtiriz
    2-ADIM :TakesScreenshot arayuzunden obje olusturmak
    3-ADIM: Files classi file nesneleri birlikte kullanabilecegimiz methodlar
    iceririr.Bu methodlari kullanarak dosyalari okuma,yazma,kopyalama ve silme islemlerini
    cok daha kolay yapabiliriz.
    NOTE:Files.white () methoduda ayni islemleri gorur.
    4-ADIM: Ekran resmini projemize kaydedlim

     */
    @Test
    public void test01() throws IOException {
        driver.get("https://techproeducation.com");
        //1-ADIM:eKRAN FOTOMUZUN NEREYE KAYDEDECGIMIZI BELIRTMELIYIZ.
        String dosyaYolu = "src/test/ScreenShoot/screenshot.png";
//2-ADIM:TakesScreenShot arayuzunden obje olusturalim
        TakesScreenshot ts = (TakesScreenshot) driver;
//3-ADIM:FileUtils'o file nesnesiyle kullanacagiz
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
    }

    @Test

    public void test02() throws IOException {
        driver.get("https://amazon.com");
        //kayit ettigimiz ekran resmi her seferinde ayni dosyanin uzerine yazmamais icin dosya isminden sonra bir tarih atariz
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
String dosya= "src/test/ScreenShoot/screenshot.png";
        TakesScreenshot ts = (TakesScreenshot) driver;
FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(tarih,dosya));
    }
}