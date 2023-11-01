package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Us17_StepDefinition {
    HomePage page = new HomePage();

    @Then("Teacher adina login yap")
    public void teacherAdinaLoginYap() {
        page.loginButton.click();
        page.loginUserName.sendKeys(ConfigReader.getProperty("usernameTeacher"));
        page.loginPassword.sendKeys(ConfigReader.getProperty("passwordTeacher"));
        page.loginEkraniLoginButton.click();
    }

    @And("Choose Lesson menusunden ders sec")
    public void chooseLessonMenusundenDersSec() {
        //page.chooseLessonBox_is.c
    }

    @And("Dean kullanici bilgileri ile sisteme giris yapar")
    public void deanKullaniciBilgileriIleSistemeGirisYapar() {
    }
}
//Assert.assertTrue(allovercommercePage.emailOtomatik.isDisplayed());