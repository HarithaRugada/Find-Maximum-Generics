package com.findmaximum;

public class FindMaximum <E extends Comparable<E>>
{
    E first,second,third;

    public FindMaximum(E first,E second,E third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }

    public E maximum()
    {
        return FindMaximum.getMaximum(first,second,third);
    }

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
