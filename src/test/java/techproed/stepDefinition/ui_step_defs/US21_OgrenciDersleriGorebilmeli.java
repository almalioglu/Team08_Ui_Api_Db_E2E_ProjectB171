package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US21_OgrenciDersleriGorebilmeli {
    HomePage page =new HomePage();
    Random random=new Random();
    List<WebElement> TumDerslerList=new ArrayList<>();
    int ilkSecim;
    int ikinciSecim;
    @And("Ogrenci name ve password girilir")
    public void ogrenciNameVePasswordGirilir() {
        page.loginUserName.sendKeys(ConfigReader.getProperty("Student"), Keys.TAB, ConfigReader.getProperty("Password"),Keys.TAB,Keys.ENTER);
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

    @Given("Acilan Chooese Lesson tablosundan random iki ders secilir")
    public void acilanChooeseLessonTablosundanRandomIkiDersSecilir() {


            ilkSecim =random.nextInt(page.dersSecmeCheckboxME.size()-1);
            ikinciSecim= random.nextInt(page.dersSecmeCheckboxME.size()-1);
            ReusableMethods.click(page.dersSecmeCheckboxME.get(ilkSecim));
            ReusableMethods.click(page.dersSecmeCheckboxME.get(ikinciSecim));




    }

    @And("Submit butonuna tıklanir")
    public void submitButonunaTıklanir() {
    ReusableMethods.click(page.dersSecmeSubmitME);
    }

    @Then("Derslerin seçildigi dogrulanir")
    public void derslerinSeçildigiDogrulanir() {
        List<String> dersList=new ArrayList<>();
        List<String> secilenDersler=new ArrayList<>();
        TumDerslerList.addAll(page.tumDerslerListesiME);


        for (int i = 0; i < TumDerslerList.size()-1; i++) {
            dersList.add(TumDerslerList.get(i).getText());
        }
        for (int i = 0; i < page.secilenDerslerListesiME.size()-1; i++) {
            secilenDersler.add(page.secilenDerslerListesiME.get(i).getText());
            System.out.println(secilenDersler.get(i));
        }

//        for (String w:secilenDersler) {
//            if (dersList.get(ilkSecim).contains(w)){
//                System.out.println("içeriyor"+w);
//            } else if (dersList.get(ikinciSecim).contains(w)) {
//                System.out.println("içeriyor2"+w);
//            }
//        }

    }
}
