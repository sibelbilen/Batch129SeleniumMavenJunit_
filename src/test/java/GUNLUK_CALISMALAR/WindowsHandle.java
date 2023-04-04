package GUNLUK_CALISMALAR;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WindowsHandle extends TestBase {
    /*
https://www.techproeducation.com adresine gidiniz
Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
Tab 2'de https://www.youtube.com sayfasını açınız
Tab 3'te https://www.linkedin.com sayfasını açınız
techproeducation sayfasına geçiniz
youtube sayfasına geçiniz
linkedIn sayfasına geçiniz
*/

    @Test

    public void test01(){
        ///*
        //https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");






        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın



        Assert.assertEquals("Techpro Education | Online It Courses & Bootcamps",driver.getTitle());



        //Tab 2'de https://www.youtube.com sayfasını açınız



        driver.switchTo().//driveri nereye gecirecegimi gosteriri.
                newWindow(WindowType.TAB).get("https://www.Google.com");


        //******note****:TAB >dediginde yeni sekme aciyor.TAB bir variabledir ve bir enumdur.Enum nedir duragan bir sey degismeyen sabit bir seydir.
       //******note*****>newWindow driver seklinde devam ediyor.
        //*******neden tab yaptik aralarda gezecegimiz icin.
        //****get :void doner herhnagi bir sey donmez verileni dondurur.


//        Sayfa başlığının "Google" olduğunu doğrulayınız
        assertEquals("Google", driver.getTitle());
//*****note****>eger benim driverim swichto olmasaydi ben o basligi alamazdim ve hata verecekti.



        //Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");//driver gibi harket ettigi icin newWindow direkt driverin yaptigi elementleri yaninda alabiliriz.


//        Sayfa başlığının "LinkedIn" içerdiğini doğrulayınız
      assertTrue( driver.getTitle().contains("LinkedIn"));






        //Window handle Set'ini bir List içerisine alıyoruz.

    List<String> WindowsHandles= new ArrayList<>(driver.getWindowHandles());


///******note****>"getWindowHandles()-->tumunu window handle aliyoruz, bu sekilde get degiyip indexleriyle aliriz.index 0 dan baslar
      //  driver.getWindowHandles(); eger bunu boyle listin icine koymadan verirsek alamayiz getle indexini
//getWindowHandles() bize set dondurur.
//  System.out.println(driver.getWindowHandles()); bu sekilde yaparsak bize sadece handleslari dondurur.



        //techproeducation sayfasına geçiniz

driver.switchTo().window(WindowsHandles.get(0));

        //youtube sayfasına geçiniz
driver.switchTo().window(WindowsHandles.get(1));
        //linkedIn sayfasına geçiniz

        driver.switchTo().window(WindowsHandles.get(2));
        //*/
    }

}
