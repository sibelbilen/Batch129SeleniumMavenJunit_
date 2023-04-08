package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Baby" secenegini secin
// sectiginiz option'i yazdirin
// dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin
// dropdown'daki optionların tamamını yazdırın

public class DropDownOptions extends TestBase {

    @Test
    public void test02() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/ ");
        // dropdown'dan "Baby" secenegini secin

        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select=new Select(ddm);
        select.selectByVisibleText("Baby");
        // sectiginiz option'i yazdirin
        String babyOptionslar=select.getFirstSelectedOption().getText();
        System.out.println("babyOptionslar : = " + babyOptionslar);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("////////////////////////////////////////////////////////////");


        // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin

      List<WebElement> tumOptionslar= select.getOptions();
        System.out.print("tumOptionslar = " + tumOptionslar);
      int toplamSayi=28;
      int olan=tumOptionslar.size();
        Assert.assertEquals(toplamSayi,olan);

        // dropdown'daki optionların tamamını yazdırın

        for (WebElement w : tumOptionslar) {
            System.out.println(w.getText());
        }

    }
}
