package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import techproed.pages.HomePage;
import techproed.utilities.ReusableMethods;

public class US11_StepDefination {
    HomePage page = new HomePage();
    @Then("Lesson Day Start Time Stop Time goruldugunu dogrular")
    public void lessonDayStartTimeStopTimeGoruldugunuDogrular() {

        page.dersgorunurluk.isDisplayed();
    }

    @Then("Logout butonuna tikla")
    public void logoutButonunaTikla() {
        ReusableMethods.bekle(5);
        page.logoutbutton.click();
        ReusableMethods.visibleWait(page.MenuTE,3);
        page.yesbutton.click();
    }
}
