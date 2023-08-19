package lesson15DivisibleBy3;

import java.util.stream.IntStream;

public class DivisibleByThree {

    public static void main(String[] args) {
        printDivisibleFromRange(1,21);
        printDivisibleFromRange(-11,22);
    }

    private static void printDivisibleFromRange(int start, int finish){
        IntStream.range(start, finish+1).filter(x -> x%3 == 0).forEach(System.out::println);
    }

}
