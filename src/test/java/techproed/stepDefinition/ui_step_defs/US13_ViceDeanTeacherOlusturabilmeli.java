package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US13_ViceDeanTeacherOlusturabilmeli {

    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("web sitesine gider")
    public void web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
        ReusableMethods.bekle(3);
    }
    @When("login sekmesine tiklar")
    public void login_sekmesine_tiklar() {
       homePage.loginButtonBI.click();
        ReusableMethods.bekle(3);
    }
    @And("username kutusuna kayitli username girer")
    public void username_kutusuna_kayitli_username_girer() {
       homePage.loginUsernameButtonBI.sendKeys(ConfigReader.getProperty("ViceDeanUserNameBI"));
        ReusableMethods.bekle(1);
    }
    @And("password kutusuna kayitli password girer ve login olur")
    public void password_kutusuna_kayitli_password_girer() {
       homePage.loginPasswordButtonBI.sendKeys(ConfigReader.getProperty("ViceDeanPasswordBI"));
       homePage.loginSubmitButtonBI.click();
        ReusableMethods.bekle(2);
    }
    @When("menu sekmesine tiklar")
    public void menu_sekmesine_tiklar() {
        homePage.menuButtonBI.click();
        ReusableMethods.bekle(1);
    }
    @And("soldaki menuden Teacher Management sekmesine tiklar")
    public void soldaki_menuden_teacher_management_sekmesine_tiklar() {
        homePage.teacherManagementButtonBI.click();
        ReusableMethods.bekle(1);
    }
    @Then("Add Teacher basligini gorur")
    public void add_teacher_basligini_gorur() {
        String addTeacherTitle= homePage.addTeacherTitleBI.getText();
        Assert.assertEquals("Add Teacher",addTeacherTitle);
    }

    @When("select Lesson sekmesine tiklar ve bir ders secer")
    public void select_lesson_sekmesine_tiklar_ve_bir_ders_secer() {
        homePage.addSelectLessonDdmBI.click();
        String lesson="Java";
        homePage.addSelectLessonDdmBI.sendKeys(lesson,Keys.ENTER);
        ReusableMethods.bekle(1);
    }
    @And("name kutusuna veri girer")
    public void name_kutusuna_veri_girer() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(4);
        homePage.addNameBoxBI.click();
        homePage.addNameBoxBI.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(1);
    }
    @And("Surname kutusuna veri girer")
    public void surname_kutusuna_veri_girer() {
        homePage.addSurnameBoxBI.click();
        homePage.addSurnameBoxBI.sendKeys(faker.name().lastName());
        ReusableMethods.bekle(1);

    }
    @And("Birth Place kutusuna veri girer")
    public void birth_place_kutusuna_veri_girer() {
        homePage.addBirthPlaceBoxBI.click();
        homePage.addBirthPlaceBoxBI.sendKeys(faker.address().city());
        ReusableMethods.bekle(1);
    }
    @And("Email kutusuna veri girer")
    public void email_kutusuna_veri_girer() {
        homePage.addEmailBoxBI.sendKeys(faker.internet().emailAddress());
        ReusableMethods.bekle(1);
    }
    @And("Phone kutusuna veri girer")
    public void phone_kutusuna_veri_girer() {
        homePage.addPhoneBoxBI.sendKeys(faker.numerify("###-###-####"));
        ReusableMethods.bekle(1);
    }
    @And("Is Advisor Teacher basliginin solundaki checkbox tiklar")
    public void is_advisor_teacher_basliginin_solundaki_checkbox_tiklar() {
        homePage.addAdvisorTeacherCheckBoxBI.click();
        ReusableMethods.bekle(1);
    }
    @And("Gender basliginin altindaki radio buttondan cinsiyet secer")
    public void gender_basliginin_altindaki_radio_buttondan_cinsiyet_secer() {
        if (!homePage.addGenderFemaleRadioButtonBI.isSelected()) {
            homePage.addGenderFemaleRadioButtonBI.click();
        }else {
            homePage.addGenderMaleRadioButtonBI.click();
        }
        ReusableMethods.bekle(1);
    }
    @And("Date of Birth kutusuna veri girer")
    public void date_of_birth_kutusuna_veri_girer() {
        String birthday = "01.01.1995";
        homePage.addDateOfBirthBoxBI.sendKeys(birthday,Keys.ENTER);
        ReusableMethods.bekle(1);
    }
    @And("SSN kutusuna veri girer")
    public void ssn_kutusuna_veri_girer() {
        homePage.addSsnBoxBI.click();
        homePage.addSsnBoxBI.sendKeys(faker.numerify("###-##-####"));
        ReusableMethods.bekle(1);
    }
    @And("User Name kutusuna veri girer")
    public void user_name_kutusuna_veri_girer() {
        homePage.addUsernameBoxBI.click();
        homePage.addUsernameBoxBI.sendKeys(faker.name().username());
        ReusableMethods.bekle(1);
    }
    @And("Password kutusuna password girer")
    public void password_kutusuna_password_girer() {
        homePage.addPasswordBoxBI.click();
        homePage.addPasswordBoxBI.sendKeys(ReusableMethods.randomPassword(1,1,6));
        ReusableMethods.bekle(1);
    }
    @And("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
    }
    @Then("{string} yazisinin ciktigini dogrular")
    public void yazisinin_ciktigini_dogrula(String string) {
        String addTeacherAlertText= homePage.addTeacherSuccessfulTextBI.getText();
        Assert.assertEquals(addTeacherAlertText,"Teacher saved successfully");
    }

    @And("web sayfasini kapatir")
    public void web_sayfasini_kapatir() {
        Driver.closeDriver();
    }

        @Then("Choose Lessons başlık altındaki Select Lesson sekmesine tıklanmadığını doğrula")
    public void choose_lessons_baslik_altindaki_select_lesson_sekmesine_tiklanmadigini_dogrula() {
        Assert.assertFalse(homePage.addSelectLessonDdmBI.isSelected());
    }

    @Then("{string} yazisin ciktigini dogrular")
    public void yazisin_ciktigini_dogrular(String string) {
        Assert.assertTrue(homePage.noChoiceLessonAlertTextBI.isDisplayed());
    }

    @Then("Name kutusunun boş olduğunu doğrular")
    public void name_kutusunun_boş_olduğunu_doğrula() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addNameBoxBI.click();
        Assert.assertTrue(homePage.addNameBoxBI.getText().isEmpty());
    }

    @Then("Name kutusunun altında {string} yazısının çıktığını doğrular")
    public void name_kutusunun_altinda_yazisinin_ciktigini_dogrula(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertNameText= homePage.requiredNameAlertTextBI.getText();
        Assert.assertEquals("Required", alertNameText);
    }

    @Then("Surname kutusunun boş olduğunu doğrular")
    public void surname_kutusunun_bos_oldugunu_dogrula() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addSurnameBoxBI.click();
        Assert.assertTrue(homePage.addSurnameBoxBI.getText().isEmpty());
    }
    @Then("Surname kutusunun altında {string} yazısının çıktığını doğrular")
    public void surname_kutusunun_altinda_yazisinin_ciktigini_dogrula(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertSurnameText= homePage.requiredSurnameAlertTextBI.getText();
        Assert.assertEquals("Required", alertSurnameText);

    }

    @Then("Birth Place kutusunun boş olduğunu doğrular")
    public void birth_place_kutusunun_bos_oldugunu_dogrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addBirthPlaceBoxBI.click();
        Assert.assertTrue(homePage.addBirthPlaceBoxBI.getText().isEmpty());
    }
    @Then("Birth Place kutusunun altında {string} yazısının çıktığını doğrular")
    public void birth_place_kutusunun_altinda_yazisinin_ciktigini_dogrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertBirthPlaceText = homePage.requiredBirthPlaceAlertTextBI.getText();
        Assert.assertEquals("Required", alertBirthPlaceText);
    }

    @Then("Email kutusunun boş olduğunu doğrular")
    public void email_kutusunun_bos_oldugunu_dogrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addEmailBoxBI.click();
        Assert.assertTrue(homePage.addEmailBoxBI.getText().isEmpty());

    }
    @Then("Email kutusunun altında {string} yazısının çıktığını doğrular")
    public void email_kutusunun_altinda_yazisinin_ciktigini_dogrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertEmailText = homePage.requiredEmailAlertTextBI.getText();
        Assert.assertEquals("Required", alertEmailText);
    }

    @Then("Phone kutusunun boş olduğunu doğrular")
    public void phone_kutusunun_boş_olduğunu_doğrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addPhoneBoxBI.click();
        Assert.assertTrue(homePage.addPhoneBoxBI.getText().isEmpty());
    }
    @Then("Phone kutusunun altında {string} yazısının çıktığını doğrular")
    public void phone_kutusunun_altında_yazısının_çıktığını_doğrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertPhoneText = homePage.requiredPhoneAlertTextBI.getText();
        Assert.assertEquals("Required", alertPhoneText);
    }

    @Then("Gender kutusunun boş olduğunu doğrular")
    public void gender_kutusunun_boş_olduğunu_doğrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(2);
        homePage.addNameBoxBI.sendKeys(faker.name().firstName(),Keys.TAB,faker.name().lastName(),Keys.TAB,faker.address().city(),Keys.TAB,faker.internet().emailAddress(),Keys.TAB,"324-258-6953",Keys.TAB,Keys.TAB,Keys.TAB,"01.01.1995",Keys.TAB,"354-25-6987",Keys.TAB,faker.name().username(),Keys.TAB,"Aa1234567",Keys.TAB,Keys.ENTER);
        Assert.assertFalse(homePage.addGenderMaleRadioButtonBI.isSelected());
        Assert.assertFalse(homePage.addGenderFemaleRadioButtonBI.isSelected());
    }
    @Then("{string} yazısının çıktığını doğrular")
    public void yazısının_çıktığını_doğrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertGenderText = homePage.requiredGenderAlertTextBI.getText();
        Assert.assertEquals("You have entered an invalid value. Valid values are: MALE, FEMALE", alertGenderText);
    }

    @Then("Date Of Birth kutusunun boş olduğunu doğrular")
    public void date_of_birth_kutusunun_boş_olduğunu_doğrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addNameBoxBI.sendKeys(faker.name().firstName(),Keys.TAB,faker.name().lastName(),Keys.TAB,faker.address().city(),Keys.TAB,faker.internet().emailAddress(),Keys.TAB,"324-258-6953",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"354-25-6987",Keys.TAB,faker.name().username(),Keys.TAB,"Aa1234567",Keys.TAB,Keys.ENTER);
        Assert.assertTrue(homePage.requiredDateOfBirthAlertTextBI.isDisplayed());
    }
    @Then("Date Of Birth kutusunun altında {string} yazısının çıktığını doğrular")
    public void date_of_birth_kutusunun_altında_yazısının_çıktığını_doğrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertDateOfBirthText = homePage.requiredDateOfBirthAlertTextBI.getText();
        Assert.assertEquals("Required", alertDateOfBirthText);
    }

    @Then("SSN kutusunun boş olduğunu doğrular")
    public void ssn_kutusunun_boş_olduğunu_doğrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addSsnBoxBI.click();
        Assert.assertTrue(homePage.addSsnBoxBI.getText().isEmpty());
    }
    @Then("SSN kutusunun altında {string} yazısının çıktığını doğrular")
    public void ssn_kutusunun_altında_yazısının_çıktığını_doğrular(String string) {
        homePage.requiredSsnAlertTextBI.click();
        ReusableMethods.bekle(1);
        String alertSsnText = homePage.requiredSsnAlertTextBI.getText();
        Assert.assertEquals("Required", alertSsnText);
    }

    @Then("SSN kutusuna {int} tane rakam girer")
    public void ssn_kutusuna_tane_rakam_girer(Integer int1) {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addSsnBoxBI.click();
        homePage.addSsnBoxBI.sendKeys(faker.number().digits(9));

    }
    @Then("SSN kutusunun altında {string} yazısının çıktığını doğrula")
    public void ssn_kutusunun_altında_yazısının_çıktığını_doğrula(String string) {
        String alertSsnText1 = homePage.requiredSsnAlertTextBI.getText();
        Assert.assertEquals("Minimum 11 character (XXX-XX-XXXX)", alertSsnText1);
    }

    @Then("Username kutusunun boş olduğunu doğrular")
    public void username_kutusunun_boş_olduğunu_doğrular() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addUsernameBoxBI.click();
        Assert.assertTrue(homePage.addUsernameBoxBI.getText().isEmpty());
    }
    @Then("Username kutusunun altında {string} yazısının çıktığını doğrular")
    public void username_kutusunun_altında_yazısının_çıktığını_doğrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertUserNameText = homePage.requiredUsernameAlertTextBI.getText();
        Assert.assertEquals("Required", alertUserNameText);
    }

    @Then("Password kutusuna 8den az sayıda adet karakter girer")
    public void password_kutusuna_8den_az_sayıda_adet_karakter_girer() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addPasswordBoxBI.click();
        homePage.addPasswordBoxBI.sendKeys(faker.number().digits(5));
    }
    @Then("Password kutusunun altında {string} yazısının çıktığını doğrular")
    public void password_kutusunun_altında_yazısının_çıktığını_doğrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertPassword8CharText = homePage.requiredPasswordAlertTextBI.getText();
        Assert.assertEquals("At least 8 characters", alertPassword8CharText);

    }

    @Then("Password kutusuna {int} tane rakam gir")
    public void password_kutusuna_tane_rakam_gir(Integer int1) {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addPasswordBoxBI.click();
        homePage.addPasswordBoxBI.sendKeys(faker.number().digits(8));
    }
    @Then("Password kutusunun altında {string} yazısının çıktığını doğrula")
    public void password_kutusunun_altında_yazısının_çıktığını_doğrula(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertPasswordLowerText = homePage.requiredPasswordAlertTextBI.getText();
        Assert.assertEquals("One lowercase character", alertPasswordLowerText);

    }

    @Then("Password kutusuna {int} küçük harf ve {int} tane rakam girer")
    public void password_kutusuna_küçük_harf_ve_tane_rakam_girer(Integer int1, Integer int2) {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(1);
        homePage.addPasswordBoxBI.click();
        homePage.addPasswordBoxBI.sendKeys(faker.number().digits(8), "a");
    }
    @Then("Password kutusunun altinda {string} yazisinin ciktigini dogrular")
    public void password_kutusunun_altinda_yazisinin_ciktigini_dogrular(String string) {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
        String alertPasswordUpperText = homePage.requiredPasswordAlertTextBI.getText();
        Assert.assertEquals("One uppercase character", alertPasswordUpperText);


    }











}

