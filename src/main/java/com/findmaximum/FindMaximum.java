package com.findmaximum;

import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>> {
    private final T[] elements;

    public FindMaximum(T... elements) {
        this.elements = elements;
    }

    public T getMaximum() {
        Arrays.sort(elements);
        printMaximum(elements[elements.length - 1]);
        return (T) elements[elements.length - 1];
    }

    public void printMaximum(T maximumValue) {
        System.out.println(maximumValue);
    }
}
