package paste_bin.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import paste_bin.page.PasteBinHomePage;
import paste_bin.page.PasteBinResultPage;

public class PasteBinCom {

    WebDriver driver = new ChromeDriver();
    PasteBinHomePage homePage = new PasteBinHomePage(driver);
    PasteBinResultPage resultPage;

    private String pasteText =
            "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";

    private String pasteName = "how to gain dominance among developers";

    @Test
    public void ICanWin(){
        homePage.openPage();
        homePage.inputPasteCode("Hello from WebDriver");
        homePage.choseExpiration10Minutes();
        homePage.inputPasteName("helloweb");
        resultPage = homePage.createNewPaste();
        Assert.assertTrue(true);
    }


    @Test
    public void pageNameCorrespondsToPasteName() {

        homePage.openPage();
        homePage.inputPasteCode(pasteText);
        homePage.inputPasteName(pasteName);
        homePage.choseSyntaxHighlightingBash();
        resultPage = homePage.createNewPaste();
        String actualPageName = "[Bash] "+ resultPage.getPasteName() +" - Pastebin.com";
        Assert.assertEquals(actualPageName,driver.getTitle());
    }

    @Test
    public void pasteSyntaxIsBash(){

        homePage.openPage();
        homePage.inputPasteCode(pasteText);
        homePage.inputPasteName(pasteName);
        homePage.choseSyntaxHighlightingBash();
        resultPage = homePage.createNewPaste();
        Assert.assertEquals(resultPage.getPasteSyntax(),"Bash");
    }

    @Test
    public void resultPagePasteCorrespondsToEnteredPaste(){

        homePage.openPage();
        homePage.inputPasteCode(pasteText);
        homePage.inputPasteName(pasteName);
        homePage.choseSyntaxHighlightingBash();
        resultPage = homePage.createNewPaste();
        Assert.assertEquals(resultPage.getPasteText(), pasteText);
    }
}
