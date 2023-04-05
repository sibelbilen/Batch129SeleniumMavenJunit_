package GUNLUK_CALISMALAR.day04;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;

public class C01  extends TestBase {

@Test
    public void test01(){


//https://www.techproeducation.com adresine gidiniz
    driver.get("https://www.techproeducation.com");


//Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    Assert.assertEquals("Techpro Education | Online It Courses & Bootcamps",driver.getTitle());



//Tab 2'de https://www.youtube.com sayfasını açınız.

    driver.switchTo().newWindow(WindowType.TAB).get("https://www.youtube.com");


//Tab 3'te https://www.linkedin.com sayfasını açınız

   driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");

    List<String> tumTablar=new ArrayList<>(driver.getWindowHandles());


//techproeducation sayfasına geçiniz

    bekle(3);

 driver.switchTo().window(tumTablar.get(0));


//youtube sayfasına geçiniz
bekle(3);
    driver.switchTo().window(tumTablar.get(1));

//linkedIn sayfasına geçiniz
bekle(3);
    driver.switchTo().window(tumTablar.get(2));

}

}
