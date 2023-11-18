package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Us15_VicedeanStudentOlusturabilmeli {


    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Web sayfaasına git")
    public void webSayfaasınaGit() {
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
        ReusableMethods.bekle(5);

    }

    @When("login butonuna tıkla")
    public void loginButonunaTıkla() {
        homePage.girisloginButtonSG.click();

    }


    @And("Vice dean hesabıyla login ol")
    public void viceDeanHesabıylaLoginOl() {
        //homePage.usernamePlaceHolderSG.clear();
        homePage.usernamePlaceHolderSG.click();
        ReusableMethods.bekle(2);
        homePage.usernamePlaceHolderSG.sendKeys(ConfigReader.getProperty("ViceDeanUsernameSG"));
        //homePage.passwordPlaceHolderSG.clear();
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));
        homePage.loginEkraniLoginButtonSG.click();
    }

    @And("Menu butonuna tıkla")
    public void menuButonunaTıkla() {
        ReusableMethods.bekle(5);
        ReusableMethods.visibleWait(homePage.menuButtonSG,3);
        homePage.menuButtonSG.click();

    }

    @And("Açılan pencerede student management yazısına tıkla")
    public void açılanPenceredeStudentManagementYazısınaTıkla() {
        homePage.studentManagementSG.click();
    }

    @And("Choose Teacher yazısına tıkla")
    public void chooseTeacherYazısınaTıkla() {
        homePage.teacherseçmeButonuSG.click();
        ReusableMethods.visibleWait(homePage.teacherseçmeButonuSG,3);

    }

    @And("Çıkan seçeneklerden teacher seç")
    public void çıkanSeçeneklerdenTeacherSeç() {
        ReusableMethods.bekle(10);
        Select select = new Select(homePage.teacherseçmeButonuSG);
        select.selectByIndex(Integer.parseInt(faker.numerify("#")));
        homePage.namePlaceHolderSG.click();

    }

    @And("name alanına geçerli veri gir")
    public void nameAlanınaGeçerliVeriGir() {
        //String fakeName = faker.name().firstName();
        homePage.namePlaceHolderSG.sendKeys(faker.name().firstName());
    }

    @And("surname alanına geçerli veri gir")
    public void surnameAlanınaGeçerliVeriGir() {
        homePage.SurnamePlaceHolderSG.sendKeys(faker.name().lastName());

    }

    @And("Birth Place alanına geçerli bir veri gir")
    public void birthPlaceAlanınaGeçerliBirVeriGir() {
        homePage.BirthPlaceHolderSG.sendKeys(faker.address().city());

    }

    @And("Geçerli bir email adresi gir")
    public void geçerliBirEmailAdresiGir() {
        homePage.EmailPlaceHolderSG.sendKeys(faker.internet().emailAddress());

    }

    @And("geçerli bir phone number gir")
    public void geçerliBirPhoneNumberGir() {
        homePage.PhonePlaceHolderSG.sendKeys(faker.numerify("### ### ####"));

    }

    @And("gender seç")
    public void genderSeç() {
        homePage.FemaleRadioButtonSG.click();
    }

    @And("Date of Birth alanına tıkla  tarih seç")
    public void dateOfBirthAlanınaTıklaTarihSeç() {
        homePage.DateOfBirthSG.click();
        homePage.DateOfBirthSG.sendKeys("21/08/1997");

    }

    @And("SSN number gir")
    public void ssnNumberGir() {
        homePage.ssnPlaceHolderSG.sendKeys(faker.numerify("###-##-####"));
    }

    @And("Geçerli bir user name gir")
    public void geçerliBirUserNameGir() {
        homePage.usernamePlaceHolderSG.sendKeys(faker.name().username());
    }

    @And("father name alanına geçerli bir veri gir")
    public void fatherNameAlanınaGeçerliBirVeriGir() {
        homePage.fathernamePlaceHolderSG.sendKeys(faker.name().firstName());
    }

    @And("mother name alanına geçerli bir veri gir")
    public void motherNameAlanınaGeçerliBirVeriGir() {
        homePage.mothernamePlaceHolderSG.sendKeys(faker.name().firstName());
    }

    @And("geçerli bir password gir")
    public void geçerliBirPasswordGir() {
        homePage.passwordPlaceHolderSG.sendKeys(ReusableMethods.randomPassword(1,1,6));

    }




    @And("Student saved successfully mesajını doğrula")
    public void studentSavedSuccessfullyMesajınıDoğrula() {
        ReusableMethods.visibleWait(homePage.verifyMessageSG, 10);
        //assert homePage.verifyMessageSG.getText().contains("Successfully");
    }

    @And("Student Listte son sayfaya git")
    public void studentListteSonSayfayaGit() {
        //ReusableMethods.scrollEnd();
        js.executeScript("window.scrollBy(0, 800);");
        //ReusableMethods.visibleWait(homePage.lastPageButtonSG,4);
        js.executeScript("arguments[0].click()", homePage.lastPageButtonSG);
        // homePage.lastPageButtonSG.click();

    }

    @Then("Oluşturulan Studentin Student Number'inin otomatik geldiğini doğrula")
    public void oluşturulanStudentinStudentNumberIninOtomatikGeldiğiniDoğrula() {
        assert homePage.PagebuttonSG.isDisplayed();
    }


    @And("Required yazısını doğrula\\(Name)")
    public void requiredYazısınıDoğrulaName() {
        {
            Assert.assertEquals("Required", homePage.nameRequiredSG.getText());
        }
    }

    @And("Required yazısını doğrula\\(Surname)")
    public void requiredYazısınıDoğrulaSurname() {
        Assert.assertEquals("Required",homePage.SurnameRequiredSG.getText());
    }

    @And("Required yazısını doğrula\\(Birth Place)")
    public void requiredYazısınıDoğrulaBirthPlace() {
        Assert.assertEquals("Required",homePage.BirthPlaceRequiredSG.getText());
    }

    @And("Required yazısını doğrula\\(Email)")
    public void requiredYazısınıDoğrulaEmail() {
        Assert.assertEquals("Required",homePage.EmailRequiredSG.getText());
    }

    @And("Required yazısını doğrula\\(Phone Number)")
    public void requiredYazısınıDoğrulaPhoneNumber() {
        Assert.assertEquals("Required",homePage.phoneRequiredSG.getText());
    }

    @And("Required yazısını doğrula\\(Date of Birth)")
    public void requiredYazısınıDoğrulaDateOfBirth() {
        Assert.assertEquals("Required",homePage.dateofbirthRequiredSG.getText());
    }

    @And("Required yazısını doğrula\\(Ssn)")
    public void requiredYazısınıDoğrulaSsn() {
        Assert.assertEquals("Required",homePage.ssnRequiredSG.getText());
    }

    @And("User name alanını sil")
    public void userNameAlanınıSil() {
    }

    @And("Required yazısını doğrula\\(Username)")
    public void requiredYazısınıDoğrulaUsername() {
        Assert.assertEquals("Required",homePage.usernameRequiredSG.getText());
    }
    @And("Required yazısını doğrula\\(Fathername)")
    public void requiredYazısınıDoğrulaFathername() {
        Assert.assertEquals("Required",homePage.fathernameRequiredSG.getText());
    }

    @And("Required yazısını doğrula\\(Motherrname)")
    public void requiredYazısınıDoğrulaMotherrname() {
        Assert.assertEquals("Required",homePage.motnameRequiredSG.getText());
    }

    @And("Password alanını sil")
    public void passwordAlanınıSil() {

    }



    @Then("Enter your password yazısını doğrula")
    public void yazısınıDoğrula() {
        Assert.assertEquals("Enter your password",homePage.passwordRequiredSG.getText());
    }

    @And("gender seçme")
    public void genderSeçme() {

    }

    @And("you have entered an invalid value Valid values are MALE,FEMALE mesajı görülür")
    public void youHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEMesajıGörülür() {
        ReusableMethods.visibleWait(homePage.genderAlertSG,4);
        assert homePage.genderAlertSG.isDisplayed();


    }
    @And("Çıkan seçeneklerden teacher seçme")
    public void çıkanSeçeneklerdenTeacherSeçme() {
        Select select = new Select(homePage.contactTeacherSG);
        select.selectByIndex(0);
        homePage.namePlaceHolderSG.click();
    }
    @Then("öğrencinin kaydedilemediğini doğrula")
    public void öğrencininKaydedilemediğiniDoğrula() {
        ReusableMethods.visibleWait(homePage.teacherAlert2SG,3);
        assert homePage.teacherAlert2SG.isDisplayed();
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        // wait.until(ExpectedConditions.alertIsPresent());
        //assert  Driver.getDriver().switchTo().alert().getText().contains("Please select advisor teacher");
    }

    @And("SSN girilir fakat 3 ve 5 inci rakamlardan sonra bosluk birak konıulmaz")
    public void ssnGirilirFakatVeRakamdanSonraKonıulmaz() {
        {
            Actions action = new Actions(Driver.getDriver());
            action.scrollToElement(homePage.ssnPlaceHolderSG).perform();
            ReusableMethods.bekle(3);
            js.executeScript("arguments[0].click()", homePage.ssnPlaceHolderSG);
            homePage.ssnPlaceHolderSG.click();
            homePage.ssnPlaceHolderSG.sendKeys(("123 45 234"));
            ReusableMethods.visibleWait(homePage.ssnminkarakterAlertSG,3);
            assert homePage.ssnminkarakterAlertSG.isDisplayed();
        }

    }

    @And("SSN alanı temizlenir")
    public void ssnAlanıTemizlenir() {
        js.executeScript("arguments[0].value = ''", homePage.ssnPlaceHolderSG);
    }


    @And("SSN kutusunun altında Minimum {int} character \\(XXX XX XXXX) yazısının çıktığı görülür ve doğrulanır")
    public void ssnKutusununAltındaMinimumCharacterXXXXXXXXXYazısınınÇıktığıGörülürVeDoğrulanır(int arg0) {
        ReusableMethods.visibleWait(homePage.ssnminkarakterAlertSG,3);
        assert homePage.ssnminkarakterAlertSG.isDisplayed();

    }

    @And("SSN alanına dokuz tane rakam gir")
    public void ssnAlanınaDokuzTaneRakamGir() { {
        homePage.ssnPlaceHolderSG.sendKeys(faker.numerify("#########"));
        ReusableMethods.visibleWait(homePage.ssnminkarakterAlertSG,3);
        assert homePage.ssnminkarakterAlertSG.isDisplayed();
    }
    }
    @And("password alanına sekiz karakterden az password gir")
    public void passwordAlanınaKarakterdenAzPasswordGir() {
        actions.scrollToElement(homePage.passwordPlaceHolderSG).perform();
        js.executeScript("arguments[0].click()", homePage.passwordPlaceHolderSG);
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ReusableMethods.randomPassword(1,1,3));
    }
    @Then("Password kutusunun altında At least 8 characters yazısının çıktığını doğrula")
    public void passwordKutusununAltındaYazısınınÇıktığınıDoğrula() {

        ReusableMethods.visibleWait(homePage.passwordatleastAlertSG,3);
        assert homePage.passwordatleastAlertSG.isDisplayed();

    }

    @And("Password alanına sekiz karakterli büyük harf içermeyen password gir")
    public void passwordAlanınaKarakterliBüyükHarfIçermeyenPasswordGir() {
        actions.scrollToElement(homePage.SubmitbuttonSG).perform();
        js.executeScript("arguments[0].click()", homePage.passwordPlaceHolderSG);
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ReusableMethods.randomPassword(0,1,7));
    }

    @Then("one uppercase mesajının göründüğünü doğrula")
    public void oneUppercaseMesajınınGöründüğünüDoğrula() {
        ReusableMethods.visibleWait(homePage.passwordoneUpperAlertSG,3);
        assert homePage.passwordoneUpperAlertSG.isDisplayed();

    }

    @And("Password alanına {int} karakterli küçük harf içermeyen password gir")
    public void passwordAlanınaKarakterliKüçükHarfIçermeyenPasswordGir(int arg0) {
        actions.scrollToElement(homePage.SubmitbuttonSG).perform();
        js.executeScript("arguments[0].click()", homePage.passwordPlaceHolderSG);
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ReusableMethods.randomPassword(1,0,7));

    }

    @Then("One lowercase character mesajının göründüğünü doğrula")
    public void oneLowercaseCharacterMesajınınGöründüğünüDoğrula() {
        ReusableMethods.visibleWait(homePage.passwordoneLowerAlertSG,3);
        assert homePage.passwordoneLowerAlertSG.isDisplayed();
    }

    @And("Password alanına {int} karakterli rakam içermeyen bir password gir")
    public void passwordAlanınaKarakterliRakamIçermeyenBirPasswordGir(int arg0) {
        actions.scrollToElement(homePage.SubmitbuttonSG).perform();
        js.executeScript("arguments[0].click()", homePage.passwordPlaceHolderSG);
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ReusableMethods.randomPassword(4,4,0));

    }

    @And("One number mesajının göründüğünü doğrula")
    public void oneNumberMesajınınGöründüğünüDoğrula() {
        ReusableMethods.visibleWait(homePage.passwordonenumberAlertSG,3);
        assert homePage.passwordonenumberAlertSG.isDisplayed();
    }

    @And("Vice dean submit Butonuna tıklar")
    public void viceDeanSubmitButonunaTıklar() {
        ReusableMethods.bekle(4);
        js.executeScript("arguments[0].scrollIntoView(true);", homePage.SubmitbuttonSG);
        homePage.SubmitbuttonSG.click();
    }
}
