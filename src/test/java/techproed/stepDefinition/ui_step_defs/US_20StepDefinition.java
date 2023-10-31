package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.HomePage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_20StepDefinition {
    Actions actions=new Actions(Driver.getDriver());
    HomePage page = new HomePage();
    @And("toplantilari gormek icin sayfayi kaydir")
    public void toplantilariGormekIcinSayfayiKaydir() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
    }

    //============================TC01================================================
    @Then("Toplantıların, Date, Start Time, Stop Time ve Description gör")
    public void toplantılarınDateStartTimeStopTimeVeDescriptionGör() {
        assertTrue(page.studensGorunurlugu.isDisplayed());
    }

    //============================TC02================================================

    @And("meet List cercevesindenki  Edit butonuna tıkla")
    public void meetListCercevesindenkiEditButonunaTıkla() {
        page.editButton.click();
        ReusableMethods.bekle(2);
    }


    @And("Choose Students box inda ki öğrenciyi {string} ile  değistir")
    public void chooseStudentsBoxIndaKiÖğrenciyiIleDeğistir(String ogrenci) {
        page.editChooseStudentSilme.click();
        page.editChooseStudents.click();
        page.editChooseStudents.sendKeys(ogrenci,Keys.ENTER);
        ReusableMethods.bekle(2);

    }

    @And("Editsubmit butonuna tıkla")
    public void editsubmitButonunaTıkla() {
        page.editSubmit.click();
        ReusableMethods.bekle(2);
    }

    @Then("Meet Updated Successfully mesajının cıktığını doğrula")
    public void meetUpdatedSuccessfullyMesajınınCıktığınıDoğrula() {
        assertTrue(page.editMeetUpdateSuccesfullMesaji.isDisplayed());
    }

    //============================TC03================================================

    @And("Date Of Meet box inda {string} degistir")
    public void dateOfMeetBoxIndaDegistir(String tarih) {
        page.editDateOfMeet.sendKeys(tarih);
        ReusableMethods.bekle(2);
    }

    //============================TC06================================================

    @And("Description kısmınıdaki mesajı {string} olarak değistir")
    public void descriptionKısmınıdakiMesajıOlarakDeğistir(String mesaj) {
        //page.editDescription.clear();
        page.editDescription.sendKeys(Keys.CONTROL + "a");
        page.editDescription.sendKeys(Keys.DELETE);
        ReusableMethods.bekle(2);
        page.editDescription.sendKeys(mesaj,Keys.ENTER);
    }

    //============================TC07================================================

    @And("meet List cercevesindenki  cöp kutusu görseline tıkla")
    public void meetListCercevesindenkiCöpKutusuGörselineTıkla() {
        page.deleteButton_mo.click();
        ReusableMethods.bekle(4);
    }


    @And("Meet Delete Successfully mesajının cıktığını doğrula")
    public void meetDeleteSuccessfullyMesajınınCıktığınıDoğrula() {
        assertTrue(page.meetDeleteSuccesfullMesaji.isDisplayed());
    }
}

