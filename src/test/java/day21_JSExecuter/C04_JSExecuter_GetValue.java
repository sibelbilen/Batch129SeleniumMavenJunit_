package day21_JSExecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_JSExecuter_GetValue extends TestBase {

// 2)https://www.priceline.com/ a git

//  3)Tarih kısmındaki Yazili metinleri al ve yazdır


    @Test
    public void test01() {

// 2)https://www.priceline.com/ a git
      driver.get("https://www.carettahotel.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
//  3)Tarih kısmındaki Yazili metinleri al ve yazdır
        getValueByJS("checkin_date","name");

    }
}
