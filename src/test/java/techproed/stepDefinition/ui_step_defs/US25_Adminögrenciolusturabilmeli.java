package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US25_Adminögrenciolusturabilmeli {
    HomePage homePage = new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @And("admin hesabıyla login ol")
    public void adminHesabıylaLoginOl() {
        homePage.usernamePlaceHolderSG.click();
        ReusableMethods.bekle(2);
        homePage.usernamePlaceHolderSG.sendKeys(ConfigReader.getProperty("adminUsername"));
        //homePage.passwordPlaceHolderSG.clear();
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ConfigReader.getProperty("Password"));
        homePage.loginEkraniLoginButtonSG.click();
    }
    @And("Admin submit butonuna tıklar")
    public void adminSubmitButonunaTıklar() {
        js.executeScript("arguments[0].click()", homePage.adminsubmitButtonSG);

    }
    }

