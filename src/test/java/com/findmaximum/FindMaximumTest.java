package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    FindMaximum findMaximum=new FindMaximum();

    @Test
    public void maxNumber_atFirstPosition_returnTheNumber()
    {
        Assert.assertEquals(86,(int)findMaximum.getMaximum(86,34,78));
    }

    @Test
    public void maxNumber_atSecondPosition_returnTheNumber()
    {
        Assert.assertEquals(72,(int)findMaximum.getMaximum(65,72,48));
    }

    @Test
    public void maxNumber_atThirdPosition_returnTheNumber()
    {
        Assert.assertEquals(34,(int)findMaximum.getMaximum(31,12,34));
    }
}
