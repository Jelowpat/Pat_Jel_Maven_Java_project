package lesson13FifoQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue implements OwnQueue{

    private final List<Integer> elements = new ArrayList<>();

    @Override
    public boolean offer(Integer e) {
        elements.add(e);
        return true;
    }

    @Override
    public Integer poll() {
        if (elements.isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }
        return elements.remove(0);
    }

    @Override
    public Integer peek() {
        if (elements.isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }
        return elements.get(0);
    }
}
