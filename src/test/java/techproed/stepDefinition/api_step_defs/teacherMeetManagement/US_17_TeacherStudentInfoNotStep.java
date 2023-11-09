package techproed.stepDefinition.api_step_defs.teacherMeetManagement;

import io.cucumber.java.en.And;
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

public class US_17_TeacherStudentInfoNotStep {

    PostExpectedDataPojo payload;
    Response response;
    StudentResponsePojo studentResponse;
    ObjectPojo expectedData;
    ObjectPojo getActualData;


    static int infoId;
    static int studentId;

    @And("Kayitli tüm ogrencilerin Idsi alinir_is")
    public void kayitliTümOgrencilerinIdsiAlinir_is() {
        spec.pathParams("first", "students", "second", "getAll").queryParams("page", 0, "size", 10);
        response = given(spec).when().get("{first}/{second}");

        JsonPath jsonPath =  response.jsonPath();
        List<Integer> studentIdList = jsonPath.getList("content.findAll{it.infoNote == 'welldone!!'}.id");
        studentId = studentIdList.get(0);
    }

    @And("Sdutent info save icin URL duzenlenir_is")
    public void sdutentInfoSaveIcinURLDuzenlenir_is() {
        //https://managementonschools.com/app/studentInfo/save
        spec.pathParams("first","studentInfo","second","save");
    }

    @And("Sdutent info save icin payload duzenlenir_is")
    public void sdutentInfoSaveIcinPayloadDuzenlenir_is() {
         payload= new PostExpectedDataPojo(5,19,90,"Başarılarının devamını dilerim..?",1915,100, studentId);

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
        assertEquals(200,response.statusCode());
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
            List<Integer> idList = jsonPath.getList("content.findAll{it.infoNote == 'welldone!!'}.id");
            infoId = idList.get(0);
    }

    @And("Sdutent info get icin URL duzenlenir_is")
    public void sdutentInfoGetIcinURLDuzenlenir_is() {
        spec.pathParams("first", "studentInfo", "second", "get", "third", infoId);
        }


    @And("Sdutent info icin beklenen veriler duzenlenir_is")
    public void sdutentInfoIcinBeklenenVerilerDuzenlenir_is() {
        studentResponse = new StudentResponsePojo(1855, "TeacherConnor","Adam",
                "Connor", "1990-12-12", "Canada", "555-312-5312",
                "MALE", 1026,"Jane", "John", "connor@hotmail.com", true);
        expectedData = new ObjectPojo(infoId, 79, 83, 2, "welldone!!",
                "Computer Science", 1865, 8, 16, 81.4,
                studentResponse, false, "BA");
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