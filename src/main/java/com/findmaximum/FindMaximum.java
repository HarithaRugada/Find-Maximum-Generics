package com.findmaximum;

import java.awt.font.ShapeGraphicAttribute;

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

    public String getMaximumString(String firstString,String secondString,String thirdString)
    {
        String maximumString=firstString;
        if(secondString.compareTo(maximumString) > 0)
        {
            maximumString=secondString;
        }
        if(thirdString.compareTo(maximumString) > 0)
        {
            maximumString=thirdString;
        }
        return maximumString;
    }
}
