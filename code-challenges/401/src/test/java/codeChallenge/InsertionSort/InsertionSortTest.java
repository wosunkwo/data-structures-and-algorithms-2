package codeChallenge.InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void empty_insertionSort(){
        InsertionSort o = new InsertionSort ();
        int[] arr = {};
        assertArrayEquals(o.InsertionSort(arr),arr);
    }
    @Test
    public void ASC_inOrder_InsertionSort(){
        InsertionSort o = new InsertionSort ();
        int[] arr = {12,33,46,101};
        assertArrayEquals(o.InsertionSort(arr),arr);
    }
    @Test
    public void ASC_notInOrder_InsertionSort(){
        InsertionSort o = new InsertionSort ();
        int[] input = {101,33,12,46};
        int[] arr = {12,33,46,101};
        assertArrayEquals(o.InsertionSort(input),arr);
    }
    @Test
    public void ASC_notInOrder_large_InsertionSort(){
        InsertionSort o = new InsertionSort ();
        int[] input = {101,33,12,46,1,5,1020,66,1111,550};
        int[] arr = {1,5,12,33,46,66,101,550,1020,1111};
        assertArrayEquals(o.InsertionSort(input),arr);
    }
}