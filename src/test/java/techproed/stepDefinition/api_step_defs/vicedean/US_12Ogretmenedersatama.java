package techproed.stepDefinition.api_step_defs.vicedean;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getlessonteacher.GetResponsePojo;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.spec;

public class US_12Ogretmenedersatama {
    static Response response;
    @When("ogretmene ders atamak için URL hazıranır")
    public void ogretmeneDersAtamakIçinURLHazıranır() {
        //https://managementonschools.com/app/lessonPrograms/getAllAssigned
        //{{baseUrl}}/teachers/getSavedTeacherById/:id
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",2987);
    }

    @Then("ogretmene ders atamak post reguest goderilir ve response alinir")
    public void ogretmeneDersAtamakPostReguestGoderilirVeResponseAlinir() {
        response =given(spec).when().get("{first}/{second}/{third}");
        //response.prettyPrint();
    }

    @Then("ogretmen ders bilgileri dogrulanır")
    public void ogretmenDersBilgileriDogrulanır() {
        GetResponsePojo actualdata = response.as(GetResponsePojo.class);
        assertEquals(200,response.statusCode());
        assertEquals("teachercihan",actualdata.getObject().getUsername());
        assertEquals( "cihankaranfil@hotmail.com",actualdata.getObject().getEmail());
        assertEquals( "MALATYA",actualdata.getObject().getBirthPlace());
        assertEquals( "445-555-2121",actualdata.getObject().getPhoneNumber());
        assertEquals( "445-98-9887",actualdata.getObject().getSsn());
        assertEquals( 1526,actualdata.getObject().getLessonsProgramList().get(0).getId());



    }
}
