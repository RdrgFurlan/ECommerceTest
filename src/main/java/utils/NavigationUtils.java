package utils;

import org.openqa.selenium.WebDriver;
import wrapper.WebDriverWrapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NavigationUtils {

    public static final String URL_WEBSITE = "http://automationpractice.com/index.php";

    public void getBrowserInstance(String browser){
        WebDriver driver = WebDriverWrapper.getNewInstance(browser);
        assertNotNull(driver);
    }

    public void getPage() {
        WebDriver driver = WebDriverWrapper.getInstance();
        driver.get(URL_WEBSITE);
    }

    public void quitDriver() {
        WebDriver driver = WebDriverWrapper.getInstance();
        driver.close();
        driver.quit();
    }
}
