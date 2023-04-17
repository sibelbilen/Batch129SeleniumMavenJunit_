package day19_WebTables_ReadExcel;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

//    Task 1 : Table1’i yazdırın
//    Task 2 : 3. Satır verilerini yazdırın
//    Task 3 : Son verilerini verileri yazdırın
//    Task 4 : 5. Sütun verilerini yazdırın
//    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
//    Parameter 1 = satır numarası
//    Parameter 2 = sütun numarası
//    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.
public class C01_WebTables extends TestBase {



    //    Task 1 : Table1’i yazdırın
    @Test
    public void table1Print() {
        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");
String table01=driver.findElement(By.id("table1")).getText();
        System.out.println("table01 = " );
        System.out.println(table01);

      //elementleri tek tek yazdiralim:

   List<WebElement>tumElementler =driver.findElements(By.xpath("//table[@id='table1']//td"))  ;

//        for (WebElement w : tumElementler) {
//            System.out.println(w.getText());
//        }

//lamda ile
        tumElementler.stream().forEach(t-> System.out.println(t.getText()+"--->"));



    }

    //    Task 2 : 3. Satır verilerini yazdırın
    @Test
    public void satir3VerileriPrint() {
        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");
List<WebElement>satir3List=driver.findElements(By.xpath("//table[@id='table1']//tr[3]/td"));
satir3List.forEach(t-> System.out.println(t.getText()+" | "));



    }
}
