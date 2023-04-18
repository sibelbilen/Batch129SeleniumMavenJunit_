package Gunluklerim;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables extends TestBase {

    //    Task 1 : Table1’i yazdırın
//    Task 2 : 3. Satır verilerini yazdırın
//    Task 3 : Son satırın verilerini yazdırın
//    Task 4 : 5. Sütun verilerini yazdırın
//    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
//    Parameter 1 = satır numarası
//    Parameter 2 = sütun numarası
//    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.


    @Test
    public void task1() {
        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");


        //    Task 1 : Table1’i yazdırın
        String table01 = driver.findElement(By.id("table1")).getText();
        System.out.println("-----------------------------------------------------------");
        System.out.println("table01 = " + table01);
        System.out.println("-----------------------------------------------------------------------");
//elementleri tek tek yazdiralim

        List<WebElement> tumsatir = driver.findElements(By.xpath("//table[@id='table1']//td"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~tum satir~~~~~~~~~~~~~~~~~~");
        for (WebElement w : tumsatir) {
            System.out.println(w.getText());
        }
    }

    @Test
    public void task02() {
        //    Task 2 : 3. Satır verilerini yazdırın

        List<WebElement> satir3 = driver.findElements(By.xpath("//table[@id='table1']//tr[3]"));
        System.out.println("@@@@@@@@@@@@@@@@@satir3@@@@@@@@@@@@@@@@@@");
        satir3.forEach(t -> System.out.println(t.getText() + " ||| "));

        List<WebElement> deneme = driver.findElements(By.xpath("//table[@id='table1']//tr[3]/td"));
        // td burada tek tek  data vermesi icin kullanilir. buradaki amac td olmadan yaparsak tr deki tamamini bir eleman olarak gorur.
        System.out.println("@@@@@@@@@@@@@@@@@satir3 td olanla @@@@@@@@@@@@@@@@@@");
        satir3.forEach(t -> System.out.println(t.getText() + " |"));


    }

    @Test
    public void task03() {
        //    Task 3 : Son satırın verilerini yazdırın



        //ilk satir ayni zamanda son satir bu ikilemden kurtulmak icin araya //tbody imlecini koyaraiz bodydeki son ssatiri almak istedigimizde bunu yaparaiz
        //last() ==> ile son satır indeksini yazıyorum.
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> sonSatirList = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[last()]/td"));
        sonSatirList.forEach(t-> System.out.print(t.getText()+" | "));
//cikti aciklamasi:

// burada ilk olarak birinci tableye gel diyoruz! table[1] genelde id ile lairsak daha garnti olur o yuzden yukarda yazdim
//son satiri almak istiyorum.//tr[last()]
        //son satiri boyle almak istiyorum ben bide headerdan kurtulmak istiyorum onun icin ne yaparim //tbody/tr[last()] yaparim bu sekilde oldugunda tum datalari verir
        //tek tek elemanlri istersekde sonuna //td koyariz

    }

    @Test
    public void sutun5Verileri() {
      //  Task 4 : 5. Sütun verilerini yazdırın
        driver.get("https://the-internet.herokuapp.com/tables");
     List<WebElement>sutun5List=driver.findElements(By.xpath("//table[1]//td[5]"));
        System.out.println("---------------------");
     sutun5List.forEach(t-> System.out.println(t.getText()+"|"));
     //buraya hic table[1]belirtmesek bu bize iki tablo varsa tum sutunlari verir.

    }



    public void printData(int satir, int sutun){
    driver.get("https://the-internet.herokuapp.com/tables");
    //  Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
//    Parameter 1 = satır numarası
//    Parameter 2 = sütun numarası
//    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.

    WebElement ikiParametreli= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+ satir +"]/td["+ sutun +"]"));
        System.out.println( ikiParametreli.getText());
//dinamik olmasi icin 3 yazacgimiza satir iicn parametreye koyariz.sutun icinde gecerli

}
    @Test
    public void printDataTesti() {

        printData(3,5);
    }
}
