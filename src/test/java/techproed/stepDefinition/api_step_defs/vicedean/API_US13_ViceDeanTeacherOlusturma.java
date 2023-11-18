package techproed.stepDefinition.api_step_defs.vicedean;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.postTeacher.vice.post.ResponsePojo;
import techproed.pojos.vicedean.postTeacher.vice.post.TeacherVicePostPojo;
import techproed.utilities.ConfigReader;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class API_US13_ViceDeanTeacherOlusturma {
    TeacherVicePostPojo payload;
    Response response;
    ResponsePojo actualData;
    @Given("Siteye {string} yetkisi ile giris yapilir")
    public void siteye_yetkisi_ile_giris_yapilir(String user) {
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
    @Given("Teacher eklemek icin URL duzenlenir")
    public void teacher_eklemek_icin_url_duzenlenir() {
        //https://managementonschools.com/app/teachers/save
        spec.pathParams("first", "teachers", "second", "save");
    }
    @Given("Teacher eklemek icin PAYLOAD duzenlenir")
    public void teacher_eklemek_icin_payload_duzenlenir() {


        payload = new TeacherVicePostPojo("1995-01-01","Texas","sheldoncooper@forkshape.com","MALE","true",Collections.singletonList("1967"),"Sheldon","Aa123456","451-895-6312","245-31-8914","Cooper","TeacherSheldon");
        //{
        //  "birthDay": "1995-01-01",
        //  "birthPlace": "Texas",
        //  "email": "sheldoncooper@forkshape.com",
        //  "gender": "MALE",
        //  "isAdvisorTeacher": "true",
        //  "lessonsIdList": [
        //    "1967"
        //  ],
        //  "name": "Sheldon",
        //  "password": "Aa123456",
        //  "phoneNumber": "451-895-6312",
        //  "ssn": "245-31-8914",
        //  "surname": "Cooper",
        //  "username": "TeacherSheldon"
        //}

    }
    @When("Teacher eklemek icin request gonderilir ve response alinir")
    public void teacher_eklemek_icin_request_gonderilir_ve_response_alinir() {
        response=given(spec).body(payload).when().post("{first}/{second}");
        actualData= response.as(ResponsePojo.class);
    }
    @Then("HTTP status code {int} oldugu kontrol edilir")
    public void http_status_code_oldugu_kontrol_edilir(int statuscode) {
        assertEquals(statuscode,response.statusCode());

    }
    @Then("Teacher bilgileri dogrulanir")
    public void teacher_bilgileri_dogrulanir() {
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getEmail(),actualData.getObject().getEmail());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
    }


}
