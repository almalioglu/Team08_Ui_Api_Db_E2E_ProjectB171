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
        Assert.assertTrue(page.ogretmenListesiME.size() > 0);
    }

    @And("Lesson Tableda Day sutununda ders gunlerinin goruldugu dogrulanır")
    public void lessonTabledaDaySutunundaDersGunlerininGorulduguDogrulanır() {
        Assert.assertTrue(page.gunListesiME.size() > 0);
    }

    @And("Lesson Tableda Start Time sutununda baslangic saatinin goruldugu dogrulanir")
    public void lessonTabledaStartTimeSutunundaBaslangicSaatininGorulduguDogrulanir() {
        Assert.assertTrue(page.startTimeListesiME.size() > 0);
    }

    @And("Lesson Tableda Stop Time sutununda baslangic saatinin goruldugu dogrulanir")
    public void lessonTabledaStopTimeSutunundaBaslangicSaatininGorulduguDogrulanir() {
        Assert.assertTrue(page.stopTimeListesiME.size() > 0);
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
    //page.dersSecmeSubmitME.click();
    }

    @Then("Derslerin seçildigi dogrulanir")
    public void derslerinSeçildigiDogrulanir() {
//        System.out.println(page.dersSecmeCheckboxME.get(ilkSecim).getText());
//        System.out.println(page.dersSecmeCheckboxME.get(ikinciSecim).getText());
//        System.out.println(page.tumDerslerListesiME.getText());
        //page.tumDerslerListesiME.forEach(t-> System.out.println(t.getText()));
        System.out.println("**********************************");
        List<Object> dersList=new ArrayList<>();

        TumDerslerList.addAll(page.tumDerslerListesiME);

        TumDerslerList.forEach(t-> System.out.println(t.getText()));

//        for (List<WebElement> w: TumDerslerList) {
//
//            dersList.add(w.getText());
//            System.out.println("foreach"+ w.getText());
//
//        }
        for (int i = 0; i < TumDerslerList.size()-1; i++) {
            dersList.add(TumDerslerList.get(i).getText());
            System.out.println("Deneme"+TumDerslerList.get(i).getText());
        }
        System.out.println("derslist"+dersList);

    }
}
