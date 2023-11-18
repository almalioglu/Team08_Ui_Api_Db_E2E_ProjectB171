package techproed.runners.apiRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber1.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        features = "src/test/resources",
        glue = {"techproed/stepDefinition/api_step_defs", "techproed/hooks"},
        tags = "@US_17_18_is",
        dryRun = false,
        monochrome = true
)
public class Runner_API {
}
