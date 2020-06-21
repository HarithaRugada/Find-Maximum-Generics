package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    @Test
    public void maximumInteger()
    {
        Integer[] integerArray={10,53,76,15,46};
        FindMaximum findMaximum=new FindMaximum(integerArray);
        Assert.assertEquals((int)76,(int)findMaximum.getMaximum());
        findMaximum.printMaximum();
    }

    @Test
    public void maximumDouble()
    {
        Double[] doubleArray={76.8,866.42,434.3,756.8,6453.1};
        FindMaximum findMaximum=new FindMaximum(doubleArray);
        Assert.assertEquals((Double)6453.1,(Double)findMaximum.getMaximum());
        findMaximum.printMaximum();
    }

    @Test
    public void maximumString()
    {
        String[] stringArray={"lavender","canna","iris","ixora","crocus"};
        FindMaximum findMaximum=new FindMaximum(stringArray);
        Assert.assertEquals((String)"lavender",(String)findMaximum.getMaximum());
        findMaximum.printMaximum();
    }
}
