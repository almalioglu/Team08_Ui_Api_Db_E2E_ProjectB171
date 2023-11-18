package techproed.runners.dbRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "rerun:TestOutput/failed_scenario.txt"},
        features = "@TestOutput/failed_scenario.txt",
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true
        /*
            Bu class'da sadece fail olan scenarioları çalıştıracağımız için feature parametresine features package'ının
        yolu yerine fail scenarioların olduğu .txt dosyasının yolunu koyarız. Dosya yolu belirttiğimiz için yoldan önce
        @ işareti koymamız gerekir. Sadece dosya içindeki fail olan scenarioları çalıştıracağı için bu class'da tags
        parametresine ihtiyaç yoktur
         */
)

public class FailedRunner {
}
