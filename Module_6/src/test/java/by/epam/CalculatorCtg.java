package by.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorCtg extends BaseTest{

    @Test
    public void ctgPositive(){
        double actualCtgPositive = calculator.ctg(0);
        Assert.assertEquals(actualCtgPositive,0,"Incorrect ctg result");
    }

    @Test
    public void ctgPi(){
        double actualCtgPi = calculator.ctg(Math.PI);
        Assert.assertEquals(actualCtgPi,-1,"Incorrect ctg result");
    }

}
