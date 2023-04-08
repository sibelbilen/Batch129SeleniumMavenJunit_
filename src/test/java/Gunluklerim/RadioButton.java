package Gunluklerim;
// https://demo.guru99.com/test/radio.html adresine gidin
// radiobutton elementlerini locate edin
// option2'yi secin
// option2 elementlerinin secili oldugunu Test edin
// option1 elementlerinin secili olmadıgını test edin
// option3 elementlerinin secili olmadıgını test edin

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RadioButton extends TestBase {
    @Test
    public void name() {
        // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html");
        // radiobutton elementlerini locate edin
        WebElement option01= driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        WebElement option02= driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
        WebElement option03= driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
        // option2'yi secin
        option02.click();

        // option2 elementlerinin secili oldugunu Test edin
        assertTrue(option02.isSelected());
        // option1 elementlerinin secili olmadıgını test edin
        assertFalse(option01.isSelected());

        // option3 elementlerinin secili olmadıgını test edin
assertFalse(option03.isSelected());
    }
}
