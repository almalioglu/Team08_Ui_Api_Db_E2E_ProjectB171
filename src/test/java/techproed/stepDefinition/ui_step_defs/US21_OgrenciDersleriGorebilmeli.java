package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US21_OgrenciDersleriGorebilmeli {
    HomePage page =new HomePage();
    Random random=new Random();
    int dersEklendiDogrulama;
    int ilkSecim;
    int ikinciSecim;
    @And("Ogrenci name ve password girilir")
    public void ogrenciNameVePasswordGirilir() {
        page.loginUserName.sendKeys(ConfigReader.getProperty("ogrenciUsername"), Keys.TAB, ConfigReader.getProperty("ogrenciPassword"),Keys.TAB,Keys.ENTER);
    }


    @Given("Choose Lesson Table'da Teacher sutununda ogretmen bilgilerinin goruldugu dogrulanır")
    public void chooseLessonTableDaTeacherSutunundaOgretmenBilgilerininGorulduguDogrulanır() {
        assertTrue(page.ogretmenListesiME.size() > 0);
    }

    @And("Lesson Tableda Day sutununda ders gunlerinin goruldugu dogrulanır")
    public void lessonTabledaDaySutunundaDersGunlerininGorulduguDogrulanır() {
        assertTrue(page.gunListesiME.size() > 0);
    }

    @And("Lesson Tableda Start Time sutununda baslangic saatinin goruldugu dogrulanir")
    public void lessonTabledaStartTimeSutunundaBaslangicSaatininGorulduguDogrulanir() {
        assertTrue(page.startTimeListesiME.size() > 0);
    }

    @And("Lesson Tableda Stop Time sutununda baslangic saatinin goruldugu dogrulanir")
    public void lessonTabledaStopTimeSutunundaBaslangicSaatininGorulduguDogrulanir() {
        assertTrue(page.stopTimeListesiME.size() > 0);
    }

    //Burayı mutlaka geliştirecegim
//    @Given("Acilan Chooese Lesson tablosundan random iki ders secilir")
//    public void acilanChooeseLessonTablosundanRandomIkiDersSecilir() {
//
//
//            ilkSecim =random.nextInt(page.dersSecmeCheckboxME.size()-1);
//            ikinciSecim= random.nextInt(page.dersSecmeCheckboxME.size()-1);
//            ReusableMethods.click(page.dersSecmeCheckboxME.get(ilkSecim));
//            ReusableMethods.click(page.dersSecmeCheckboxME.get(ikinciSecim));
//
//
//
//
//    }

    @And("Submit butonuna tıklanir")
    public void submitButonunaTıklanir() {
    ReusableMethods.click(page.dersSecmeSubmitME);
    }

    @Then("Derslerin seçildigi dogrulanir")
    public void derslerinSeçildigiDogrulanir() {

    }

    @And("Choose Lesson tablosundan random bir ders seçilir")
    public void chooseLessonTablosundanRandomBirDersSeçilir() {
        ilkSecim =random.nextInt(page.dersSecmeCheckboxME.size()-1);
        ReusableMethods.click(page.dersSecmeCheckboxME.get(ilkSecim));
    }

    @And("Submit butonuna tiklanir ve derslerin seçildigi dogrulanir")
    public void submitButonunaTiklanirVeDerslerinSeçildigiDogrulanir() {
        dersEklendiDogrulama=page.secilenDerslerListesiME.size();
        ReusableMethods.click(page.dersSecmeSubmitME);
        ReusableMethods.visibleWait(page.adminSavedVerifyME,3);
        assertTrue(page.adminSavedVerifyME.isDisplayed());
    }

    @And("Derslerin Lesson Program List e eklendigi dogrulanir")
    public void derslerinLessonProgramListEEklendigiDogrulanir() {
        assertTrue(page.secilenDerslerListesiME.size()>dersEklendiDogrulama);

    }

    @And("Aynı derslerin tekrardan seçilemedigi dogrulanir")
    public void aynıDerslerinTekrardanSeçilemedigiDogrulanir() {
        ReusableMethods.click(page.dersSecmeSubmitME);
        assertTrue(page.adminSavedVerifyME.isDisplayed());
    }

    @And("Grades and Announcemenents sayfasina gidilir")
    public void gradesAndAnnouncemenentsSayfasinaGidilir() {
    ReusableMethods.click(page.studentMenuButtonME);
    ReusableMethods.click(page.gradesButtonME);
    ReusableMethods.scrollHome();
    }

    @And("Student Info List tablosunda ders notlarinin goruldugu dogrulanir")
    public void studentInfoListTablosundaDersNotlarininGorulduguDogrulanir() {
        ReusableMethods.bekle(2);
    assertTrue(page.studentInfoListME.size()>0);
        System.out.println("ilk"+page.studentInfoListME.get(0).getText());
    }

    @And("Meet List tablosunda toplantilarin goruldugu dogrulanir")
    public void meetListTablosundaToplantilarinGorulduguDogrulanir() {
        ReusableMethods.bekle(2);
    assertTrue(page.studentMeetListME.size()>0);
        System.out.println("deneme"+page.studentMeetListME.get(0).getText());
    }
}
