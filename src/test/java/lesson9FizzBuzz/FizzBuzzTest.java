package lesson9FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    public void shouldBeNumber() {
        Assertions.assertEquals("11", FizzBuzz.getFizzBuzzPrint(11));
    }
    @Test
    public void shouldBeFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getFizzBuzzPrint(12));
    }
    @Test
    public void shouldBeBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getFizzBuzzPrint(65));
    }
    @Test
    public void shouldBeFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.getFizzBuzzPrint(75));
    }
}