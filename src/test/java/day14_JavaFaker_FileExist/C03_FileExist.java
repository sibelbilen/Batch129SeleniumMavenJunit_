package day14_JavaFaker_FileExist;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class C03_FileExist {
      /*
Masaüstünde "logo.jpeg" dosyası oluşturun.
Bu dosyanın varlığını doğrulayın.
 */

    @Test
    public void test01() {
        String userHOME = System.getProperty("user.home");//C:/Users/TechProEd(kullanıcı adı)
//ide proje yolunun dinamik olarak verir
String userDir=System.getProperty("user.dir");
//src/test/java/day14_JavaFaker_FileExist

        boolean isExist = Files.exists(Paths.get(userHOME + "/Desktop/logo.jpeg"));
        System.out.println("isExist = " + isExist);
assertTrue(isExist);


    /*
        Fail ise: Dosya masaüstünde değil, dosya adı yanlış, yada arada onedrive gibi ekstra dosyalar olabilir.
         */


    }
    }
