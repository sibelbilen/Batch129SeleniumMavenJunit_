package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsShift extends TestBase {

    /*
"https://techproeducation.com/" gidin
İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
 */

    @Test
    public void actions() {

//"https://techproeducation.com/" gidin
        driver.get("https://techproeducation.com/");


        //reklamlari kapatalim
        driver.findElement(By.xpath("//a[@class='dialog-close-button dialog-lightbox-close-button']")).click();

//İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
WebElement kelimeler=driver.findElement(By.xpath("//input[@class='elementor-search-form__input']"));
        Actions actions=new Actions(driver);
        actions.keyDown(kelimeler, Keys.SHIFT).sendKeys("techpro").keyUp(Keys.SHIFT).sendKeys("  education"+Keys.ENTER).perform();

    }
}
