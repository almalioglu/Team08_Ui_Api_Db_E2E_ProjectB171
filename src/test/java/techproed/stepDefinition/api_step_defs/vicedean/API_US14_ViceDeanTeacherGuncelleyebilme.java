package techproed.stepDefinition.api_step_defs.vicedean;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.postTeacher.vice.put.ResponsePojo;
import techproed.pojos.vicedean.postTeacher.vice.put.TeacherVicePutPojo;
import techproed.utilities.ConfigReader;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class API_US14_ViceDeanTeacherGuncelleyebilme {
    TeacherVicePutPojo payload;
    Response response;
    ResponsePojo actualData;
    @Given("Siteye {string} ile giris yapilir")
    public void siteye_ile_giris_yapilir(String user) {
        switch (user.toLowerCase()) {
            case "admin":
                setup(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("Password"));
                break;
            case "dean":
                setup(ConfigReader.getProperty("Dean"), ConfigReader.getProperty("Password"));
                break;
            case "vicedean":
                setup(ConfigReader.getProperty("Vicedean"), ConfigReader.getProperty("Password"));
                break;
            case "teacher":
                setup(ConfigReader.getProperty("Teacher"), ConfigReader.getProperty("Password"));
                break;
            case "student":
                setup(ConfigReader.getProperty("Student"), ConfigReader.getProperty("Password"));

        }
    }

    @Given("Kayitli ogretmen bilgilerini guncellemek icin URL duzenlenir")
    public void kayitli_ogretmen_bilgilerini_guncellemek_icin_url_duzenlenir() {
      //  https://managementonschools.com/app/teachers/update/3398
       spec.pathParams("first","teachers","second","update","third",3398);
    }

    @Given("Guncellenecek ogretmen verileri icin PAYLOAD hazirlanir")
    public void guncellenecek_ogretmen_verileri_icin_payload_hazirlanir() {
        payload = new TeacherVicePutPojo("1995-07-09","USA","sheldoncooper@forkshape.com","FEMALE","true", Collections.singletonList("1968"),"Sheldon","Aa123456","451-895-6312","245-31-8914","Cooper","TeacherSheldon");

        /*
        {
  "birthDay": "1995-09-09",
  "birthPlace": "USA",
  "email": "sheldoncooper@forkshape.com",
  "gender": "MALE",
  "isAdvisorTeacher": "true",
  "lessonsIdList": [
    "1967"
  ],
  "name": "Sheldon",
  "password": "Aa123456",
  "phoneNumber": "451-895-6312",
  "ssn": "245-31-8914",
  "surname": "Cooper",
  "username": "TeacherSheldon"
}

         */

    }

    @When("Kayitli ogretmen bilgilerini guncellemek icin request gonderilir ve response alinir")
    public void kayitli_ogretmen_bilgilerini_guncellemek_icin_request_gonderilir_ve_response_alinir() {
        response=given(spec).body(payload).put("{first}/{second}/{third}");
        actualData= response.as(ResponsePojo.class);
    }

    @Then("HTTP status codeun {int} oldugu dogrulanir")
    public void http_status_codeun_oldugu_dogrulanir(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @Then("Kayitli ogretmen guncellemek icin gelen BODY dogrulanir")
    public void kayitli_ogretmen_guncellemek_icin_gelen_body_dogrulanir() {
        assertEquals(payload.getEmail(), actualData.getObject().getEmail());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());

    }


}
