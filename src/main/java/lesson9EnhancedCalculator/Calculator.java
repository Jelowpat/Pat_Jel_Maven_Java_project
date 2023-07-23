package lesson9EnhancedCalculator;

public class Calculator {

    public double calculate(double a, double b, Operation operation){
        return operation.calculate(a, b);
    }

}
