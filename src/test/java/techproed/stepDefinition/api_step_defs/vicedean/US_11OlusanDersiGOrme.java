package techproed.stepDefinition.api_step_defs.vicedean;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getLesson.GetResponsepojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;


public class US_11OlusanDersiGOrme {
    Response response;
    @Given("Eklenen ders programini gorebilmek icin Get request hazirligi yapilir")
    public void eklenenDersPrograminiGorebilmekIcinGetRequestHazirligiYapilir() {
        spec.pathParams("first","lessonPrograms","second","getById","third",1865);

    }

    @Then("Ders program bilgilerini gormek icin Get request gonderilir")
    public void dersProgramBilgileriniGormekIcinGetRequestGonderilir() {
        response= given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Ders programi bilgileri dogrulanir")
    public void dersProgramiBilgileriDogrulanir() {
        GetResponsepojo actualData = response.as(GetResponsepojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(1865,actualData.getLessonProgramId());
        assertEquals("10:00:00",actualData.getStartTime());
        assertEquals("18:00:00",actualData.getStopTime());

    }

}
