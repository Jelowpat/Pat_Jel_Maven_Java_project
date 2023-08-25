package lesson13FifoQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class MyQueueTest {

    @Test
    void shouldAddElement() {
        //given
        MyQueue myQueue = new MyQueue();
        //when
        boolean result = myQueue.offer(1);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldPollFirstInElement() {
        //given
        MyQueue myQueue = new MyQueue();
        //when
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        //then
        Assertions.assertAll("should take first in, after that second in",
                () -> Assertions.assertEquals(1, myQueue.poll()),
                () -> Assertions.assertEquals(2, myQueue.poll())
                );
    }

    @Test
    void shouldPeekNextElement() {
        //given
        MyQueue myQueue = new MyQueue();
        //when
        myQueue.offer(1);
        //then
        Assertions.assertEquals(1, myQueue.peek());
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenQueueIsEmpty(){
        //given
        MyQueue myQueue = new MyQueue();
        //then
        Assertions.assertAll("Should throw NoSuchElementException",
                () -> Assertions.assertThrows(NoSuchElementException.class, myQueue::peek),
                () -> Assertions.assertThrows(NoSuchElementException.class, myQueue::poll)
                );

    }

}