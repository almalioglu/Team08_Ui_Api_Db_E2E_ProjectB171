package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;

public class US03_ContactMesajGonderme {
    HomePage homePage = new HomePage();


    @And("kullanici Contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        homePage.contactButonEB.click();
    }

    @And("kullanici {string} {string} {string} {string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String name, String email, String subject, String message) {
        homePage.contactNameButonEB.sendKeys(name,Keys.TAB,email,Keys.TAB,subject,Keys.TAB,message);
    }

    @And("kullanici Send Message butonuna tiklar")
    public void kullaniciSendMessageButonunaTiklar() {
        homePage.SendMessageButonEB.click();
    }

    @Then("kullanici mesaji gonderdigini dogrular")
    public void kullaniciMesajiGonderdiginiDogrular() {
    }
}
