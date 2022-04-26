package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C://Company//PoCs//BDD-Cucumber//Features//ECommerceLogin.feature",
        "C://Company//PoCs//BDD-Cucumber//Features//CartFlow.feature"},
        glue = "stepDefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/json/Cucumber.json",
                "junit:target/cucumber-reports/xml/Cucumber.xml",
                "html:target/cucumber-reports/html"},
        monochrome = true)
public class TestRunner {
}
