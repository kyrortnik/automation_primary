package by.epam;

import org.testng.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTg extends BaseTest {

    @Test
    public void tgZero(){
        double actualTgZero = calculator.tg(0);
        double expectedTgZero = Math.tan(0);
        Assert.assertEquals(actualTgZero,expectedTgZero,"Incorrect ctg result");
    }

    @Test
    public void tg90Degrees(){
        double actualTg90Degrees = calculator.tg(radiansTestValues);
        double expectedTg90Degrees = Math.tan(radiansTestValues);
        Assert.assertEquals(actualTg90Degrees,expectedTg90Degrees,"Incorrect tg result");
    }

}
