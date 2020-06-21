package com.findmaximum;

public class FindMaximum
{
    public Integer getMaximum(Integer firstNumber,Integer secondNumber,Integer thirdNumber)
    {
        Integer maximumInteger=firstNumber;
        if(secondNumber.compareTo(maximumInteger) > 0)
        {
            maximumInteger=secondNumber;
        }
        if(thirdNumber.compareTo(maximumInteger) > 0)
        {
            maximumInteger=thirdNumber;
        }
        return maximumInteger;
    }
}
