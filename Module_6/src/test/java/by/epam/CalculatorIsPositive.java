package by.epam;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CalculatorIsPositive extends BaseTest{

    @Test
    public void isPositiveTrue(){
        boolean actualIsPositiveTrue = calculator.isPositive(10);
        Assert.assertTrue(actualIsPositiveTrue);
    }

    @Test
    public void isPositiveFalse(){
        boolean actualIsPositiveFalse = calculator.isPositive(-10);
        Assert.assertFalse(actualIsPositiveFalse);
    }
}
