package lesson9EnhancedCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void shouldAdd() {
        double result = calculator.calculate(4.12, 5.22, new Addition());
        Assertions.assertEquals(9.34, result);
    }
    @Test
    public void shouldSubtract() {
        double result = calculator.calculate(4.12, 5.22, new Substraction());
        Assertions.assertEquals(-1.0999999999999996, result);
    }
    @Test
    public void shouldMultiply() {
        double result = calculator.calculate(4.12, 5.22, new Multiplication());
        Assertions.assertEquals(21.5064, result);
    }
    @Test
    public void shouldDivide() {
        double result = calculator.calculate(4.12, 5.22, new Division());
        Assertions.assertEquals(0.7892720306513411, result);
    }
}