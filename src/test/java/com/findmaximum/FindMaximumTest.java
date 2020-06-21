package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    FindMaximum findMaximum=new FindMaximum();

    @Test
    public void maxIntegerNumber_atFirstPosition_returnTheNumber()
    {
        Assert.assertEquals(86,(int)findMaximum.getMaximumInteger(86,34,78));
    }

    @Test
    public void maxIntegerNumber_atSecondPosition_returnTheNumber()
    {
        Assert.assertEquals(72,(int)findMaximum.getMaximumInteger(65,72,48));
    }

    @Test
    public void maxIntegerNumber_atThirdPosition_returnTheNumber()
    {
        Assert.assertEquals(34,(int)findMaximum.getMaximumInteger(31,12,34));
    }

    @Test
    public void maxDoubleNumber_atFirstPosition_returnTheNumber()
    {
        Assert.assertEquals((Double)86.6,(Double)findMaximum.getMaximumDouble(86.6,34.8,78.7));
    }

    @Test
    public void maxDoubleNumber_atSecondPosition_returnTheNumber()
    {
        Assert.assertEquals((Double)72.54,(Double) findMaximum.getMaximumDouble(65.93,72.54,48.75));
    }

    @Test
    public void maxDoubleNumber_atThirdPosition_returnTheNumber()
    {
        Assert.assertEquals((Double)34.12,(Double) findMaximum.getMaximumDouble(31.90,12.98,34.12));
    }

    @Test
    public void maxString_atFirstPosition_returnTheString()
    {
        Assert.assertEquals((String)"banana",(String)findMaximum.getMaximumString("banana", "air", "apple"));
    }

    @Test
    public void maxString_atSecondPosition_returnTheString()
    {
        Assert.assertEquals((String)"elephant",(String)findMaximum.getMaximumString("cat", "elephant", "bird"));
    }

    @Test
    public void maxString_atThirdPosition_returnTheString()
    {
        Assert.assertEquals((String)"orchid",(String)findMaximum.getMaximumString("daisy", "iris", "orchid"));
    }
}
