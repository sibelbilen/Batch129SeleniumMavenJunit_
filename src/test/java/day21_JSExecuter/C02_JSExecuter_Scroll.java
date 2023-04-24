package day21_JSExecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C02_JSExecuter_Scroll extends TestBase {
    /*
Techpro education ana sayfasına git
We Offer elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
Aynı sayfada Enroll Free elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
Aynı sayfada WHY US? elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
Aynı sayfada tekrar Enroll Free elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
 */

    @Test
    public void test01() {
//        Techpro education ana sayfasına git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

//        "We Offer" elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
        WebElement weOffer = driver.findElement(By.xpath("//span[.='we offer']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",weOffer);
        bekle(3);
        scrollIntoView(weOffer);//test base claasindaki method
        tumSayfaResmi();
        bekle(2);

//        Aynı sayfada "Enroll Free "elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
WebElement enroollFree= driver.findElement(By.xpath("//*[text()='Enroll Free Course']"));
scrollIntoView(enroollFree);
tumSayfaResmi();


//        Aynı sayfada "WHY US?" elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
        WebElement whyUs= driver.findElement(By.xpath("/h3[.='WHY US?']"));
        scrollIntoView(whyUs);
        tumSayfaResmi();
        bekle(2);
//        Aynı sayfada tekrar "Enroll Free" elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
scrollIntoView(enroollFree);
tumSayfaResmi();

    }

    }


