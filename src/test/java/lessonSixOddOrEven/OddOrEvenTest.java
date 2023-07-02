package lessonSixOddOrEven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OddOrEvenTest {

    @Test
    public void checkIfEvenTest() {
        Assertions.assertEquals("even", OddOrEven.CheckIfEvenOrOdd(2));
        Assertions.assertNotEquals("even", OddOrEven.CheckIfEvenOrOdd(3));
    }
    @Test
    public void checkIfOddTest() {
        Assertions.assertEquals("odd", OddOrEven.CheckIfEvenOrOdd(1));
        Assertions.assertNotEquals("odd", OddOrEven.CheckIfEvenOrOdd(12));
    }
}