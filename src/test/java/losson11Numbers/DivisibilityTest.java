package losson11Numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DivisibilityTest {

    @ParameterizedTest(name = "should verify if {0} is divisible by 2")
    @ValueSource(ints = {2,4,6,8,123132})
    public void isDivisibleByTwo(int number) {
        //given
        Divisibility divisibility = new Divisibility();

        //when
        boolean result = divisibility.isDivisibleByTwo(number);

        //then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "should verify if {0} is not divisible by 2")
    @ValueSource(ints = {3,5,9,5675757})
    public void isNotDivisibleByTwo(int number) {
        //given
        Divisibility divisibility = new Divisibility();

        //when
        boolean result = divisibility.isDivisibleByTwo(number);

        //then
        Assertions.assertFalse(result);
    }
}