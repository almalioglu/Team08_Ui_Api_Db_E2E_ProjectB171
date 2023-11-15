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
import techproed.pojos.student.meetList.MeetResponsePojo;
import techproed.pojos.student.meetList.StudentsPojo;
import techproed.pojos.student.studentInfoList.ContentPojo;
import techproed.pojos.student.studentInfoList.StudentInfoListExpectedPojo;
import techproed.pojos.student.studentInfoList.StudentResponsePojo;

import java.util.ArrayList;
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
    MeetResponsePojo[] actualDataMeet;
    MeetResponsePojo expectedDataMeet;
    StudentsPojo student;
    StudentInfoListExpectedPojo actualDataInfolist;
    ContentPojo studentExpected;
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

    }

    @Given("student icin meet URL duzenlenir")
    public void studentIcinMeetURLDuzenlenir() {
        //https://managementonschools.com/app/meet/getAllMeetByStudent
        spec.pathParams("first","meet","second","getAllMeetByStudent");
    }

    @And("meet list gorebilmek icin Get request gonderilir ve response alinir")
    public void meetListGorebilmekIcinGetRequestGonderilirVeResponseAlinir() {
        response=given(spec).when().get("{first}/{second}");
        actualDataMeet= response.as(MeetResponsePojo[].class);
        student= new StudentsPojo("1996-10-10","deneme","MALE",1170,"deneme",true,"451-67-4613","adana","145-845-6244","erçik","mehmet",2000,"deneme123@gmail.com","mehmet321");
        List<StudentsPojo> list=new ArrayList<>();
        list.add(student);
        expectedDataMeet=new MeetResponsePojo("2023-11-06","123-85-7412",1313,"Kamil","apiTest",list,"03:50:00","04:20:00",1183);


    }

    @Then("meet listin goruldugu dogrulanir")
    public void meetListinGorulduguDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(expectedDataMeet.getId(),actualDataMeet[0].getId());
        assertEquals(expectedDataMeet.getDescription(),actualDataMeet[0].getDescription());
        assertEquals(expectedDataMeet.getStartTime(),actualDataMeet[0].getStartTime());
        assertEquals(expectedDataMeet.getStopTime(),actualDataMeet[0].getStopTime());
        assertEquals(expectedDataMeet.getAdvisorTeacherId(),actualDataMeet[0].getAdvisorTeacherId());
        assertEquals(expectedDataMeet.getTeacherName(),actualDataMeet[0].getTeacherName());
        assertEquals(expectedDataMeet.getTeacherSsn(),actualDataMeet[0].getTeacherSsn());
        assertEquals(student.getId(),actualDataMeet[0].getStudents().get(0).getId());
        assertEquals(student.getUsername(),actualDataMeet[0].getStudents().get(0).getUsername());
        assertEquals(student.getSsn(),actualDataMeet[0].getStudents().get(0).getSsn());
        assertEquals(student.getName(),actualDataMeet[0].getStudents().get(0).getName());
        assertEquals(student.getSurname(),actualDataMeet[0].getStudents().get(0).getSurname());
        assertEquals(student.getBirthDay(),actualDataMeet[0].getStudents().get(0).getBirthDay());
        assertEquals(student.getBirthPlace(),actualDataMeet[0].getStudents().get(0).getBirthPlace());
        assertEquals(student.getPhoneNumber(),actualDataMeet[0].getStudents().get(0).getPhoneNumber());
        assertEquals(student.getGender(),actualDataMeet[0].getStudents().get(0).getGender());
        assertEquals(student.getStudentNumber(),actualDataMeet[0].getStudents().get(0).getStudentNumber());
        assertEquals(student.getEmail(),actualDataMeet[0].getStudents().get(0).getEmail());
        assertEquals(student.isActive(),actualDataMeet[0].getStudents().get(0).isActive());
    }

    @Given("student icin ders notlarini gorme URL duzenlenir")
    public void studentIcinDersNotlariniGormeURLDuzenlenir() {
        //https://managementonschools.com/app/studentInfo/getAllByStudent?page=0&size=10
        spec.pathParams("first","studentInfo","second","getAllByStudent")
                .queryParams("page",0,"size",10);

    }

    @And("ders notlarini gorebilmek icin GET request gonderilir ve response alinir")
    public void dersNotlariniGorebilmekIcinGETRequestGonderilirVeResponseAlinir() {
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        actualDataInfolist=response.as(StudentInfoListExpectedPojo.class);
        StudentResponsePojo studentData=new StudentResponsePojo(2000,"mehmet321","mehmet","erçik","1996-10-10","adana","145-845-6244","MALE",1170,"deneme","deneme","deneme123@gmail.com",true);
        studentExpected=new ContentPojo(3952,100.0,100.0,3,"Good Work!","xray",1847,11,15,100.0,studentData,true,"AA");


    }


    @Then("donen response dogrulanir")
    public void donenResponseDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(studentExpected.getMidtermExam(),actualDataInfolist.getContent().get(0).getMidtermExam());
        assertEquals(studentExpected.getFinalExam(),actualDataInfolist.getContent().get(0).getFinalExam());
        assertEquals(studentExpected.getAbsentee(),actualDataInfolist.getContent().get(0).getAbsentee());
        assertEquals(studentExpected.getInfoNote(),actualDataInfolist.getContent().get(0).getInfoNote());
        assertEquals(studentExpected.getLessonName(),actualDataInfolist.getContent().get(0).getLessonName());
        assertEquals(studentExpected.getLessonId(),actualDataInfolist.getContent().get(0).getLessonId());
        assertEquals(studentExpected.getCreditScore(),actualDataInfolist.getContent().get(0).getCreditScore());
        assertEquals(studentExpected.getEducationTermId(),actualDataInfolist.getContent().get(0).getEducationTermId());
        assertEquals(studentExpected.getAverage(),actualDataInfolist.getContent().get(0).getAverage());

    }
}
