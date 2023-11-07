package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.AddDeanPage;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US04_AddDeanStepDefs {
    HomePage page = new HomePage();
    AddDeanPage addDeanPage = new AddDeanPage();
    Faker fake = new Faker();

    @Given("Admin Dean Management sayfasina gider")
    public void admin_dean_management_sayfasina_gider() {


        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
        addDeanPage.loginLink.click();
        addDeanPage.usernameBox.sendKeys(ConfigReader.getProperty("adminUsername"), Keys.TAB, ConfigReader.getProperty("Password"), Keys.TAB);
        ReusableMethods.bekle(2);
        addDeanPage.loginButton.click();
        ReusableMethods.bekle(2);
        addDeanPage.menuButton.click();
        ReusableMethods.bekle(2);
        addDeanPage.deanManagementButton.click();
        ReusableMethods.bekle(2);

    }

    @Then("Name text boxına valid bir değer girer")
    public void name_text_boxına_valid_bir_değer_girer() {
        addDeanPage.name.sendKeys("Rabia");
        ReusableMethods.bekle(2);

    }

    @Then("Surname text boxına valid bir değer girer")
    public void surname_text_boxına_valid_bir_değer_girer() {
        addDeanPage.surname.sendKeys("Kaya");
        ReusableMethods.bekle(2);

    }

    @Then("Birth Place text boxına valid bir değer girer")
    public void birth_place_text_boxına_valid_bir_değer_girer() {
        addDeanPage.birthPlace.sendKeys("Ankara");
        ReusableMethods.bekle(2);

    }

    @Then("Gender alaninin goruntulendigini dogrular Female butonuna tıklar")
    public void gender_alaninin_goruntulendigini_dogrular_female_butonuna_tıklar() {
        addDeanPage.addDeanGender.isDisplayed();
        addDeanPage.genderFemale.click();
        ReusableMethods.bekle(2);

    }

    @Then("Date Of Birth text boxına valid bir değer girer")
    public void date_of_birth_text_boxına_valid_bir_değer_girer() {
        addDeanPage.birthDay.sendKeys("02031999");
        ReusableMethods.bekle(2);

    }

    @Then("Phone text boxına valid bir değer girer")
    public void phone_text_boxına_valid_bir_değer_girer() {
        addDeanPage.phoneNumber.sendKeys("555-421-3232");
        ReusableMethods.bekle(2);

    }

    @Then("SSN text boxına valid bir değer girer")
    public void ssn_text_boxına_valid_bir_değer_girer() {
        addDeanPage.ssn.sendKeys("111-22-4444");
        ReusableMethods.bekle(2);

    }

    @Then("User name text boxına valid bir değer girer")
    public void user_name_text_boxına_valid_bir_değer_girer() {
        addDeanPage.username.sendKeys("Rabiakayaa");
        ReusableMethods.bekle(2);

    }

    @Then("Password text boxına valid bir değer girer")
    public void password_text_boxına_valid_bir_değer_girer() {
        addDeanPage.deanPassword.sendKeys("2.Rabiakaya");
        ReusableMethods.bekle(2);

    }

    @Then("Submit butonuna tıklar")
    public void submit_butonuna_tıklar() {
        addDeanPage.deanSubmit.click();
        ReusableMethods.bekle(2);

    }

    @When("Dean saved mesajınin görüntülendigini dogrular")
    public void dean_saved_mesajınin_görüntülendigini_dogrular() {
        addDeanPage.deanSavedPopUp.isDisplayed();
        ReusableMethods.bekle(2);


    }

    @When("Required uyarısı aldigini dogrular")
    public void required_uyarısı_aldigini_dogrular() {
        addDeanPage.deanNameRequired.isDisplayed();
    }

    @Then("Gender alaninin goruntulendigini dogrular")
    public void gender_alaninin_goruntulendigini_dogrular() {
        addDeanPage.addDeanGender.isDisplayed();
    }

    @Then("Birth of date text boxına gelecekten bir değer girer")
    public void birth_of_date_text_boxına_gelecekten_bir_değer_girer() {
        addDeanPage.birthDay.sendKeys("02032024");

    }

    @When("Hata mesaji goruntulendigini dogrular")
    public void hata_mesaji_goruntulendigini_dogrular() {

    }

    @Then("Phone text boxına gerekli bilgileri girer")
    public void phone_text_boxına_gerekli_bilgileri_girer() {
        addDeanPage.phoneNumber.sendKeys("555-421-323");

    }

    @When("Minimum character uyarisinin goruntulendigini dogrular")
    public void minimum_character_goruntulendigini_dogrular() {

    }

    @Then("Phone text boxına invalid ozel karakter iceren değer girer")
    public void phone_text_boxına_invalid_ozel_karakter_iceren_değer_girer() {
        addDeanPage.phoneNumber.sendKeys("555-421-32!*");

    }

    @Then("Phone text boxına invalid harf iceren değer girer")
    public void phone_text_boxına_invalid_harf_iceren_değer_girer() {
        addDeanPage.phoneNumber.sendKeys("555-421-32za");

    }

    @Then("SSN text boxına on karakterli bir değer girer")
    public void ssn_text_boxına_on_karakterli_bir_değer_girer(Integer int1) {
        addDeanPage.ssn.sendKeys("111-22-444");

    }

    @When("Minimum character uyarı mesajinin goruntulendigini dogrular")
    public void minimum_character_uyarı_mesajinin_goruntulendigini_dogrular() {

    }

    @Then("SSN text boxına ozel karakterli bir değer girer")
    public void ssn_text_boxına_ozel_karakterli_bir_değer_girer() {
        addDeanPage.ssn.sendKeys("111-22-4*!");

    }

    @Then("SSN text boxına onbir karekterden fazla bir değer girer")
    public void ssn_text_boxına_onbir_karekterden_fazla_bir_değer_girer() {
        addDeanPage.ssn.sendKeys("111-225-4444");

    }

    @When("Uyarı mesajı çıkmalıdır")
    public void uyarı_mesajı_çıkmalıdır() {

    }

    @Then("SSN text boxına harf iceren bir değer girer")
    public void ssn_text_boxına_harf_iceren_bir_değer_girer() {
        addDeanPage.ssn.sendKeys("111-22-44aw");

    }

    @Then("Password text boxına invalid bir değer girer")
    public void password_text_boxına_invalid_bir_değer_girer() {

    }

    @When("uyarı mesajı görünür olmalidir")
    public void uyarı_mesajı_görünür_olmalidir() {

    }

    @Then("Logout yapar ve sayfayi kapatir")
    public void logout_yapar_ve_sayfayi_kapatir() {
        addDeanPage.menuButton.click();
        addDeanPage.logout.click();
        Driver.closeDriver();

    }


}
