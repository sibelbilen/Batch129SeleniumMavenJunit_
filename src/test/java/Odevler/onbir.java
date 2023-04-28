package Odevler;

import Utilities.TestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class onbir extends TestBase {
    //    -İki tane test methodu oluşturalım
    FileInputStream fis=new FileInputStream("src/test/java/resourses/data.xlsx");
    Workbook workbook = WorkbookFactory.create(fis);

    public onbir() throws IOException {
    }


    @Test
    public void test1() throws IOException {
//    -İlkinde masaüstünde java ile data.xlsx isimli bir dosya oluşturalım
//        String fileName="data.xlsx";
//       String sheetName="Sheet1";
//        Workbook workbook = new XSSFWorkbook();
//
//        workbook.createSheet(sheetName);
//        File file = new File(fileName);
//        file.createNewFile();
        //FileInputStream fis=new FileInputStream("/Users/yusufozturan/Desktop/data.xlsx");
        // workbook.write(file);
        // workbook.close();
//    -Birinci satır birinci hücreye email ve ikinci hücreye password
        workbook.getSheet("Sayfa1").createRow(0).createCell(0).setCellValue("Email");
        workbook.getSheet("Sayfa1").getRow(0).createCell(1).setCellValue("Password");
//    -ikinci satır birinci hücreye evren.techproed@gmail.com ve ikinci hücreye asdfgh yazdıralım
        workbook.getSheet("Sayfa1").getRow(1).createCell(0).setCellValue("evren.techproed@gmail.com");
        workbook.getSheet("Sayfa1").getRow(1).createCell(1).setCellValue("asdfgh");
        FileOutputStream fos=new FileOutputStream("src/test/java/resourses/data.xlsx");
        workbook.write(fos);
//    -Dosyayı kaydedelim
        FileOutputStream fileOut = new FileOutputStream("data.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
    @Test
    public void test2(){
//    -İkinci methodda https://www.bluerentalcars.com/ adresine gidip
        driver.get("https://www.bluerentalcars.com/");
//    -Excel dosyasından aldığımız kullanıcı bilgileri ile login olalım
        WebElement login= driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        WebElement email= driver.findElement(By.id("formBasicEmail"));
        email.sendKeys(workbook.getSheet("Sayfa1").getRow(1).getCell(0).toString());
        WebElement password= driver.findElement(By.id("formBasicPassword"));
        password.sendKeys(workbook.getSheet("Sayfa1").getRow(1).getCell(1).toString());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    -Login olduğumuzu doğrulayalım
        WebElement erol=driver.findElement(By.xpath("//button[text()='Erol Evren']"));
        Assert.assertTrue("Erol Evren",true);
    }
}
