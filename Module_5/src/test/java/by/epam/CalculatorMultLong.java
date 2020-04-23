package by.epam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultLong extends BaseTest {

    @Test(dataProvider = "valuesForMultLong")
    public void multLong(long a,long b,long expectedResult){
        long actualMultLong = calculator.mult(a,b);
        Assert.assertEquals(actualMultLong,expectedResult);
    }

    @DataProvider(name = "valuesForMultLong")
    public Object[][] multValuesLong(){
        return new Object[][]{
                {5, 2, 10},
                {-3, -5, 15},
                {0, 0, 0},
                {-3, 7, -21}
        };
    }
}
