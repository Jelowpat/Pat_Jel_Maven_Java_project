package lesson8Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
            180, 74);
    Person person2 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
            180, 74);
    Person person3 = new Person("Jacek", "Nowak", 1994, Month.December, 5,
            180, 74);

    @Test
    void shouldBeTheSameHashCode() {
        Assertions.assertEquals(person1.hashCode(), person2.hashCode());
    }
    @Test
    void shouldBeDifferentHashCode() {
        Assertions.assertNotEquals(person1.hashCode(), person3.hashCode());
    }

    @Test
    void shouldEqual() {
        Assertions.assertEquals(person1, person2);
    }
    @Test
    void shouldNotEqual(){
        Assertions.assertNotEquals(person1, person3);
    }

    @Test
    void shouldGetAge() {
        Assertions.assertEquals( 28, person1.getAge());
    }

    @Test
    void shouldDisplayCorrectStringPattern() {
        Assertions.assertEquals("Name: Patryk\nSurname: Jelowicki\nAge: 28\n" +
                "Height: 180.0\nWeight: 74.0\nDate of birth: 1994-12-05", person1.toString());
        System.out.println(person1);
    }
}