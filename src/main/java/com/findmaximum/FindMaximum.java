package com.findmaximum;

public class FindMaximum
{
    public Integer getMaximumInteger(Integer firstNumber,Integer secondNumber,Integer thirdNumber)
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

    public double getMaximumDouble(Double firstNumber,Double secondNumber,Double thirdNumber)
    {
        Double maximumDouble=firstNumber;
        if(secondNumber.compareTo(maximumDouble) > 0)
        {
            maximumDouble=secondNumber;
        }
        if(thirdNumber.compareTo(maximumDouble) > 0)
        {
            maximumDouble=thirdNumber;
        }
        return maximumDouble;
    }
}
