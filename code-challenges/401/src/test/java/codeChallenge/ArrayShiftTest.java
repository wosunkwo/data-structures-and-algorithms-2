package codeChallenge;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void ArrayShift_Empty_Array(){
        ArrayShift obj = new ArrayShift();
        int [] input = new int[0];
        int value = 23;
        int [] output = new int[]{23};
        assertArrayEquals(output,obj.insertShiftArray(input,value));
    }

    @Test
    public void ArrayShift_Even_Array(){
        ArrayShift obj = new ArrayShift();
        int [] input = new int[]{1,10};
        int value = 5;
        int [] output = new int[]{1,5,10};
        assertArrayEquals(output,obj.insertShiftArray(input,value));
    }

    @Test
    public void ArrayShift_Odd_Array(){
        ArrayShift obj = new ArrayShift();
        int [] input = new int[]{4,8,15,23,42};
        int value = 16;
        int [] output = new int[]{4,8,15,16,23,42};
        assertArrayEquals(output,obj.insertShiftArray(input,value));
    }
}

