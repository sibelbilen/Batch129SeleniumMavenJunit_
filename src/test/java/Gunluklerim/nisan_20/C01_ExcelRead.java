package Gunluklerim.nisan_20;

import com.google.common.collect.Table;
import org.apache.hc.core5.util.Asserts;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C01_ExcelRead {
    /*
Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
Kullanılan satır sayısın bulun
Ülke-Başkent şeklinde verileri yazdırın
*/

    @Test
    public void test01() throws IOException {

     //dosya al
        FileInputStream fileInputStream =  new FileInputStream("src/test/java/resources/Capitals.xlsx");

        //FileInputStream objesini WorkBook(Excel) dosyası olarak aç:
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //Sayfayı(Sheet) aç:
        Sheet sheet1 = workbook.getSheet("Sheet1");

        //Satıra(Row) git:
        Row row = sheet1.getRow(0);//1. satır: indeks 0

        //Birinci hücreyi(Cell) al:
        Cell cell = row.getCell(1);//1. hücre: indeks 0
        System.out.println("cell = " + cell);

    


        //Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
Cell cell1=sheet1.getRow(1).getCell(1);
        System.out.println("cell1 = " + cell1);
        //3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin


Cell cell2=sheet1.getRow(2).getCell(0);
        System.out.println("cell2 = " + cell2);
        Assert.assertEquals("France",cell2.toString());


        //Kullanılan satır sayısın bulun

  int KullanilanSatir=sheet1.getLastRowNum();
        System.out.println("KullanilanSatir = " + KullanilanSatir);

        //Ülke-Başkent şeklinde verileri yazdırın


        Map<String,String>toplam=new HashMap<>();
        for (int satirIndex = 1; satirIndex <KullanilanSatir ; satirIndex++) {
String ulkeAdi=sheet1.getRow(satirIndex).getCell(0).toString();
String baskentAdi=sheet1.getRow(satirIndex).getCell(0).toString();
            toplam.put(ulkeAdi,baskentAdi);
        }//fori
        System.out.println("toplam = " + toplam);
    }
}
