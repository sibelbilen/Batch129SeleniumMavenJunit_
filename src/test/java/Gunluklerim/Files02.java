package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Files02  extends TestBase {
    /*
https://the-internet.herokuapp.com/upload adresine gidin
logo.jpeg dosyasını yükleyin(uopload)
"File Uploaded!" textinin görüntülendiğini test edin
*/

    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
        //logo.jpeg dosyasını yükleyin(uopload)
        WebElement dosyaYukleme= driver.findElement(By.xpath("//input[@id='file-upload']"));
        dosyaYukleme.sendKeys(System.getProperty("user.home")+"/Desktop/logo.jpeg");

        WebElement upload= driver.findElement(By.xpath("//*[@id='file-submit']"));
        upload.click();
        //"File Uploaded!" textinin görüntülendiğini test edin
        WebElement fileUploadedText = driver.findElement(By.xpath("//h3"));
        assertTrue(fileUploadedText.isDisplayed());
    }
}
