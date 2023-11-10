package techproed.stepDefinition.api_step_defs.dean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.dean.postViceDean.Response6Pojo;

import static io.restassured.RestAssured.given;
import static techproed.base_url.BaseUrl.spec;

public class US_06DeanViceDeanOlusturabilmeliStepdef {
    Response6Pojo payload;
    @Given("Vice Dean olusturabilmek icin URL duzenlenir")
    public void viceDeanOlusturabilmekIcinURLDuzenlenir() {
        spec.pathParams("first","vicedean","second","save");
       //https://managementonschools.com/app/vicedean/save)
    }

    @And("Vice Dean olusturabilmek icin payload kismi duzenlenir")
    public void viceDeanOlusturabilmekIcinPayloadKismiDuzenlenir() {
       payload = new Response6Pojo("1999-09-09","Bursa","FEMALE","Lale","Lale1234","565-988-4347","233-12-4744", "Yılmaz1","LALE230");

    }

    @When("Vice Dean olusturabilmek icin request gonderilir response alinir")
    public void viceDeanOlusturabilmekIcinRequestGonderilirResponseAlinir() {
    Response response = given(spec).body(payload).when().post("{first}/{second}");
    }

    @And("Vice Dean olusmasi icin gelen body dogrulanir")
    public void viceDeanOlusmasiIcinGelenBodyDogrulanir() {

    }
}
