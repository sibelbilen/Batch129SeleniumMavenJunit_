package day14_JavaFaker_FileExist;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_JavaFaker  {


    @Test
    public void faker() {
        //1.faker objesi olustur:
       Faker faker =new Faker();
       
       
       
       //yada Faker  Faker.instance() static methoduyla baslayabiliriz
        
        Faker.instance();
        
        //Firstname yazdirin:
        System.out.println("faker.name().firstName() = " + faker.name().firstName());


        //LastName yazdirin

        System.out.println(Faker.instance().name().lastName());
        
        //kullanici adi yzdirin
        System.out.println("faker.name().username() = " + faker.name().username());
        
        //funny name yazdirin

        System.out.println("faker.funnyName().name() = " + faker.funnyName().name());

        //meslek ismi yazdirin
        System.out.println("faker.name().title = " + faker.name().title());
        
        //sehir ismi yazdirin

        System.out.println(" faker.address().city() = " +  faker.address().city());

        //eyalet yazdirin

        System.out.println("faker.address().state() = " + faker.address().state());
        
        //full adres

        System.out.println(" faker.address().fullAddress() = " +  faker.address().fullAddress());

        //cep numarasi yazdirin

        System.out.println("faker = " + faker.phoneNumber().cellPhone());
        
        //email yazdirin

        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
        
        //posta kodu yaziniz

        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        //Rastgele 15 haneli numara yazdirin

        System.out.println("faker.number().digits(15) = " + faker.number().digits(15));


    }
}
