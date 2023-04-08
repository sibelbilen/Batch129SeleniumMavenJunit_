package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDwon extends TestBase {
    @Test
    public void test01() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");
// dropdown'dan "Books" secenegini secin
        //DropDown 3 adımda handle edilir
        //1-)DropDown Locate Edilmelidir
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2-)Select Objesi Olusturulur
        Select select = new Select(ddm);
select.selectByIndex(5);

// arama cubuguna "Java" aratın

WebElement arama=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
arama.sendKeys("java");
    arama.submit();
// arama sonuclarinin Java icerdigini test edin
        String aramaSonucu= driver.findElement(By.xpath("//*[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        Assert.assertTrue(aramaSonucu.contains("java"));

    }
}
