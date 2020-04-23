
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

     protected WebDriver driver;

    @BeforeClass
    public void browserSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        driver = null;
    }

}

