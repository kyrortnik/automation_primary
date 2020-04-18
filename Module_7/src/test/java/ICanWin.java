import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class ICanWin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"paste_code\"]"));
        searchInput.sendKeys("Hello from WebDriver");

        WebElement expirationDDL = driver.findElement(By.xpath("//span[@title='Never']"));
        expirationDDL.click();

        List<WebElement> allElements = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
        allElements.get(1).click();

       WebElement pageName = driver.findElement(By.xpath("//input[@class='post_input']"));
       pageName.sendKeys("helloweb");
       WebElement createNewPasteButton = driver.findElement(By.xpath("//input[@id='submit']"));
       createNewPasteButton.click();



     driver.quit();

    }
}
