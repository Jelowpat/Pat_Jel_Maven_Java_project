package lesson9FizzBuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++ ){
            System.out.println(getFizzBuzzPrint(i));
        }
    }

    public static String getFizzBuzzPrint(int number) {
        String print = "";
        if (number % 3 == 0) {print += "Fizz";}
        if (number % 5 == 0) {print += "Buzz";}
        if (print.equals("")) {print += number;}
        return print;
    }

}
