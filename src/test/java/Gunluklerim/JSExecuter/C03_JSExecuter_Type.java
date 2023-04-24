package Gunluklerim.JSExecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static java.awt.SystemColor.text;

public class C03_JSExecuter_Type extends TestBase {

    /*
Techpro education ana sayfasina git
Arama kutusuna QA yaz
 */

    @Test
    public void test01() {


        //Techpro education ana sayfasina git
        //        Techpro education ana sayfasina git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        //Arama kutusuna QA yaz
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+text+"')",searchBox);


    }
}
