package by.epam;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorSumLong extends BaseTest {

    @Test(dataProvider = "valuesForSumLong")
    public void sumLong(long a,long b, long expectedResult){
        long actualSumLong = calculator.sum(a,b);
        Assert.assertEquals(actualSumLong,expectedResult);
    }

    @DataProvider(name = "valuesForSumLong")
    public Object[][] sumValuesLong(){
        return new Object[][]{
                {5,2,7},
                {-3,-5,-8},
                {0,0,0},
                {-3,7,4}
        };
    }

}
