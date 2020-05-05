package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class GoogleCloudHomePage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;


    public GoogleCloudHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[@data-category='Site-Wide Custom Events'] [contains(text(),'Products')]")
    WebElement goToProductsButton;

    @FindBy(xpath = "/html/body/section/devsite-header/div/div[1]/div/div/div[2]/div[1]/cloudx-tabs-nav/div/tab[3]/div/div[1]/div/a")//
    WebElement seeAllProductsButton;




    @FindBy(xpath = "//*[@id=\"mainForm\"]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]/div/div")
    WebElement computeEngineButton;

    @FindBy(xpath = "//input[@id='input_58']") ////form[@name='ComputeEngineForm']/div/div/md-input-container[@class='flex'][1]
    WebElement numberOfInstancesInput;


//    @FindBy(xpath = "//md-select-value[@id='select_value_label_55']")
//    List<WebElement> machineTypes;


    @FindBy(xpath = "//*[contains(text(),'n1-standard-8 (vCPUs: 8, RAM: 30GB)')]  ")
    WebElement listItem;

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

    @FindBy(xpath = "//a[@class='cloud-free-trial-button cloud-free-trial-enabled']")
    WebElement test;


    @FindBy(xpath = "//div[7]/div/md-input-container/md-select/md-select-value/span/div")
    WebElement instanceTypeDDL;

    public GoogleCloudHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;

    }

    public GoogleCloudHomePage goToProducts(){
        goToProductsButton.click();
        return this;
    }

//    public GoogleCloudProductsPage goToSeeAllProducts(){
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(
//                ExpectedConditions.elementToBeClickable(seeAllProductsButton));
////        JavascriptExecutor executor = (JavascriptExecutor) driver;
////        executor.executeScript("arguments[0].click();",seeAllProductsButton );
//       seeAllProductsButton.click();
//        return  new GoogleCloudProductsPage(driver);
//
//    }




    public boolean activeComputeEngine(){
       return  computeEngineButton.isEnabled();
    }

    public GoogleCloudHomePage putNumberOfInstances(String numOfInstances){
        numberOfInstancesInput.sendKeys(numOfInstances);
        return this;
    }
//    public GoogleCloudHomePage putMachineType(){
//            machineTypes
//
//            return this;
//    }

    public GoogleCloudHomePage choseInstanceType(){
        instanceTypeDDL.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("xpath=//md-option[@id='select_option_212']/div")));

        driver.findElement(By.xpath("xpath=//md-option[@id='select_option_212']/div")).click();


//
//      driver.findElement(By.xpath("/html/body/div[3]/md-select-menu/md-content/md-optgroup[3]/md-option[4]/div[1]")).click();

        return this;
    }





}
