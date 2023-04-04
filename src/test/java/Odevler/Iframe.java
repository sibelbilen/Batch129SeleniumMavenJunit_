package Odevler;
/*
➢ https://testcenter.techproeducation.com/index.php?page=iframe
➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin
oldugunu test edelim
➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
 */
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe extends TestBase {
    @Test

    public void test01(){
        //➢ https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        //➢ Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin
        //oldugunu test edelim

      String iceriyorMu= driver.findElement(By.xpath("//*[text()='An iframe with a thin black border:']")).getText();
     Assert.assertTrue(iceriyorMu.contains("black border"));
        //➢ Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);
        WebElement Applicationslists=driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(Applicationslists.isDisplayed());
        //➢ Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
        driver.switchTo().parentFrame();

        WebElement PoveredBy= driver.findElement(By.xpath("//*[text()='Povered By']"));
        Assert.assertTrue(PoveredBy.isDisplayed());
    }
}
