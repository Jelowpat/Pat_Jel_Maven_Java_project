package lessonSixOddOrEven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OddOrEvenTest {
    @Test
    public void shouldBeEven() {
        Assertions.assertTrue(OddOrEven.checkIfEven(2));
    }
    @Test
    public void shouldBeOdd() {
        Assertions.assertTrue(OddOrEven.checkIfOdd(111));
    }
}