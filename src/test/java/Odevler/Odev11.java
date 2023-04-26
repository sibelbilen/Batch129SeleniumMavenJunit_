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

public class Odev11  {
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

    @Test
    public void test01() throws IOException {
        FileInputStream fis=  new FileInputStream("/C://Users//Casper//Desktop//jav.xml/");
        Workbook workbook=WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("shell1");

    }

    @Test
    public void test02() throws IOException {
        // Excel dosyasını oluşturmak için gerekli kodlar
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");

        // Satır ve hücreleri oluşturma
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell1 = row.createCell(0);
        XSSFCell cell2 = row.createCell(1);

        // Hücrelere veri yazma
        cell1.setCellValue("email");
        cell2.setCellValue("password");

        row = sheet.createRow(1);
        cell1 = row.createCell(0);
        cell2 = row.createCell(1);

        cell1.setCellValue("evren.techproed@gmail.com");
        cell2.setCellValue("asdfgh");

        // Dosyayı kaydetme
        FileOutputStream outputStream = new FileOutputStream(new File("/C://Users//Casper//Desktop//jav.xml/"));
        workbook.write(outputStream);
        workbook.close();
    }








    }

