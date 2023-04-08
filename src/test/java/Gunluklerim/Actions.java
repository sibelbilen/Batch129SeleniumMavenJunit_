package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Actions extends TestBase {

    @Test
    public void test01() {
        // Dinamik içerik sayfasına gitme
        driver.get("https://www.wikipedia.org/");

        // Arama kutusunu bulma

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='searchInput']"));
        // Arama kutusuna kelime girme ve arama yapma
        aramaKutusu.sendKeys("selenyum nedir");
        aramaKutusu.submit();
        // Arama sonuçlarını bulma
        WebElement aramaSonuclari = driver.findElement(By.xpath("//div[@class='results-info']"));
        System.out.println("aramaSonuclari = " + aramaSonuclari);
        // Arama sonuçlarında linkleri bulma ve yazdırma
        List<WebElement> links = aramaSonuclari.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.print(link.getText() + " - " + link.getAttribute("href"));
            // Tarayıcıyı kapatma
            driver.close();
        }
    }
}