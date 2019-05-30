package codeChallenge;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinarySearch_Arr_Includes_Key_Even(){
        int[] input = new int []{4,8,15,16,23,42};
        int key = 16;
        int output = 3;
        BinarySearch obj = new BinarySearch();
        assertEquals(obj.BinarySearch(input,key),output);
    }
    @Test
    public void testBinarySearch_Arr_Includes_Key_Odd(){
        int[] input = new int []{4,8,15,16,23,99,101,333,34,21};
        int key = 99;
        int output = 5;
        BinarySearch obj = new BinarySearch();
        assertEquals(obj.BinarySearch(input,key),output);
    }
    @Test
    public void testBinarySearch_Arr_NotIncludes_Key_Even(){
        int[] input = new int []{4,8,15,16,23,929,101,333,34,21};
        int key = 99;
        int output = -1;
        BinarySearch obj = new BinarySearch();
        assertEquals(obj.BinarySearch(input,key),output);
    }
    @Test
    public void testBinarySearch_Arr_NotIncludes_Key_Odd(){
        int[] input = new int []{4,8,15,16,23,34,101,333,534};
        int key = 235;
        int output = -1;
        BinarySearch obj = new BinarySearch();
        assertEquals(obj.BinarySearch(input,key),output);
    }
    @Test
    public void testBinarySearch_Arr_NotIncludes_Key_lengthFive(){
        int[] input = new int []{4,8,32,534,999};
        int key = 235;
        int output = -1;
        BinarySearch obj = new BinarySearch();
        assertEquals(obj.BinarySearch(input,key),output);
    }
    @Test
    public void testBinarySearch_Arr_Includes_Key_NotEqual(){
        int[] input = new int []{4,8,32,534,999,1113,3000};
        int key = 1113;
        int output = -1;
        BinarySearch obj = new BinarySearch();
        assertNotEquals(obj.BinarySearch(input,key),output);
    }
}