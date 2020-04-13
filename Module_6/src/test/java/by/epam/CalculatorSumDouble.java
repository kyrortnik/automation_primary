package by.epam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSumDouble extends BaseTest {


    @Test(dataProvider = "valuesForSumDouble")
    public void sumDouble(double a,double b, double expectedResult){
        double actualSumDouble = calculator.sum(a,b);
        Assert.assertEquals(actualSumDouble,expectedResult);
    }

    @DataProvider(name = "valuesForSumDouble")
    public Object[][] sumValuesDouble(){
        return new Object[][]{
                {5.0,2.0,7.0},
                {-3.2,-5.2,-8.4},
                {0.0,0.0,0.0},
                {-3.0,7.0,4.0}
        };
    }
}
