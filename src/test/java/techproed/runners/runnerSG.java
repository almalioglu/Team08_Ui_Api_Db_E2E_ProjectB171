package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty-->konsolda scenerio lar ile ilgili ayrintili bilgi verir
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",//devoloper lar kullanir
        "junit:target/xml-report/cucumber.xml",//devoloper lar kullanir
        "rerun:TestOutput/failed_scenario.txt"},//fail olan seneryoları belirttiğimiz .txt dosyasında tutar
        features = "src/test/resources/features",//features package'ının yolu (content root)
        glue = "java/stepDefinitions",//stepDefinitions package ismi
        tags = "@saadet",//Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = false, //true secersek scenerio'lari kontrol eder browser'i calistirmaz
        monochrome = true//-->true kullanirsak konsoldaki ciktilari tek renk (siyah) olarak verir
)
public class runnerSG {}
