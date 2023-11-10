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
        homePage.loginUserName.sendKeys(ConfigReader.getProperty("deanUsername_aeo"), Keys.TAB, ConfigReader.getProperty("deanPassword_aeo"), Keys.TAB, Keys.ENTER);
    }

    @Given("Kullanici anasayfaya gider.")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));

    }

    @Then("Kullanici Dean hesabi ile Sing in yapar.")
    public void kullanici_dean_hesabi_ile_sing_in_yapar() {
        ReusableMethods.bekle(2);
        homePage.loginButton.click();
        homePage.loginUserName.clear();
        homePage.loginUserName.sendKeys(ConfigReader.getProperty("deanUsername_aeo"));
        homePage.loginPassword.clear();
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("deanPassword_aeo"));
        homePage.loginEkraniLoginButton.click();
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
        assertFalse(homePage.requiredPhoneNumber_aeo.isDisplayed());

    }

    @Then("Kullanici {string} kutusuna gecerli bir SSN girer.")
    public void kullaniciKutusunaGecerliBirSSNGirer(String ssn) {
        fakeSsn = faker.idNumber().ssnValid();
        homePage.viceDeanSsnNo_aeo.sendKeys(fakeSsn);

    }

    @And("Kullanici Ssn kutusunun bos olmadigini test eder.")
    public void kullaniciSsnKutusununBosOlmadiginiTestEder() {
        assertFalse(homePage.requiredSsn_aeo.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna gecerli bir User Name girer.")
    public void kullaniciKutusunaGecerliBirUserNameGirer(String username) {
        fakeUsername = faker.name().username();
        homePage.viceDeanUsername_aeo.sendKeys(fakeUsername);
    }

    @And("Kullanici User Name kutusunun bos olmadigini test eder.")
    public void kullaniciUserNameKutusununBosOlmadiginiTestEder() {
        assertFalse(homePage.requiredUsername_aeo.isDisplayed());
    }

    @And("Kullanici Password kutusunun bos olmadigini test eder.")
    public void kullaniciPasswordKutusununBosOlmadiginiTestEder() {
        assertFalse(homePage.passwordGirUyarisi.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici Submit butonunu tiklar.")
    public void kullaniciSubmitButonunuTiklar() {
        homePage.viceDeanSubmitButton_aeo.click();
    }

    @And("Kullanici basarili bir sekilde Vice Dean ekledigini dogrular.")
    public void kullaniciBasariliBirSekildeViceDeanEklediginiDogrular() {
        assertTrue(homePage.viceDeanSavedUyarisi.isDisplayed());
    }


    @And("Kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular.")
    public void kullaniciPleaseEnterValidSSNNumberAlertUyarisiGoruldugunuDogrular() {
        ReusableMethods.visibleWait(homePage.ssnDogruDegilUyarisi, 3);
        assertTrue(homePage.ssnDogruDegilUyarisi.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @And("Kullanici Ssn kutusunu siler.")
    public void kullaniciSsnKutusunuSiler() {
        ReusableMethods.cleanByJs(homePage.viceDeanSsnNo_aeo);
    }

    @And("Kullanici eksik karakter girdigini dorular.")
    public void kullaniciEksikKarakterGirdiginiDorular() {
        assertTrue(homePage.ssn11KarakterEksikUyarisi.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna sekiz karakterden kucuk bir sifre girer.")
    public void kullaniciKutusunaSekizKarakterdenKucukBirSifreGirer(String pass) {
        homePage.viceDeanPassword_aeo.sendKeys(pass);
    }

    @And("Kullanici password icin eksik karakter girdigini dogrular.")
    public void kullaniciPasswordIcinEksikKarakterGirdiginiDogrular() {
        assertTrue(homePage.password8KarakterEksikUyarisi.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna Büyük harf kullanmadan sifre girer.")
    public void kullaniciKutusunaBüyükHarfKullanmadanSifreGirer(String pass) {
        homePage.viceDeanPassword_aeo.sendKeys(pass);
    }

    @And("Kullanici One uppercase character yazisini gordugunu dogrular.")
    public void kullaniciOneUppercaseCharacterYazisiniGordugunuDogrular() {
        assertTrue(homePage.passwordBuyukHarfEksikUyarisi.isDisplayed());

    }

    @And("Kullanici Password kutusun siler.")
    public void kullaniciPasswordKutusunSiler() {
        ReusableMethods.cleanByJs(homePage.viceDeanPassword_aeo);
    }


    @Then("Kullanici {string} kutusuna Kücük harf kullanmadan sifre girer.")
    public void kullaniciKutusunaKücükHarfKullanmadanSifreGirer(String pass1) {
        homePage.viceDeanPassword_aeo.sendKeys(pass1);
    }

    @And("Kullanici One lowercase character yazisini gordugunu dogrular.")
    public void kullaniciOneLowercaseCharacterYazisiniGordugunuDogrular() {
        assertTrue(homePage.passwordKucukHarfEksikUyarisi.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna rakam kullanmadan sifre girer.")
    public void kullaniciKutusunaRakamKullanmadanSifreGirer(String pass2) {
        homePage.viceDeanPassword_aeo.sendKeys(pass2);
    }

    @And("Kullanici One number yazisini gordugunu dogrular.")
    public void kullaniciOneNumberYazisiniGordugunuDogrular() {
        assertTrue(homePage.passwordRakamEksikUyarisi.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna büyük harf, kücük harf ve rakam iceren  en az sekiz karakterli bir sifreyi girer.")
    public void kullaniciKutusunaBüyükHarfKücükHarfVeRakamIcerenEnAzSekizKarakterliBirSifreyiGirer(String password) {
        homePage.viceDeanPassword_aeo.sendKeys(password);

    }

    @Then("Kullanici {string}girilmelidir.")
    public void kullaniciGirilmelidir(String SSN) {
        homePage.viceDeanSsnNo_aeo.sendKeys(SSN);
    }

    @Then("Kullanici {string} kutusuna -dokuz- karakterden fazla  bir SSN girer.")
    public void kullaniciKutusunaDokuzKarakterdenFazlaBirSSNGirer(String ssn1) {
        homePage.viceDeanSsnNo_aeo.sendKeys(ssn1);
    }

    @Then("Kullanici {string} kutusuna -dokuz- karakterden az bir SSN girer.")
    public void kullaniciKutusunaDokuzKarakterdenAzBirSSNGirer(String ssn2) {
        homePage.viceDeanSsnNo_aeo.sendKeys(ssn2);

    }


}





