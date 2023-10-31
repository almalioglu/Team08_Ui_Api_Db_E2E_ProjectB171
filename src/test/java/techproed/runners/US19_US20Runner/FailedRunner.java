package techproed.runners.US19_US20Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt",},
        features = "@TestOutput/failed_scenario.txt",  //dosya yolu önüne muhakkak @ isareti konulmalı.
        glue = {"techproed/stepDefinitions"},
        dryRun = false,
        monochrome = true
        /*
        bu calss da sadece txt dosyası içinde fail olan scenariolari calıstıracağımız için tag
         parametresine ihtiyac yoktur.feature parametresine de fail olan scenarioların olduğu txt dosyasının yolu
         belirtiriz.
         features parametresinde dosya yolu belirtiyorsak dosya yolundan önce @ sembolu koymamız gerekir

         */
)

public class FailedRunner {

}
/*
fail olan senaryoları tek bir yerden calıstırmak için failedRunner olusturduk
 */