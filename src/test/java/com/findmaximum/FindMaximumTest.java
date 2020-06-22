package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void maximumInteger_ofFiveElements() {
        Assert.assertEquals(76, new FindMaximum(10, 53, 76, 15, 46).getMaximum());
    }

    @Test
    public void maximumInteger_ofThreeElements() {
        Assert.assertEquals(86, new FindMaximum(86, 34, 78).getMaximum());
    }

    @Test
    public void maximumDouble_ofFiveElements() {
        Assert.assertEquals(866.42, new FindMaximum(76.8, 866.42, 434.3, 756.8).getMaximum());
    }

    @Test
    public void maximumDouble_ofThreeElements() {
        Assert.assertEquals(72.54, new FindMaximum(65.93, 72.54, 48.75).getMaximum());
    }

    @Test
    public void maximumString_ofFiveElements() {
        Assert.assertEquals("lavender", new FindMaximum("lavender", "canna", "iris", "ixora", "crocus").getMaximum());
    }

    @Test
    public void maximumString_ofThreeElements() {
        Assert.assertEquals("elephant", new FindMaximum("cat", "elephant", "bird").getMaximum());
    }
}
