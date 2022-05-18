package netology.patterns;

import org.junit.Assert;
import org.junit.Test;


public class PersonBuilderTest {

    @Test
    public void whenSetName_ThenNextSetNameNotChangeName(){
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setName("AAA")
                .setName("BBB")
                .setSurname("CCC")
                .setAge(0)
                .build();

        Assert.assertEquals("AAA", person.getName());
    }

    @Test
    public void whenSetRurName_ThenNextSetSurnameNotChangeSurname(){
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setName("AAA")
                .setSurname("BBB")
                .setSurname("CCC")
                .setAge(0)
                .build();

        Assert.assertEquals("BBB", person.getSurname());
    }


}
