package Gunluklerim;

import com.github.javafaker.Faker;
import org.junit.Test;

public class JavaFaker {
    @Test
    public void faker() {
        Faker faker=new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.animal().name());
        System.out.println(faker.artist().name());
        System.out.println(faker.music().chord());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.address().cityName());
        System.out.println(faker.address().country());
        System.out.println(faker.internet().avatar());

    }
}
