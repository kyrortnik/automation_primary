package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PasteBinHomePage {

    private WebDriver driver;
    private static final String HOMEPAGE_URL = "https://pastebin.com";

    public PasteBinHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id='paste_code']")
    private WebElement pasteCodeInput;

    @FindBy(xpath = "//span[@title='Never'] ") //   //span[@id='select2-paste_private-9p-container'] //span[@aria-labelledby='select2-paste_expire_date-rm-container']
    private WebElement expirationTimeDDL;

    @FindBy(xpath = "//span[@title='None']")  //span[@aria-labelledby='select2-paste_format-ir-container']
    private WebElement syntaxHighlightingDDL;

    @FindBy(xpath = "//span[@class='select2-results']/ul/li") //
    private List<WebElement> openedDDLALLElements;

    @FindBy(xpath = "//input[@class='post_input']")
    private  WebElement pasteName;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement createNewPasteButton;

//    public void openPage(){
//        driver.get(HOMEPAGE_URL);
//        new WebDriverWait(driver,10).until(CustomCondition.)
//    }

    public void inputPasteCode(String paste){
        pasteCodeInput.click();
        pasteCodeInput.sendKeys(paste);
    }

    public void choseExpiration(){
        expirationTimeDDL.click();
        openedDDLALLElements.get(1).click();
    }

    public void choseSyntaxHighlighting(){
        syntaxHighlightingDDL.click();
        openedDDLALLElements.get(2).click();
    }

    public void inputPasteName(String name){
        pasteName.click();
        pasteName.sendKeys(name);
    }

    public PasteBinResultPage createNewPaste(){
        createNewPasteButton.click();
        return new PasteBinResultPage(driver);
    }









}
