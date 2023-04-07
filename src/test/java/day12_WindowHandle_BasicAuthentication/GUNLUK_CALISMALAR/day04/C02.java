package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day04;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C02 extends TestBase {
        /*
1-Amazon anasayfaya gidin
2-tum cookie'leri listeleyin
3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
5-ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie  olusturun ve sayfaya ekleyin
6-eklediginiz cookie'nin sayfaya eklendigini test edin
7-ismi skin olan cookie'yi silin ve silindigini test edin
8-tum cookie'leri silin ve silindigini test edin
 */

    @Test
    public void test01() {

        //1-Amazon anasayfaya gidin

        driver.get("http://amazon.com");
        //2-tum cookie'leri listeleyin

        Set<Cookie>allCookie=driver.manage().getCookies();

        for (Cookie w : allCookie) {
            System.out.println("tum cookies = " + w);
            System.out.println(w.getName());
        }


        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin

       int cookieSayisi=allCookie.size();
        System.out.println("cookieSayisi = " + cookieSayisi);
        Assert.assertTrue(allCookie.size()>5);

        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin

        String cookiesDegeri=driver.manage().getCookieNamed("i18n-prefs").getValue();

        Assert.assertEquals("USD",cookiesDegeri);



        //5-ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie  olusturun ve sayfaya ekleyin

        String yeniCookies=new Cookie("en sevdigim cookie","cikolatali").getValue();


        //6-eklediginiz cookie'nin sayfaya eklendigini test edin

        Assert.assertEquals("cikotali",yeniCookies);



        //7-ismi skin olan cookie'yi silin ve silindigini test edin



        //8-tum cookie'leri silin ve silindigini test edin

    }
}
