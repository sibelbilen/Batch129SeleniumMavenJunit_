package day11_IFrame_WindowHandle;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

import static org.junit.Assert.assertEquals;

public class C03_WindowHandle2 extends TestBase {
    @Test
    public void newWindowTest() throws InterruptedException {
        //Window1 https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproeducationWindowHandle = driver.getWindowHandle();

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());

        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();


        //techproeducation sayfasına geçiniz:
        Thread.sleep(3000);
        driver.switchTo().window(techproeducationWindowHandle);

        //youtube sayfasına geçiniz:
        Thread.sleep(3000);
        driver.switchTo().window(youtubeWindowHandle);

        //linkedIn sayfasına geçiniz:
        Thread.sleep(3000);
        driver.switchTo().window(linkedinWindowHandle);



    }

}
