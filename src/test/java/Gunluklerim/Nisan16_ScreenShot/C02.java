package Gunluklerim.Nisan16_ScreenShot;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02 extends TestBase {

    @Test
    public void test01() throws IOException {
        driver.get("http://amazon.com");




        String tarih=new SimpleDateFormat("ddmmyy_hh_mm_ss").format(new Date());
        String dosya="_08_02_11_16042023/src/test/ScreenShoot/screenshot.png";
        TakesScreenshot ts=(TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosya,tarih));

    }
}
