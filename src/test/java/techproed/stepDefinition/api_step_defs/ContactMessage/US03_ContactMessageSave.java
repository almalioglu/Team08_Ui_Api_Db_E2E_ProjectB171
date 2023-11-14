package techproed.stepDefinition.api_step_defs.ContactMessage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.TestCase;
import techproed.pojos.Contact.ActualResponsePojoEB;
import techproed.pojos.Contact.ContactMessagePostSavePojo;
import techproed.pojos.Contact.ObjectPojoEB;
import techproed.pojos.Register.ActualResponsePojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.spec;
import static techproed.pojos.Register.ObjectPojo.userId;

public class US03_ContactMessageSave {
    String url;

    Response response ;

    ContactMessagePostSavePojo payload;

    ActualResponsePojoEB expectedData;

    ActualResponsePojoEB actualData;

    ObjectPojoEB objectPojoEB;
    @Given("contact islemi icin url duzenlenir")
    public void contactIslemiIcinUrlDuzenlenir() {
        url = "https://managementonschools.com/app/contactMessages/save";

    }

    @And("contact payload duzenlenir")
    public void contactPayloadDuzenlenir() {
         payload = new ContactMessagePostSavePojo("nurayyy@gamail.com","Dünya madem fanidir","Nuray","Ders");
        objectPojoEB = new ObjectPojoEB("Nuray","nurayyy@gamail.com","Ders","Dünya madem fanidir","2023-11-13");
         expectedData = new ActualResponsePojoEB(objectPojoEB,"Contact Message Created Successfully","CREATED");
//{
//    "object": {
//        "name": "Nuray",
//        "email": "nuray@gamail.com",
//        "subject": "Ders",
//        "message": "Dünya madem fanidir",
//        "date": "2023-11-13"
//    },
//    "message": "Contact Message Created Successfully",
//    "httpStatus": "CREATED"
//}
    }

    @And("contact icin post request gonderilir ve respons alinir")
    public void contactIcinPostRequestGonderilirVeResponsAlinir() {
        response = given().contentType(ContentType.JSON).body(payload).when().post(url);
        response.prettyPrint();
        actualData = response.as(ActualResponsePojoEB.class);

    }

    @Then("status kodun {int} oldugu dogrulanirEB")
    public void statusKodunOlduguDogrulanirEB(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @And("contact icin gelen response bady dogrulanilir")
    public void contactIcinGelenResponseBadyDogrulanilir() {

        TestCase.assertEquals(objectPojoEB.getMessage(),actualData.getObject().getMessage());
        TestCase.assertEquals(objectPojoEB.getSubject(),actualData.getObject().getSubject());
        TestCase.assertEquals(objectPojoEB.getDate(),actualData.getObject().getDate());
        TestCase.assertEquals(objectPojoEB.getEmail(),actualData.getObject().getEmail());
        TestCase.assertEquals(objectPojoEB.getName(),actualData.getObject().getName());
        TestCase.assertEquals(expectedData.getMessage(),actualData.getMessage());
        TestCase.assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());




    }

    }

