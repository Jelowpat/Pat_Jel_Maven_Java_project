package lesson16Multithreading;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SumAndAverage sumAndAverage = new SumAndAverage();
        sumAndAverage.get(List.of(2,1,3,4,1,2));
    }

}
