package PRATICE_DERSI.DAY01;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class C05_Alert extends TestBase {
    //http://demo.guru99.com/test/delete_customer.php adresine gidin
    //customer id kısmına 53920 yazın
    //submit butonuna tıklayın
    //cıkan alert mesajını yazdırın
    //alerti kabul edin
    //cıkan 2. alert mesajını yazdırın
    //cıkan 2. alerti kabul edin


    @Test
    public void name() {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        //customer id kısmına 53920 yazın

 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");



        //submit butonuna tıklayın

driver.findElement(By.xpath("//input[@name='submit']")).click();


        //cıkan alert mesajını yazdırın

String alertYazisi=driver.switchTo().alert().getText();
        System.out.println("alertYazisi1 = " + alertYazisi);
        //alerti kabul edin
        driver.switchTo().alert().accept();
        bekle(2);
        //cıkan 2. alert mesajını yazdırın
      String alertMesa2=  driver.switchTo().alert().getText();
        System.out.println("alertMesa2 = " + alertMesa2);
        //cıkan 2. alerti kabul edin
        bekle(2);
        driver.switchTo().alert().accept();
    }
}
