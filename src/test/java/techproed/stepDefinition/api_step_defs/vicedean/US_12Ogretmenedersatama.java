package techproed.stepDefinition.api_step_defs.vicedean;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getlessonteacher.GetlessonsResponsePojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;

public class US_12Ogretmenedersatama {
    static Response response;
    @When("ogretmene ders atamak için URL hazıranır")
    public void ogretmeneDersAtamakIçinURLHazıranır() {
        //https://managementonschools.com/app/lessonPrograms/getAllAssigned
        spec.pathParams("first","lessonPrograms","second","getAllAssigned");
    }

    @Then("ogretmene ders atamak post reguest goderilir ve response alinir")
    public void ogretmeneDersAtamakPostReguestGoderilirVeResponseAlinir() {
        response =given(spec).when().get("{first}/{second}");
        //response.prettyPrint();
//
//        JsonPath json = response.jsonPath();
//        List<Integer> a = json.getList("findAll{it.lessonProgramId}");
//        System.out.println(a);

        GetlessonsResponsePojo[] actualData = response.as(GetlessonsResponsePojo[].class);
        System.out.println(actualData[0].lessonProgramId());

    }

    @Then("ogretmen ders bilgileri dogrulanır")
    public void ogretmenDersBilgileriDogrulanır() {
       // GetlessonsResponsePojo[] actualData = response.as(GetlessonsResponsePojo[].class);
      //  System.out.println(actualData[0].lessonProgramId());

       // assertEquals(2129,actualData.getLessonProgramId());
    }
}
