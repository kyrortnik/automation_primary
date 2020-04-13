package by.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSqrt extends BaseTest{

    @Test
    public void sqrtPositive(){
        double actualSqrtPositive = calculator.sqrt(64);
        Assert.assertEquals(actualSqrtPositive,8,"Incorrect sqrt result");
    }

    @Test
    public void sqrtZero(){
        double actualSqrtZero = calculator.sqrt(0);
        Assert.assertEquals(actualSqrtZero,0,"Incorrect sqrt result!");
    }
}
