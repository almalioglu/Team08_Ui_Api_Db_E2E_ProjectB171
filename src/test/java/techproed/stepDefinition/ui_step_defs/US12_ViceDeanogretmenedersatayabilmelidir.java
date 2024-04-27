package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.HomePage;
import techproed.utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class US12_ViceDeanogretmenedersatayabilmelidir {

    HomePage page =new HomePage();

    Random random=new Random();
    Faker faker=new Faker();
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    int pwdLength;
    Date birthDate;
    String dateOfBirth;
    String randomPassword;
    String randomPhoneNumber;

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
        //Assert.assertTrue(page.nullyazisi.getText().contains("The given id must not be null"));

    }

    @Then("Lesson Program Assignment bolumunde Chose Lesson u boş bırak")
    public void lessonProgramAssignmentBolumundeChoseLessonUBoşBırak() {

    }

    @Then("Vice Dean Managemente tikla")
    public void viceDeanManagementeTikla() {
        page.vicedeanmanagment.click();
    }

    @Then("ViceDean ogretmen olusturur")
    public void vicedeanOgretmenOlusturur() {



    }

    @Given("ViceDean olusturulur")
    public void vicedeanOlusturulur() {

        pwdLength=8;
        randomPassword= faker.regexify("[A-Za-z0-9]{"+pwdLength+"}");

        //Random dogum günü için formatli birthDate
        birthDate=faker.date().birthday();
        dateOfBirth=dateFormat.format(birthDate);
        randomPhoneNumber=faker.regexify("\\d{3}-\\d{3}-\\d{4}");


        page.adminNameTextBoxME.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                dateOfBirth,Keys.TAB,
                randomPhoneNumber,Keys.TAB,
                faker.idNumber().ssnValid(),Keys.TAB,
                faker.name().firstName(),Keys.TAB,
                randomPassword,Keys.TAB,Keys.ENTER);
    }

    @Then("Teacher managemente tikla")
    public void teacherManagementeTikla() {
        page.ogretmenmenudensec.click();
    }

    @When("select Lesson sekmesine tiklar ve bir ders secerr")
    public void selectLessonSekmesineTiklarVeBirDersSecerr() {
        page.selectlessonck.click();
        page.selectlessonck.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);




    }
}