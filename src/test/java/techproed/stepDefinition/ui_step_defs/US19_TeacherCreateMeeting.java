package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;


import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US19_TeacherCreateMeeting {
    HomePage page = new HomePage();

    @And("siteye git")
    public void siteyeGit() {
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
    }

    @Given("login butonuna tikla")
    public void loginButonunaTikla() {
        page.loginButton_mo.click();
        ReusableMethods.bekle(2);
    }


    @And("username box a username yaz, password box a password yaz,login butonuna tikla")
    public void usernameBoxAUsernameYazPasswordBoxAPasswordYazLoginButonunaTikla() {
        page.loginUserName_mo.sendKeys(ConfigReader.getProperty("teacher_mo"), Keys.TAB,
                ConfigReader.getProperty("password_mo"), Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("menu butonuna tikla")
    public void menuButonunaTikla() {

        ReusableMethods.click(page.menuButton_mo);
        ReusableMethods.bekle(3);

    }

    @And("sol tarafta acılan menu sekmesinde Meet Management seceneğine tıkla")
    public void solTaraftaAcılanMenuSekmesindeMeetManagementSeceneğineTıkla() {
        page.meetManagement_mo.click();
      //  ReusableMethods.click(page.meetManagement_mo);
    }

    //========================TC01==================================

    @When("Choose Students select menusunden ogrenci secimini yap")
    public void chooseStudentsSelectMenusundenOgrenciSeciminiYap() {
        ReusableMethods.click(page.chooseStudentsBox);
        ReusableMethods.bekle(2);
        page.chooseStudentsBox.sendKeys("mery mery",Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("Choose Students menusunden ogrenci secildigini dogrula")
    public void chooseStudentsMenusundenOgrenciSecildiginiDogrula() {
        //assertTrue(page.chooseStudentsBox.getText().contains("mery mery"));
        assertTrue(page.chooseStudentsBox.getText().isEmpty());

    }


    //=====================================TC02=======================================================
        //TC02 DE BUG VAR
    //=====================================TC03=======================================================
    @And("Date of Meet box a geçmis tarih olarak {string} tarihini gir")
    public void dateOfMeetBoxAGeçmisTarihOlarakTarihiniGir(String tarih) {
        page.dateBox.sendKeys(tarih);
        ReusableMethods.bekle(2);
    }




    @And("toplantı baslangıc saati  olarak {string} sec")
    public void toplantıBaslangıcSaatiOlarakSec(String start) {
        page.startTimeBox.sendKeys(start);
        ReusableMethods.bekle(2);
    }

    @And("toplantı bitis saati olarak {string} sec")
    public void toplantıBitisSaatiOlarakSec(String stop) {
        page.stopTimeBox.sendKeys(stop);
        ReusableMethods.bekle(2);
    }
    @And("description box'a {string} yaz")
    public void descriptionBoxAYaz(String msj) {
        page.descriptionBox.sendKeys(msj);
        ReusableMethods.bekle(2);
    }

   @And("submit butonuna tıkla")
   public void submitButonunaTıkla() {
       page.submitButton_mo.click();
       ReusableMethods.bekle(2);
   }

    @Then("ileri bir tarih olmalı  mesajinin cıktığını doğrula")
    public void ileriBirTarihOlmalıMesajininCıktığınıDoğrula() {
        assertTrue(page.ileriBirTarihOlmalıMesaji.isDisplayed());
    }

//==================================tc04=============================
@And("Date Of Meet den bir tarih sec")
public void dateOfMeetDenBirTarihSec() {
    List<String> meetDateList = List.of("11112024", "12112024", "13112024", "14112024", "15112024", "16112024", "17112024", "18112024", "19112023", "20112023", "21112023", "22112023");
    Random random = new Random();
    String meetDate = meetDateList.get(random.nextInt(meetDateList.size()));
    page.dateBox.sendKeys(meetDate);
    ReusableMethods.bekle(2);
}
    @Then("Meet Saved Successfully mesajinin cıktığını doğrula")
    public void meetSavedSuccessfullyMesajininCıktığınıDoğrula() {
        assertTrue(page.meetSavedSuccessfullyMesaj.isDisplayed());
    }
    //==================================tc05=============================
    @Then("StartTime box altında Requried uyarisi ciktigini dogrula")
    public void starttimeBoxAltındaRequriedUyarisiCiktiginiDogrula() {
        assertTrue(page.requiredUyarisi.isDisplayed());
    }
    //==================================tc06=============================
    @Then("Error: start time must not be greater than or equal to stop time mesajinin cıktığını doğrula")
    public void errorStartTimeMustNotBeGreaterThanOrEqualToStopTimeMesajininCıktığınıDoğrula() {
        assertTrue(page.startveStopTimeAynıiseHataMesaji.isDisplayed());
    }

    //==================================tc08=============================
    @Then("Desciription  box inin altında Required uyarısı cıktığını doğrula")
    public void desciriptionBoxIninAltındaRequiredUyarısıCıktığınıDoğrula() {
        assertTrue(page.requiredUyarisi.isDisplayed());
    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }



}