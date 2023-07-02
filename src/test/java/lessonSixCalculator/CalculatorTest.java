package lessonSixCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        Assertions.assertEquals(15635, Calculator.addTwoNumbers(12313, 3322));
    }

    @Test
    public void shouldSubtractNumberFromAnother(){
        Assertions.assertEquals(8991, Calculator.subtractNumberFromAnother(12313, 3322));
    }

    @Test
    public void shouldMultiplyTwoNumbers(){
        Assertions.assertEquals(40903786, Calculator.multiplyTwoNumbers(12313, 3322));
    }

    @Test
    public void shouldDivideNumberByAnother(){
        Assertions.assertEquals(12313D/3322D, Calculator.divideNumberByAnother(12313, 3322));
    }
    @Test
    public void shouldNotDivideByZero() {
        Assertions.assertEquals(0, Calculator.divideNumberByAnother(133, 0));
    }
}