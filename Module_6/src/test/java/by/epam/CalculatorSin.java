package by.epam;

import org.testng.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorSin extends BaseTest{

    @Test
    public void sinZero(){
        double actualSinZero = calculator.sin(0);
        Assert.assertEquals(actualSinZero, 0, "Incorrect value for sin");
    }

    @Test
    public void sin90Degrees(){
        double actualSinPi = calculator.sin(radiansTestValues);
        Assert.assertEquals(actualSinPi,1,"Incorrect value for sin");
    }
}
