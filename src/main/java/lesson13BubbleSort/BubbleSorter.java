package lesson13BubbleSort;
import java.util.List;

public class BubbleSorter {

    public static void sort(List<Integer> list){
        int listLength = list.size();
        int iterations = list.size();
        do {
            for (int i = 0; i < listLength-1; i++){
                if (list.get(i) > list.get(i + 1)){
                    int first = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, first);
                }
            }
            iterations -= 1;
        }
        while (iterations > 1);
    }
}
