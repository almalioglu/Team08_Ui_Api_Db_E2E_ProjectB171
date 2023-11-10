package techproed.stepDefinition.api_step_defs.vicedean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class US_15ViceDeanogrenciolusturabilmeli {
    @Given("Studen eklemek icin post request hazirligi yapilir")
    public void studenEklemekIcinPostRequestHazirligiYapilir() {
        setup("VicedDeanSaadet","Asrasa97...");
        spec.pathParams("first","students","second","save");
        //https://managementonschools.com/app/students/save
    }

    @And("Gonderilecek studen bilgileri hazirlanir")
    public void gonderilecekStudenBilgileriHazirlanir() {

    }

    @When("Student eklemek icin post request gonderilir")
    public void studentEklemekIcinPostRequestGonderilir() {
    }

    @Then("Student bilgileri dogrulanir")
    public void studentBilgileriDogrulanir() {
    }

    @When("Kayitli Student id ile cagirilir")
    public void kayitliStudentIdIleCagirilir() {
    }

    @Then("Student bilgileri dogrulanir\\(get)")
    public void studentBilgileriDogrulanirGet() {
    }
}
