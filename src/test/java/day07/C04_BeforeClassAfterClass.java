package day07;

import org.junit.*;

/*
@beforeClass ve @AfterClass notasyonlari sadece static methodlar ile
calsiir.
 */
public class C04_BeforeClassAfterClass {
    @Before

    public void setup01(){
        System.out.println("her testten once calisir");
    }

    @After

    public void tearDown(){
        System.out.println("her testten sonra calisir");
    }


    @Test
    public void test01(){
        System.out.println("ilk test...");
        System.out.println("===============");
    }


    @Test

    public void test02(){
        System.out.println("ikinci test...");
        System.out.println("===============");
    }

    @Test

    public void test03(){
        System.out.println("ucuncu test...");
        System.out.println("===============");
    }


    @BeforeClass//before class methodlari static olmalidir.
    public static void setup(){

        System.out.println("tum testlerden once bir kez calisir.");
        System.out.println("=========");
    }

    @AfterClass

    public static  void teamDown(){
        System.out.println("tum testlerden sonra bir kez calisir");
    }



}
