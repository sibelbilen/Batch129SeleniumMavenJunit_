package Gunluklerim;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Masaüstünde "logo.jpeg" dosyası oluşturun.
//Bu dosyanın varlığını doğrulayın.
public class FilexExist {
    @Test
    public void filesExist() {

        String userhome = System.getProperty("user.home");
        System.out.println("userhome = " + userhome);//userhome = C:\Users\Casper
//System.getProperty("user.home")-->bilgisayarimda bulunan user klosrounu verir.

        String userDir = System.getProperty("user.dir");
        System.out.println("userDir = " + userDir);//icinde bulunan klosorun pathini veririr


        boolean exist= Files.exists(Paths.get(userhome+" /Desktop/logo.jpeg/"));
        Assert.assertTrue(exist);

    }
}
