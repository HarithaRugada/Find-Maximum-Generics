package com.findmaximum;

import java.util.Arrays;

public class FindMaximum
{
    public static <E extends Comparable<E>> E getMaximum(E[] inputArray)
    {
        Arrays.sort(inputArray);
        return inputArray[inputArray.length-1];
    }
}
