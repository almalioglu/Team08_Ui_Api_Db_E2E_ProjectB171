package techproed.stepDefinition.api_step_defs.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.US_01.ActualResponsePojo;
import techproed.pojos.US_01.GuestUserPostSavePojo;
import techproed.pojos.US_01.ObjectPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.spec;
import static techproed.pojos.US_01.ObjectPojo.userId;

public class US01_US02_RegisterPostSave_GetAll_Delete {
    String url;
    GuestUserPostSavePojo payload ;
    Response response ;

    ActualResponsePojo actualData;


    public static ObjectPojo object;
    public static ActualResponsePojo expectedData;

    @Given("register islemi icin url düzenlenir")
    public void registerIslemiIcinUrlDüzenlenir() {
        //https://managementonschools.com/app/guestUser/register

        url="https://managementonschools.com/app/guestUser/register";

    }

    @And("register payload düzenlenir")
    public void registerPayloadDüzenlenir() {

        payload = new GuestUserPostSavePojo("2000-02-02",
                "Mersin","FEMALE","Demet",
                "Nur1978+","788-456-7822",
                "456-32-4789","Karye","Demetnur");

//{
//  "birthDay": "2000-02-02",
//  "birthPlace": "Mersin",
//  "gender": "FEMALE",
//  "name": "Demet",
//  "password": "Nur1978+",
//  "phoneNumber": "788-456-7822",
//  "ssn": "788-456-7822",
//  "surname": "Karye",
//  "username": "Demetnur"

    }

    @And("register icin post request gönderilir ve respons alinir")
    public void registerIcinPostRequestGönderilirVeResponsAlinir() {
        response = given().contentType(ContentType.JSON).body(payload).when().post(url);
        response.prettyPrint();
        actualData = response.as(ActualResponsePojo.class);
        System.out.println(userId);
    }



    @And("register icin gelen response bady dogrulanilir")
    public void registerIcinGelenResponseBadyDogrulanilir() {

        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
    }

     /////////////////////////SENARYO 2 GET //////////////////////////////

    @And("admin get icin url duzenlenir")
    public void adminGetIcinUrlDuzenlenir() {
        ///guestUser/getAll?page=26&size=10&sort=name&type=desc
        spec.pathParams("first","guestUser","second","getAll")
                .queryParams("page","0","size","1000",
                        "sort","name","type","desc");

    }

    @And("Get guest user icin beklenen veriler duzenlenir")
    public void getGuestUserIcinBeklenenVerilerDuzenlenir() {
        response =  given(spec).when().get("{first}/{second}");
        JsonPath json = response.jsonPath();

    }

    @When("getAll request gonderilir response alinir")
    public void getallRequestGonderilirResponseAlinir() {
        expectedData = new ActualResponsePojo(object, "Guest User registered.", "CREATED");
    }


    @Then("status kodun {int} oldugu dogrulanir_EB")
    public void statusKodunOlduguDogrulanir_EB(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @And("get ile gelen response dogrulanir")
    public void getIleGelenResponseDogrulanir() {


    }

      //////////////////////// SENARYO 3 DELETE ////////////////////
    @And("eklenen guest user silinir")
    public void eklenenGuestUserSilinir() {
        //https://managementonschools.com/app/guestUser/delete/1
        spec.pathParams("first", "guestUser", "second", "delete", "third", userId);
        response = given(spec).when().delete("{first}/{second}/{third}");
        String expectedData = "Guest User deleted Successful";
    }
    }


