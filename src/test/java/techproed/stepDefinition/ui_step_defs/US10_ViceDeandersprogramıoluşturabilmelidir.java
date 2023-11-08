
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
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
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
        page.lessonddm2.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        ReusableMethods.bekle(2);


    }

    @Then("Choose Education Term de donemi sec")
    public void chooseEducationTermDeDonemiSec() {
        page.chooseEducationddm.click();
        page.chooseEducationddm.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Choose Day den gun sec")
    public void chooseDayDenGunSec() {
        page.chooseDayddm.click();
        page.chooseDayddm.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @Then("Start Time dan baslangıc saatini sec")
    public void startTimeDanBaslangicSaatiniSec() {
        Faker fake= new Faker();

        page.startTimeddm.sendKeys(fake.random().hex(10));
    }

    @Then("Stop Time dan bitis saatini sec")
    public void stopTimeDanBitisSaatiniSec() {
        page.stopTimeddm.sendKeys("2359");
        ReusableMethods.bekle(1);

    }

    @Then("Submit butonuna tikla")
    public void submitButonunaTikla() {
        page.submitbutton.click();
        ReusableMethods.bekle(2);

    }

    @Then("Created Lesson Program yazisini gor")
    public void createdLessonProgramYazisiniGor() {
    }

    @Then("Chose Lessons da dersi bos birak")
    public void choseLessonsDaDersiBosBirak() {

    }

    @Then("Choose Education Term i bos birak")
    public void chooseEducationTermIBosBirak() {

    }

    @Then("Choose Day i bos birak")
    public void chooseDayIBosBirak() {
        
    }

    @Then("Full authentication is required to access this resource yazısını gör")
    public void fullAuthenticationIsRequiredToAccessThisResourceYazısınıGör() {

    }




    @Then("Dean Logout butonuna tikla")
    public void deanLogoutButonunaTikla() {
        ReusableMethods.bekle(3);
        page.logoutbutton2.click();
        ReusableMethods.visibleWait(page.MenuTE,3);
        page.yesbutton.click();
    }

    @Then("ViceDean Logout butonuna tiklar")
    public void vicedeanLogoutButonunaTiklar() {
        ReusableMethods.bekle(2);
        page.logouttbutton3.click();
        ReusableMethods.visibleWait(page.MenuTE,3);
       // page.yesbutton.click();
        ReusableMethods.click(page.yesbutton);


    }
}
