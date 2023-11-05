package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasına sağlayan scenario çalıştırı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json", //2 farklı rapor yerine tek bir yerden rapor alabileceğiz
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt",//fail olan senarioyu buraya belirtiğimiz adrese alır(projeseviyesinde TestOutput package içinde ismi failed_scenario.txt uzantılı dosya
},
        /*
        rerun plugin i sayesinde fail olan scenariolarimizi yolunu belirttiğimiz .txt dosya içinde tutacaktır
         */
        features = "src/test/resources",//-->features package'ının yolu (content root) belirtilir
        glue = {"techproed/stepDefinition", "techproed/hooks"},//-->stepDefinitions package'ı belirtilir
        tags = "@08",//-->Burda belirttiğimiz tag'i hangi scenario da belirtirsek o scenariolar çalışır
        dryRun = false,  //true secersek scenariolari kontrol eder.Browser'ı calıştırmaz.
        monochrome = true //--> true kullanırsak konsoldaki cıktıları tem renk(siyah) olarak verir
)

public class RunnerMO {
}
