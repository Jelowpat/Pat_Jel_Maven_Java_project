package lesson13GenericList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGenericList<E> implements OwnList<E>{

    private Object[] content;
    private int size;

    public  MyGenericList(){
        content = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public  MyGenericList(int size){
        content = new Object[Math.max(DEFAULT_CAPACITY,size)];
        this.size = 0;
    }

    public  MyGenericList(List<E> list){
        content = new Object[Math.max(DEFAULT_CAPACITY,list.size())];
        this.size = list.size();
        for (int i = 0; i < size; i++){
            content[i] = list.get(i);
        }
    }

    @Override
    public boolean add(E e) {
        content = Arrays.copyOf(content, size +1);
        content[size] = e;
        size += 1;
        return true;
    }

    public boolean add(int index, E e) {
        Object[] oldValues = Arrays.copyOf(content, size);
        content = Arrays.copyOf(content, size +1);
        size += 1;
        for (int i = 0; i < size; i++){
            if (i == index){
                content[i] = e;
            }else if(i > index){
                content[i] = oldValues[i-1];
            }
        }
        return true;
    }

    @Override
    public Object get(int index) {
        return content[index];
    }

    @Override
    public boolean remove(E o) {
        int iterations = size;
        boolean removed = false;
        for (int i = 0; i < iterations; i++)
            if (content[i].equals(o)){
                content[i] = content[i+1];
                size -= 1;
                removed = true;
        }
        content = Arrays.copyOf(content, size);
        return removed;
    }

    @Override
    public int size() {
        return size;
    }
}
