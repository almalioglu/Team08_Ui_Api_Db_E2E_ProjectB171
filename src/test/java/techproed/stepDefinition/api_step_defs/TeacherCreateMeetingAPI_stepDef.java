package techproed.stepDefinition.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.teacher_createMeeting.MeetPostPojo;
import techproed.pojos.teacher_createMeeting.Objectpojo;
import techproed.pojos.teacher_createMeeting.Responsepojo;
import techproed.pojos.teacher_createMeeting.Studentspojo;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class TeacherCreateMeetingAPI_stepDef {

    MeetPostPojo payload;
    Response response;
    static List<String> studentIds;
    Responsepojo actualData;
    static int meetID;
    public static Studentspojo students;
    public static Objectpojo object;
    public static Responsepojo expectedData;

    @Given("toplantı olusturmak için url düzenlenir")
    public void toplantıOlusturmakIçinUrlDüzenlenir() {

        spec.pathParams("first", "meet", "second", "save");
    }

    @And("toplantı olusturmak için payload düzenlenir")
    public void toplantıOlusturmakIçinPayloadDüzenlenir() {
        studentIds = List.of("2123");
        payload = new MeetPostPojo("2031-01-01", "acil ve onemli", "10:00", "11:00", studentIds);
    }

    @When("toplantı olusturmak için request gönderilir response alınır")
    public void toplantıOlusturmakIçinRequestGönderilirResponseAlınır() {
      //  setup("Teacher08", "Batch171+");
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(Responsepojo.class);


    }

    @Then("HTTP status code should be {int}")
    public void httpStatusCodeShouldBe(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }

    @And("Toplantı olusturmak icin gelen body dogrulanır")
    public void toplantıOlusturmakIcinGelenBodyDogrulanır() {
        assertEquals(payload.getDate(), actualData.getObject().getDate());
        assertEquals(payload.getDescription(), actualData.getObject().getDescription());
        assertTrue(actualData.getObject().getStartTime().contains(payload.getStartTime()));
        assertTrue(actualData.getObject().getStopTime().contains(payload.getStopTime()));
        //assertEquals(payload.getStudentIds().get(0),actualData.getObject().getStudents().get(0));

    }


//////////////////////////           SCENARİO 2 GETID         /////////////////////////////////////////////

    @Given("Kayitli meet in ID nosu alinir")
    public void kayitliMeetInIDNosuAlinir() {
       // setup("Teacher08", "Batch171+");
        //https://managementonschools.com/app/meet/getAll
        spec.pathParams("first", "meet", "second", "getAll");
        response = given(spec).when().get("{first}/{second}");
        JsonPath json = response.jsonPath();
        List<Integer> meetIdList = json.getList("findAll{it.students[0].id == " + studentIds.get(0) + "}.id");
        meetID = meetIdList.get(0);
    }

    @And("Teacher Meet GetMeetById icin URL duzenlenir")
    public void teacherMeetGetMeetByIdIcinURLDuzenlenir() {
        //https://managementonschools.com/app/meet/getMeetById/1
        spec.pathParams("first", "meet", "second", "getMeetById", "third", meetID);
    }

    @And("Teacher Meet GetMeetById icin beklenen veriler düzenlenir")
    public void teacherMeetGetMeetByIdIcinBeklenenVerilerDüzenlenir() {

        students = new Studentspojo(2123, "mery", "123-32-4321", "mery", "mery", "1991-06-20", "istanbul", "123-321-4321", "FEMALE", "mery", "mery", 1293, "mustapha.kristen@forkshape.com", true);

        object = new Objectpojo(meetID, "acil ve onemli", "2028-01-01", "10:00:00", "11:00:00", 1416, "team08", "741-85-8877", (List<Studentspojo>) students);
        expectedData = new Responsepojo(object, "Meet successfully found", "CREATED");
    }

    @When("Teacher Meet GetMeetById icin request gönderilir response alınır")
    public void teacherMeetGetMeetByIdIcinRequestGönderilirResponseAlınır() {
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(Responsepojo.class);
    }


    @And("GetMeetById icin gelen response body dogrulanır")
    public void getmeetbyıdIcinGelenResponseBodyDogrulanır() {

        assertEquals(students.getId(), actualData.getObject().getStudents().get(0).getId());
        assertEquals(students.getUsername(), actualData.getObject().getStudents().get(0).getUsername());
        assertEquals(students.getSsn(), actualData.getObject().getStudents().get(0).getSsn());
        assertEquals(students.getName(), actualData.getObject().getStudents().get(0).getName());
        assertEquals(students.getSurname(), actualData.getObject().getStudents().get(0).getSurname());
        assertEquals(students.getBirthDay(), actualData.getObject().getStudents().get(0).getBirthDay());
        assertEquals(students.getBirthPlace(), actualData.getObject().getStudents().get(0).getBirthPlace());
        assertEquals(students.getPhoneNumber(), actualData.getObject().getStudents().get(0).getPhoneNumber());
        assertEquals(students.getGender(), actualData.getObject().getStudents().get(0).getGender());
        assertEquals(students.getMotherName(), actualData.getObject().getStudents().get(0).getMotherName());
        assertEquals(students.getFatherName(), actualData.getObject().getStudents().get(0).getFatherName());
        assertEquals(students.getStudentNumber(), actualData.getObject().getStudents().get(0).getStudentNumber());
        assertEquals(students.getEmail(), actualData.getObject().getStudents().get(0).getEmail());
        assertEquals(students.isActive(), actualData.getObject().getStudents().get(0).isActive());
/*
        {
    "object": {
        "id": 1390,
        "description": "acil ve onemli",
        "date": "2028-01-01",
        "startTime": "10:00:00",
        "stopTime": "11:00:00",
        "advisorTeacherId": 1416,
        "teacherName": "team08",
        "teacherSsn": "741-85-8877",
        "students": [

        ]
    },
    "message": "Meet successfully found",
    "httpStatus": "CREATED"
}
         */
        assertEquals(object.getId(), actualData.getObject().getId());
        assertEquals(object.getDescription(), actualData.getObject().getDescription());
        assertEquals(object.getDate(), actualData.getObject().getDate());
        assertEquals(object.getStartTime(), actualData.getObject().getStartTime());
        assertEquals(object.getStopTime(), actualData.getObject().getStopTime());
        assertEquals(object.getAdvisorTeacherId(), actualData.getObject().getAdvisorTeacherId());
        assertEquals(object.getTeacherName(), actualData.getObject().getTeacherName());
        assertEquals(object.getTeacherSsn(), actualData.getObject().getTeacherSsn());
        assertEquals(object.getStudents(), actualData.getObject().getStudents());

        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
    }


//////////////////////////           SCENARİO 3 MEETİNG PUT       /////////////////////////////////////////////










 //////////////////////////           SCENARİO 4 MEETİNG DELETE      /////////////////////////////////////////////
    @Given("meet delete icin url URL duzenlenir")
    public void meetDeleteIcinUrlURLDuzenlenir() {
       // setup("Teacher08", "Batch171+");
        //https://managementonschools.com/app/meet/delete/1
        spec.pathParams("first","meet","second","delete","third", meetID);
    }

    @When("meet delete icin request dönderilir ve response alinir")
    public void meetDeleteIcinRequestDönderilirVeResponseAlinir() {
        response=given(spec).when().delete("{first}/{second}/{third}");

    }
}