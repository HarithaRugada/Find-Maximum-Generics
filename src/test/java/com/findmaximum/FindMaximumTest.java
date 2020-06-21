package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    @Test
    public void maxIntegerNumber_atFirstPosition_returnTheNumber()
    {
        //FindMaximum findMaximum=new FindMaximum(86,34,78);
        Assert.assertEquals(86,new FindMaximum(86,34,56).maximum());
    }

    @Test
    public void maxIntegerNumber_atSecondPosition_returnTheNumber()
    {
        Assert.assertEquals(72,new FindMaximum(65,72,12).maximum());
    }

    @Test
    public void maxIntegerNumber_atThirdPosition_returnTheNumber()
    {
        Assert.assertEquals(34,new FindMaximum(31,12,34).maximum());
    }

    @Test
    public void maxDoubleNumber_atFirstPosition_returnTheNumber()
    {
        Assert.assertEquals(86.6,new FindMaximum(86.6,34.8,78.7).maximum());
    }

    @Test
    public void maxDoubleNumber_atSecondPosition_returnTheNumber()
    {
        Assert.assertEquals(72.54,new FindMaximum(65.93,72.54,48.75).maximum());
    }

    @Test
    public void maxDoubleNumber_atThirdPosition_returnTheNumber()
    {
        Assert.assertEquals(34.12,new FindMaximum(31.90,12.98,34.12).maximum());
    }

    @Test
    public void maxString_atFirstPosition_returnTheString()
    {
        Assert.assertEquals("banana",new FindMaximum("banana", "air", "apple").maximum());
    }

    @Test
    public void maxString_atSecondPosition_returnTheString()
    {
        Assert.assertEquals("elephant",new FindMaximum("cat", "elephant", "bird").maximum());
    }

    @Test
    public void maxString_atThirdPosition_returnTheString()
    {
        Assert.assertEquals("orchid",new FindMaximum("daisy", "iris", "orchid").maximum());
    }
}
