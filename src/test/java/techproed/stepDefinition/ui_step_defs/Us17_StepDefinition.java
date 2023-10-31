package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;

public class Us17_StepDefinition {
    HomePage page = new HomePage();

    @Then("Teacher adina login yap")
    public void teacherAdinaLoginYap() {
        page.loginButton.click();
        page.loginUserName.sendKeys(ConfigReader.getProperty("usernameTeacher"));
        page.loginPassword.sendKeys(ConfigReader.getProperty("passwordTeacher"));
        page.loginEkraniLoginButton.click();
    }
}
