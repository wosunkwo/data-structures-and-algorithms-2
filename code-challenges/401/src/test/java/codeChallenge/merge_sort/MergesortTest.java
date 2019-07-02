package codeChallenge.merge_sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergesortTest {
    @Test
    public void mergeSort_Empty(){
        Mergesort o = new Mergesort();
        int[] input = {};
        int[] output = {};
        o.mergeSort(input);

        assertNotEquals(input,output);
    }
    @Test
    public void mergeSort_test(){
        Mergesort o = new Mergesort();
        int[] input = {55,1,4,9,10,34};
        int[] output = {1,4,9,10,34,55};
        o.mergeSort(input);

        assertArrayEquals(input,output);
    }

    @Test
    public void mergeSort_NegativeInt(){
        Mergesort o = new Mergesort();
        int[] input = {-55,-1,-4,-9,-10,-34};
        int[] output = {-55,-34,-10,-9,-4,-1};
        o.mergeSort(input);

        assertArrayEquals(input,output);
    }
    @Test
    public void mergeSort_NegativeInt_NotEquals(){
        Mergesort o = new Mergesort();
        int[] input = {-55,-1,-4,-9,-10,-34,0};
        int[] output = {-55,-34,-10,-9,-4,0,-1};
        o.mergeSort(input);

        assertNotEquals(input,output);
    }


}