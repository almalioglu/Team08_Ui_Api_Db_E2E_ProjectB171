package techproed.stepDefinition.api_step_defs.vicedean;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getStudent.StudentGetResponse;
import techproed.pojos.vicedean.postStudent.StudentPost;
import techproed.pojos.vicedean.postStudent.StudentPostResponse;
import techproed.utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.BaseUrl.spec;


public class US_15Api_StudentManagementStepDef {
    StudentPost expectedData;
    Response response;
    public static StudentPostResponse actualData;
    public static StudentGetResponse actualDataGet;
    Faker faker = new Faker();

    String email;
    String phoneNumber;
    String ssn;
    String username;
    private static int idStudent;

    @When("Kayitli Student id ile cagirilir")
    public void kayitli_student_id_ile_cagirilir() {

        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", idStudent);
        Response response1 = given(spec).when().get("{first}/{second}");
        response1.prettyPrint();
        actualDataGet = response1.as(StudentGetResponse.class);
    }

    @Given("Studen eklemek icin post request hazirligi yapilir")
    public void studen_eklemek_icin_post_request_hazirligi_yapilir() {
        spec.pathParams("first", "students", "second", "save");
    }

    @Given("Gonderilecek studen bilgileri hazirlanir")
    public void gonderilecek_studen_bilgileri_hazirlanir() {
        email = faker.internet().emailAddress();
        phoneNumber = ReusableMethods.randomPhone();
        ssn = ReusableMethods.randomSsn();
        username = faker.name().firstName();
        expectedData = new StudentPost(1969, "1997-08-22", "izmir",
                email, "ömercan", "FEMALE", "aysem", "Sude", "Asrasa97.", phoneNumber, ssn, "gokerrli", username);

    }

    @When("Student eklemek icin post request gonderilir")
    public void student_eklemek_icin_post_request_gonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        idStudent = response.jsonPath().getInt("object.id");
        System.out.println(idStudent);
        actualData = response.as(StudentPostResponse.class);
        response.prettyPrint();
    }

    @Then("Student bilgileri dogrulanir")
    public void student_bilgileri_dogrulanir() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        assertEquals(expectedData.getMotherName(), actualData.getObject().getMotherName());
        assertEquals(expectedData.getFatherName(), actualData.getObject().getFatherName());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
    }

    @Then("Student bilgileri dogrulanir\\(get)")
    public void studentBilgileriDogrulanirGet() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualDataGet.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualDataGet.getBirthPlace());
        assertEquals(expectedData.getEmail(), actualDataGet.getEmail());
        assertEquals(expectedData.getMotherName(), actualDataGet.getMotherName());
        assertEquals(expectedData.getFatherName(), actualDataGet.getFatherName());
        assertEquals(expectedData.getGender(), actualDataGet.getGender());
        assertEquals(expectedData.getName(), actualDataGet.getName());
        assertEquals(expectedData.getPhoneNumber(), actualDataGet.getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualDataGet.getSsn());
        assertEquals(expectedData.getSurname(), actualDataGet.getSurname());
        assertEquals(expectedData.getUsername(), actualDataGet.getUsername());
    }


    @When("Student icin Delete  URL duzenlenir")
    public void studentIcinDeleteURLDuzenlenir() {
        spec.pathParams("first", "students", "second", "delete", "third", idStudent);
    }

    @And("Student Info Delete icin request gönderilir ve response alınır.")
    public void studentInfoDeleteIcinRequestGönderilirVeResponseAlınır() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("status kodun ikiyuz oldugu dogrulanirSG")
    public void statusKodunIkiyuzOlduguDogrulanirSG() {
        String expectedData = "Student Deleted";
        assertEquals(200, response.statusCode());
        assertEquals(expectedData, response.jsonPath().getString("message"));
    }
}

