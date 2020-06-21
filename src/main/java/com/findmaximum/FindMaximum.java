package com.findmaximum;

public class FindMaximum
{
    public static <E extends Comparable<E>> E getMaximum(E first,E second,E third)
    {
        E maximum=first;
        if(second.compareTo(maximum) > 0)
        {
            maximum=second;
        }
        if(third.compareTo(maximum) > 0)
        {
            maximum=third;
        }
        return maximum;
    }
}
