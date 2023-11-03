package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
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
    @When("username kutusuna kayitli username girer")
    public void username_kutusuna_kayitli_username_girer() {
       homePage.loginUsernameButtonBI.sendKeys(ConfigReader.getProperty("ViceDeanUserNameBI"));
        ReusableMethods.bekle(1);
    }
    @When("password kutusuna kayitli password girer ve login olur")
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
    @When("soldaki menuden Teacher Management sekmesine tiklar")
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
    @When("name kutusuna veri girer")
    public void name_kutusuna_veri_girer() {
        actions.scrollByAmount(0,200).perform();
        ReusableMethods.bekle(4);
        homePage.addNameBoxBI.click();
        homePage.addNameBoxBI.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(1);
    }
    @When("Surname kutusuna veri girer")
    public void surname_kutusuna_veri_girer() {
        homePage.addSurnameBoxBI.click();
        homePage.addSurnameBoxBI.sendKeys(faker.name().lastName());
        ReusableMethods.bekle(1);

    }
    @When("Birth Place kutusuna veri girer")
    public void birth_place_kutusuna_veri_girer() {
        homePage.addBirthPlaceBoxBI.click();
        homePage.addBirthPlaceBoxBI.sendKeys(faker.address().city());
        ReusableMethods.bekle(1);
    }
    @When("Email kutusuna veri girer")
    public void email_kutusuna_veri_girer() {
        homePage.addEmailBoxBI.sendKeys(faker.internet().emailAddress());
        ReusableMethods.bekle(1);
    }
    @When("Phone kutusuna veri girer")
    public void phone_kutusuna_veri_girer() {
        homePage.addPhoneBoxBI.sendKeys(faker.numerify("###-###-####"));
        ReusableMethods.bekle(1);
    }
    @When("Is Advisor Teacher basliginin solundaki checkbox tiklar")
    public void is_advisor_teacher_basliginin_solundaki_checkbox_tiklar() {
        homePage.addAdvisorTeacherCheckBoxBI.click();
        ReusableMethods.bekle(1);
    }
    @When("Gender basliginin altindaki radio buttondan cinsiyet secer")
    public void gender_basliginin_altindaki_radio_buttondan_cinsiyet_secer() {
        if (!homePage.addGenderFemaleRadioButtonBI.isSelected()) {
            homePage.addGenderFemaleRadioButtonBI.click();
        }else {
            homePage.addGenderMaleRadioButtonBI.click();
        }
        ReusableMethods.bekle(1);
    }
    @When("Date of Birth kutusuna veri girer")
    public void date_of_birth_kutusuna_veri_girer() {
        String birthday = "01.01.1995";
        homePage.addDateOfBirthBoxBI.sendKeys(birthday,Keys.ENTER);
        ReusableMethods.bekle(1);
    }
    @When("SSN kutusuna veri girer")
    public void ssn_kutusuna_veri_girer() {
        homePage.addSsnBoxBI.click();
        homePage.addSsnBoxBI.sendKeys(faker.numerify("###-##-####"));
        ReusableMethods.bekle(1);
    }
    @When("User Name kutusuna veri girer")
    public void user_name_kutusuna_veri_girer() {
        homePage.addUsernameBoxBI.click();
        homePage.addUsernameBoxBI.sendKeys(faker.name().username());
        ReusableMethods.bekle(1);
    }
    @When("Password kutusuna password girer")
    public void password_kutusuna_password_girer() {
        homePage.addPasswordBoxBI.click();
        homePage.addPasswordBoxBI.sendKeys(ReusableMethods.randomPassword(1,1,6));
        ReusableMethods.bekle(1);
    }
    @When("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
        homePage.addSubmitBoxBI.click();
        ReusableMethods.bekle(1);
    }
    @When("Teacher saved successfully. yazisinin ciktigini dogrula")
    public void yazisinin_ciktigini_dogrula(String string) {
        String addTeacherAlertText= homePage.addTeacherSuccessfulTextBI.getText();
        Assert.assertEquals(addTeacherAlertText,"Teacher saved successfully.");

    }



}

