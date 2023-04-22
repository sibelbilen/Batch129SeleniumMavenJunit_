package Gunluklerim;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWhite {
         /*
    Bir "NÜFUS" sütunu oluşturup başkent nüfuslarını excel doyasına yazınız:
    (D.C: 712816, Paris: 2161000, London: 8982000, Ankara: 5663000 ...)
     */

    @Test
    public void test01() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("src/test/java/resources/Capitals.xlsx");

        Workbook workbook= WorkbookFactory.create(fileInputStream);
workbook.getSheet("sheet").getRow(0).createCell(2).setCellValue("nufus");
workbook.getSheet("sheet").getRow(1).createCell(2).setCellValue("123344444");
workbook.getSheet("sheet").getRow(2).createCell(2).setCellValue(222);
workbook.getSheet("sheet").getRow(3).createCell(2).setCellValue(222222);

       FileOutputStream fos=new FileOutputStream("src/test/java/resources/Capitals.xlsx");
workbook.write(fos);


    }

    @Test
    public void name() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("src/test/java/resources/Capitals.xlsx");

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        workbook.getSheet("Sheet").getRow(4).createCell(2).setCellValue((String)null);

        FileOutputStream fis=new FileOutputStream("src/test/java/resources/Capitals.xlsx");
        workbook.write(fis);
    }
}
