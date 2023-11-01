package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US02_AdminGuestUserList {

    HomePage homePage = new HomePage();

    @Given("Admin olarak Username kutusuna  username gir")
    public void adminOlarakUsernameKutusunaUsernameGir() {
        homePage.loginUserName.sendKeys(ConfigReader.getProperty("Username"));

    }

    @When("Admin olarak Password kutusuna  password gir")
    public void adminOlarakPasswordKutusunaPasswordGir() {
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("Password1"));

    }

    @Then("Login butonuna tikla")
    public void loginButonunaTikla() {
        ReusableMethods.click(homePage.loginEkraniLoginButton);
    }


    @Then("Admin Guest User linkini tikla")
    public void adminGuestUserLinkiniTikla() {
        homePage.GuestUserEB.click();
    }


    @Then("kullanici admin list bolumunde Name Number bilgisinin gorundugunu dogrular")
    public void kullaniciAdminListBolumundeNameNumberBilgisininGorundugunuDogrular() {
        assertTrue(homePage.nameColumnEB.isDisplayed());
    }

    @And("kullanici admin list bolumunde Phone Number bilgisinin gorundugunu dogrular")
    public void kullaniciAdminListBolumundePhoneNumberBilgisininGorundugunuDogrular() {
        assertTrue(homePage.PhoneNumberColumnEB.isDisplayed());

    }

    @And("kullanici admin list bolumunde SSN bilgisinin gorundugunu dogrular")
    public void kullaniciAdminListBolumundeSSNBilgisininGorundugunuDogrular() {
        assertTrue(homePage.SsnColumnEB.isDisplayed());

    }

    @And("kullanici admin list bolumunde User Name bilgisinin gorundugunu dogrular")
    public void kullaniciAdminListBolumundeUserNameBilgisininGorundugunuDogrular() {
        assertTrue(homePage.UserNameColumnEB.isDisplayed());

    }

    @When("kullanici admin list bolumunden kullaniciyi siler")
    public void kullaniciAdminListBolumundenKullaniciyiSiler() {
        homePage.copButonuEB.click();
    }

    @Then("kullanici olusturulan kaydin silindigini dogrular")
    public void kullaniciOlusturulanKaydinSilindiginiDogrular() {
    }
}
