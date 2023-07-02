package LessonSixCalculator;

public class Calculator {

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public static int subtractNumberFromAnother(int a, int b){
        return a - b;
    }

    public static long multiplyTwoNumbers(int a, int b){
        return (long) a * (long) b;
    }

    public static double divideNumberByAnother(int a, int b) {
        if (b == 0){
            return 0;
        }
        else{
            return (double) a / (double) b;
        }
    }
}
