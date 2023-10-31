package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import techproed.pages.HomePage;
import techproed.utilities.ReusableMethods;


public class US12_ViceDeanogretmenedersatayabilmelidir {
    HomePage page = new HomePage();
    @Then("Secilen ders Lesson Program Assignment da oldugunu dogrula")
    public void secilenDersLessonProgramAssignmentDaOldugunuDogrula() {

    }

    @Then("Lesson Program Assignment bolumunde Chose Lesson u sec")
    public void lessonProgramAssignmentBolumundeChoseLessonUSec() {
        //page.chooselessonbox.click();
        //ReusableMethods.bekle(3);

       ReusableMethods.click(page.chooseStudentsBox);


        }


    @Then("Lesson Program Assignment bolumunde Chose Teacher ı sec")
    public void lessonProgramAssignmentBolumundeChoseTeacherISec() {
        //page.chooseTeacher.click();
        //page.chooseTeacher.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        //ReusableMethods.bekle(2);
    }

    @Then("Assignment Submit butonuna tikla")
    public void assignmentSubmitButonunaTikla() {
    }

    @Then("Lesson added to teacher yazısı gorulmeli")
    public void lessonAddedToTeacherYazısıGorulmeli() {
    }


}
