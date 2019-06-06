package linked_list;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;


public class LinkedListTest {

    LinkedList<Integer> obj = new LinkedList<Integer>();

    @Test
    public void testEmpty_LL(){
        LinkedList<Integer> input = new LinkedList<Integer>();
        Object output = null;
        assertEquals(input.getListHead(),output);
    }
    @Test
    public void testInsert_HeadNode_String(){
        LinkedList<String> input = new LinkedList<String>();
        input.insert("hello");
        input.insert("Mello");
        input.insert("Kello");

        String output = "hello";
        assertEquals(
                (input.getNodeValue(input.getListHead())),output);

    }
    @Test
    public void testInsert_CurrentNode_Int(){
        LinkedList<Integer> input = new LinkedList<Integer>();
        input.insert(1);
        input.insert(23242);
        input.insert(120);
        input.insert(40);
        input.insert(1094390);
        input.insert(11);
        input.insert(70);


        Integer output = 70;
        assertEquals(
                (input.getNodeValue(input.getListCurrent())),output);

    }
    @Test
    public void testInsert_Search_True(){
        LinkedList<Integer> input = new LinkedList<Integer>();
        input.insert(1);
        input.insert(23242);
        input.insert(120);
        input.insert(40);
        input.insert(109490);
        input.insert(11);
        input.insert(70);
        input.insert(1094390);
        input.insert(1090);
        input.insert(450);

        Integer item = 23242;
        Boolean output = true;
        assertEquals(
                input.includes(item), output);

    }

    @Test
    public void testInsert_Search_True_String(){
        LinkedList<String> input = new LinkedList<String>();
        input.insert("1");
        input.insert("23242");
        input.insert("120");
        input.insert("40");
        input.insert("09490");
        input.insert("11");
        input.insert("70");
        input.insert("1094390");
        input.insert("1090");
        input.insert("450");

        String item = "1094390";
        Boolean output = true;
        assertEquals(
                input.includes(item), output);

    }

    @Test
    public void testInsert_Search_False_String(){
        LinkedList<String> input = new LinkedList<String>();
        input.insert("1");
        input.insert("23242");
        input.insert("120");
        input.insert("40");
        input.insert("09490");
        input.insert("11");
        input.insert("70");
        input.insert("1094390");
        input.insert("1090");
        input.insert("450");

        String item = "1094390A";
        Boolean output = false;
        assertEquals(
                input.includes(item), output);

    }
    @Test
    public void testInsert_CheckAllValues(){
        LinkedList<String> input = new LinkedList<String>();
        input.insert("1");
        input.insert("23242");
        input.insert("120");
        input.insert("40");
        input.insert("09490");
        input.insert("11");
        input.insert("70");
        input.insert("1094390");
        input.insert("1090");
        input.insert("450");

        Vector output = new Vector();
        output.add("1");
        output.add("23242");
        output.add("120");
        output.add("40");
        output.add("09490");
        output.add("11");
        output.add("70");
        output.add("1094390");
        output.add("1090");
        output.add("450");


        input.print();
        assertEquals(
                input.get_LL_into_Vector(), output
        );
    }


}