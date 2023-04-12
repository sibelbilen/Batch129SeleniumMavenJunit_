package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//https://the-internet.herokuapp.com/upload adresine gidin
//logo.jpeg dosyasını yükleyin(uopload)
//"File Uploaded!" textinin görüntülendiğini test edin
public class FileUpload extends TestBase {
    @Test
    public void test01() {
//  https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
//logo.jpeg dosyasını yükleyin(uopload)
        WebElement dosyaYukleme= driver.findElement(By.xpath("//input[@id='file-upload']"));


        dosyaYukleme.sendKeys(System.getProperty("user.home")+"/Desktop/logo.jpeg");


        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
//"File Uploaded!" textinin görüntülendiğini test edin
WebElement fileUploaded=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(fileUploaded.isDisplayed());
    }
}
