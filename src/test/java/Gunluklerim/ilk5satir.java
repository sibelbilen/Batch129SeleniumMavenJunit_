package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ilk5satir extends TestBase {

    @Test
    public void test01() {

        // Google arama sayfasına gitme
        driver.get("https://www.google.com/");

        // Arama kutusunu bulma ve arama yapma
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        // İlk 5 sonucu yazdırma
      List<WebElement> searchResults = driver.findElements(By.xpath("//*[text()='Yaklaşık 6.040.000 sonuç bulundu']"));
       for (int i = 0; i < 5; i++) {
            WebElement result = searchResults.get(i);
           WebElement title = result.findElement(By.tagName("h3"));
           WebElement link = result.findElement(By.tagName("a"));
          String titleText = title.getText();
           String linkText = link.getAttribute("href");
           System.out.println((i + 1) + ". " + titleText);
            System.out.println(linkText);
       }

        // Tarayıcıyı kapatma
        //driver.quit();
    }
}
