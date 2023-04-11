package day15_FileUpload_Waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class C01_FileUpload extends TestBase {
/*
https://the-internet.herokuapp.com/upload adresine gidin
logo.jpeg dosyasını yükleyin(uopload)
"File Uploaded!" textinin görüntülendiğini test edin
*/

    @Test
    public void test01() {


//https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
//logo.jpeg dosyasını yükleyin(uopload)//

WebElement dosyaYukleme=driver.findElement(By.xpath("//input[@id='file-upload']"));
dosyaYukleme.sendKeys(System.getProperty("user.home")+"/Desktop/logo.jpeg");

//  //Gönerilecek(upload) dosyanın adresini choosefile butununa senKeys() metodu ile yazıyoruz. Bu şekilde gödrilecek dosya seçilmiş olur.

 WebElement fileUploadButton=driver.findElement(By.xpath("//input[@id='file-submit']"));
   fileUploadButton.click();
//"File Uploaded!" textinin görüntülendiğini test edin
        WebElement fileUploadedText = driver.findElement(By.xpath("//h3"));
        assertTrue(fileUploadedText.isDisplayed());
    }
}
