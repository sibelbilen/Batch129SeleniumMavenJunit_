package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertTrue;

public class FileDownload extends TestBase {

    @Test
    public void test01() {
        //"https://testcenter.techproeducation.com/index.php?page=file-download"   adresine gidin
driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        // "b10 all test cases" dosyasını indirin
        WebElement indirme=driver.findElement(By.linkText("b10 all test cases, code.docx"));
        indirme.click();




        //  Dosyanın başarıyla indirilip indirilmediğini test edin.
        String userHome=System.getProperty("user.home")+"/Downloads/b10 all test cases, code (2).docx/";

        Boolean isExist=Files.exists(Path.of(userHome));
        System.out.println("isExist = " + isExist);
    }
}
