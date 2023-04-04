package GUNLUK_CALISMALAR;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmojıTask extends TestBase {

    /*
        // https://lnkd.in/dTWJi7Rn sitesine gidin
// ikinci emojiye tıklayın
// tüm ikinci emoji öğelerini tıklayın
// parent iframe e geri donun
     */

    @Test

    public void test01(){
        driver.get("https://lnkd.in/dTWJi7Rn");
//// tüm ikinci emoji öğelerini tıklayın
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//a[@href='#nature']")).click();

// tüm ikinci emoji öğelerini yazdirin
        List<WebElement> emojies = driver.findElements(By.xpath("//div[@id='nature']"));
        emojies.forEach(t -> System.out.println(t.getText()));

// parent iframe e geri donun
        driver.switchTo().parentFrame();

    }
}
