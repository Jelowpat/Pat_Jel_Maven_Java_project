package lessonSixCalculator;

public class Calculator {

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static long multiply(int a, int b){
        return (long) a * (long) b;
    }

    public static double divide(double a, double b) {
        if (b == 0){
            return 0;
        }
        else{
            return a / b;
        }
    }
}
