package lessonSixCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        Assertions.assertEquals(3, Calculator.addTwoNumbers(2, 1));
        Assertions.assertEquals(11, Calculator.addTwoNumbers(7, 4));
        Assertions.assertEquals(15635, Calculator.addTwoNumbers(12313, 3322));
    }

    @Test
    public void shouldSubtractNumberFromAnother(){
        Assertions.assertEquals(1, Calculator.subtractNumberFromAnother(2, 1));
        Assertions.assertEquals(3, Calculator.subtractNumberFromAnother(7, 4));
        Assertions.assertEquals(8991, Calculator.subtractNumberFromAnother(12313, 3322));
    }

    @Test
    public void shouldMultiplyTwoNumbers(){
        Assertions.assertEquals(2, Calculator.multiplyTwoNumbers(2, 1));
        Assertions.assertEquals(28, Calculator.multiplyTwoNumbers(7, 4));
        Assertions.assertEquals(40903786, Calculator.multiplyTwoNumbers(12313, 3322));
    }

    @Test
    public void shouldDivideNumberByAnother(){
        Assertions.assertEquals(2, Calculator.divideNumberByAnother(2, 1));
        Assertions.assertEquals(7D/4D, Calculator.divideNumberByAnother(7, 4));
        Assertions.assertEquals(12313D/3322D, Calculator.divideNumberByAnother(12313, 3322));
    }
    @Test
    public void shouldNotDivideByZero() {
        Assertions.assertEquals(0, Calculator.divideNumberByAnother(133, 0));
    }
}