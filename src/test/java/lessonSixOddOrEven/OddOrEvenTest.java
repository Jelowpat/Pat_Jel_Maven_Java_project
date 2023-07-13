package lessonSixOddOrEven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OddOrEvenTest {
    @Test
    public void shouldBeEven() {
        Assertions.assertTrue(OddOrEven.checkIfEven(2));
    }
    @Test
    public void shouldNotBeEven() {
        Assertions.assertFalse(OddOrEven.checkIfEven(3));
    }
    @Test
    public void shouldBeOdd() {
        Assertions.assertTrue(OddOrEven.checkIfOdd(111));
    }
    @Test
    public void shouldNotBeOdd() {Assertions.assertFalse(OddOrEven.checkIfOdd(2)); }
}