package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.HomePage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class Us18_TeacherNotGuncelleme {
    HomePage page = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    Random random = new Random();

    String midTermNote = String.valueOf(random.nextInt(101));
    String finalNote = String.valueOf(random.nextInt(101));
    String absentee = String.valueOf(random.nextInt(16));

    List<String> infoNotesList = List.of("Başarilarinin devamini dilerim", "Zahmetini cekmediğin şey senin degildir", "Tekrar 180 kere de olsa güzeldir",
            "Aklin yolu 1 dir..", "Geçmişe kader geleceğe irade.,?", "Önümüzdeki 3 maça bakicaz", "Ümitvar olunuz..2024+", "All is well..!");
    String infoNote = infoNotesList.get(random.nextInt(infoNotesList.size()));

    String studentName;
    String lessonExpectedData;
    String deletedStudentInfo;

    @Then("Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is")
    public void ogrenciBilgileriniGuncellemekIcinEditButonuTiklanir_is() {
        actions.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        page.notEditButton_is.click();
        ReusableMethods.bekle(2);

        studentName = page.notEditStudentNameInfo_is.getText().split("\n")[1];
    }

    @And("Ders bilgisi guncellenir_is")
    public void dersBilgisiGuncellenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.notEditChooseLessonMenu_is);

        Select select = new Select(page.notEditSecilenDers_is);
        lessonExpectedData = select.getFirstSelectedOption().getText();

        page.notEditSubmitButton_is.click();
        ReusableMethods.bekle(2);
    }

    @And("Edit ekrani kapatilir_is")
    public void editEkraniKapatilir_is() {
        page.closeEditWindowButton_is.click();
        ReusableMethods.bekle(2);
    }

    @Then("Ders bilgisinin guncellendigi dogrulanir_is")
    public void dersBilgisininGuncellendigiDogrulanir_is() {
        Assert.assertEquals(studentName, page.tableStudentName_is.getText());
        Assert.assertEquals(lessonExpectedData, page.tableLessonInfo_is.getText());
    }

    @And("Ders donemi bilgisi guncellenir_is")
    public void dersDonemiBilgisiGuncellenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.notEditEducationTermMenu_is);

        Select select = new Select(page.notEditsecilenDonem_is);
        lessonExpectedData = select.getFirstSelectedOption().getText();

        page.notEditSubmitButton_is.click();
        ReusableMethods.bekle(2);

    }

    @Then("Ders donemi bilgisinin guncellendigi dogrulanir_is")
    public void dersDonemiBilgisininGuncellendigiDogrulanir_is() {
        Assert.assertEquals("Student Info updated Successfully", page.infoAlert_is.getText());
        ReusableMethods.bekle(2);
    }

    @And("Absentee bilgisi guncellenir_is")
    public void absenteeBilgisiGuncellenir_is() {
        page.notEditAbsenteeInfo_is.sendKeys(Keys.COMMAND,Keys.CONTROL, "A", Keys.DELETE, Keys.DELETE, Keys.DELETE);
        ReusableMethods.bekle(2);

        page.notEditAbsenteeInfo_is.sendKeys(absentee);
        ReusableMethods.bekle(2);

        page.notEditSubmitButton_is.click();
        ReusableMethods.bekle(2);
    }

    @Then("Absentee bilgisinin guncellendigi dogrulanir_is")
    public void absenteeBilgisininGuncellendigiDogrulanir_is() {
        Assert.assertEquals(absentee, page.tableAbsenteeInfo_is.getText());

    }

    @And("Midterexam bilgisi guncellenir_is")
    public void midterexamBilgisiGuncellenir_is() {
        page.notEditMidtermInfo_is.sendKeys(Keys.COMMAND,Keys.CONTROL,"A", Keys.DELETE);
        ReusableMethods.bekle(2);

        page.notEditMidtermInfo_is.sendKeys(midTermNote);
        ReusableMethods.bekle(2);

        page.notEditSubmitButton_is.click();
        ReusableMethods.bekle(2);
    }

    @Then("Midtermexam bilgisinin guncellendigi dogrulanir_is")
    public void midtermexamBilgisininGuncellendigiDogrulanir_is() {
        Assert.assertEquals(midTermNote, page.tableMidTermNote_is.getText());
    }

    @And("Finalexam bilgisi guncellenir_is")
    public void finalexamBilgisiGuncellenir_is() {
        page.notEditFinalInfo_is.sendKeys(Keys.COMMAND,Keys.CONTROL, "A", Keys.DELETE);
        ReusableMethods.bekle(2);

        page.notEditFinalInfo_is.sendKeys(finalNote);
        ReusableMethods.bekle(2);

        page.notEditSubmitButton_is.click();
        ReusableMethods.bekle(2);
    }

    @Then("Finalexam bilgisinin guncellendigi dogrulanir_is")
    public void finalexamBilgisininGuncellendigiDogrulanir_is() {
        Assert.assertEquals(finalNote, page.tableFinalExamNote_is.getText());
    }

    @And("infonote bilgisi guncellenir_is")
    public void infonoteBilgisiGuncellenir_is() {
        page.notEditInfoNoteInfo_is.sendKeys(Keys.COMMAND,Keys.CONTROL, "A", Keys.DELETE);
        ReusableMethods.bekle(2);

        page.notEditInfoNoteInfo_is.sendKeys(infoNote);
        ReusableMethods.bekle(2);

        page.notEditSubmitButton_is.click();
        ReusableMethods.bekle(2);
    }

    @Then("infonote bilgisinin guncellendigi dogrulanir_is")
    public void infonoteBilgisininGuncellendigiDogrulanir_is() {
        Assert.assertEquals(infoNote, page.tableInfoNoteInfo_is.getText());
    }

    @And("Not bilgisini silmek icin delete butonu tiklanir_")
    public void notBilgisiniSilmekIcinDeleteButonuTiklanir_() {
        ReusableMethods.click(page.deleteStudentInfoButon_is);
        deletedStudentInfo = page.tableRowsis.get(2).getText();
        ReusableMethods.bekle(2);
        page.deleteStudentInfoButon_is.click();
        ReusableMethods.bekle(1);
    }

    @Then("Ogrencinin listeden silindigi dogrulanir_is")
    public void ogrencininListedenSilindigiDogrulanir_is() {
        Assert.assertEquals("Student Info deleted Successfully", page.infoAlert_is.getText());
        page.tableRowsis.forEach(t -> Assert.assertFalse(t.getText().contains(deletedStudentInfo)));
    }

}
