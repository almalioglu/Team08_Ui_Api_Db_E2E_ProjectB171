package techproed.stepDefinition.api_step_defs.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import techproed.pojos.dean.postViceDean.ExpectedDataPojo;
import techproed.pojos.dean.postViceDean.Response6Pojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.spec;
import static techproed.pojos.dean.postViceDean.ObjectPojo.userId;


public class US_23AdminViceDeanOlusturabilmeliStepDef {
    Response6Pojo payload;
    Response response;



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
        response=given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();

    }

    @Then("Admin status kodun {int} oldugu dogrulanir_aeo")
    public void adminStatusKodunOlduguDogrulanir_aeo(int statusCode) {
      assertEquals(statusCode,response.statusCode());

    }

    @And("Admin Vice Dean save icin gelen body dogrulanir_aeo")
    public void adminViceDeanSaveIcinGelenBodyDogrulanir_aeo() {
        ExpectedDataPojo actualData =response.as(ExpectedDataPojo.class);
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
    }

    @And("Admin vice dean silinir")
    public void adminViceDeanSilinir() {
        // {{baseUrl}}/vicedean/delete/:userId
        spec.pathParams("first","vicedean","second","delete","third",userId);
        response=given(spec).when().delete("{first}/{second}/{third}");


    }
}
