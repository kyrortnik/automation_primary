import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class ICanWin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://pastebin.com");
//        WebElement pasteCodeInput = driver.findElement(By.xpath("//*[@id=\"paste_code\"]"));
//        pasteCodeInput.sendKeys("Hello from WebDriver");

//        WebElement expirationTimeDDL = driver.findElement(By.xpath("//span[@title='Never']"));
//        expirationTimeDDL.click();

//        List<WebElement> expirationDDLAllElements = driver.findElements(By.xpath("//span[@class='select2-results']/ul/li"));
//        expirationDDLAllElements.get(1).click();

       WebElement pageNameField = driver.findElement(By.xpath("//input[@class='post_input']"));
       pageNameField.sendKeys("helloweb");
       WebElement createNewPasteButton = driver.findElement(By.xpath("//input[@id='submit']"));
       createNewPasteButton.click();



     driver.quit();

    }
}
