package page.paste_bin_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasteBinResultPage {

    public WebDriver driver;

    public PasteBinResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[starts-with(@href, '/archive/')]")
     private WebElement syntaxButton;

    @FindBy(xpath = "//div[@class='paste_box_line1']")
    private WebElement pasteName;

    @FindBy(xpath = "//textarea")
    private WebElement pasteText;

    public String getPasteSyntax(){
        return syntaxButton.getText();
    }

    public String getPasteName(){
        return pasteName.getText();
    }

    public String getPasteText(){

        return pasteText.getText();
    }




}
