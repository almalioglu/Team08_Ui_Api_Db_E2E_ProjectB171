package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import techproed.pages.HomePage;
import techproed.utilities.ReusableMethods;


public class US12_ViceDeanogretmenedersatayabilmelidir {
    HomePage page = new HomePage();

    @Then("Secilen ders Lesson Program Assignment da oldugunu dogrula")
    public void secilenDersLessonProgramAssignmentDaOldugunuDogrula() {
        page.dersdogrulama.isDisplayed();

    }

    @Then("Lesson Program Assignment bolumunde Chose Teacher ı sec")
    public void lessonProgramAssignmentBolumundeChoseTeacherISec() {
        ReusableMethods.click(page.chooseTeacher);
        ReusableMethods.ddmIndex(page.chooseTeacher, 7);

    }

    @Then("Lesson Program Assignment bolumunde Chose Lesson u sec")
    public void lessonProgramAssignmentBolumundeChoseLessonUSec() {
        page.chooselessonbox.get(page.chooselessonbox.size() - 1).click();
    }

    @Then("Assignment Submit butonuna tikla")
    public void assignmentSubmitButonunaTikla() {
        page.assignmmentSubmit.click();
    }

    @Then("Lesson added to teacher yazısı gorulmeli")
    public void lessonAddedToTeacherYazısıGorulmeli() {
         //Assert.assertEquals("Lesson added to Teacher",page.lessonaddyazisi.toString());
       // page.lessonaddyazisi.isDisplayed();

    }

    @Then("Lesson Program Assignment bolumunde Chose Teacher i boş birak")
    public void lessonProgramAssignmentBolumundeChoseTeacherIBoşBirak() {
    }

    @Then("The given id must not be null yazısı gorulmeli")
    public void theGivenIdMustNotBeNullYazısıGorulmeli() {
        Assert.assertTrue(page.nullyazisi.getText().contains("The given id must not be null"));

    }
}