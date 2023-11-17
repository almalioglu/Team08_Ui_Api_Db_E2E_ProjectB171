package techproed.stepDefinition.api_step_defs.vicedean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import techproed.pojos.vicedean.getLesson.LessonssPojo;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getLesson.ObjectTEPojo;
import techproed.pojos.vicedean.getLesson.ResponseTEPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class US08_US09 {
    LessonssPojo payload;
    Response response;
    ResponseTEPojo actualData;
    int lessonId;
    public static ObjectTEPojo object;
    public static ResponseTEPojo expectedData;


    @Given("Vice Dean yetkisi ile giris yapilirr")
    public void viceDeanYetkisiIleGirisYapilirr() {
        setup("vicedeanjohn007","qweasdzxcfF2");
    }
    //Vice Dean lessons save Request gonderilir ve Response alinir
    @And("Vice Dean lessons save icin URL düzenlenir")
    public void viceDeanLessonsSaveIcinURLDüzenlenir() {
        spec.pathParams("first","lessons","second","save");
    }

    @And("Vice Dean lessons save icin payload duzenlenirr")
    public void viceDeanLessonsSaveIcinPayloadDuzenlenirr() {
        payload = new LessonssPojo("True","5","Algorithm 2");
    }

    @Then("status kodun {int} oldugu dogrulanirr")
    public void statusKodunOlduguDogrulanirr(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Vice Dean lessons save icin gelen Response body dogrulanir")
    public void viceDeanLessonsSaveIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getCompulsory(), actualData.getObject().isCompulsory());
        assertEquals(payload.getCreditScore(), actualData.getObject().getCreditScore());
        assertEquals(payload.getLessonName(), actualData.getObject().getLessonName());
    }


    @Given("Kayitli ders bilgisinin ID nosu alinirrr")
    public void kayitliDersBilgisininIDNosuAlinirrr() {
        setup("vicedeanjohn007","qweasdzxcfF2");
        spec.pathParams("first","lessons","second", "getAll");
        response = given(spec).when().get("{first}/{second}");
        JsonPath json = response.jsonPath();
        List<Integer> lessonIdList = json.getList("findAll{it.lessonName=='Algorithm 2'}.lessonId");
        lessonId = lessonIdList.get(0);
    }



    @And("Lesson getAllLessonByLessonId icin URL duzenlenirrr")
    public void lessonGetAllLessonByLessonIdIcinURLDuzenlenirrr() {
        spec.pathParams("first","lessons","second", "getAllLessonByLessonId","third", lessonId );
    }
    @And("Lesson getAllLessonByLessonId icin beklenen veriler duzenlenir")
    public void lessonGetAllLessonByLessonIdIcinBeklenenVerilerDuzenlenir() {
        object = new ObjectTEPojo(lessonId, "Algorithm 2", 5, true);
        expectedData = new ResponseTEPojo(object,"","");
    }

    @When("Lesson getAllLessonByLessonId icin GET Request gonderilir ve Response alinir")
    public void lessonGetAllLessonByLessonIdIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(ResponseTEPojo.class);
    }

    @And("Lesson getAllLessonByLessonId icin gelen Response body dogrulanir")
    public void lessonGetAllLessonByLessonIdIcinGelenResponseBodyDogrulanir() {
        assertEquals(object.getLessonId(), actualData.getObject().getLessonId());
        assertEquals(object.getLessonName(), actualData.getObject().getLessonName());
        assertEquals(object.getCreditScore(), actualData.getObject().getCreditScore());
        assertEquals(object.isCompulsory(), actualData.getObject().isCompulsory());
    }


    @When("Vice Dean lessons save Request gonderilir ve Response alinir")
    public void viceDeanLessonsSaveRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponseTEPojo.class);

    }

    @And("Vice Dean lessons get all için name alınır")
    public void viceDeanLessonsGetAllIçinNameAlınır() {
        
    }

    @When("Vice Dean lessons get Lesson by name için URL duzenlenir")
    public void viceDeanLessonsGetLessonByNameIçinURLDuzenlenir() {

    }

    @And("Vice Dean lessons get Lesson by name için Expected Data duzenlenir")
    public void viceDeanLessonsGetLessonByNameIçinExpectedDataDuzenlenir() {

    }

    @And("Vice Dean lessons get Lesson by name için Request gonderilir ve Response alinir")
    public void viceDeanLessonsGetLessonByNameIçinRequestGonderilirVeResponseAlinir() {

    }

    @And("Vice Dean lessons get Lesson by name için gelen Response body dogrulanir")
    public void viceDeanLessonsGetLessonByNameIçinGelenResponseBodyDogrulanir() {
    }
}

