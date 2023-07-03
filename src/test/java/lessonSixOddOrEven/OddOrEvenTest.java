package lessonSixOddOrEven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OddOrEvenTest {

    @Test
    public void isEven() {
        Assertions.assertEquals("even", OddOrEven.CheckIfEvenOrOdd(2));
    }
    @Test
    public void isOdd() {
        Assertions.assertEquals("odd", OddOrEven.CheckIfEvenOrOdd(1111));
    }
}