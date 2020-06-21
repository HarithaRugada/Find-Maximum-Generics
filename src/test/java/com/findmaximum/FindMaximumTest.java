package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    FindMaximum findMaximum=new FindMaximum();

    @Test
    public void maximumInteger()
    {
        Integer[] integerArray={10,53,76,15,46};
        Assert.assertEquals((int)76,(int)findMaximum.getMaximum(integerArray));
    }

    @Test
    public void maximumDouble()
    {
        Double[] doubleArray={76.8,866.42,434.3,756.8,6453.1};
        Assert.assertEquals((Double)6453.1,(Double)findMaximum.getMaximum(doubleArray));
    }

    @Test
    public void maximumString()
    {
        String[] stringArray={"lavender","canna","iris","ixora","crocus"};
        Assert.assertEquals((String)"lavender",(String)findMaximum.getMaximum(stringArray));
    }
}
