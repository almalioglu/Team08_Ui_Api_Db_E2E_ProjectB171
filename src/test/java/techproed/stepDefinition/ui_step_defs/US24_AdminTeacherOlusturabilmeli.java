package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US24_AdminTeacherOlusturabilmeli {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @When("username kutusuna admin olarak kayitli username girer")
    public void username_kutusuna_admin_olarak_kayitli_username_girer() {
        homePage.loginUsernameButtonBI.sendKeys(ConfigReader.getProperty("adminUsername"));
        ReusableMethods.bekle(1);

    }

    @When("password kutusuna admin olarak kayitli password girer ve login olur")
    public void password_kutusuna_admin_olarak_kayitli_password_girer_ve_login_olur() {
        homePage.loginPasswordButtonBI.sendKeys(ConfigReader.getProperty("Password"));
        homePage.loginSubmitButtonBI.click();
        ReusableMethods.bekle(2);

    }

    @When("admin select Lesson sekmesine tiklar ve bir ders secer")
    public void admin_select_lesson_sekmesine_tiklar_ve_bir_ders_secer() {
        //homePage.addSelectLessonDdmBI.click();
        //String lesson="Java";
        //homePage.addSelectLessonDdmBI.sendKeys(lesson,Keys.ENTER);
        //ReusableMethods.bekle(1);
        // Locate click
        // Locate send keys “Java” keys.up keys.enter
        //homePage.adminChooseLessonDdmBI.click();
        String lesson="Java";
        homePage.adminChooseLessonDdmBI.sendKeys(lesson, Keys.TAB,Keys.TAB);
        ReusableMethods.bekle(2);
    }
}
