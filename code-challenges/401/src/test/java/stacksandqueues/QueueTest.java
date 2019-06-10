package stacksandqueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {
    @Test
    public void testEmpty_Queue(){
        Queue<Integer> o = new Queue<Integer>();
        Object output = null;
        assertEquals(o.getFirst(),output);
    }
    @Test
    public void test_Queue_EnqueueOneItem(){
        Queue<Integer> o = new Queue<Integer>();
        o.enqueue(13);
        o.enqueue(333);
        Object output = 13;
        assertEquals(o.getFirst().getData(),output);
    }
    @Test
    public void test_Queue_EnqueueMultiItem_Last(){
        Queue<Integer> o = new Queue<Integer>();
        o.enqueue(13);
        o.enqueue(3);
        o.enqueue(33);
        o.enqueue(333);
        o.enqueue(3333);
        Object output = 3333;
        assertEquals(o.getLast().getData(),output);
    }
    @Test
    public void test_Queue_EnqueueMultiItem_First(){
        Queue<Integer> o = new Queue<Integer>();
        o.enqueue(13);
        o.enqueue(3);
        o.enqueue(33);
        o.enqueue(333);
        o.enqueue(3333);
        Object output = 13;
        assertEquals(o.getFirst().getData(),output);
    }
    @Test
    public void test_Queue_DequeueMultiItem_First(){
        Queue<Integer> o = new Queue<Integer>();
        o.enqueue(13);
        o.enqueue(3);
        o.enqueue(33);
        o.enqueue(333);
        o.enqueue(3333);
        o.dequeue();
        Object output = 3;
        assertEquals(o.dequeue(),output);
    }
    @Test
    public void test_Queue_testPeek_EnqueueMultiItem(){
        Queue<Integer> o = new Queue<Integer>();
        o.enqueue(13);
        o.enqueue(3);
        o.enqueue(33);
        o.enqueue(333);
        o.enqueue(3333);

        Object output = 13;
        assertEquals(o.peek(),output);
    }
    @Test
    public void test_Queue_testEmptyQueue_AfterMultiDueue(){
        Queue<Integer> o = new Queue<Integer>();
        o.enqueue(13);
        o.enqueue(3);
        o.enqueue(33);
        o.enqueue(333);
        o.enqueue(3333);
        o.dequeue();
        o.dequeue();
        o.dequeue();
        o.dequeue();
        o.dequeue();
        Object output = null;
        assertEquals(o.getFirst(),output);
    }
}