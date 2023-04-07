package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day03_Iframe_WindowsHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C03_WindowHandle2 extends TestBase {



/*
https://www.techproeducation.com adresine gidiniz
Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
Tab 2'de https://www.youtube.com sayfasını açınız
Tab 3'te https://www.linkedin.com sayfasını açınız
techproeducation sayfasına geçiniz
youtube sayfasına geçiniz
linkedIn sayfasına geçiniz
*/

    @Test
    public void WindowsHandles() {



//https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
//Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın

 Assert.assertEquals("Techpro Education | Online It Courses & Bootcamps",driver.getTitle());
//Tab 2'de https://www.youtube.com sayfasını açınız

     driver.switchTo().newWindow(WindowType.TAB);
     String YouTube= driver.getWindowHandle();
     driver.get("https://www.youtube.com");
//Tab 3'te https://www.linkedin.com sayfasını açınız

        driver.switchTo().newWindow(WindowType.TAB);
        String linkedin= driver.getWindowHandle();
        driver.get("https://www.linkedin.com");
//techproeducation sayfasına geçiniz

//youtube sayfasına geçiniz
//linkedIn sayfasına geçiniz

    }
}
