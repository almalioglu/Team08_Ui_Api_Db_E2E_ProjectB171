package techproed.stepDefinition.api_step_defs.vicedean;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.deletelessonprograms.DeletelessonprogramsPojo;
import techproed.pojos.vicedean.postLessonProgram.ExpectedDataPojo;
import techproed.pojos.vicedean.postLessonProgram.ResponsePojo;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;
import static techproed.pojos.vicedean.postLessonProgram.ObjectPojo.lessonProgramId;

public class US_10Dersprogramiolusturma {
    ExpectedDataPojo payload;
    Response response;
    DeletelessonprogramsPojo actualData;
    public static List<Integer> lessonidlist;

    Faker fake= new Faker();
    @When("ders programi olusturmak icin POST request hazirlanir")
    public void dersProgramiOlusturmakIcinPOSTRequestHazirlanir() {
        spec.pathParams("first","lessonPrograms","second","save");

    }

    @Then("gonderilecek ders programi bilgileri hazirlanir")
    public void gonderilecekDersProgramiBilgileriHazirlanir() {
        lessonidlist = Collections.singletonList(1865);

        payload = new ExpectedDataPojo("MONDAY",15,lessonidlist,"22:59","23:59");
    }

    @Then("ders programi olusturmak icin POST request gonderilir")
    public void dersProgramiOlusturmakIcinPOSTRequestGonderilir() {
    response = given(spec).body(payload).when().post("{first}/{second}");
    response.prettyPrint();



    }

    @Then("olusturulan ders programi bilgileri dogrulanir")
    public void olusturulanDersProgramiBilgileriDogrulanir() {
        ResponsePojo actualData= response.as(ResponsePojo.class);
        assertEquals(200,response.statusCode());
        assertEquals(payload.getDay(),actualData.getObject().getDay());
        // assertEquals(payload.getStudentIds().get(0), String.valueOf(actualData.getObject().getStudents().get(0).getId()));
        assertEquals(payload.getLessonIdList().get(0).toString(),String.valueOf(actualData.getObject().getLessonName().get(0).getLessonId()));
       // assertEquals(payload.getStartTime(),actualData.getObject().getStartTime());
       // assertEquals(payload.getStopTime(),actualData.getObject().getStopTime());
        System.out.println(lessonProgramId);

    }


    @Then("silinecek des icin URL duzenlenir")
    public void silinecekDesIcinURLDuzenlenir() {
        //{{baseUrl}}/lessonPrograms/delete/:id
        spec.pathParams("first","lessonPrograms","second","delete","third",lessonProgramId);
    }

    @And("silinecek ders icin DELETE Request gonderilir ve Response alinir")
    public void silinecekDersIcinDELETERequestGonderilirVeResponseAlinir() {
        response  = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
         actualData = response.as(DeletelessonprogramsPojo.class);

    }

    @And("gelen Response body dogrulanir")
    public void gelenResponseBodyDogrulanir() {

        assertEquals("Lesson Program Deleted",actualData.getMessage());
        assertEquals("OK",actualData.getHttpStatus());
    }
}

