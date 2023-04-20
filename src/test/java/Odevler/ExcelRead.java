package Odevler;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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




    }
}
