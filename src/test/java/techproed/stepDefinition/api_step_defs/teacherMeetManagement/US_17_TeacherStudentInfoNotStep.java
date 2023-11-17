package techproed.stepDefinition.api_step_defs.teacherMeetManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import techproed.pojos.teacher.PostStudentInfo.ObjectPojo;
import techproed.pojos.teacher.PostStudentInfo.PostExpectedDataPojo;
import techproed.pojos.teacher.PostStudentInfo.PostResponsePojo;
import techproed.pojos.teacher.PostStudentInfo.StudentResponsePojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;
import static techproed.base_url.BaseUrl.spec;
import static techproed.stepDefinition.api_step_defs.admin.AdminManagement.id;

public class US_17_TeacherStudentInfoNotStep {

    PostExpectedDataPojo payload;
    Response response;
    StudentResponsePojo studentResponse;
    PostResponsePojo postActualData;
    ObjectPojo expectedData;
    ObjectPojo getActualData;


  public static int id;
    static int studentId;



    @And("Sdutent info save icin URL duzenlenir_is")
    public void sdutentInfoSaveIcinURLDuzenlenir_is() {
        //https://managementonschools.com/app/studentInfo/save
        spec.pathParams("first","studentInfo","second","save");
    }

    @And("Sdutent info save icin payload duzenlenir_is")
    public void sdutentInfoSaveIcinPayloadDuzenlenir_is() {
         payload= new PostExpectedDataPojo(5,19,90,"Başarılarının devamını dilerim..?",1915,100, 2071);


        //{
        //  "absentee": 5,
        //  "educationTermId": 19,
        //  "finalExam": 90,
        //  "infoNote": "Başarılarının devamını dilerim..?",
        //  "lessonId": 1915,
        //  "midtermExam": 100,
        //  "studentId": 1934
        //}
    }

    @When("Sdutent info save icin POST Request gonderilir ve Reponse alinir_is")
    public void sdutentInfoSaveIcinPOSTRequestGonderilirVeReponseAlinir_is() {
         response = given(spec).body(payload).when().post("{first}/{second}");
         response.prettyPrint();

    }


    @And("Sdutent info save icin gelen Response body dogrulanir_is")
    public void sdutentInfoSaveIcinGelenResponseBodyDogrulanir_is() {
        PostResponsePojo actualData=response.as(PostResponsePojo.class);

        assertEquals(payload.getAbsentee(),actualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getObject().getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getObject().getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getObject().getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getObject().getMidtermExam());
        assertEquals(payload.getStudentId(),actualData.getObject().getStudentResponse().getUserId());
        //{
        //  "absentee": 5,
        //  "educationTermId": 19,
        //  "finalExam": 90,
        //  "infoNote": "Başarılarının devamını dilerim..?",
        //  "lessonId": 1915,
        //  "midtermExam": 100,
        //  "studentId": 1934
        //}
    }

    @And("Kayitli Sdutent info bilgisinin ID nosu alinir_is")
    public void kayitliSdutentInfoBilgisininIDNosuAlinir_is() {
            spec.pathParams("first", "studentInfo", "second", "getAllForTeacher").queryParams("page", 0, "size", 5);
            response = given(spec).when().get("{first}/{second}");

            JsonPath jsonPath =  response.jsonPath();
            List<Integer> idList = jsonPath.getList("content.findAll{it}.id");
            id = idList.get(0);


    }

    @And("Sdutent info get icin URL duzenlenir_is")
    public void sdutentInfoGetIcinURLDuzenlenir_is() {
        spec.pathParams("first", "studentInfo", "second", "get", "third", id);
        }


    @And("Sdutent info icin beklenen veriler duzenlenir_is")
    public void sdutentInfoIcinBeklenenVerilerDuzenlenir_is() {
        studentResponse = new StudentResponsePojo(2071, "08Student","Student08",
                "08student", "2008-10-01", "ankara", "548-986-6699",
                "FEMALE", 1241,"teamff", "team08f", "vveswtu@hotmail.com", true);
        expectedData = new ObjectPojo(id, 100.0, 100.0, 3, "Good Work!",
                "xray", 1847, 11, 15, 100.0,
                studentResponse, true, "AA");
        /*
        "id": 4328,
        "midtermExam": 100.0,
        "finalExam": 90.0,
        "absentee": 5,
        "infoNote": "Başarılarının devamını dilerim..?",
        "lessonName": "Chemisch ",
        "lessonId": 1915,
        "creditScore": 10,
        "educationTermId": 19,
        "average": 94.0 */
    }

    @When("Sdutent info icin GET Request gonderilir ve Response alinir_is")
    public void sdutentInfoIcinGETRequestGonderilirVeResponseAlinir_is() {
        response = given(spec).when().get("{first}/{second}/{third}");
        getActualData = response.as(ObjectPojo.class);
    }

    @And("Sdutent info icin gelen Response body dogrulanir_is")
    public void sdutentInfoIcinGelenResponseBodyDogrulanir_is() {
        assertEquals(studentResponse.getUserId(), getActualData.getStudentResponse().getUserId());
        assertEquals(studentResponse.getUsername(), getActualData.getStudentResponse().getUsername());
        assertEquals(studentResponse.getName(), getActualData.getStudentResponse().getName());
        assertEquals(studentResponse.getSurname(), getActualData.getStudentResponse().getSurname());
        assertEquals(studentResponse.getBirthDay(), getActualData.getStudentResponse().getBirthDay());
        assertEquals(studentResponse.getBirthPlace(), getActualData.getStudentResponse().getBirthPlace());
        assertEquals(studentResponse.getPhoneNumber(), getActualData.getStudentResponse().getPhoneNumber());
        assertEquals(studentResponse.getGender(), getActualData.getStudentResponse().getGender());
        assertEquals(studentResponse.getStudentNumber(), getActualData.getStudentResponse().getStudentNumber());
        assertEquals(studentResponse.getMotherName(), getActualData.getStudentResponse().getMotherName());
        assertEquals(studentResponse.getFatherName(), getActualData.getStudentResponse().getFatherName());
        assertEquals(studentResponse.getEmail(), getActualData.getStudentResponse().getEmail());
        assertEquals(studentResponse.isActive(), getActualData.getStudentResponse().isActive());

        assertEquals(expectedData.getId(), getActualData.getId());
        assertEquals(expectedData.getMidtermExam(), getActualData.getMidtermExam());
        assertEquals(expectedData.getFinalExam(), getActualData.getFinalExam());
        assertEquals(expectedData.getAbsentee(), getActualData.getAbsentee());
        assertEquals(expectedData.getInfoNote(), getActualData.getInfoNote());
        assertEquals(expectedData.getLessonName(), getActualData.getLessonName());
        assertEquals(expectedData.getLessonId(), getActualData.getLessonId());
        assertEquals(expectedData.getCreditScore(), getActualData.getCreditScore());
        assertEquals(expectedData.getEducationTermId(), getActualData.getEducationTermId());
        assertEquals(expectedData.getAverage(), getActualData.getAverage());
        assertTrue(getActualData.getStudentResponse().toString().contains(expectedData.getStudentResponse().toString()));

        assertEquals(expectedData.isCompulsory(), getActualData.isCompulsory());
        assertEquals(expectedData.getNote(), getActualData.getNote());
    }

    @Then("status kodun {int} oldugu dogrulanir_is")
    public void statusKodunOlduguDogrulanir_is(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }


    @Given("Student Info Delete icin URL duzenlenir_is")
    public void studentInfoDeleteIcinURLDuzenlenir_is() {
        spec.pathParams("first", "studentInfo", "second", "delete", "third", id);
    }

    @When("Student Info icin DELETE Request gonderilir ve Response alinir_is")
    public void studentInfoIcinDELETERequestGonderilirVeResponseAlinir_is() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        postActualData = response.as(PostResponsePojo.class);
    }

    @And("Student Info Delete icin gelen Response body dogrulanir_is")
    public void studentInfoDeleteIcinGelenResponseBodyDogrulanir_is() {
        assertEquals("Student Info deleted Successfully", postActualData.getMessage());
        assertEquals("OK", postActualData.getHttpStatus());
    }

    @Given("Student Info Update icin URL duzenlenir_is")
    public void studentInfoUpdateIcinURLDuzenlenir_is() {
        spec.pathParams("first", "studentInfo", "second", "update", "third", id);
    }

    @And("Student Info Update icin gonderilecek veriler duzenlenir_is")
    public void studentInfoUpdateIcinGonderilecekVerilerDuzenlenir_is() {
        payload= new PostExpectedDataPojo(8,19,100,"Su sizintisi su kaynagina isarettir..!?",1915,100, 2071);
    }

    @When("Student Info Update icin PUT Request gonderilir ve Response alinir_is")
    public void studentInfoUpdateIcinPUTRequestGonderilirVeResponseAlinir_is() {
        response = given(spec).body(payload).when().put("{first}/{second}/{third}");
        postActualData = response.as(PostResponsePojo.class);
    }


    @And("Student Info Update icin gelen Response body dogrulanir_is")
    public void studentInfoUpdateIcinGelenResponseBodyDogrulanir_is() {
        assertEquals(payload.getAbsentee(), postActualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(), postActualData.getObject().getEducationTermId());
        assertTrue(postActualData.getObject().getFinalExam().toString().contains(String.valueOf(payload.getFinalExam())));
        assertEquals(payload.getInfoNote(), postActualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(), postActualData.getObject().getLessonId());
        assertTrue(postActualData.getObject().getMidtermExam().toString().contains(String.valueOf(payload.getMidtermExam())));
    }
}
/*
List<Integer> ogrencilerinId;
    @Given("tum ogrencilerin idleri alinir")
    public void tumOgrencilerinIdleriAlinir() {
        spec.pathParams("first", "admin", "second", "save");
        response=given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        ogrencilerinId=json.getList("findAll{it.id}");

    }
 */