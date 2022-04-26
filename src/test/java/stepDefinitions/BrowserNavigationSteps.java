package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.NavigationUtils;

public class BrowserNavigationSteps {

    @Given("I launch {string} browser")
    public void i_launch_browser(String selectedBrowser) {
        NavigationUtils navigationUtils = new NavigationUtils();
        navigationUtils.getBrowserInstance(selectedBrowser);
    }

    @When("I open the Automation Ecommerce WebSite")
    public void i_open_the_automation_ecommerce_web_site() {
        NavigationUtils navigationUtils = new NavigationUtils();
        navigationUtils.getPage();
    }

    @Then("Close browser")
    public void close_browser() {
        NavigationUtils navigationUtils = new NavigationUtils();
        navigationUtils.quitDriver();
    }
}
