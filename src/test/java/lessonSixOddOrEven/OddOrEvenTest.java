package lessonSixOddOrEven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OddOrEvenTest {

    @Test
    public void shouldBeEven() {
        Assertions.assertEquals("even", OddOrEven.CheckIfEvenOrOdd(2));
    }
    @Test
    public void shouldBeOdd() {
        Assertions.assertEquals("odd", OddOrEven.CheckIfEvenOrOdd(1111));
    }
}