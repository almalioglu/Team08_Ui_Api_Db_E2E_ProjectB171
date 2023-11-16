package techproed.stepDefinition.api_step_defs.vicedean;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.vicedean.postTeacher.TeacherDataPostBI;
import techproed.pojos.vicedean.postTeacher.TeacherPostResponseBI;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class API_US13_ViceDeanTeacherOlusturma {

    public Faker faker = new Faker();
    public String email;
    public String phoneNumber;
    public String ssn;
    public String username;
    public TeacherDataPostBI expectedTeacherDataPostBI;
    Response response;
    public static int teacherId;
    public TeacherDataPostBI actualTeacherDataPostBI;

    @Given("Siteye {string} yetkisi ile giris yapilir")
    public void siteyeYetkisiIleGirisYapilir(String user) {
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
            case"student":
                setup(ConfigReader.getProperty("ogrenciUsername"),ConfigReader.getProperty("ogrenciPassword"));

        }

    }

    @And("Teacher eklemek icin post request hazirligi yapilir")
    public void teacherEklemekIcinPostRequestHazirligiYapilir() {
        spec.pathParams("first","teachers","second","save");
    }

    @And("Gonderilecek Teacher bilgileri hazirlanir")
    public void gonderilecekTeacherBilgileriHazirlanir() {
        List<Integer> lessonsIdList = new ArrayList<>();
        lessonsIdList.add(17);
        email = faker.internet().emailAddress();
        phoneNumber = ReusableMethods.randomPassword(1,1,6);
        ssn = ReusableMethods.randomSsn();
        username = faker.name().firstName();
        expectedTeacherDataPostBI = new TeacherDataPostBI("1995-01-01", "Bursa", email, "FEMALE", true, lessonsIdList, "BITeacherName", "Aa123456", phoneNumber, ssn, "BITeacherSurname", username + "@");
    }

    @When("Teacher eklemek icin post request gonderilir")
    public void teacherEklemekIcinPostRequestGonderilir() {
        response = given(spec).body(expectedTeacherDataPostBI).when().post("{first}/{second}");
        response.prettyPrint();
        teacherId = response.jsonPath().getInt("object.userId");
        System.out.println(teacherId);
 //      actualTeacherDataPostBI = response.as(TeacherPostResponseBI.class);

 //  }

 //  @Then("Teacher bilgileri dogrulanir")
 //  public void teacherBilgileriDogrulanir() {
 //      assertEquals(200, response.statusCode());
 //      assertEquals(expectedTeacherDataPostBI.getBirthDay(), actualTeacherDataPostBI.getObject().getBirthDay());
 //      assertEquals(expectedTeacherDataPostBI.getBirthPlace(), actualTeacherDataPostBI.getObject().getBirthPlace());
 //      assertEquals(expectedTeacherDataPostBI.getEmail(), actualTeacherDataPostBI.getObject().getEmail());
 //      assertEquals(expectedTeacherDataPostBI.getGender(), actualTeacherDataPostBI.getObject().getGender());
 //      assertEquals(expectedTeacherDataPostBI.getName(), actualTeacherDataPostBI.getObject().getName());
 //      assertEquals(expectedTeacherDataPostBI.getPhoneNumber(), actualTeacherDataPostBI.getObject().getPhoneNumber());
 //      assertEquals(expectedTeacherDataPostBI.getSsn(), actualTeacherDataPostBI.getObject().getSsn());
 //      assertEquals(expectedTeacherDataPostBI.getSurname(), actualTeacherDataPostBI.getObject().getSurname());
 //      assertEquals(expectedTeacherDataPostBI.getUsername(), actualTeacherDataPostBI.getObject().getUsername());
  }
}
