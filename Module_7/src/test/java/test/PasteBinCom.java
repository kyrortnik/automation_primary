package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.PasteBinHomePage;
import page.PasteBinResultPage;

public class PasteBinCom extends BaseTest {

    PasteBinHomePage homePage = new PasteBinHomePage(driver);
    PasteBinResultPage resultPage;

    private String pasteCode;
    private String pasteName;



    @Test
    public void pageNameCorrespondsToPasteName() {

        pasteCode =
        "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";

        pasteName = "how to gain dominance among developers";


        driver.get("https://pastebin.com");
        homePage.inputPasteCode(pasteCode);
        homePage.choseExpiration();
        homePage.inputPasteName(pasteName);
        homePage.choseSyntaxHighlighting();
        homePage.createNewPaste();
        Assert.assertEquals("[Bash] "+ pasteName +"  - Pastebin.com",driver.getTitle());
    }

    @Test
    public void pasteSyntaxIsBash(){
        driver.get("https://pastebin.com");
        WebElement element = driver.findElement(By.xpath("//*[starts-with(@href, '/archive/')]"));
        Assert.assertEquals("Bash",element.getText());

    }

    @Test
    public void resultPagePasteCorrespondsToEnteredPaste(){}
}
