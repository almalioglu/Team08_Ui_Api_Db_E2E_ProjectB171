package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pages.HomePage;


public class US06_ViceDeanOlusturmaStepDefs {
    HomePage page = new HomePage();

    @Given("kullanici name kutusuna {string} girer")
    public void kullanici_name_kutusuna_girer(String string) {

    }

    @Then("kullanici surname kutusuna {string} girer")
    public void kullaniciSurnameKutusunaGirer(String arg0) {
    }
}
