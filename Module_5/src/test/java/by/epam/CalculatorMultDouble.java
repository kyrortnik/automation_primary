package by.epam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultDouble extends BaseTest {

    @Test(dataProvider = "valuesForMultDouble")
    public void multDouble(double a, double b, double expectedResult) {
        double actualMultDouble = calculator.mult(a, b);
        Assert.assertEquals(actualMultDouble, expectedResult);
    }

    @DataProvider(name = "valuesForMultDouble")
    public Object[][] multValuesLong() {
        return new Object[][]{
                {5, 2, 10},
                {-3, -5, 15},
                {0, 0, 0},
                {-3, 7, -21}
        };
    }
}
