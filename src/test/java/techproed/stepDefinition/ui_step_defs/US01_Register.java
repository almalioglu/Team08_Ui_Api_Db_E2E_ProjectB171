package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
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
       homePage.registerNameText.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(), Keys.TAB, faker.address().city(), Keys.TAB,
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

    @And("kullanici {string} {string} {string} {string} {string} {string} {string} {string} {string} bilgilerini doldurur")
    public void kullaniciBilgileriniDoldurur(String name, String surname, String birthPlace, String phone, String gender, String dateOfBirth, String ssn, String userName, String password) {

        homePage.nameButonEB.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace, Keys.TAB, phone, Keys.PAGE_DOWN);
        ReusableMethods.click(homePage.maleGenderEB);
        homePage.dateofBirthdayButonEB.sendKeys(dateOfBirth, Keys.TAB, ssn, Keys.TAB, userName, Keys.TAB, password);
    }

    @Then("kullanici name bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciNameBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredNameEB.isDisplayed());
    }

    @Then("kullanici surname bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciSurnameBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredSurameEB.isDisplayed());

    }

    @Then("kullanici birth place bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciBirthPlaceBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredBirthPlaceEB.isDisplayed());
    }

    @Then("kullanici date of birth bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciDateOfBirthBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredDateOfBirthEB.isDisplayed());

    }

    @Then("kullanici phone bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciPhoneBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredPhoneEB.isDisplayed());
    }

    @Then("kullanici ssn bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciSsnBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredSsnEB.isDisplayed());
    }

    @Then("kullanici user name bos birakildiginde Required uyari yazisi geldigini dogrular")
    public void kullaniciUserNameBosBirakildigindeRequiredUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.getRequiredUserNameEB.isDisplayed());
    }

    @Then("kullanici password bos birakildiginde Enter your password uyari yazisi geldigini dogrular")
    public void kullaniciPasswordBosBirakildigindeEnterYourPasswordUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.enterYourPasswordEB.isDisplayed());
    }



    @Then("kullanici Ssn hatali girilince Minimum onbir character (XXX-XX-XXXX) uyari yazisi geldigini dogrular")
    public void kullaniciSsnHataliGirilinceMinimumOnbirCharacterXXXXXXXXXUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.minimum11characterEB.isDisplayed());
    }

    @And("Kullanici {string} {string} {string} {string} {string} {string} {string} {string} {string} bilgileri girer")
    public void kullaniciBilgileriGirer(String name, String Surname, String BirthPlace, String Phone, String Gender, String Date_Of_Birth , String Ssn, String UserName, String Password ) {
        homePage.registerNameText.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(), Keys.TAB, faker.country().name(), Keys.TAB,
                faker.phoneNumber().cellPhone(), Keys.TAB, Keys.SPACE, Keys.TAB, Date_Of_Birth, Keys.TAB, Ssn, Keys.TAB, faker.name().firstName(), Keys.TAB, Password, Keys.TAB);


    }

    @Then("kullanici kucuk harf icermeyen password girince One lowercase character uyari yazisi geldigini dogrular")
    public void kullaniciKucukHarfIcermeyenPasswordGirinceOneLowercaseCharacterUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.lowercaseCharacterYazisiEB.isDisplayed());
    }

    @Then("kullanici rakam icermeyen password girince One number uyari yazisi geldigini dogrular")
    public void kullaniciRakamIcermeyenPasswordGirinceOneNumberUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.OneNumberYazisiEB.isDisplayed());
    }

    @Then("kullanici buyuk harf, kucuk harf ve rakam iceren yedi karakterli password girince At least sekiz characters uyari yazisi geldigini dogrular")
    public void kullaniciBuyukHarfKucukHarfVeRakamIcerenYediKarakterliPasswordGirinceAtLeastSekizCharactersUyariYazisiGeldiginiDogrular() {
        assertTrue(homePage.passwordSekizcharactersUyarisiEB.isDisplayed());
    }
}





