package techproed.stepDefinition.api_step_defs.dean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.dean.postViceDean.Response6Pojo;
import techproed.pojos.dean.postViceDean.ResponseViceDeanPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static techproed.base_url.BaseUrl.spec;

public class US_06DeanViceDeanOlusturabilmeliStepdef {
    Response6Pojo payload;
    Response response;
    int Id;
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
        response = given(spec).body(payload).when().post("{first}/{second}");


        JsonPath jsonPath = response.jsonPath();
        List<Integer> idList = jsonPath.getList("content.findAll{it.surname == 'ORAL'}.userId");
        Id = idList.get(1);
        System.out.println(Id);
    }
    @And("Vice Dean olusmasi icin gelen body dogrulanir")
    public void viceDeanOlusmasiIcinGelenBodyDogrulanir() {
        ResponseViceDeanPojo actualData = response.as(ResponseViceDeanPojo.class);

    }

    @And("Olusturulan vice dean silinir")
    public void olusturulanViceDeanSilinir() {
       // {{baseUrl}}/vicedean/delete/:userId
       //spec.pathParams("first","vicedean","second","delete","third",1);
    }
}
