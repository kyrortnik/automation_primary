package by.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorCos extends BaseTest{

    //a bug
    @Test
    public void CosZero(){
        double actualCosZero = calculator.cos(0);
        Assert.assertEquals(actualCosZero, 1, "Incorrect value for cos");
    }

    @Test
    private void cosPi(){
        double actualCosPi = calculator.cos(Math.PI);
        Assert.assertEquals(actualCosPi,-1,"Incorrect value for cos");
    }

}
