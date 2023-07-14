package lesson8Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    public void shouldBeTheSameHashCode() {
        Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Person person2 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Assertions.assertEquals(person1.hashCode(), person2.hashCode());
    }
    @Test
    public void shouldBeDifferentHashCode() {
        Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Person person3 = new Person("Jacek", "Nowak", 1994, Month.December, 5,
                180, 74);
        Assertions.assertNotEquals(person1.hashCode(), person3.hashCode());
    }

    @Test
    public void shouldEqual() {
        Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Person person2 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Assertions.assertEquals(person1, person2);
    }
    @Test
    public void shouldNotEqual(){
        Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Person person3 = new Person("Jacek", "Nowak", 1994, Month.December, 5,
                180, 74);
        Assertions.assertNotEquals(person1, person3);
    }

    @Test
    public void shouldGetAge() {
        Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Assertions.assertEquals( 28, person1.getAge());
    }

    @Test
    public void shouldDisplayCorrectStringPattern() {
        Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
                180, 74);
        Assertions.assertEquals("Person{name=Patryk, surname=Jelowicki, age=28" +
                ", height=180.0, weight=74.0, dateOfBirth=1994-12-05}", person1.toString());
    }
}