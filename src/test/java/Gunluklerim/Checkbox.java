package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// https://demo.guru99.com/test/radio.html adresine gidin
// checkbox elementlerini locate edin
// checkbox1 ve checkbox3  secili degil ise secin
// checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
// checkbox2 elementinin secili olmadıgını test edin


public class Checkbox extends TestBase {
    @Test
    public void name() {
        // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html");
        // checkbox elementlerini locate edin
        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
        WebElement checkBox2= driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        WebElement checkBox3= driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
        // checkbox1 ve checkbox3  secili degil ise secin
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox3.isSelected()){
            checkBox3.click();
        }
        // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertTrue(checkBox3.isSelected());

        // checkbox2 elementinin secili olmadıgını test edin
Assert.assertFalse(checkBox2.isSelected());

    }
}
