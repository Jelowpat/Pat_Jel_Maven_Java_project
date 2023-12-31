package lesson12MyList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class MyList implements OwnList {

    private Integer[] content;
    private int size = 0;

    public MyList(){
        content = new Integer[]{};
    }

    public MyList(List<Integer> list){
        this();
        list.forEach(this::add);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void add(Integer element){
        content = Arrays.copyOf(content, size + 1);
        content[size] = element;
        size += 1;
    }

    @Override
    public Integer get(int i) {
        return content[i];
    }

    @Override
    public void add(int index, Integer element) {
        rangeCheckForAdd(index);
        if (index == size){
            content = Arrays.copyOf(content, size + 1);

        }
        content = Arrays.copyOf(content, size + 1);
        System.arraycopy(content, index,
                content, index + 1,
                size - index);
        content[index] = element;
        size += 1;
    }

    @Override
    public Integer remove(int index) {
        Objects.checkIndex(index, size);

        Integer oldValue = content[index];

        size -= 1;
        System.arraycopy(content, index + 1, content, index, size - index);

        return oldValue;
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder("[");
        if (size == 0){ return "[]";}

        for (int i = 0; i < size - 1; i++){
            print.append(content[i]).append(", ");
        }
        return print.append(content[size - 1]).append("]").toString();
    }

    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
}
