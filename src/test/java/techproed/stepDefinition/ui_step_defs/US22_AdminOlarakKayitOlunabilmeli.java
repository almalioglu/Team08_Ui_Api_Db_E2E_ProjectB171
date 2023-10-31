package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US22_AdminOlarakKayitOlunabilmeli {
    HomePage page =new HomePage();
    Random random=new Random();
    Faker faker=new Faker();
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    int pwdLength;
    Date birthDate;
    String dateOfBirth;
    String randomPassword;
    @And("Admin username ve Password girilip login olunur")
    public void adminUsernameVePasswordGirilipLoginOlunur() {
        page.loginUserName.sendKeys(ConfigReader.getProperty("adminUsername"), Keys.TAB, ConfigReader.getProperty("Password"),Keys.TAB,Keys.ENTER);
    }


    @Given("Admin hesabinda login olduktan sonra ilgili alanlar doldurulur ve submit butonuna tıklanır")
    public void adminHesabindaLoginOlduktanSonraIlgiliAlanlarDoldurulurVeSubmitButonunaTıklanır() {
        //Random şifre için
        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");

        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);


        page.adminNameTextBoxME.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                dateOfBirth,Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER
        );
    }

    @Then("Admin hesabinin eklendigi dogrulanir")
    public void adminHesabininEklendigiDogrulanir() {
        ReusableMethods.visibleWait(page.adminSavedVerifyME,3);
        assertTrue(page.adminSavedVerifyME.isDisplayed());
    }

    @Given("Yeni admin Name bolumu bos birakilarak eklenmemeli")
    public void yeniAdminNameBolumuBosBirakilarakEklenmemeli() {
        //Random şifre için
        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");

        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);


        page.adminNameTextBoxME.sendKeys(Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                dateOfBirth,Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER
        );
    }

    @Then("Admin hesabinin eklenmedigi dogrulanir")
    public void adminHesabininEklenmedigiDogrulanir() {
        assertTrue(page.adminDontSavedVerifyME.isDisplayed());
    }

    @Given("Yeni admin SurName bolumu bos birakilarak eklenmemeli")
    public void yeniAdminSurNameBolumuBosBirakilarakEklenmemeli() {
        //Random şifre için
        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");
        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);


        page.adminNameTextBoxME.sendKeys(faker.name().firstName(), Keys.TAB,
                Keys.TAB,
                faker.address().city(),Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                dateOfBirth,Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER
        );
    }

    @Given("Yeni admin Birt Place bolumu bos birakilarak eklenmemeli")
    public void yeniAdminBirtPlaceBolumuBosBirakilarakEklenmemeli() {
        //Random şifre için
        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");

        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);


        page.adminNameTextBoxME.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                dateOfBirth,Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER
        );
    }

    @Given("Yeni admin Gender bolumu bos birakilarak eklenmemeli")
    public void yeniAdminGenderBolumuBosBirakilarakEklenmemeli() {
        //Random şifre için
        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");

        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);


        page.adminNameTextBoxME.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                Keys.TAB,
                dateOfBirth,Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER
        );
    }

    @Then("Gender bolumu bos birakilarak admin eklenmedigi dogrulanir")
    public void genderBolumuBosBirakilarakAdminEklenmedigiDogrulanir() {
        assertFalse(page.adminSavedVerifyME.isDisplayed());
    }

    @Given("Yeni admin Date Of Birth bolumu bos birakilarak eklenmemeli")
    public void yeniAdminDateOfBirthBolumuBosBirakilarakEklenmemeli() {
        //Random şifre için
        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");

        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);


        page.adminNameTextBoxME.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER
        );
    }
}
