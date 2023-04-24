package day21_JSExecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class C03_JSExecuter_Type extends TestBase {
   /*
Techpro education ana sayfasina git
Arama kutusuna QA yaz
 */

    @Test
    public void test01() {

        //Techpro education ana sayfasina git
        //        Techpro education ana sayfasına git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();


        //Arama kutusuna QA yaz

    }
}
