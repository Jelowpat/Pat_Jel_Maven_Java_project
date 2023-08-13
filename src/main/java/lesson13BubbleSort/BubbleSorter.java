package lesson13BubbleSort;
import java.util.List;

public class BubbleSorter {

    public static <E> void sort(List<E> list){
        int listLength = list.size();
        int iterations = list.size();
        do {
            for (int i = 0; i < listLength-1; i++){
                if (list.get(i).hashCode() > list.get(i + 1).hashCode()){
                    E first = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, first);
                }
            }
            iterations -= 1;
        }
        while (iterations > 1);
    }
}
