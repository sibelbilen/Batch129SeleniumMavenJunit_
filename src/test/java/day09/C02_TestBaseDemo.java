package day09;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class C02_TestBaseDemo extends TestBase {
    @Test

    public void test(){
//Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
//Başlığın "Bootcamp" içerdiğini test edelim
        String actuel= driver.getTitle();
        String expectedtitle="Bootcamp";
        Assert.assertTrue(actuel.contains(expectedtitle));
    }
}
