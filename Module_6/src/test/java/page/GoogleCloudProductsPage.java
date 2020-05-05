package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudProductsPage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/product";
    private WebDriver driver;

    public GoogleCloudProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@track-metadata-anchor_text='See Pricing']")
    WebElement seePricingButton;

    @FindBy(xpath = "//a[@track-name='pricingNav/calculators']")
    WebElement calculatorsButton;

    public GoogleCloudProductsPage openPage(){
        driver.get("https://cloud.google.com/products");
        return this;
    }

    public GoogleCloudProductsPage goToSeePricing(){
        seePricingButton.click();
        return this;
    }

    public GoogleCloudProductsPage goToCalculators(){
        calculatorsButton.click();
        return this;
    }


}
