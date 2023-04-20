package Odevler;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelRead {
    @Test
    public void test01() throws IOException {
        //dosyayi al :
        FileInputStream fileInputStream=new FileInputStream("src/test/java/resources/Capitals.xlsx");

        //FileInputStream objesini workBook(Excel) dosyasi olarak ac:
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        //sayfayi(Sheet)ac :
        Sheet sheet1=workbook.getSheet("sheet1");

//satira(row)git
        Row row=sheet1.getRow(1);//1.satir indeks 0

        //biirnci hucreyi al
        Cell cell=row.getCell(1);
       
        System.out.println( cell);
        //        Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
Cell cell1=sheet1.getRow(0).getCell(1);

        System.out.println("cell1 = " + cell1);

     //  3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
               Cell cell2=sheet1.getRow(2).getCell(0);
        System.out.println("cell2 = " + cell2);
        Assert.assertEquals("France",cell2.toString());

        //son  Kullanılan satır sayısıni bulun
        
        int sonKullanilanSatirSayisi=sheet1.getLastRowNum();
        System.out.println("sonKullanilanSatirSayisi = " + sonKullanilanSatirSayisi);
        //fiziki olarak kac satir kullanilmistir?
        int fiizki=sheet1.getPhysicalNumberOfRows();
        System.out.println("fiizki = " + fiizki);
        //Ülke-Başkent şeklinde verileri yazdırın

        Map<String,String>UlkeBaskent=new HashMap<>();
        for (int satirindeksi = 1; satirindeksi < fiizki; satirindeksi++) {
            String ulkeAdi=sheet1.getRow(satirindeksi).getCell(0).toString();
            String baskentAdi=sheet1.getRow(satirindeksi).getCell(1).toString();
            UlkeBaskent.put(ulkeAdi,baskentAdi);
            System.out.println("ulkelerVeBaskentleri = " + UlkeBaskent);

        }
    }
}
