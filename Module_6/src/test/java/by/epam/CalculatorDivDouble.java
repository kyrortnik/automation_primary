package by.epam;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CalculatorDivDouble extends BaseTest{

    @Test(dataProvider = "valuesForDivMult")
    public void divMult(double a, double b, double expectedResult) {
        double actualDivMult = calculator.div(a, b);
        Assert.assertEquals(actualDivMult, expectedResult,"Division by zero is forbidden");
    }

    @DataProvider(name = "valuesForDivMult")
    public Object[][] divValuesLong() {
        return new Object[][]{
                {5, 2, 2.5},
                {-15, -5, 3},
                {-30, 10, -3}
        };

    }
    @Test
    public void divDoubleZero(){
        double actualDivDoubleZero = calculator.div(10.0,0.0);
        Assert.assertTrue(Double.isInfinite(actualDivDoubleZero));
    }
}
