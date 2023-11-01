package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import techproed.pages.HomePage;

public class US11_StepDefination {
    HomePage page = new HomePage();
    @Then("Lesson Day Start Time Stop Time goruldugunu dogrular")
    public void lessonDayStartTimeStopTimeGoruldugunuDogrular() {

        page.dersgorunurluk.isDisplayed();
    }
}
