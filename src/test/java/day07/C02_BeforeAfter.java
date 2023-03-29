package day07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @Before
    public  void  setup(){
        System.out.println("her test methodundan once bir kez calisacak");
    }

    @After
    public  void  tearDown(){
        System.out.println("her test methodundan sonra bir kez calisacak");
    }
@Test
    public void test01(){
    System.out.println("ilk test ");
}

    @Test
    public void test02(){
        System.out.println(" ikinci testt");
    }
}
