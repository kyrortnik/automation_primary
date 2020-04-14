package by.epam;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CalculatorIsNegative extends BaseTest {

    @Test
    public void isNegativeTrue(){
        boolean actualIsNegativeTrue = calculator.isNegative(-1);
        Assert.assertTrue(actualIsNegativeTrue);
    }

    @Test
    public void isNegativeFalse(){
        boolean actualIsNegativeFalse = calculator.isNegative(1);
        Assert.assertFalse(actualIsNegativeFalse);
    }
}
