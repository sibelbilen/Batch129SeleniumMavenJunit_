package day20_ReadExcel_WriteExcel;

import Utilities.TestBase;
import day06.C02_MavenClassWork;

import org.apache.hc.core5.util.Asserts;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
Kullanılan satır sayısın bulun
Ülke-Başkent şeklinde verileri yazdırın
*/
public class C01_ExcelRead  {
    @Test
    public void excelReadTest() throws IOException {
        //Dosyayı al:
        FileInputStream fileInputStream =  new FileInputStream("TestOutput/Capitals.xlsx");

        //FileInputStream objesini WorkBook(Excel) dosyası olarak aç:
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //Sayfayı(Sheet) aç:
        Sheet sheet1 = workbook.getSheet("Sheet1");

        //Satıra(Row) git:
        Row row = sheet1.getRow(0);//1. satır: indeks 0

        //Birinci hücreyi(Cell) al:
        Cell cell = row.getCell(1);//1. hücre: indeks 0

        System.out.println("cell = " + cell);

//        Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
      Cell cell11=  sheet1.getRow(0).getCell(1);
        System.out.println("cell11 = " + cell11);
//        3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
        Cell cell31=  sheet1.getRow(2).getCell(0);
        System.out.println("cell31 = " + cell31);
        Assert.assertEquals("France",cell31.toString());
//      son  Kullanılan satır sayısıni bulun
int sonkullanilanSatirIndexi=sheet1.getLastRowNum();
        System.out.println("toplamSatirSayisi = " + sonkullanilanSatirIndexi);   //son kullanilan satirin indexini verir.
        //fiziki olarak kac satir kullanilmistir?
        
        int KullanilanToplamSatirSayisi=sheet1.getPhysicalNumberOfRows();
        System.out.println("KullanilanToplamSatirSayisi = " + KullanilanToplamSatirSayisi);
//        Ülke-Başkent şeklinde verileri yazdırın

    }
}
