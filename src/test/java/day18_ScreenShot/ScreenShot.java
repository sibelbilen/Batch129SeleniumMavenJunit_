package day18_ScreenShot;

import Utilities.TestBase;
import org.junit.Test;

public class ScreenShot extends TestBase {
    @Test
    public void test01() {

//Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");


//Sayfanın resmini alalım
    tumSayfaResmi();
//Sonra amazon sayfasına gidelim
        driver.get("http://amazon.com");
//Amazon sayfasının ekran görüntüsünü alalım

tumSayfaResmi();
    }
}
