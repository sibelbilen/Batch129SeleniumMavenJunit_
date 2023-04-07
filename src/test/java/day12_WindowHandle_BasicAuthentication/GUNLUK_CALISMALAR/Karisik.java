package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
 /*
        RELATIVE LOCATOR
            - Bir web sayfasında benzer özelliklere sahip webelementlerin olduğu durumlarda kullanılabilir
            - above --> Belirtilen elementin üstünde olan elementi seçer
            - below --> Belirtilen elementin altında olan elementi seçer
            - to_left_of --> Belirtilen elementin solunda olan elementi seçer
            - to_right_of --> Belirtilen elementin sağında olan elementi seçer
            - near --> Belirtilen elementin yanında/yakınında olan elementi seçer
         */
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Karisik extends TestBase {
    /*
    1- amazon gidin
2. Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
3. dropdown menude 40 eleman olduğunu doğrulayın
Test02
1. dropdown menuden elektronik bölümü seçin
2. arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
3. sonuc sayisi bildiren yazinin iphone icerdigini test edin
4. ikinci ürüne relative locater kullanarak tıklayin
5. ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
Test03
1. yeni bir sekme açarak amazon anasayfaya gidin
2. dropdown’dan bebek bölümüne secin
3. bebek puset aratıp bulundan sonuç sayısını yazdırın
4. sonuç yazsının puset içerdiğini test edin
5-üçüncü ürüne relative locater kullanarak tıklayin
6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
Test 4
1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayı
     */

    @Test
    public void test01() {
        //    1- amazon gidin
        driver.get("http://amazon.com");
        //2. Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın

        WebElement aramaKutusu= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select=new Select(aramaKutusu);
        System.out.println("Dropdown seçenekleri:");

        for (WebElement w :select.getOptions() ) {
            System.out.println(w.getText());

        }

        //3. dropdown menude 40 eleman olduğunu doğrulayın
int expectedSize=40;
        int actuelSize=select.getOptions().size();
     if (expectedSize==actuelSize){
         System.out.println("Dropdown menü doğru sayıda seçeneğe sahip.");
     }else
         System.out.println("Dropdown menü yanlış sayıda seçeneğe sahip. Beklenen: " + expectedSize + ", Gerçek: " + actuelSize);
    }

    @Test
    public void test02() {

        //1. dropdown menuden elektronik bölümü seçin
        driver.get("http://amazon.com");

        WebElement ddmKutusu= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select electronik=new Select(ddmKutusu);

        electronik.selectByIndex(10);
        //2. arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın

        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("iphone");
        aramaKutusu.submit();


        //3. sonuc sayisi bildiren yazinin iphone icerdigini test edin
       String SonucSayisi=driver.findElement(By.xpath("//h1")).getText();

Assert.assertTrue(SonucSayisi.contains("iphone"));


        //4. ikinci ürüne relative locater kullanarak tıklayin

WebElement ilkUrun=driver.findElement(By.xpath("//*[.='Apple iPhone 11 Pro, 64GB, Gold - Unlocked (Renewed Premium)']"));

WebElement ikinciUrun=driver.findElement(with(By.className("sg-col-inner")).toRightOf(ilkUrun));
ikinciUrun.click();


        //5. ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
String title=driver.findElement(By.xpath("//h1[@id='title']")).getText();
//urun stoklarda yok
        System.out.println("title = " + title);
String stok=driver.findElement(By.xpath("//div[@id='availability']")).getText();

        System.out.println("stokta olmadigina dair baslik: = " + stok);



    }

    @Test
    public void test03() {

        //1. yeni bir sekme açarak amazon anasayfaya gidin
        driver.get("http://amazon.com");
        driver.switchTo().newWindow(WindowType.TAB).get("http://amazon.com");
        //2. dropdown’dan bebek bölümüne secin
        WebElement ddmKutusu= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
Select select=new Select(ddmKutusu);
select.selectByIndex(3);
        //3. bebek puset aratıp bulundan sonuç sayısını yazdırın
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("bebek puset");
        aramaKutusu.submit();
        //4. sonuç yazsının puset içerdiğini test edin
        String sonucYazisi=driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']")).getText();
        Assert.assertTrue(sonucYazisi.contains("puset"));
        //5-üçüncü ürüne relative locater kullanarak tıklayin

        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
    }
}
