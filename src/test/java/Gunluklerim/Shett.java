package Gunluklerim;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class Shett extends TestBase {
    // https://www.teknosa.com/ adresine gidin
    // arama cubuguna oppo yazip enter'a basınız
    // sonuc sayisini yazdiriniz
    // ikinci urunun fotografını cekin
    // cikan ikinci urune tiklayiniz
    // iki ArrowDown sayfayı asagiya kaydirin
    // sepete ekleyiniz
    // sepetim'e git tilayiniz
    // "Siparis Ozeti" webelementinin text'ini yazdiriniz
    // Alisverisi tamamlayiniz
    // "Teknosa'ya hos geldiniz" webelementinin text'ini yazdiriniz
    // driver'i kapatiniz


    @Test
    public void name() throws InterruptedException, IOException {

        // https://www.teknosa.com/ adresine gidin
        driver.get("https://www.teknosa.com/");


        // arama cubuguna oppo yazip enter'a basınız
        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Oppo" + Keys.ENTER);
        Thread.sleep(3000);
        try {
            driver.findElement(By.xpath("//div[@id='ins-editable-button-1580496494']")).click();
        } catch (Exception e) {
            System.out.println("reklam yok");
        }

        // sonuc sayisini yazdiriniz
     WebElement sonucSayisi= driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println("sonucSayisi: = " + sonucSayisi.getText());

        // ilk urunun fotografını cekin
WebElement ilkUrun= driver.findElement(By.xpath("(//a[@class='prd-link gowitPlp-js'])[1]"));
String dosyaYolu="TestOutput/pratic";
FileUtils.copyFile(ilkUrun.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));


        // cikan ilkurune tiklayiniz
ilkUrun.click();

        // iki ArrowDown sayfayı asagiya kaydirin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        // sepete ekleyiniz
        // sepetim'e git tilayiniz
        // "Siparis Ozeti" webelementinin text'ini yazdiriniz
        // Alisverisi tamamlayiniz
        // "Teknosa'ya hos geldiniz" webelementinin text'ini yazdiriniz
        // driver'i kapatiniz
    }
}
