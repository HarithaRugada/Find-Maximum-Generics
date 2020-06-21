package com.findmaximum;

import java.util.Arrays;

public class FindMaximum<E extends Comparable<E>>
{
    E[] inputArray;

    public FindMaximum(E[] inputArray)
    {
        this.inputArray = inputArray;
    }

    public E getMaximum()
    {
        Arrays.sort(inputArray);
        return inputArray[inputArray.length - 1];
    }

    public void printMaximum()
    {
        System.out.println(inputArray[inputArray.length - 1]);
    }
}
