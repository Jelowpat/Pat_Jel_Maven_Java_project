package lesson8Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    private Person person1 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
            180, 74);
    private Person person2 = new Person("Patryk", "Jelowicki", 1994, Month.December, 5,
            180, 74);
    private Person person3 = new Person("Jacek", "Nowak", 1994, Month.December, 5,
            180, 74);

    @Test
    public void shouldBeTheSameHashCode() {
        Assertions.assertEquals(person1.hashCode(), person2.hashCode());
    }
    @Test
    public void shouldBeDifferentHashCode() {
        Assertions.assertNotEquals(person1.hashCode(), person3.hashCode());
    }

    @Test
    public void shouldEqual() {
        Assertions.assertEquals(person1, person2);
    }
    @Test
    public void shouldNotEqual(){
        Assertions.assertNotEquals(person1, person3);
    }

    @Test
    public void shouldGetAge() {
        Assertions.assertEquals( 28, person1.getAge());
    }

    @Test
    public void shouldDisplayCorrectStringPattern() {
        Assertions.assertEquals("Person{name=Patryk, surname=Jelowicki, age=28" +
                ", height=180.0, weight=74.0, dateOfBirth=1994-12-05}", person1.toString());
    }
}