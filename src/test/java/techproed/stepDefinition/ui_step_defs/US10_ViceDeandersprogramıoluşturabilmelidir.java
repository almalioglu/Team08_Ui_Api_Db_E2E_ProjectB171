
package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US10_ViceDeandersprogramıoluşturabilmelidir {
    HomePage page = new HomePage();
    Faker fake= new Faker();
    @Given("Kullanici {string} sayfasina git")
    public void kullaniciSayfasinaGit(String pageUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(pageUrl));
    }

    @Then("Login e tikla")
    public void loginETikla() {
        page.loginButton.click();
    }


    @Then("Dean olarak User name gir")
    public void deanOlarakUserNameGir() {
        page.loginUserName.sendKeys(ConfigReader.getProperty("deanUsename"));

    }

    @Then("Password u gir ve enter a tikla")
    public void passwordUGirVeEnterATikla() {
        page.loginPassword.sendKeys(ConfigReader.getProperty("deanPassword"));
        page.loginEkraniLoginButton.click();
    }

    @Then("Lesson Program a tikla")
    public void lessonProgramATikla() {
        page.lessonprogramButton.click();
    }

    @Then("Chose Lessons da ders sec")
    public void choseLessonsDaDersSec() {
        page.lessonddm2.click();
        ReusableMethods.bekle(2);
        page.lessonddm2.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        ReusableMethods.bekle(2);


    }

    @Then("Choose Education Term de donemi sec")
    public void chooseEducationTermDeDonemiSec() {
        page.chooseEducationddm.click();
        page.chooseEducationddm.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

        ReusableMethods.bekle(2);
    }

    @Then("Choose Day den gun sec")
    public void chooseDayDenGunSec() {
        page.chooseDayddm.click();
        page.chooseDayddm.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("Start Time dan baslangıc saatini sec")
    public void startTimeDanBaslangıcSaatiniSec() {
        Faker fake= new Faker();

        page.startTimeddm.sendKeys(fake.random().hex(10));
    }

    @Then("Stop Time dan bitis saatini sec")
    public void stopTimeDanBitisSaatiniSec() {
        page.stopTimeddm.sendKeys("2359");
        ReusableMethods.bekle(3);
    }

    @Then("Submit butonuna tikla")
    public void submitButonunaTikla() {
        page.submitbutton.click();
    }

    @Then("Created Lesson Program yazisini gor")
    public void createdLessonProgramYazisiniGor() {
    }

}
