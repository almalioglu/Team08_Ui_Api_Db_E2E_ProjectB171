package techproed.stepDefinition.api_step_defs.vicedean;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.postLessonProgram.ExpectedDataPojo;
import techproed.pojos.vicedean.postLessonProgram.ResponsePojo;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;

public class US_10Dersprogramiolusturma {
    ExpectedDataPojo payload;
    Response response;

    @When("ders programi olusturmak icin POST request hazirlanir")
    public void dersProgramiOlusturmakIcinPOSTRequestHazirlanir() {
        spec.pathParams("first","lessonPrograms","second","save");

    }

    @Then("gonderilecek ders programi bilgileri hazirlanir")
    public void gonderilecekDersProgramiBilgileriHazirlanir() {
        List<Integer> lessonidlist = Collections.singletonList(1864);
        payload = new ExpectedDataPojo("MONDAY",15,lessonidlist,"22:55:00","23:56:00");
    }

    @Then("ders programi olusturmak icin POST request gonderilir")
    public void dersProgramiOlusturmakIcinPOSTRequestGonderilir() {
    response = given(spec).body(payload).when().post("{first}/{second}");


    }

    @Then("olusturulan ders programi bilgileri dogrulanir")
    public void olusturulanDersProgramiBilgileriDogrulanir() {
        ResponsePojo actualData= response.as(ResponsePojo.class);
        assertEquals(200,response.statusCode());
        assertEquals(payload.getDay(),actualData.getObject().getDay());
        //assertEquals(payload.getEducationTermId(),actualData.getObject().get);
        // assertEquals(payload.getStudentIds().get(0), String.valueOf(actualData.getObject().getStudents().get(0).getId()));
       // assertEquals(payload.getLessonIdList().get(0),String.valueOf(actualData.getObject().getLessonName().get(0).getLessonId()));
        assertEquals(payload.getStartTime(),actualData.getObject().getStartTime());
        assertEquals(payload.getStopTime(),actualData.getObject().getStopTime());

    }


    }

