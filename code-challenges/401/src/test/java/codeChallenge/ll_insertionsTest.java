package codeChallenge;



import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.security.InvalidParameterException;
import java.util.Vector;

import static org.junit.Assert.*;

public class ll_insertionsTest {


    @Test
    public void testEmpty_LL(){
        ll_insertions<Integer> input = new ll_insertions<Integer>();
        Object output = null;
        assertEquals(input.getListHead(),output);
    }
    @Test
    public void testInsert_HeadNode_String(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("hello");
        input.append("Mello");
        input.append("Kello");

        String output = "hello";
        assertEquals(
                (input.getNodeValue(input.getListHead())),output);

    }
    @Test
    public void testInsert_CurrentNode_Int(){
        ll_insertions<Integer> input = new ll_insertions<Integer>();
        input.append(1);
        input.append(23242);
        input.append(120);
        input.append(40);
        input.append(1094390);
        input.append(11);
        input.append(70);


        Integer output = 70;
        assertEquals(
                (input.getNodeValue(input.getListCurrent())),output);

    }
    @Test
    public void testInsert_Search_True(){
        ll_insertions<Integer> input = new ll_insertions<Integer>();
        input.append(1);
        input.append(23242);
        input.append(120);
        input.append(40);
        input.append(109490);
        input.append(11);
        input.append(70);
        input.append(1094390);
        input.append(1090);
        input.append(450);

        Integer item = 23242;
        Boolean output = true;
        assertEquals(
                input.includes(item), output);

    }

    @Test
    public void testInsert_AfterMiddleNode_Success(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("09490");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Insert After Successfull";

        assertEquals(
                input.insertAfter("09490","set"), output);

        input.print();

    }

    @Test
    public void testInsert_BeforeMiddleNode_Success(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("09490");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Insert Before Successfull";

        assertEquals(
                input.insertBefore("09490","set"), output);

        input.print();

    }
    @Test
    public void testInsert_BeforeMidleNode_Fail(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("094901");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Item not found";

        assertEquals(
                input.insertBefore("09490","set"), output);

        input.print();

    }
    @Test
    public void testInsert_AfterMiddleNode_Fail(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("09490");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Item not found";

        assertEquals(
                input.insertAfter("094901","set"), output);

        input.print();

    }
    @Test
    public void testInsert_After_FirstNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("09490");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Insert After Successfull";

        assertEquals(
                input.insertAfter("1","set"), output);

        input.print();

    }
    @Test
    public void testInsert_Before_FirstNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("09490");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Insert Before Successfull";

        assertEquals(
                input.insertBefore("1","set"), output);

        input.print();

    }
    @Test
    public void testInsert_After_LastNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("40");
        input.append("09490");
        input.append("11");
        input.append("70");
        input.append("1094390");
        input.append("1090");
        input.append("450");

        String output = "Insert After Successfull";

        assertEquals(
                input.insertAfter("450","set"), output);

        input.print();

    }
    @Test
    public void testInsert_Before_LastNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        input.append("23242A");
        input.append("120F");


        String output = "Insert Before Successfull";

        assertEquals(
                input.insertBefore("120F","set"), output);

        input.print();

    }

//    Code Challenge 07
    @Test
            (expected = NullPointerException.class)
    public void test_kthFromEnd_EmptyLL(){
        ll_insertions object = new ll_insertions();
        object.kthFromEnd(9);
    }
    @Test
            (expected = IllegalArgumentException.class)
    public void test_kthFromEnd_greaterThan_LLSize(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        object.append("23A");
        object.append("23B");
        object.kthFromEnd(9);
    }
    @Test
            (expected = IllegalArgumentException.class)
    public void test_kthFromEnd_SameAs_LLSize(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        object.append("23A");
        object.append("23B");
        object.append("23BB");
        object.append("23BA");
        object.kthFromEnd(5);
    }
    @Test
            (expected = IllegalArgumentException.class)
    public void test_kthFromEnd_LessThanZero_LLSize(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        object.append("23A");
        object.append("23B");
        object.append("23BB");
        object.append("23BA");
        object.kthFromEnd(-5);
    }
    @Test
    public void test_kthFromEnd_LLSizeOne(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        String output = "23";
        assertEquals(object.kthFromEnd(0),output);
    }
    @Test
    public void test_kthFromEnd_LLSizeFive_InMiddle(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        object.append("23A");
        object.append("23B");
        object.append("23C");
        object.append("23D");
        object.append("23E");
        object.append("23F");
        object.append("23G");
        object.append("23H");
        object.append("23II");
        object.append("23JJ");
        String output = "23D";
        assertEquals(object.kthFromEnd(6),output);
    }
    @Test
    public void test_kthFromEnd_LLSizeEleven_InEnd(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        object.append("23A");
        object.append("23B");
        object.append("23C");
        object.append("23D");
        object.append("23E");
        object.append("23F");
        object.append("23G");
        object.append("23H");
        object.append("23II");
        object.append("23JJ");

        String output = "23";
        assertEquals(object.kthFromEnd(10),output);
    }
    @Test
    public void test_kthFromEnd_LLSizeEleven_InFront(){
        ll_insertions object = new ll_insertions();
        object.append("23");
        object.append("23A");
        object.append("23B");
        object.append("23C");
        object.append("23D");
        object.append("23E");
        object.append("23F");
        object.append("23G");
        object.append("23H");
        object.append("23II");
        object.append("23JJ");

        String output = "23JJ";
        assertEquals(object.kthFromEnd(0),output);
    }
    @Test
    public void test_kthFromEnd_LLSizeTwo_InFront(){
        ll_insertions object = new ll_insertions();
        object.append("23-1");
        object.append("23-0");

        String output = "23-0";
        assertEquals(object.kthFromEnd(0),output);
    }
    //Code Challenge 08 : Merge
    @Test
    public void testInsert_Merge_EvenEven(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input1.append("C");
        input = input.merge(input,input1);
        int output =6;
        input.print();
        assertEquals(input.getSize(),output);
    }
    @Test
    public void testInsert_Merge_LL_OddEvenParam(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");
        input.append("120");
        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input = input.merge(input,input1);
        int output =5;
        input.print();
        assertEquals(input.getSize(),output);
    }
    @Test
    public void testInsert_Merge_LL_EvenOddParam(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");

        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input1.append("C");
        input = input.merge(input,input1);
        int output =4;
        input.print();
        assertEquals(input.getSize(),output);
    }
    @Test
    public void testInsert_Merge_LL_EvenEven(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("23242");

        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input = input.merge(input,input1);
        int output =4;
        input.print();
        assertEquals(input.getSize(),output);
    }
    @Test
            (expected = InvalidParameterException.class)
    public void testInsert_Merge_LL_EmptyFirst() {
        ll_insertions<String> input = new ll_insertions<String>();

        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input = input.merge(input, input1);
        int output = 4;
    }
    @Test
    public void testInsert_Merge_oneNode_manyNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input1.append("B1");
        input1.append("B2");

        input = input.merge(input,input1);
        int output =2;
        input.print();
        assertEquals(input.getSize(),output);
    }
    @Test
    public void testInsert_Merge_manyNode_oneNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");
        input1.append("B");
        input1.append("B1");
        input1.append("B2");
        input1 = input1.merge(input1,input);
        int output =5;
        input.print();
        assertEquals(input1.getSize(),output);
    }
    @Test
    public void testInsert_Merge_oneNode_oneNode(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");

        input = input.merge(input,input1);
        int output =2;
        input.print();
        assertEquals(input.getSize(),output);
    }
    @Test
    public void testInsert_Merge_ManyNode_none(){
        ll_insertions<String> input = new ll_insertions<String>();
        input.append("1");
        input.append("2");
        input.append("3");
        input.append("4");
        ll_insertions<String> input1 = new ll_insertions<String>();
        input1.append("A");

        input = input.merge(input,input1);
        int output =4;
        input.print();
        assertEquals(input.getSize(),output);
    }
}