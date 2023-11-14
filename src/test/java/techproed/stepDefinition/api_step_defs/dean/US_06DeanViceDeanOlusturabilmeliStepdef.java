package techproed.stepDefinition.api_step_defs.dean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import techproed.pojos.dean.postViceDean.ObjectPojo;
import techproed.pojos.dean.postViceDean.Response6Pojo;
import techproed.pojos.dean.postViceDean.ResponseViceDeanPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;
import static techproed.pojos.dean.postViceDean.ObjectPojo.userId;

public class US_06DeanViceDeanOlusturabilmeliStepdef {
    Response6Pojo payload;
    Response response;
    int Id;

    @Given("Vice Dean save icin URL duzenlenir_aeo")
    public void viceDeanSaveIcinURLDuzenlenir_aeo() {
        spec.pathParams("first","vicedean","second","save");
       //https://managementonschools.com/app/vicedean/save)
    }

    @And("Vice Dean save icin payload duzenlenir_aeo")
    public void viceDeanSaveIcinPayloadDuzenlenir_aeo() {
       payload = new Response6Pojo("1999-09-10","Istanbul","FEMALE","Firdevs3","Mahmude123",
               "188-198-7878","222-33-6163", "ORAL3","Firdevs333");

    }

    @When("Vice Dean save icin post request gonderilir response alinir_aeo")
    public void viceDeanSaveIcinPostRequestGonderilirResponseAlinir_aeo() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        System.out.println(userId);


    }
    @And("Vice Dean save icin gelen body dogrulanir_aeo")
    public void viceDeanSaveIcinGelenBodyDogrulanir_aeo() {
        ResponseViceDeanPojo actualData = response.as(ResponseViceDeanPojo.class);
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());


    }


    @Then("status kodun {int} oldugu dogrulanir_aeo")
    public void statusKodunOlduguDogrulanir_aeo(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

    @And("olusturulan vice dean silinir")
    public void olusturulanViceDeanSilinir() {
       // {{baseUrl}}/vicedean/delete/:userId
        spec.pathParams("first","vicedean","second","delete","third",userId);
        response=given(spec).when().delete("{first}/{second}/{third}");
    }
}

