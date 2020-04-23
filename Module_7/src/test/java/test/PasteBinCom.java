package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import page.PasteBinHomePage;
import page.PasteBinResultPage;

public class PasteBinCom extends BaseTest {

    PasteBinHomePage homePage;
    PasteBinResultPage resultPage;

    private final String pasteText =
            "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";

    private final String pasteName = "how to gain dominance among developers";

    @Test
    public void ICanWin(){
        homePage = new PasteBinHomePage(driver)
                .openPage()
                .inputPasteCode("Hello from WebDriver")
                .choseExpiration10Minutes()
                .inputPasteName("helloweb");
        resultPage = homePage.createNewPaste();
        Assert.assertNotNull(resultPage);
    }


    @Test
    public void pageNameCorrespondsToPasteName() {
        homePage = new PasteBinHomePage(driver)
        .openPage()
        .inputPasteCode(pasteText)
        .inputPasteName(pasteName)
        .choseSyntaxHighlightingBash();
        resultPage = homePage.createNewPaste();
        String actualPageName = "[Bash] "+ resultPage.getPasteName() +" - Pastebin.com";
        Assert.assertEquals(actualPageName,driver.getTitle());
    }

    @Test
    public void pasteSyntaxIsBash(){
        homePage = new PasteBinHomePage(driver)
        .openPage()
        .inputPasteCode(pasteText)
        .inputPasteName(pasteName)
        .choseSyntaxHighlightingBash();
        resultPage = homePage.createNewPaste();
        Assert.assertEquals(resultPage.getPasteSyntax(),"Bash");
    }

    @Test
    public void resultPagePasteCorrespondsToEnteredPaste(){

        homePage = new PasteBinHomePage(driver)
        .openPage()
        .inputPasteCode(pasteText)
        .inputPasteName(pasteName)
        .choseSyntaxHighlightingBash();
        resultPage = homePage.createNewPaste();
        Assert.assertEquals(resultPage.getPasteText(), pasteText);
    }


}
