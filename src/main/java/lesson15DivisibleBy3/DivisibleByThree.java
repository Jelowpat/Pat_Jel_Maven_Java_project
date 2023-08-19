package lesson15DivisibleBy3;

import java.util.stream.IntStream;

public class DivisibleByThree {

    public static void main(String[] args) {
        printDivisibleFromRange(3,21);
    }

    private static void printDivisibleFromRange(int first, int last){
        IntStream.range(first, last+1)
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
    }

}
