package codeChallenge.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    @Test
    public void test_Empty_Hash(){
        Hashtable<String,String> o = new Hashtable<String,String>();
        Object output = 0;
        assertEquals(o.getCount(),output);
    }
    @Test
    public void test_Add_Hash(){
        Hashtable<String,Integer> o = new Hashtable<String,Integer>();
        o.add("hello","1");
        o.add("hello1","11");
        o.add("hello2","111");

        Object output = 3;
        assertEquals(o.getCount(),output);
    }
    @Test
    public void test_Get_Hash(){
        Hashtable<String,Integer> o = new Hashtable<String,Integer>();
        o.add("hello","1");
        o.add("hello1","11");
        o.add("hello2","111");
        o.add("hello3","1111");
        o.add("hello4","11111");

        Object output = "1111";
        assertEquals(o.get("hello3"),output);
    }
    @Test
    public void test_Get_Hash_Null(){
        Hashtable<String,Integer> o = new Hashtable<String,Integer>();
        o.add("hello","1");
        o.add("hello1","11");
        o.add("hello2","111");
        o.add("hello3","1111");
        o.add("hello4","11111");
        Object output = null;
        assertEquals(o.get("hello31"),output);
    }
    @Test
    public void test_Get_Hash_Collision(){
        Hashtable<String,Integer> o = new Hashtable<String,Integer>();
        o.add("hello","1");
        o.add("hello","11");
        o.add("hello","111");
        o.add("hello3","1111");
        o.add("hello4","11111");

        Object output = "1";
        assertEquals(o.get("hello"),output);
    }
    @Test
    public void test_Get_Hash_Collision_Values(){
        Hashtable<String,Integer> o = new Hashtable<String,Integer>();

        o.add("hello3","1111");
        o.add("hello4","11111");
        o.add("hello","11");
        o.add("hello","11");


        Object output = "11";
        assertEquals(o.get("hello"),output);
    }
}