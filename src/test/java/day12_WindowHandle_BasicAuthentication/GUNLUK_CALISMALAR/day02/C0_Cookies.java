package day12_WindowHandle_BasicAuthentication.GUNLUK_CALISMALAR.day02;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C0_Cookies  extends TestBase {
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
      //        /*
        //1-Amazon anasayfaya gidin
        driver.get("https://amazon.com");


        //2-tum cookie'leri listeleyin

        Set<Cookie>tumCookies=driver.manage().getCookies();


        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(tumCookies.size()>5);
        //tum cookies sayilari nelerdir.

        int tumCookiesSayisi= tumCookies.size();
       // System.out.println("tumCookiesSayisi = " + tumCookiesSayisi); yaparsak yanyan ayazar

        for (Cookie w : tumCookies) {
            System.out.println("tum cookesler> "+w);
        }


        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin



        //5-ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie  olusturun ve sayfaya ekleyin
        //6-eklediginiz cookie'nin sayfaya eklendigini test edin
        //7-ismi skin olan cookie'yi silin ve silindigini test edin
        //8-tum cookie'leri silin ve silindigini test edin
        // */
    }
}
