package cloud_google.test;

import cloud_google.page.GoogleCloudHomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GoogleCloudTest {
   /* VM Class, Instance type, Region, local SSD, commitment term
    Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном прохождении теста.*/

   WebDriver driver = new ChromeDriver();
   GoogleCloudHomePage homePage = new GoogleCloudHomePage(driver);


   @Test
    public void temp() {
    homePage.openPage();
    driver.manage().window().maximize();
    homePage.goToExploreAllProducts();
    homePage.goToSeePricing();
       WebDriverWait wait = new WebDriverWait(driver,10);
       wait.until(
               ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/pricing/calculators']")));
    homePage.goToCalculators();
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input_58']")));
    homePage.putNumberOfInstances("4");


   }
}
