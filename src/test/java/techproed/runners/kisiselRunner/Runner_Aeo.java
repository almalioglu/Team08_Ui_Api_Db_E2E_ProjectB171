package techproed.runners.kisiselRunner;

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
        glue = {"techproed/stepDefinition", "techproed/hooks"},
        tags = "@ayseE2E",
        dryRun = false,
        monochrome = true

)
public class Runner_Aeo {

}
