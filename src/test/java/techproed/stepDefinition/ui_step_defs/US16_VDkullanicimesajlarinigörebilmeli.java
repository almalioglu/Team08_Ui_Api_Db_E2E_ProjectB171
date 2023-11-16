package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import techproed.pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class US16_VDkullanicimesajlarinigörebilmeli {
    HomePage page =new HomePage();
    List<WebElement> TumDerslerList=new ArrayList<>();

    @And("Contact Get All bölümüne tıkla")
    public void contactGetAllBölümüneTıkla() {
        page.contactgetallButtonSG.click();


    }

    @And("Contact message bölümünde name bilgisinin göründüğünü doğrula")
    public void contactMessageBölümündeNameBilgisininGöründüğünüDoğrula() {
        Assert.assertTrue(page.getAllNameSG.isDisplayed());
    }

    @And("Contact message bölümünde email bilgisinin göründüğünü doğrula")
    public void contactMessageBölümündeEmailBilgisininGöründüğünüDoğrula() {
        Assert.assertTrue(page.getAllEmailSG.isDisplayed());
    }

    @And("Contact message bölümünde date bilgisinin göründüğünü doğrula")
    public void contactMessageBölümündeDateBilgisininGöründüğünüDoğrula() {
        Assert.assertTrue(page.getAllDateSG.isDisplayed());
    }

    @And("Contact message bölümünde subject bilgisinin göründüğünü doğrula")
    public void contactMessageBölümündeSubjectBilgisininGöründüğünüDoğrula() {
        Assert.assertTrue(page.getAllSubjectSG.isDisplayed());
    }

    @And("Contact message bölümünde message bilgisinin göründüğünü doğrula")
    public void contactMessageBölümündeMessageBilgisininGöründüğünüDoğrula() {
        Assert.assertTrue(page.getAllMessageSG.isDisplayed());
    }

    @Then("Delete ikonuna tıkla")
    public void deleteIkonunaTıkla() {
    }
}
