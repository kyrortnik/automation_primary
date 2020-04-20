package cloud_google.page;

import org.openqa.selenium.WebDriver;

public class GoogleCloudHomePage {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;

    public GoogleCloudHomePage(WebDriver driver){
        this.driver = driver;

    }

}
