package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleCloudHomePage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;

    public GoogleCloudHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[@data-category='Site-Wide Custom Events'] [contains(text(),'Products')]")
    WebElement exploreAllProductsButton;

    @FindBy(xpath = "//a[@track-metadata-href='/products']")
    WebElement seeAllProductsButton;

    @FindBy(xpath = "//*[@href='/pricing'][@class='cloud-button cloud-button--secondary']")
    WebElement seePricingButton;

    @FindBy(xpath = "//a[@href='/pricing/calculators']")
    WebElement calculatorsButton;

//    @FindBy(xpath = "//div[@title='Compute Engine'][@class='hexagon']")
//    WebElement computeEngineButton;

    @FindBy(xpath = "//input[@id='input_58']")
    WebElement numberOfInstancesInput;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_55']")
    List<WebElement> machineTypes;

    @FindBy(xpath = "//md-checkbox/div[1]")
    WebElement addGPUsCheckbox;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_335']")
    List<WebElement> numberOfGPUs;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_336']")
    List<WebElement> typeOfGPU;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_169']")
    List<WebElement> localSSD;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_56']")
    List<WebElement> dataCentersLocation;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_56']")
    List<WebElement> committedUsage;

    @FindBy(xpath = "//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']")
    WebElement addToEstimateButton;

    public void openPage(){
        driver.get(HOMEPAGE_URL);
    }

    public void goToExploreAllProducts(){
    exploreAllProductsButton.click();
    }

    public void goToSeePricing(){
        seeAllProductsButton.click();
        seePricingButton.click();
    }

    public void goToCalculators(){
        calculatorsButton.click();
    }

//    public void activeComputeEngine(){
//        computeEngineButton.click();
//    }

    public void putNumberOfInstances(String numOfInstances){
        numberOfInstancesInput.sendKeys(numOfInstances);
    }



}
