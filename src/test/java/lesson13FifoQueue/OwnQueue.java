package lesson13FifoQueue;

public interface OwnQueue {
    boolean offer(Integer e);
    Integer poll();
    Integer peek();
}
