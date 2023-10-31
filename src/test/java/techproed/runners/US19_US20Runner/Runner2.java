package techproed.runners.US19_US20Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasına sağlayan scenario çalıştırı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports2.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber2.xml",
        "rerun:TestOutput/failed_scenario.txt",//fail olan senarioyu buraya belirtiğimiz adrese alır(projeseviyesinde TestOutput package içinde ismi failed_scenario.txt uzantılı dosya
},
        /*
        rerun plugin i sayesinde fail olan scenariolarimizi yolunu belirttiğimiz .txt dosya içinde tutacaktır
         */
        features = "src/test/resources/features",//-->features package'ının yolu (content root) belirtilir
        glue = {"techproed/stepDefinitions"},//-->stepDefinitions package'ı belirtilir
        tags = "@br1",//-->Burda belirttiğimiz tag'i hangi scenario da belirtirsek o scenariolar çalışır
        dryRun = false,  //true secersek scenariolari kontrol eder.Browser'ı calıştırmaz.
        monochrome = true //--> true kullanırsak konsoldaki cıktıları tem renk(siyah) olarak verir
)

public class Runner2 {
}
 /*
 fail olan senaryoların raporlarını almak için runner2 olusturduk
  */