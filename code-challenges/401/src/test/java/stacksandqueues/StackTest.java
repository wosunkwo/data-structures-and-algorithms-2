package stacksandqueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class StackTest {
    @Test
    public void testEmpty_Stack(){
        Stack<Integer> o = new Stack<Integer>();
        Object output = null;
        assertEquals(o.getFirst(),output);
    }
    @Test
    public void testPushOnce_Stack(){
        Stack<Integer> o = new Stack<Integer>();
        o.push(12);
        Object output = 12;
        assertEquals(o.getFirst().getData(),output);
    }
    @Test
    public void testPushMultiple_Stack(){
        Stack<String> o = new Stack<String>();
        o.push("12");
        o.push("12A");
        o.push("12B");
        o.push("12C");
        o.push("12D");
        o.push("12E");

        Object output = "12E";
        assertEquals(o.getFirst().getData(),output);
    }
    @Test
    public void testPOP_Stack(){
        Stack<String> o = new Stack<String>();
        o.push("12");
        o.push("12A");
        o.push("12B");
        o.push("12C");
        o.push("12D");
        o.push("12E");

        Object output = "12D";
        o.pop();
        assertEquals(o.getFirst().getData(),output);
    }
    @Test
    public void test_Stack_AfterMulti_POP(){
        Stack<String> o = new Stack<String>();
        o.push("12");
        o.push("12A");
        o.push("12D");
        o.push("12E");
        o.push("12F");
        o.push("12G");

        Object output = null;
        o.pop();
        o.pop();
        o.pop();
        o.pop();
        o.pop();
        o.pop();

        assertEquals(o.getFirst(),output);
    }
    @Test
    public void test_Stack_AfterMulti_PushThen_Pop(){
        Stack<String> o = new Stack<String>();
        o.push("12");
        o.push("12A");
        o.push("12D");
        o.push("12E");
        o.push("12F");
        o.push("12G");

        Object output = "12G";
        assertEquals(o.peek(),output);
    }
}
