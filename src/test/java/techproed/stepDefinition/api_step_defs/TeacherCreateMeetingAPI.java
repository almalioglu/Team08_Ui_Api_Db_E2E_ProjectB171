package techproed.stepDefinition.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.teacher_createMeeting.MeetPostPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static techproed.base_url.BaseUrl.spec;

public class TeacherCreateMeetingAPI {
    MeetPostPojo payload;
    @Given("URL is edited to create a meeting.")
    public void urlIsEditedToCreateAMeeting() {
        //https://managementonschools.com/app/meet/save
        spec.pathParams("first","dean","second","save");
    }

    @And("Payload is arranged to create a meeting")
    public void payloadIsArrangedToCreateAMeeting() {
        List<String> studentIds= List.of("2123");
        payload=new MeetPostPojo("2024-01-01","acil ve onemli","10:00","11:00",studentIds);

    }

    @When("A request is sent to create a meeting and a response is received.")
    public void aRequestIsSentToCreateAMeetingAndAResponseIsReceived() {

        Response response=given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("HTTP status code should be {int}")
    public void httpStatusCodeShouldBe(int arg0) {
    }

    @And("response body is validated")
    public void responseBodyIsValidated() {
    }
}
