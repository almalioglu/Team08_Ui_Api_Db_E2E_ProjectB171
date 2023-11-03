package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;

public class US25_Adminögrenciolusturabilmeli {
    HomePage homePage = new HomePage();
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
    }

