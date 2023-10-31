package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US01_Register {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();

    @Then("kullanici  Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        homePage.registerButton.click();
    }

    @Given("kullanici  {string} {string} {string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String name, String Surname, String Birth_Place, String Phone, String Gender, String Date_Of_Birth, String Ssn, String User_Name, String Password) {
       homePage.registerNameText.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(), Keys.TAB, faker.country().name(), Keys.TAB,
               faker.phoneNumber().cellPhone(), Keys.TAB, Keys.SPACE, Keys.TAB, Date_Of_Birth, Keys.TAB, faker.idNumber().ssnValid(), Keys.TAB, faker.name().firstName(), Keys.TAB, Password, Keys.TAB);


    }


    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }



    @Then("kullanici register yazisina tıklar")
    public void kullaniciRegisterYazisinaTıklar() {
        homePage.registerbutonEB.click();
    }

    @Then("kullanici register isleminin basarili oldugunu dogrular")
    public void kullaniciRegisterIslemininBasariliOldugunuDogrular() {
        assertTrue(homePage.guestUserRegisteredEB.isDisplayed());
    }



}


