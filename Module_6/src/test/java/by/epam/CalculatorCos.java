package by.epam;


import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class CalculatorCos extends BaseTest{

    //a bug
    @Test
    public void CosZero(){
        double actualCosZero = calculator.cos(0);
        Assert.assertEquals(actualCosZero, 1, "Incorrect value for cos");
    }

    @Test
    public void cos90Degrees(){
        double actualSinPi = calculator.cos(radiansTestValues);
        Assert.assertEquals(actualSinPi,0,"Incorrect value for cos");
    }

}
