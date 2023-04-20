package Odevler;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OdevTekrar extends TestBase {
    @Test
    public void name() {
        //-https://jqueryui.com/slider/#colorpicker adrese gidiniz
        driver.get("https://jqueryui.com/slider/#colorpicker");

driver.switchTo().frame(0)
;
        //-Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız
WebElement yesilTus= driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
WebElement maviTus= driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default'][3]"));
Actions actions=new Actions(driver);
actions.dragAndDropBy(yesilTus,-175,0);
actions.dragAndDropBy(maviTus,-80,0);
actions.dragAndDropBy(yesilTus,301,0).release().perform();

    }
}