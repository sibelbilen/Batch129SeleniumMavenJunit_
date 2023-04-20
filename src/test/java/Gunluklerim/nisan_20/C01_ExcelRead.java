package Gunluklerim.nisan_20;

import com.google.common.collect.Table;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

        FileInputStream fileInputStream=new FileInputStream("src/test/java/resources/~$Capitals.xlsx");

Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheet("sheet");
        Row row= sheet.getRow(0);
        //Birinci hücreyi(Cell) al:
        Cell cell= row.getCell(1);
        System.out.println("cell = " + cell);
        //Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
     Cell cell1=   sheet.getRow(0).getCell(1);
        System.out.println("cell1 = " + cell1);
        //3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin

        //Kullanılan satır sayısın bulun
        //Ülke-Başkent şeklinde verileri yazdırın

    }
}
