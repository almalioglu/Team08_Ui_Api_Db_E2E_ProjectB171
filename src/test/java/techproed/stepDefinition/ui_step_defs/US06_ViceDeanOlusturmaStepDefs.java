package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US06_ViceDeanOlusturmaStepDefs {
    HomePage homePage = new HomePage();
    public static String fakeUsername;
    public static String fakeSsn;
    public static String fakePhoneNumber;
    Faker faker = new Faker();

    @And("Kullanici dean bilgileri ile oturum açar")
    public void kullaniciDeanBilgileriIleOturumAçar() {
        homePage.loginUserName.sendKeys(ConfigReader.getProperty("deanUsername_aeo"), Keys.TAB, ConfigReader.getProperty("A.ebrar1"), Keys.TAB, Keys.ENTER);
    }

    @Given("Kullanici anasayfaya gider.")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
    }

    @Then("Kullanici Dean hesabi ile Sing in yapar.")
    public void kullanici_dean_hesabi_ile_sing_in_yapar() {
        ReusableMethods.bekle(2);
        homePage.loginButton.click();
        homePage.loginUserName.clear();
        homePage.loginUserName.sendKeys(ConfigReader.getProperty("deanUsername_aeo"));
        homePage.loginPassword.clear();
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("A.ebrar1"));
        homePage.loginEkraniLoginButton.click();
    }

    @And("Kullanici tüm alanlarin bos oldugunu test eder.")
    public void kullaniciTümAlanlarinBosOldugunuTestEder() {
        homePage.viceDeanManagementHomePage_aeo.sendKeys(Keys.TAB);
        ReusableMethods.bekle(1);

        assertTrue(homePage.viceDeanrequiredName_aeo.isDisplayed());
        assertTrue(homePage.viceDeanRequiredSurname_aeo.isDisplayed());
        assertTrue(homePage.viceDeanBirthPlace_aeo.isDisplayed());

        assertFalse(homePage.maleRadioButton_aeo.isSelected());
        assertFalse(homePage.femaleRadioButton_aeo.isSelected());

        assertTrue(homePage.requiredDateOfBirth_aeo.isDisplayed());
        assertTrue(homePage.requiredPhoneNumber_aeo.isDisplayed());
        assertTrue(homePage.requiredSsn_aeo.isDisplayed());
        assertTrue(homePage.requiredUsername_aeo.isDisplayed());
        assertTrue(homePage.passwordGirUyarisi.isDisplayed());

    }


    @Then("Kullanici {string} alanina gecerli bir ad girer.")
    public void kullanici_Name_alanina_gecerli_bir_ad_girer(String name) {
        homePage.viceDeanName_aeo.sendKeys(name);
        ReusableMethods.visibleWait(homePage.viceDeanName_aeo, 12);
    }


    @And("Kullanici Name alaninin bos olmadigini test eder.")
    public void kullaniciNameAlanininBosOlmadiginiTestEder() {
        assertFalse(homePage.viceDeanrequiredName_aeo.isDisplayed());

    }

    @Then("Kullanici {string} alanina gecerli bir surname girer.")
    public void kullaniciAlaninaGecerliBirSurnameGirer(String surname) {
        homePage.viceDeanSurname_aeo.sendKeys(surname);
    }

    @And("Kullanici Surname  alaninin bos olmadigini test eder.")
    public void kullaniciSurnameAlanininBosOlmadiginiTestEder() {
        assertFalse(homePage.viceDeanRequiredSurname_aeo.isDisplayed());
    }

    @Then("Kullanici {string} alanina gecerli bir değer girer.")
    public void kullaniciAlaninaGecerliBirDeğerGirer(String birthPlace) {
        homePage.viceDeanBirthPlace_aeo.sendKeys(birthPlace);
    }
    @And("Kullanici Birth Place alaninin bos olmadigini test eder.")
    public void kullaniciBirthPlaceAlanininBosOlmadiginiTestEder() {
        assertFalse(homePage.viceDeanRequiredBirthPlace_aeo.isDisplayed());
    }
    @Then("Kullanici Gender seçeneginden birini seçer.")
    public void kullaniciGenderSeçenegindenBiriniSeçer() {
       homePage.femaleRadioButton_aeo.click();
        }


    @And("Kullanici Gender seçeneginin bos olmasdigini test eder.")
    public void kullaniciGenderSeçenegininBosOlmasdiginiTestEder() {
        assertFalse(homePage.femaleRadioButton_aeo.isSelected());
        assertTrue(homePage.maleRadioButton_aeo.isSelected());
    }

    @Then("Kullanici {string} kutusuna geçerli bir doğum tarihi girer.")
    public void kullaniciKutusunaGeçerliBirDoğumTarihiGirer(String date) {
       homePage.dateOfBirth_aeo.sendKeys(date);
    }

    @And("Kullanici Date Of Birth kutusunun bos olamdigini test eder.")
    public void kullaniciDateOfBirthKutusununBosOlamdiginiTestEder() {
        assertFalse(homePage.requiredDateOfBirth_aeo.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna gecerli bir telefon numarasi girer.")
    public void kullaniciKutusunaGecerliBirTelefonNumarasiGirer(String phoneNumber) {
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        homePage.viceDeanPhoneNumber_aeo.sendKeys(fakePhoneNumber);


    }


    @And("Kullanici Phone kutusunun bos olmadigini test eder.")
    public void kullaniciPhoneKutusununBosOlmadiginiTestEder() {

    }
}

