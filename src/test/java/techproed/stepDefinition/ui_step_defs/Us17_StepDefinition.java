package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;

public class Us17_StepDefinition {
    HomePage page = new HomePage();

    @Then("Teacher olarak login yap")
    public void teacherOlarakLoginYap() {
        page.loginButton.click();
        page.loginUserName.sendKeys(ConfigReader.getProperty("usernameTeacher"));
        page.loginPassword.sendKeys(ConfigReader.getProperty("passwordTeacher"));
        page.loginEkraniLoginButton.click();
    }


    @And("Student Info Management sayfasinda oldugunu dogrula")
    public void studentInfoManagementSayfasindaOldugunuDogrula() {
        Assert.assertEquals("Student Info Management", page.studentInfoManagment_is.getText());
    }

    @Then("Teacher ogrenci not bilgilerini doldurur_is")
    public void teacherOgrenciNotBilgileriniDoldurur_is() {

    }

    @And("Ogrenciye not verilebildigi dogrulanir_is")
    public void ogrenciyeNotVerilebildigiDogrulanir_is() {

    }

    @And("sayfa kapatilir_is")
    public void sayfaKapatilir_is() {
    }

}
//Assert.assertTrue(allovercommercePage.emailOtomatik.isDisplayed());