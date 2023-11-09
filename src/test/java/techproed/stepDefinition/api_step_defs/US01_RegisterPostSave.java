package techproed.stepDefinition.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import techproed.pojos.US_01.ActualResponsePojo;
import techproed.pojos.US_01.GuestUserPostSavePojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US01_RegisterPostSave {
    String url;
    GuestUserPostSavePojo peyload ;
    Response response ;

    ActualResponsePojo actualData;

    @Given("register islemi icin url düzenlenir")
    public void registerIslemiIcinUrlDüzenlenir() {
        //https://managementonschools.com/app/guestUser/register

        url="https://managementonschools.com/app/guestUser/register";

    }

    @And("register payload düzenlenir")
    public void registerPayloadDüzenlenir() {

        peyload = new GuestUserPostSavePojo("2000-01-01","istanbul","FEMALE","Nur","karye1878","544-456-7891","789-32-4563","Karye","Nurkarye");




    }

    @And("register icin post request gönderilir ve respons alinir")
    public void registerIcinPostRequestGönderilirVeResponsAlinir() {
        response = given().contentType(ContentType.JSON).when().body(peyload).post(url);
        response.prettyPrint();

        actualData = response.as(ActualResponsePojo.class);

    }

    @Then("register post islemi icin status code {int} oldugu dogrulanir")
    public void registerPostIslemiIcinStatusCodeOlduguDogrulanir(int arg0) {
       assertEquals(200,response.statusCode());



    }

    @And("register icin gelen response bady dogrulanilir")
    public void registerIcinGelenResponseBadyDogrulanilir() {

        assertEquals(peyload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(peyload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(peyload.getGender(),actualData.getObject().getGender());
        assertEquals(peyload.getName(),actualData.getObject().getName());
        assertEquals(peyload.getSsn(),actualData.getObject().getSsn());
        assertEquals(peyload.getSurname(),actualData.getObject().getSurname());
        assertEquals(peyload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(peyload.getUsername(),actualData.getObject().getUsername());
    }
}
