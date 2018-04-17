package domain;

import com.example.springbootunittest.domain.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PersonTest {


    @Test
    public void testPerson() {

        Person person = new Person();
        person.setAge(10);

        Assert.assertEquals(Integer.valueOf(10), person.getAge());


        Assert.assertNotNull(person);


    }

}
