package wrapper;

import constants.ProjectConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class WebDriverWrapper {

    public static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = WebDriverWrapper.getNewInstance("Default");
        }
        return driver;
    }

    public static WebDriver getNewInstance(String browser) {

        if (browser.equals("Mozilla")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("IE")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equals("Default") || browser.equals("Chrome")) {
            System.setProperty(ProjectConstants.CONFIG_WEBDRIVER_CHROME, ProjectConstants.CONFIG_WEBDRIVER_CHROME_LOCATION);
            driver = new ChromeDriver();
        } else {
            throw new RuntimeException("Browser not informed or not valid");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        return driver;
    }
}