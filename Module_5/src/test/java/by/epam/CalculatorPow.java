package by.epam;

import org.testng.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorPow extends BaseTest{

    @Test
    public void PowPositive(){
        double actualPowPositive = calculator.pow(2,4);
        Assert.assertEquals(actualPowPositive,16,"Incorrect pow result");
    }

    @Test
    public void PowNegative(){
        double actualPowNegative = calculator.pow(-2,4);
        Assert.assertEquals(actualPowNegative,16,"Incorrect pow result");
    }

    @Test
    public void PowZero(){
        double actualPowZero = calculator.pow(0,4);
        Assert.assertEquals(actualPowZero,0,"Incorrect pow");
    }


}
