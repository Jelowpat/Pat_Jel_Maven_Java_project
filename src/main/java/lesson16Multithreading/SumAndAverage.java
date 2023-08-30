package lesson16Multithreading;

import java.util.List;

public class SumAndAverage {

    public void get(List<Integer> list){

        Runnable firstTask = () -> {
            if (list.size() == 0){
                throw new IllegalArgumentException("empty list");
            }
            int sum = 0;
            for (int number:list){
                sum += number;
            }
            System.out.println((double) sum / list.size());
        };

        Runnable secondTask = () -> {
            int sum = 0;
            for (int number:list){
                sum += number;
            }
            System.out.println(sum);
        };

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        firstThread.start();
        secondThread.start();
    }

}
