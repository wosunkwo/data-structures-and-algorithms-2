package codeChallenge.queue_with_stacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueWithStacksTest {
    @Test
    public void testEmpty_QueueWithStacks(){
        QueueWithStacks o = new QueueWithStacks();
        Object output = null;
        assertEquals(o.s1.getFirst(),output);
    }
    @Test
    public void test_QueueWithStacks_enQueue(){
        QueueWithStacks<String> o = new QueueWithStacks<String>();
        o.enqueue("1");
        o.enqueue("2");
        o.enqueue("3");
        o.enqueue("4");
        o.dequeue();
        Object output = "2";
        assertEquals(o.s1.getFirst().getData(),output);
    }
    @Test
    public void test_QueueWithStacks_enQueue_oneElement(){
        QueueWithStacks<String> o = new QueueWithStacks<String>();
        o.enqueue("1");
        o.dequeue();
        Object output = null;
        assertEquals(o.s1.getFirst(),output);
    }
    @Test
    public void test_QueueWithStacks_enQueue_deQueu(){
        QueueWithStacks<String> o = new QueueWithStacks<String>();
        o.enqueue("1");
        o.enqueue("2");
        o.enqueue("3");
        o.enqueue("4");
        o.dequeue();
        o.dequeue();

        Object output = "3";
        assertEquals(o.dequeue(),output);
    }
    @Test
    public void test_QueueWithStacks_enQueue_deQueu_multi(){
        QueueWithStacks<String> o = new QueueWithStacks<String>();
        o.enqueue("1");
        o.enqueue("2");
        o.enqueue("3");
        o.enqueue("4");
        o.enqueue("4A");
        o.enqueue("4X");
        o.enqueue("4XX");
        o.dequeue();
        o.dequeue();
        o.dequeue();
        o.enqueue("4XX-1");
        Object output = "4";
        assertEquals(o.dequeue(),output);
    }
}