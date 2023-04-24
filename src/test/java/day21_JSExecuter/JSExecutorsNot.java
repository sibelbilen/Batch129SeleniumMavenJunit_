package day21_JSExecuter;

public class JSExecutorsNot {
    /*
    1-js executor nedir?

   *- javascript executor javascript kodlarini java frameworkinda kullanabilmek icin
   olusturulan bir APIdir.Bu API seleniumdan gelir.

   2-JAVASCRIPT EXECUTOR METHODUNU NEDEN OGRENIYORUZ?

   *-Selenium ile web elementlerinin kontrollerini saglarken selenium komutlarini
   yetersiz kalabilir veya sorunlarla karsilasiriz.bur durumlarda java JSExecutor kullanabiliriz,

   *-javaScript HTML kodlara direk erisip yonetebilen bir script dili oldugundan bize cok kolaylik saglar

   3-JS Executor ile neler yapabiliriz.

   *-click.hidden elementlerine tiklama
   *-belirli elementlerin uzerine gitme,saga,sola,asagiya,yukariya scroll etme
   *-inputlara yazi yazma
   *-inputlara deger atama
   *-Elementlerin renklerini degistirme,arka rengini degistirme,border(cerceve)ekleme



   ASAMALARI:

   1-ADIM:javascriptExecutor kullanmak icin ilk adim olarak driverimizi javascriptexecutor'a cast edelim.

      JavascriptExecutor jse=(JavascriptExecutor)driver;

   2-ADIM:kullanacagimiz WebElemnti locate edelim

   3-ADIM:js driver ile executeScript methodunu calistiralim,icine parameter olarak ilgili
   script ve webelementi yazalim.

   jse.executeScript("ilgili script","WebElement");

   //click yapmak icin

   jse.executescript("arguments[0].click();",webelement)






     */
}
