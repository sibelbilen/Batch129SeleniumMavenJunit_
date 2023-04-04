package Odevler;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Odev11_IframeEmoji extends TestBase {
    // https://lnkd.in/dTWJi7Rn sitesine gidin
// ikinci emojiye tıklayın
// tüm ikinci emoji öğelerini tıklayın
// parent iframe e geri donun
// formu doldurun,(Formu istediğiniz metinlerle doldurun)
// apply button a basiniz

    @Test

    public void emojiTask(){
        // https://lnkd.in/dTWJi7Rn sitesine gidin

        driver.get("https://lnkd.in/dTWJi7Rn");
// ikinci emojiye tıklayın
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//a[@href='#nature']")).click();
// tüm ikinci emoji öğelerini tıklayın
        List<WebElement>emojiList=new ArrayList<>(driver.findElements(By.xpath("//*[@id='nature']")));
        emojiList.stream().forEach(t-> System.out.println(t.getText()));
// parent iframe e geri donun

        driver.switchTo().parentFrame();
// formu doldurun,(Formu istediğiniz metinlerle doldurun)
        driver.findElement(By.xpath("//input[@id='smiles']")).sendKeys("HER SEY COK GUZEL OLACAK !");
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys("SANSLI!");
        driver.findElement(By.xpath("//input[@id='nature']")).sendKeys("NATURE !");
        driver.findElement(By.xpath("//input[@id='food']")).sendKeys("balik !");
        driver.findElement(By.xpath("//input[@id='activities']")).sendKeys("⚽ !");
        driver.findElement(By.xpath("//input[@id='places']")).sendKeys("herhangi bir yer !");
        driver.findElement(By.xpath("//input[@id='objects']")).sendKeys("belirsiz !");
        driver.findElement(By.xpath("//input[@id='symbols']")).sendKeys("❤ !");
        driver.findElement(By.xpath("//input[@id='flags']")).sendKeys("kalp!");
        driver.findElement(By.xpath("//input[@id='hide']")).sendKeys("kalp!");
        driver.findElement(By.xpath("//input[@id='active']")).sendKeys("smile!");


// apply button a basiniz
        driver.findElement(By.xpath("//button[@id='send']")).click();
    }
}
