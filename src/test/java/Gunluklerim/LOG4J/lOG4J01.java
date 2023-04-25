package Gunluklerim.LOG4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class lOG4J01 {
    //logger objesi olsuturduk
   private static  Logger logger= LogManager.getLogger(lOG4J01.class.getName());

    @Test
    public void test01() {
        logger.debug("onemli degil");
        logger.info("onemli degil");
        logger.fatal("onemli");
        logger.error("onemli");


    }
}
