package Gunluklerim;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

/*
Masaüstünde "logo.jpeg" dosyası oluşturun.
Bu dosyanın varlığını doğrulayın.
*/
public class FileExist {
    @Test
    public void fileExist() {

        //Masaüstünde "logo.jpeg" dosyası oluşturun.
     Boolean exists=   Files.exists(Path.of("C:/Users/Casper/Desktop/Saved Pictures/"));
        //Bu dosyanın varlığını doğrulayın.
        System.out.println("exists = " + exists);
        Assert.assertTrue(exists);
    }

    @Test
    public void digerYol() {
    String userHome=System.getProperty("user.home");
        String userDir=System.getProperty("user.dir");

        System.out.println("userHome = " + userHome);

        System.out.println("userDir = " + userDir);

    }
}
