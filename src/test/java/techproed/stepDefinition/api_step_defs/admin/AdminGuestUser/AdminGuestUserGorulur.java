package techproed.stepDefinition.api_step_defs.admin.AdminGuestUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static techproed.base_url.BaseUrl.spec;

public class AdminGuestUserGorulur {
    @Given("admin get icin url duzenlenir")
    public void adminGetIcinUrlDuzenlenir() {
  //https://managementonschools.com/app/guestUser/getAll?page=0&size=10&sort=name&type=desc
        spec.pathParams("first","guestUser","second","getAll");
    }

    @When("get request gonderilir ve response alinir")
    public void getRequestGonderilirVeResponseAlinir() {



        //{
        //    "object": {
        //        "userId": 2378,
        //        "username": "Esma",
        //        "name": "Sena",
        //        "surname": "Karye",
        //        "birthDay": "2000-02-02",
        //        "ssn": "589-32-4567",
        //        "birthPlace": "Mersin",
        //        "phoneNumber": "444-456-7845",
        //        "gender": "FEMALE"
        //    },
        //    "message": "Guest User registered.",
        //    "httpStatus": "CREATED"
        //}
    }

    @Then("Status kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int arg0) {
    }

    @And("get ile gelen response dogrulanir")
    public void getIleGelenResponseDogrulanir() {
    }
}
