package lessonSixCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void shouldAdd(){
        Assertions.assertEquals(15635, Calculator.add(12313, 3322));
    }

    @Test
    public void shouldSubtract(){
        Assertions.assertEquals(8991, Calculator.subtract(12313, 3322));
    }

    @Test
    public void shouldMultiply(){
        Assertions.assertEquals(40903786, Calculator.multiply(12313, 3322));
    }

    @Test
    public void shouldDivide(){
        Assertions.assertEquals(3.7065021071643587, Calculator.divide(12313, 3322));
    }
    @Test
    public void shouldReturnZeroWhenDividingByZero() {
        Assertions.assertEquals(0, Calculator.divide(133, 0));
    }
}