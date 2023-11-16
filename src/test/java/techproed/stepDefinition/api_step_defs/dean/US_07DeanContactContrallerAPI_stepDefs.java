package techproed.stepDefinition.api_step_defs.dean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.dean.getContactGetAll.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;

public class US_07DeanContactContrallerAPI_stepDefs {
    ResponseContactPojo payload;
    ObjectPojo objectPojo;
    ResponseGetExpectedDataPojo expectedData;
    ResponseGetExpectedDataPojo actualData;
    Response response;
    GetContactMessagePojo getActualData;
    ContentPojo getExpectedData;
    static String nowDate;
    @Given("Base URL duzenlenir")
    public void baseURLDuzenlenir() {
        spec.pathParams("first","contactMessages","second","save");
        //https://managementonschools.com/app/contactMessages/save
    }

    @And("Payload duzenlenir")
    public void payloadDuzenlenir() {
        LocalDate localDate = LocalDate.now();
        nowDate= String.valueOf(localDate);
        payload=new ResponseContactPojo("zyrell.fariz@forkshape.com","HELLO WORLD","MAHPEYKER", "JAVA");
        objectPojo=new ObjectPojo( "MAHPEYKER","zyrell.fariz@forkshape.com", "JAVA","HELLO WORLD",nowDate);
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
     response = given(spec).when().get("{first}/{second}");
     response.prettyPrint();
     getActualData = response.as(GetContactMessagePojo.class);
     getExpectedData = new ContentPojo("MAHPEYKER","zyrell.fariz@forkshape.com","JAVA","HELLO WORLD", nowDate);


    }

    @And("Get ile donen response body dogrulanir")
    public void getIleDonenResponseBodyDogrulanir() {
       assertEquals(getExpectedData.getName(),getActualData.getContent().get(0).getName());
       assertEquals(getExpectedData.getEmail(),getActualData.getContent().get(0).getEmail());
       assertEquals(getExpectedData.getSubject(),getActualData.getContent().get(0).getSubject());
       assertEquals(getExpectedData.getMessage(),getActualData.getContent().get(0).getMessage());
       assertEquals(getExpectedData.getDate(),getActualData.getContent().get(0).getDate());

    }
}
