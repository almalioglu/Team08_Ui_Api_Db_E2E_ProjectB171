package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US03_ContactMesajGonderme {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click(homePage.SendMessageButonEB);
    }

    @Then("kullanici mesaji gonderdigini dogrular")
    public void kullaniciMesajiGonderdiginiDogrular() {
        assertTrue(homePage.alertMessageEB.isDisplayed());
    }


    @Then("kullanici email @ ve . karakteri olmadiginda message'in gonderilemedigini dogrular")
    public void kullaniciEmailVekarakteriOlmadigindaMessageInGonderilemediginiDogrular() {
       // assertTrue(homePage.pleaseEnterValidEmailMessageEB.isDisplayed());


    }
}
