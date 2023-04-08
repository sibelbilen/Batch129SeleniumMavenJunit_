package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends TestBase {

    @Test
    public void test01() {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        //customer id kısmına 53920 yazın

        WebElement id=driver.findElement(By.xpath("//input[@type='text']"));
        id.sendKeys("53920");
        id.click();

        //submit butonuna tıklayın
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //cıkan alert mesajını yazdırın
        System.out.println(driver.switchTo().alert().getText());
        //alerti kabul edin
        bekle(3);
        driver.switchTo().alert().accept();
        //cıkan 2. alert mesajını yazdırın

        System.out.println(driver.switchTo().alert().getText());
        //cıkan 2. alerti kabul edin
        bekle(3
        );
driver.switchTo().alert().dismiss();

    }
}
