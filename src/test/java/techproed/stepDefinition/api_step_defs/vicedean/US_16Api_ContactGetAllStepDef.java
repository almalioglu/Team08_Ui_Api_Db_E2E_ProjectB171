package techproed.stepDefinition.api_step_defs.vicedean;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getContactGetAll.ContactGelAllGetResponse;
import techproed.pojos.vicedean.postContactGetAll.ContactGetAllPostPojo;
import techproed.pojos.vicedean.postContactGetAll.ContactGetAllResponse;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.spec;


public class US_16Api_ContactGetAllStepDef {
    Faker faker = new Faker();

    public static String emailContact;
    public static String emailPost;
    Response response;
    ContactGetAllPostPojo expectedData;
    ContactGetAllResponse actualdata;

    ContactGelAllGetResponse actualDataGet;
    @Given("Mesaj eklemek icin post request hazirligi yapilir")
    public void mesaj_eklemek_icin_post_request_hazirligi_yapilir() {
        spec.pathParams("first", "contactMessages", "second", "save");
    }

    @Given("Gonderilecek mesaj bilgileri hazirlanir")
    public void gonderilecek_mesaj_bilgileri_hazirlanir() {
        emailContact=faker.internet().emailAddress();
        expectedData=new ContactGetAllPostPojo(emailContact, "konu","saadet", "Ders");

    }

    @When("Mesaj eklemek icin post request gonderilir")
    public void mesaj_eklemek_icin_post_request_gonderilir() {
        response=given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        emailPost=response.jsonPath().getString("object.email");
        actualdata=response.as(ContactGetAllResponse.class);
    }

    @Then("Mesaj bilgileri dogrulanir")
    public void mesaj_bilgileri_dogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getName(),actualdata.getObject().getName());
        assertEquals(expectedData.getEmail(),actualdata.getObject().getEmail());
        assertEquals(expectedData.getMessage(),actualdata.getObject().getMessage());
        assertEquals(expectedData.getSubject(),actualdata.getObject().getSubject());
    }

    @Given("Mesaj cagirmak icin get request hazirligi yapilir")
    public void mesaj_eklemek_icin_get_request_hazirligi_yapilir() {
        spec.pathParams("first", "contactMessages", "second", "searchByEmail").queryParam("email",emailPost);
    }

    @When("Mesaj eklemek icin get request gonderilir")
    public void mesaj_eklemek_icin_get_request_gonderilir() {
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        actualDataGet=response.as(ContactGelAllGetResponse.class);

    }

    @Then("Mesaj bilgileri dogrulanir\\(get)")
    public void mesaj_bilgileri_dogrulanir_get() {
        assertEquals(200,response.statusCode());
        assertEquals("saadet",actualDataGet.getContent().get(0).getName());
        assertEquals(emailContact,actualDataGet.getContent().get(0).getEmail());
        assertEquals("konu",actualDataGet.getContent().get(0).getMessage());
        assertEquals("Ders",actualDataGet.getContent().get(0).getSubject());
    }

}
