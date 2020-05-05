package test;

import org.testng.Assert;
import page.GoogleCloudHomePage;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.GoogleCloudProductsPage;

import java.util.concurrent.TimeUnit;


public class GoogleCloudTest extends BaseTest {
   /* VM Class, Instance type, Region, local SSD, commitment term
    Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном прохождении теста.*/

   GoogleCloudHomePage homePage;
    WebDriverWait wait;



   @Test
    public void temp() {
         wait = new WebDriverWait(driver,10);
         GoogleCloudHomePage homePage = new GoogleCloudHomePage(driver)
         .openPage()
         .goToProducts();
//         GoogleCloudProductsPage productsPage = homePage.goToSeeAllProducts();
         GoogleCloudProductsPage productsPage = new GoogleCloudProductsPage(driver);
         productsPage.openPage();
         wait.until(
         ExpectedConditions.elementToBeClickable(By.xpath("//a[@track-metadata-anchor_text='See Pricing']")));
         productsPage.goToSeePricing();
         wait.until(
                 ExpectedConditions.elementToBeClickable(By.xpath("//a[@track-name='pricingNav/calculators']")));
         productsPage.goToCalculators();
         driver.switchTo().defaultContent();

         wait.until(
                 ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='/products/calculator/index_ad8ca20a6d1799e286a0c0839aeb86ca523afe927b04501d8ba77dc59e5b8523.frame']")));

         driver.switchTo().frame("myFrame");
         homePage.putNumberOfInstances("4");

         homePage.choseInstanceType();

      Assert.assertTrue(true);



   }
}
