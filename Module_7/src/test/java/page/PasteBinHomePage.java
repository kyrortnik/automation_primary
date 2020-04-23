package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//span[@title='Never'] ")
    private WebElement expirationTimeDDL;

    @FindBy(xpath = "//span[@title='None']")
    private WebElement syntaxHighlightingDDL;

    @FindBy(xpath = "//span[@class='select2-results']/ul/li") //
    private List<WebElement> openedDDLALLElements;

    @FindBy(xpath = "//input[@class='post_input']")
    private  WebElement pasteName;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement createNewPasteButton;

    public void openPage(){
        driver.get(HOMEPAGE_URL);
    }

    public void inputPasteCode(String paste){
        pasteCodeInput.click();
        pasteCodeInput.sendKeys(paste);
    }

    public void choseExpiration10Minutes(){
        expirationTimeDDL.click();
        openedDDLALLElements.get(1).click();
    }

    public void choseSyntaxHighlightingBash(){
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
