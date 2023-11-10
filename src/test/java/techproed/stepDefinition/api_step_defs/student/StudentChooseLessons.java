package techproed.stepDefinition.api_step_defs.student;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.student.LessonsProgramResponsePojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.BaseUrl.spec;

public class StudentChooseLessons {
    static Response response;

    static LessonsProgramResponsePojo[] lessonsList;
    @Given("student icin URL duzenlenir")
    public void student_icin_url_duzenlenir() {
        spec.pathParams("first","lessonPrograms","second","getAll");
    }
    @When("choose lessons gorebilmek icin Get request gonderilir ve response alinir")
    public void choose_lessons_gorebilmek_icin_get_request_gonderilir_ve_response_alinir() {
        response=given(spec).when().get("{first}/{second}");
        lessonsList = response.as(LessonsProgramResponsePojo[].class);
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


}
