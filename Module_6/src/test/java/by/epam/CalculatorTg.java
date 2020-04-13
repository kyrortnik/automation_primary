package by.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTg extends BaseTest{
    @Test
    public void tgPositive(){
        double actualTgPositive = calculator.ctg(0);
        Assert.assertEquals(actualTgPositive,0,"Incorrect ctg result");
    }

    @Test
    public void ctgPi(){
        double actualTgPi = calculator.ctg(Math.PI);
        Assert.assertEquals(actualTgPi,-1,"Incorrect ctg result");
    }

}
