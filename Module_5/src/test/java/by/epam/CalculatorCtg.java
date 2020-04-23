package by.epam;

import org.testng.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorCtg extends BaseTest{

    @Test
    public void ctgZero(){
        double actualCtgZero = calculator.ctg(0);
        double expectedCtgZero = 1.0 / Math.tan(0);
        Assert.assertEquals(actualCtgZero,expectedCtgZero,"Incorrect ctg result");
    }

    @Test
    public void ctg90Degrees(){
        double actualCtg90Degrees = calculator.ctg(radiansTestValues);
        double expectedCtg90Degrees = 1.0 / Math.tan(radiansTestValues);
        Assert.assertEquals(actualCtg90Degrees,expectedCtg90Degrees,"Incorrect ctg result");
    }

}
