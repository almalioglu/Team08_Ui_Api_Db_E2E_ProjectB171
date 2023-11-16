package techproed.stepDefinition.api_step_defs.admin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import techproed.pojos.admin.addAdmin.AdminPostPojo;
import techproed.pojos.admin.addAdmin.AdminPostResponsePojo;
import techproed.pojos.admin.addAdmin.ObjectResponsePojo;
import techproed.pojos.admin.getAdmin.AdminGetExpectedPojo;
import techproed.pojos.admin.getAdmin.AdminGetResponsePojo;
import techproed.pojos.admin.getAdmin.ContentPojo;
import techproed.utilities.ConfigReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
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

    Faker faker=new Faker();
    static String userName;
    static String randomSsn;
    static String randomPhoneNumber;
    public static int id;
    static ContentPojo getActualData;
    static List<Object> actualDataGet;
    static String deleteActualData;

    @Given("admin save icin URL duzenlenir")
    public void adminSaveIcinURLDuzenlenir() {
        //https://managementonschools.com/app/admin/save
        spec.pathParams("first", "admin", "second", "save");
    }

    @And("admin save icin payload duzenlenir")
    public void adminSaveIcinPayloadDuzenlenir() {
        randomPhoneNumber=faker.regexify("\\d{3}-\\d{3}-\\d{4}");
        userName= faker.name().firstName();
        randomSsn= faker.idNumber().ssnValid();
        payload = new AdminPostPojo("1996-10-02", "ADANA", true, "MALE", "API", "A123456789a", randomPhoneNumber, randomSsn, "DENEME", userName);

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
        response.prettyPrint();
        JsonPath json=response.jsonPath();
        id =json.getInt("object.userId");//"findAll{it.id>190}"
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
            case"student":
                setup(ConfigReader.getProperty("Student"),ConfigReader.getProperty("Password"));

        }
    }


    @Given("admin get icin URL duzenlenir")
    public void adminGetIcinURLDuzenlenir() {
        //https://managementonschools.com/app/admin/getAll?page=1&size=10&sort=name&type=desc
        spec.pathParams("first", "admin", "second", "getAll");
    }

    @And("admin get expected data duzenlenir")
    public void adminGetExpectedDataDuzenlenir() {

        expected = new AdminGetExpectedPojo(id, userName, randomSsn, "API", "DENEME", "1996-10-02", "ADANA", randomPhoneNumber, "MALE", false);


    }

    @When("admin get request gonderilir ve response alinir")
    public void adminGetRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        response.prettyPrint();
        actualDataGet=json.getList("content.findAll{it.id=="+id+"}");




    }

    @And("admin get ile gelen response dogrulanir")
    public void adminGetIleGelenResponseDogrulanir() {
        assertTrue(actualDataGet.get(0).toString().contains(expected.getUsername()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getSsn()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getName()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getSurname()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getBirthDay()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getBirthPlace()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getPhoneNumber()));
        assertTrue(actualDataGet.get(0).toString().contains(expected.getGender()));
    }

    @Given("admin delete icin URL duzenlenir")
    public void adminDeleteIcinURLDuzenlenir() {
        //https://managementonschools.com/app/admin/delete/10
        spec.pathParams("first","admin","second","delete","third",id);
    }

    @When("admin delete request gonderilir ve response alinir")
    public void adminDeleteRequestGonderilirVeResponseAlinir() {
        response=given(spec).when().delete("{first}/{second}/{third}");
        deleteActualData=response.prettyPrint();
    }

    @And("admin delete islemi yapildigi dogrulanir")
    public void adminDeleteIslemiYapildigiDogrulanir() {
        assertEquals("Admin deleted Successful",deleteActualData);
    }
}
