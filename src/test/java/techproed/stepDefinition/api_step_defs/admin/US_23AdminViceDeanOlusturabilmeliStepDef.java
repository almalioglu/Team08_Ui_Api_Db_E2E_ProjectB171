package techproed.stepDefinition.api_step_defs.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.dean.postViceDean.Response6Pojo;

import static techproed.base_url.BaseUrl.spec;



public class US_23AdminViceDeanOlusturabilmeliStepDef {
    Response6Pojo payload;

    @Given("Admin Vice Dean save icin URL duzenlenir_aeo")
    public void adminViceDeanSaveIcinURLDuzenlenir_aeo() {
        spec.pathParams("first","vicedean","second","save");
    }

    @And("Admin Vice Dean save icin payload duzenlenir_aeo")
    public void adminViceDeanSaveIcinPayloadDuzenlenir_aeo() {
      payload = new Response6Pojo("1999-09-10","Istanbul","FEMALE","Firdevs3","Mahmude1234","282-198-7778","222-99-6563","ORAL3", "Firdevs34");


    }

    @When("Admin Vice Dean save icin post request gonderilir response alinir_aeo")
    public void adminViceDeanSaveIcinPostRequestGonderilirResponseAlinir_aeo() {
    }

    @Then("Admin status kodun {int} oldugu dogrulanir_aeo")
    public void adminStatusKodunOlduguDogrulanir_aeo(int arg0) {
    }

    @And("Admin Vice Dean save icin gelen body dogrulanir_aeo")
    public void adminViceDeanSaveIcinGelenBodyDogrulanir_aeo() {
    }
}
