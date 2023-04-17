package day14_JavaFaker_FileExist.day13_ActionsClass;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/*
https://techproeducation.com adresine gidin
Sayfanın alt tarafına gidin
Sayfanın üst tarafına gidin
*/
public class C03_Action03 extends TestBase {

   @Test

    public void test01(){
       //https://techproeducation.com adresine gidin
driver.get("https://techproeducation.com");

       // Sayfanın alt tarafına gidin
       //reklam kapatma icin
       driver.findElement(By.xpath("(//i[@class='eicon-close'])")).click();
//ssss
     Actions actions=new Actions(driver);
     bekle(2);
     actions.sendKeys(Keys.PAGE_DOWN).perform();
       bekle(2);
       actions.sendKeys(Keys.PAGE_DOWN).perform();
//PAGE_DOWN tusu hizli bir sekilde asagiya gidiyor.
       bekle(2);
       actions.sendKeys(Keys.ARROW_DOWN).perform();//Arrow_Down tusu PAGE_DOWN tusundan daha az asagi kaydiriyor.
       //perform uygulanmazsa islem calismiyor.
//sseus
       bekle(2);
       actions.sendKeys(Keys.ARROW_DOWN).perform();

       bekle(3);


//yukardakinin yaptigini asagidan daha kisa sekilde yapabiliriz.

       actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();

       // Sayfanın üst tarafına gidin
       bekle(2);
     actions.sendKeys(Keys.PAGE_UP).perform();


   }
}
