package GUNLUK_CALISMALAR.day04;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/*
https://jqueryui.com/droppable/ adresine gidin
"Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
*/

public class Actions04 extends TestBase {
    @Test
    public void test01() {

        //https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");
        //"Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.


        //iframe oldugu icin swich yapamiyoruz.
        driver.switchTo().frame(0);


        WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();

//dragAndDrop() methodu kaynak elemanı hedef eleman üzerine bırakır.

    }
}
