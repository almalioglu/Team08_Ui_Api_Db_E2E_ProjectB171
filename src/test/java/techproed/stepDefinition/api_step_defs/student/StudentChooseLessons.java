package techproed.stepDefinition.api_step_defs.student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import techproed.pojos.student.AddChooseLessonsResponsePojo;
import techproed.pojos.student.ChooseLessonsPayloadPojo;
import techproed.pojos.student.LessonsProgramResponsePojo;
import techproed.pojos.student.ObjectPojo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static techproed.base_url.BaseUrl.spec;

public class StudentChooseLessons {
    static Response response;

    static LessonsProgramResponsePojo[] lessonsList;
    ChooseLessonsPayloadPojo payload;
    static List<Integer> id;
    Random random=new Random();
    AddChooseLessonsResponsePojo actualData;
    AddChooseLessonsResponsePojo expectedData;
    ObjectPojo object;
    @Given("student icin URL duzenlenir")
    public void student_icin_url_duzenlenir() {
        spec.pathParams("first","lessonPrograms","second","getAll");
    }
    @When("choose lessons gorebilmek icin Get request gonderilir ve response alinir")
    public void choose_lessons_gorebilmek_icin_get_request_gonderilir_ve_response_alinir() {
        response=given(spec).when().get("{first}/{second}");
        lessonsList = response.as(LessonsProgramResponsePojo[].class);
        JsonPath json =response.jsonPath();
        id=json.getList("findAll{it}lessonProgramId");

    }
    @When("choose lessonsda start time ve stop time gorulabildigi dogrulanir")
    public void choose_lessonsda_start_time_ve_stop_time_gorulabildigi_dogrulanir() {
        assertFalse(lessonsList[0].getStartTime().isEmpty());
        assertFalse(lessonsList[0].getStopTime().isEmpty());
    }
    @When("choose lessonsda teacher bilgilerinin goruldugu dogrulanir")
    public void choose_lessonsda_teacher_bilgilerinin_goruldugu_dogrulanir() {
        assertFalse(lessonsList[0].getTeachers().isEmpty());
    }
    @When("choose lessonsda day bilgilerinin goruldugu dogrulanir")
    public void choose_lessonsda_day_bilgilerinin_goruldugu_dogrulanir() {
        assertFalse(lessonsList[0].getDay().isEmpty());

    }


    @Given("student icin ders secme URL duzenlenir")
    public void studentIcinDersSecmeURLDuzenlenir() {
        //https://managementonschools.com/app/students/chooseLesson
        spec.pathParams("first","students","second","chooseLesson");
    }

    @And("student choose lessonsdan ders secebilmek icin payload olusturulur")
    public void studentChooseLessonsdanDersSecebilmekIcinPayloadOlusturulur() {
        payload =new ChooseLessonsPayloadPojo();
        int randomSecim=random.nextInt(id.size()-1);
        payload.setLessonProgramId(List.of(id.get(randomSecim)));

        object=new ObjectPojo(2071,"08Student","Student08","08student","2008-10-01","ankara","548-986-6699","FEMALE",1241,"teamff","team08f","vveswtu@hotmail.com",true);
        expectedData=new AddChooseLessonsResponsePojo(object,"Lesson added to Student","CREATED");


    }

    @When("students choose lessons post icin request gonderilir payload alinir")
    public void studentsChooseLessonsPostIcinRequestGonderilirPayloadAlinir() {
        response=given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData=response.as(AddChooseLessonsResponsePojo.class);

    }

    @Then("dersin eklendigi dogrulanir")
    public void dersinEklendigiDogrulanir() {
    assertEquals(object.getUserId(),actualData.getObject().getUserId());
    assertEquals(object.getUsername(),actualData.getObject().getUsername());
    assertEquals(object.getName(),actualData.getObject().getName());
    assertEquals(object.getSurname(),actualData.getObject().getSurname());
    assertEquals(object.getBirthDay(),actualData.getObject().getBirthDay());
    assertEquals(object.getBirthPlace(),actualData.getObject().getBirthPlace());
    assertEquals(object.getPhoneNumber(),actualData.getObject().getPhoneNumber());
    assertEquals(object.getStudentNumber(),actualData.getObject().getStudentNumber());
    assertEquals(object.getMotherName(),actualData.getObject().getMotherName());
    assertEquals(object.getFatherName(),actualData.getObject().getFatherName());
    assertEquals(object.getEmail(),actualData.getObject().getEmail());
    assertEquals(object.isActive(),actualData.getObject().isActive());
    assertEquals(expectedData.getMessage(),actualData.getMessage());
    assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
        /*
        {
    "object": {
        "userId": 2071,
        "username": "08Student",
        "name": "Student08",
        "surname": "08student",
        "birthDay": "2008-10-01",
        "birthPlace": "ankara",
        "phoneNumber": "548-986-6699",
        "gender": "FEMALE",
        "studentNumber": 1241,
        "motherName": "teamff",
        "fatherName": "team08f",
        "email": "vveswtu@hotmail.com",
        "active": true
    },
    "message": "Lesson added to Student",
    "httpStatus": "CREATED"
}
         */
    }
}
