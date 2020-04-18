import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class BringItOn {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"paste_code\"]"));
        searchInput.sendKeys(
                "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");

        WebElement syntaxHighlightDDL = driver.findElement(By.xpath("//span[@title='None']"));
        syntaxHighlightDDL.click();

        List<WebElement> allElementsSyntax = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
        allElementsSyntax.get(2).click();

        WebElement expirationDDL = driver.findElement(By.xpath("//span[@title='Never']"));
        expirationDDL.click();

        List<WebElement> allElementsExpiration = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
        allElementsExpiration.get(1).click();

        WebElement pageName = driver.findElement(By.xpath("//input[@class='post_input']"));
        pageName.sendKeys("how to gain dominance among developers");
        WebElement createNewPasteButton = driver.findElement(By.xpath("//input[@id='submit']"));
        createNewPasteButton.click();

        WebElement title = driver.findElement(By.xpath("//h1[contains(text(),'how to gain dominance among developers')]"));
        boolean check = title.isDisplayed();

       Assert.assertTrue(check);

    }
}
