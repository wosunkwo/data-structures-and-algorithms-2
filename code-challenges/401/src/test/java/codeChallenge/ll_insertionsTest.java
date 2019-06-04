package codeChallenge;


import org.junit.Test;

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
        input.append("09490");
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
                input.insertAfter("09490","set"), output);

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
}