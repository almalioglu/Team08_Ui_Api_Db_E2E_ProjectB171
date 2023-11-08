package techproed.stepDefinition.api_step_defs.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.admin.addAdmin.AdminPostPojo;
import techproed.pojos.admin.addAdmin.AdminPostResponsePojo;
import techproed.pojos.admin.getAdmin.AdminGetExpectedPojo;
import techproed.pojos.admin.getAdmin.AdminGetResponsePojo;
import techproed.utilities.ConfigReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class AdminManagement {
    AdminPostPojo payload;
    Response response;
    AdminPostResponsePojo actualData;
    AdminGetExpectedPojo expected;
    AdminGetResponsePojo getActualData;

    @Given("admin save icin URL duzenlenir")
    public void adminSaveIcinURLDuzenlenir() {
        //https://managementonschools.com/app/admin/save
        spec.pathParams("first", "admin", "second", "save");
    }

    @And("admin save icin payload duzenlenir")
    public void adminSaveIcinPayloadDuzenlenir() {
        payload = new AdminPostPojo("1996-10-02", "ADANA", true, "MALE", "API", "A123456789a", "458-972-2431", "751-65-8742", "DENEME", "APIDENEME");

        /*
        {
  "birthDay": "1996-10-02",
  "birthPlace": "ADANA",
  "built_in": true,
  "gender": "MALE",
  "name": "API",
  "password": "A123456789a",
  "phoneNumber": "458-972-2431",
  "ssn": "751-65-8742",
  "surname": "DENEME",
  "username": "APIDENEME"
}
         */
    }

    @When("admin save icin post request gonderilir ve response alinir")
    public void adminSaveIcinPostRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(AdminPostResponsePojo.class);
    }

    @Then("status kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("admin save icin gelen response body dogrulanir")
    public void adminSaveIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
    }

    @Given("admin icin setup parametreleri olusturulur")
    public void adminIcinSetupParametreleriOlusturulur() {
        setup(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("Password"));
    }


    @Given("{string} yetkisi ile giris yapilir")
    public void yetkisiIleGirisYapilir(String user) {
        switch (user.toLowerCase()) {
            case "admin":
                setup(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("Password"));
                break;
            case "dean":
                setup(ConfigReader.getProperty("Dean"), ConfigReader.getProperty("Password"));
                break;
            case "vicedean":
                setup(ConfigReader.getProperty("Vicedean"), ConfigReader.getProperty("Password"));
                break;
            case "teacher":
                setup(ConfigReader.getProperty("Teacher"), ConfigReader.getProperty("Password"));
                break;

        }
    }


    @Given("admin get icin URL duzenlenir")
    public void adminGetIcinURLDuzenlenir() {
        //https://managementonschools.com/app/admin/getAll?page=1&size=10&sort=name&type=desc
        spec.pathParams("first", "admin", "second", "getAll");
    }

    @And("admin get expected data duzenlenir")
    public void adminGetExpectedDataDuzenlenir() {

        expected = new AdminGetExpectedPojo(1166, "APIDENEME", "751-65-8742", "API", "DENEME", "1996-10-02", "ADANA", "458-972-2431", "MALE", false);
    /*
    {
            "id": 1166,
            "username": "APIDENEME",
            "ssn": "751-65-8742",
            "name": "API",
            "surname": "DENEME",
            "birthDay": "1996-10-02",
            "birthPlace": "ADANA",
            "phoneNumber": "458-972-2431",
            "gender": "MALE",
            "built_in": false
        }
     */
    }

    @When("admin get request gonderilir ve response alinir")
    public void adminGetRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        getActualData=response.as(AdminGetResponsePojo.class);
    }

    @And("admin get ile gelen response dogrulanir")
    public void adminGetIleGelenResponseDogrulanir() {
        assertEquals(expected.getUsername(),getActualData.getContent().get(1).getUsername());
    }

}
