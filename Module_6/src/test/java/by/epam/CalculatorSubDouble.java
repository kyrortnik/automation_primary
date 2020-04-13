package by.epam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSubDouble extends BaseTest{

    @Test(dataProvider = "valuesForSubDouble")
    public void subDouble(double a,double b, double expectedResult){
        double actualSubDouble = calculator.sub(a,b);
        Assert.assertEquals(actualSubDouble,expectedResult);
    }

    @DataProvider(name = "valuesForSubDouble")
    public Object[][] subValuesDouble(){
        return new Object[][]{
                {5.0, 2.0, 3.0},
                {-3.2, -5.2, 2.0},
                {0.0, 0.0, 0.0},
                {-3.0, 7.0, -10.0}
        };
    }

}
