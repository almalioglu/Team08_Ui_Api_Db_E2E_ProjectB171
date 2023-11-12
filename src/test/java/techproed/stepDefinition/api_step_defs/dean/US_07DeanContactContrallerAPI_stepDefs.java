package techproed.stepDefinition.api_step_defs.dean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.dean.getContactGetAll.ObjectPojo;
import techproed.pojos.dean.getContactGetAll.ResponseContactPojo;
import techproed.pojos.dean.getContactGetAll.ResponseGetExpectedDataPojo;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;

public class US_07DeanContactContrallerAPI_stepDefs {
    ResponseContactPojo payload;
    ObjectPojo objectPojo;
    ResponseGetExpectedDataPojo expectedData;
    ResponseGetExpectedDataPojo actualData;
    Response response;
    @Given("Base URL duzenlenir")
    public void baseURLDuzenlenir() {
        spec.pathParams("first","contactMessages","second","save");
        //https://managementonschools.com/app/contactMessages/save
    }

    @And("Payload duzenlenir")
    public void payloadDuzenlenir() {
        payload=new ResponseContactPojo("zyrell.fariz@forkshape.com","HELLO WORLD","MAHPEYKER", "JAVA");
        objectPojo=new ObjectPojo( "MAHPEYKER","zyrell.fariz@forkshape.com", "JAVA","HELLO WORLD","2023-11-10");
        expectedData=new ResponseGetExpectedDataPojo(objectPojo,"Contact Message Created Successfully","CREATED");
    }

    @When("Request gonderilir response alinir")
    public void requestGonderilirResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(ResponseGetExpectedDataPojo.class);

    }

    @Then("Status code iki yüz oldugu dogrulanir")
    public void statusCodeIkiYüzOlduguDogrulanir() {
        assertEquals(200,response.getStatusCode());

    }

    @And("Body dogrulanir")
    public void bodyDogrulanir() {
        assertEquals(objectPojo.getMessage(),actualData.getObject().getMessage());
        assertEquals(objectPojo.getSubject(),actualData.getObject().getSubject());
        assertEquals(objectPojo.getDate(),actualData.getObject().getDate());
        assertEquals(objectPojo.getEmail(),actualData.getObject().getEmail());
        assertEquals(objectPojo.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());

    }

    @Given("Get islemi icin base url duzenlenir")
    public void getIslemiIcinBaseUrlDuzenlenir() {
        spec.pathParams("first","contactMessages","second","searchByEmail")
                .queryParams("email","zyrell.fariz@forkshape.com","page",0,"size",10,"sort","date","type","desc");
        //https://managementonschools.com/app/contactMessages/searchByEmail?email=zyrell.fariz%40forkshape.com&page=0&size=10&sort=date&type=desc
    }

    @When("Get request hazirligi gonderilir response alinir")
    public void getRequestHazirligiGonderilirResponseAlinir() {


    }

    @And("Get ile donen response body dogrulanir")
    public void getIleDonenResponseBodyDogrulanir() {

    }
}
