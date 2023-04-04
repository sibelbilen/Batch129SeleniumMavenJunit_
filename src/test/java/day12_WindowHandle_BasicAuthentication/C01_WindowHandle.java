package day12_WindowHandle_BasicAuthentication;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
https://www.techproeducation.com adresine gidiniz
Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
Tab 2'de https://www.youtube.com sayfasını açınız
Tab 3'te https://www.linkedin.com sayfasını açınız
techproeducation sayfasına geçiniz
youtube sayfasına geçiniz
linkedIn sayfasına geçiniz
*/
public class C01_WindowHandle extends TestBase {
    @Test
    public void newTabTest(){
//        https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

//        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());

//        Tab 2'de https://www.google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");

//        Sayfa başlığının "Google" olduğunu doğrulayınız
        assertEquals("Google", driver.getTitle());

//        Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");

//        Sayfa başlığının "LinkedIn" içerdiğini doğrulayınız
        assertTrue( driver.getTitle().contains("LinkedIn"));

        //Window handle Set'ini bir List içerisine alıyoruz.

        List<String>WindowsHandles= new ArrayList<>(driver.getWindowHandles());

//        techproeducation sayfasına geçiniz
        //List ile indeks kullanarak ilgili windowHandle değerine ulaşabiliriz:
//        techproeducation sayfasına geçiniz
        bekle(3);
driver.switchTo().window(WindowsHandles.get(0));

//        google sayfasına geçiniz


        bekle(2);
        driver.switchTo().window(WindowsHandles.get(1));
//        linkedIn sayfasına geçiniz


        bekle(2);
        driver.switchTo().window(WindowsHandles.get(2));





    }

    @Test
    public void newTabTest2(){
    //https://www.techproeducation.com adresine gidiniz

        driver.get("https://www.techproeducation.com");

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın

Assert.assertEquals("Techpro Education | Online It Courses & Bootcamps",driver.getTitle());
        //Tab 2'de https://www.Google.com sayfasını açınız
 driver.switchTo().newWindow(WindowType.TAB).get("https://www.Google.com");
        assertEquals("Google", driver.getTitle());
        //Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");
        assertTrue(driver.getTitle().contains("LinkedIn"));
        //techproeducation sayfasına geçiniz
        bekle(3);
        switchToWindow(0);
        //youtube sayfasına geçiniz
        bekle(3);
        switchToWindow(1);
        //linkedIn sayfasına geçiniz
        bekle(3);
        switchToWindow(2);
    }


}
