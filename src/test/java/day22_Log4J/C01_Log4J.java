package day22_Log4J;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class C01_Log4J  {

   private  static Logger logger= LogManager.getLogger(C01_Log4J.class.getName()) ;

    @Test
    public void log4jTest() {

        //Logger fonksiyonuyla istenilen fonksiyonu kullan
        logger.debug("Debug logger");
        logger.info("Info logger");
        logger.error("Error logger");
        logger.fatal("Fatal logger");


    }
}
