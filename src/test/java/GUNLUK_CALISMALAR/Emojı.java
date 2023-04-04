package GUNLUK_CALISMALAR;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Emojı extends TestBase {

        // https://lnkd.in/dTWJi7Rn sitesine gidin
// ikinci emojiye tıklayın
// tüm ikinci emoji öğelerini tıklayın
// parent iframe e geri donun
// formu doldurun,(Formu istediğiniz metinlerle doldurun)
// apply button a basiniz
        @Test
        public void test01() {
// https://lnkd.in/dTWJi7Rn sitesine gidin
            driver.get("https://lnkd.in/dTWJi7Rn");

// ikinci emojiye tıklayın
            driver.switchTo().frame(1);
            driver.findElement(By.xpath("//a[@href='#nature']")).click();

// tüm ikinci emoji öğelerini yazdirin
            List<WebElement> emojies = driver.findElements(By.xpath("//div[@id='nature']"));
            emojies.forEach(t -> System.out.println(t.getText()));

// parent iframe'e geri donun
            driver.switchTo().defaultContent();

// formu doldurun,(Formu istediğiniz metinlerle doldurun) ve apply button'a basiniz
            driver.findElement(By.xpath("//input[@id='text']")).sendKeys("");
            Actions actions = new Actions(driver);
            actions.sendKeys("ayse").sendKeys(Keys.TAB)
                    .sendKeys("sansli").sendKeys(Keys.TAB)
                    .sendKeys("nature").sendKeys(Keys.TAB)
                    .sendKeys("hamburger").sendKeys(Keys.TAB)
                    .sendKeys("⚽").sendKeys(Keys.TAB)
                    .sendKeys("park").sendKeys(Keys.TAB)
                    .sendKeys("idea").sendKeys(Keys.TAB)
                    .sendKeys("❤").sendKeys(Keys.TAB)
                    .sendKeys("flag").sendKeys(Keys.TAB)
                    .sendKeys("feel").sendKeys(Keys.TAB)
                    .sendKeys("smiles").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();


        }
}
