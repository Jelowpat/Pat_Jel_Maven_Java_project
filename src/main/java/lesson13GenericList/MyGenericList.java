package lesson13GenericList;

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
        this(list.size());
        this.size = list.size();
        for (int i = 0; i < size; i++){
            content[i] = list.get(i);
        }
    }

    public MyGenericList(MyGenericList<E> list){
        this(list.size());
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
        size += 1;
        content = Arrays.copyOf(content, size);
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
    public E get(int index) {
        return (E)content[index];
    }

    @Override
    public boolean remove(E o) {
        boolean removed = false;
        int removedIndex;
        for (int i = 0; i < size; i++){
            if (content[i].equals(o)){
                removedIndex = i;
                size -= 1;
                for (int k = removedIndex; k < size; k++){
                    content[k]= content[k+1];
                }
                removed = true;
                content = Arrays.copyOf(content, size);
                break;
            }
        }
        return removed;
    }

    @Override
    public int size() {
        return size;
    }
}
