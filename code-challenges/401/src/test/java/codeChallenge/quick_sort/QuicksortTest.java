package codeChallenge.quick_sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuicksortTest {
    @Test
    public void quickSort_Test_Empty(){
        int [] arr = {};
        int left = 0 ;
        int right = 0 ;
        Quicksort o = new Quicksort();
        o.quickSort(arr,left,right);
        //arr shouldn't change at all
        assertArrayEquals(arr,arr);
    }
    @Test
    public void quickSort_Test_NotEmpty(){
        int [] arr = {44,66,11,300,202};
        int left = 0 ;
        int right = arr.length-1 ;
        Quicksort o = new Quicksort();
        int [] output = {11,44,66,202,300};
        o.quickSort(arr,left,right);

        assertArrayEquals(arr,output);
    }
    @Test
    public void quickSort_Test_NegativeInt(){
        int [] arr = {-44,-66,-11,-300,-202};
        int left = 0 ;
        int right = arr.length-1 ;
        Quicksort o = new Quicksort();
        int [] output = {-300,-202,-66,-44,-11};
        o.quickSort(arr,left,right);

        assertArrayEquals(arr,output);
    }
    @Test
    public void quickSort_Test_NotEquals(){
        int [] arr = {-44,-66,-11,-300,-202, 101,2323};
        int left = 0 ;
        int right = arr.length-1 ;
        Quicksort o = new Quicksort();
        int [] output = {-300,-202,-66,-44,-11,2323,101};
        o.quickSort(arr,left,right);

        assertNotEquals(arr,output);
    }
}