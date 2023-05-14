package Odevler;

import Utilities.TestBase;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;

public class Odev11 {
    /*
    -İki tane test methodu oluşturalım
    -İlkinde masaüstünde java ile data.xlsx isimli bir dosya oluşturalım
    -Birinci satır birinci hücreye email ve ikinci hücreye password
    -ikinci satır birinci hücreye evren.techproed@gmail.com ve ikinci hücreye asdfgh yazdıralım
    -Dosyayı kaydedelim
    -İkinci methodda https://www.bluerentalcars.com/ adresine gidip
    -Excel dosyasından aldığımız kullanıcı bilgileri ile login olalım
    -Login olduğumuzu doğrulayalım
*/
//    FileInputStream fis = new FileInputStream("src/test/java/resources/data.xlsx.xlsx");
//    Workbook workbook = WorkbookFactory.create(fis);
//
//    public Odev11() throws IOException {
//    }

    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/resources/data.xlsx.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        // Set the values of the cells
        workbook.getSheet("Sheet1").getRow(1).createCell(0).setCellValue("email");
        workbook.getSheet("Sheet1").getRow(0).createCell(1).setCellValue("password");
        workbook.getSheet("Sheet1").getRow(1).createCell(0).setCellValue("sibelinko33@gmail.com");
        workbook.getSheet("Sheet1").getRow(1).createCell(1).setCellValue("sibel");

        // Save the changes
        FileOutputStream fos = new FileOutputStream("src/test/java/resources/data.xlsx.xlsx");
        workbook.write(fos);
        fos.close();


    }
}
