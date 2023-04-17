package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class files extends TestBase {

    @Test
    public void files01() {
        //  System.getProperty("user.dir");-->icinde bulunan klosorun path'i verir.'
        //  System.getProperty("user.home");-->bilgisayaimizda bulunan user klosorunu verir.
      //  Files.exists(Paths.get(filepath))-->bilgisayarimizda dosyanin olup olmadigini kontrol eder.


//        2.https://testcenter.techproeducation.com/index.php?page=filedownload adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

//        3.b10 all test cases dosyasını indirelim
//driver.findElement(By.linkText("b10 all test cases, code.docx")).click();
//        4.Dosyanın başarıyla indirilip indirilmediğini test edelim
String dosyaYolu=System.getProperty("user.home")+"/Downloads/b10 all test cases, code.docx/";

boolean isExist=Files.exists(Path.of(dosyaYolu));
assertTrue(isExist);
    }
}
