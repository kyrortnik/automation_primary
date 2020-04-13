package by.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSin extends BaseTest{

    @Test
    public void SinZero(){
        double actualSinZero = calculator.sin(0);
        Assert.assertEquals(actualSinZero, 0, "Incorrect value for cos");
    }

    @Test
    private void cosPi(){
        double actualSinPi = calculator.sin(Math.PI);
        Assert.assertEquals(actualSinPi,0,"Incorrect value for cos");
    }
}
