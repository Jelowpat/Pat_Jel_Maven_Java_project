package lesson9EnhancedCalculator;

public class Multiply implements Operation{
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
