package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day02;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class BasicAuthentication extends TestBase {

     /*

    Aşağıdaki bilgileri kullanarak authentication yapınız:

    Url: https://the-internet.herokuapp.com/basic_auth
    Username: admin
    Password: admin

    Başarılı girişi doğrulayın.
     */

    //Authentication Url: "https://admin:admin@the-internet.herokuapp.com/basic_auth"
    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/basic_auth adresine gidiniz
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    ///***note >verilen taskteki sifreyi manuel olarak giris yaptik ve girdik
    //buraki sifreyi bizden tekrar tekrar istemesin diye gideln adresin yanina sifre ve passwordu yazdik
        //sytaxi bu sekilde https://admin:admin@the-internet.herokuapp.com

        //Paragrafın "Congratulations" kelimesini içerdiğini doğrulayınız
        String paragraf = driver.findElement(By.xpath("//p")).getText();
        assertTrue(paragraf.contains("Congratulations"));

    }
}
