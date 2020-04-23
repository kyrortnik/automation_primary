package by.epam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSubLong extends BaseTest{

    @Test(dataProvider = "valuesForSubLong")
   public void subLong(long a,long b,long expectedResult){
        long actualSubLong = calculator.sub(a,b);
        Assert.assertEquals(actualSubLong,expectedResult);
    }

    @DataProvider(name = "valuesForSubLong")
    public Object[][] subValuesLong(){
        return new Object[][]{
                {5, 2, 3},
                {-3, -5, 2},
                {0, 0, 0},
                {-3, 7, -10}
        };
        }
    }

