package by.epam;

import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDivLong extends BaseTest{

    @Test(dataProvider = "valuesForDivLong")
    public void divLong(long a, long b, long expectedResult) {
        long actualDivLong = calculator.div(a, b);
        Assert.assertEquals(actualDivLong, expectedResult,"Division by zero is forbidden");
    }

    @DataProvider(name = "valuesForDivLong")
    public Object[][] divValuesLong() {
        return new Object[][]{
                {5, 2, 2},
                {-15, -5, 3},
                {-30, 10, -3}
        };
    }
    @Test
    public void divByZero(){
        Assertions.assertThrows(NumberFormatException.class, () -> {
            calculator.div(5, 0);
        });
    }
}
