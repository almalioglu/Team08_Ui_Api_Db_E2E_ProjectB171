package techproed.stepDefinition.api_step_defs.admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.postTeacher.admin.ResponsePojo;
import techproed.pojos.vicedean.postTeacher.admin.TeacherAdminPostPojo;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;

public class API_US24_AdminTeacherOlusturma {
    TeacherAdminPostPojo payload;
    Response response;

    ResponsePojo actualData;
    @Given("Teacher eklemek icin URL duzenlenir\\(admin)")
    public void teacher_eklemek_icin_url_duzenlenir_admin() {
        //https://managementonschools.com/app/teachers/save
        spec.pathParams("first","teachers","second","save");
    }
    @Given("Teacher eklemek icin PAYLOAD duzenlenir\\(admin)")
    public void teacher_eklemek_icin_payload_duzenlenir_admin() {
        payload = new TeacherAdminPostPojo("1995-01-01","Texas","sheldoncooper@forkshape.com","MALE","true", Collections.singletonList("1967"),"Sheldon","Aa123456","451-895-6312","245-31-8914","Cooper","TeacherSheldon");

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
    @When("Teacher eklemek icin request gonderilir ve response alinir\\(admin)")
    public void teacher_eklemek_icin_request_gonderilir_ve_response_alinir_admin() {
        response=given(spec).body(payload).when().post("{first}/{second}");
        actualData= response.as(ResponsePojo.class);

    }
    @Then("HTTP status code {int} oldugunu kontrol edilir")
    public void http_status_code_oldugunu_kontrol_edilir(int stacode) {
            assertEquals(stacode,response.statusCode());
    }
        @Then("Teacher bilgileri dogrulanir \\(admin)")
    public void teacher_bilgileri_dogrulanir_admin() {
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
