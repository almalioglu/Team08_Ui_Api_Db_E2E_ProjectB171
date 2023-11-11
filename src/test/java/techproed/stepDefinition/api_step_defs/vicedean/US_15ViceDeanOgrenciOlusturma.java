package techproed.stepDefinition.api_step_defs.vicedean;

import com.github.javafaker.Faker;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.vicedean.getStudent.StudentGetResponse;
import techproed.pojos.vicedean.postStudent.PostvicedeanStudentPOJO;
import techproed.pojos.vicedean.postStudent.StudentPOJO;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;

public class US_15ViceDeanOgrenciOlusturma {
    StudentPOJO expectedData;
    Response response;
    public static PostvicedeanStudentPOJO actualData;
    public static StudentGetResponse actualDataGet;
    Faker faker = new Faker();

    String email;
    String phoneNumber;
    String ssn;
    String username;
    private static int idStudent;
  /*  @Given("Studen eklemek icin post request hazirligi yapilir")
    public void studenEklemekIcinPostRequestHazirligiYapilir() {
        setup("VicedDeanSaadet","Asrasa97...");
        spec.pathParams("first","students","second","save");
        //https://managementonschools.com/app/students/save

    }

    @And("Gonderilecek studen bilgileri hazirlanir")
    public void gonderilecekStudenBilgileriHazirlanir() {
        email= faker.internet().emailAddress();
        phoneNumber = faker.phoneNumber().phoneNumber();
        ssn = faker.numerify("###-##-####");
        username = faker.name().firstName();
        expectedData = new StudentPOJO("1969","1997-08-21","izmir",email,"ömer","FEMALE","ayse","sude","Asrasa97.",phoneNumber,ssn,"gökçe",username);
    }

    @When("Student eklemek icin post request gonderilir")
    public void studentEklemekIcinPostRequestGonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        idStudent = response.jsonPath().getInt("object.id");
        System.out.println(idStudent);
        actualData = response.as(PostvicedeanStudentPOJO.class);
        response.prettyPrint();
    }

    @Then("Student bilgileri dogrulanir")
    public void studentBilgileriDogrulanir() {
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

    @When("Kayitli Student id ile cagirilir")
    public void kayitliStudentIdIleCagirilir() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", idStudent);
        Response response1 = given(spec).when().get("{first}/{second}");
        response1.prettyPrint();
        actualDataGet = response1.as(StudentGetResponse.class);

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
*/
  @Given("Studen eklemek icin post request hazirligi yapilir")
  public void studen_eklemek_icin_post_request_hazirligi_yapilir() {
      //setup("VicedDeanSaadet","Asrasa97...");
      spec.pathParams("first","students","second","save");
      //https://managementonschools.com/app/students/save


  }
    @And("Gonderilecek studen bilgileri hazirlanir")
    public void gonderilecek_studen_bilgileri_hazirlanir() {
       // email= faker.internet().emailAddress();
       // phoneNumber = faker.numerify("###-###-####");
       // ssn = faker.numerify("###-##-####");
       // username = faker.name().firstName();
        expectedData = new StudentPOJO("1969","1997-08-22","izmir","sadogk46@gmail.com","ömercan","FEMALE","aysem","Sude","Asrasa97.","986-345-2346","234-45-8975"
                ,"gokerr","saadetce");
    //{
        //  "advisorTeacherId":1969,
        //  "birthDay": "1997-08-22",
        //  "birthPlace": "izmir",
        //  "email": "sadogk46@gmail.com",
        //  "fatherName": "ömercan",
        //  "gender": "FEMALE",
        //  "motherName": "aysem",
        //  "name": "Sude",
        //  "password": "Asrasa97.",
        //  "phoneNumber": "986-345-2346",
        //  "ssn": "234-45-8975",
        //  "surname": "gokerr",
        //  "username": "saadetce"
        //}
  }

    @When("Student eklemek icin post request gonderilir")
    public void student_eklemek_icin_post_request_gonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
       // idStudent = response.jsonPath().getInt("object.id");
        //System.out.println(idStudent);
        //actualData = response.as(PostvicedeanStudentPOJO.class);
        response.prettyPrint();
        JsonPath json = response.jsonPath();
        List <Object> id = json.getList("findAll{it.id}.id");
        System.out.println(id.get(0));

    }
    @Then("Student bilgileri dogrulanir")
    public void student_bilgileri_dogrulanir() {
       /* assertEquals(200, response.statusCode());
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



        */
    }
    /*@When("Kayitli Student id ile cagirilir")
    public void kayitli_student_id_ile_cagirilir() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", idStudent);
        Response response1 = given(spec).when().get("{first}/{second}");
        response1.prettyPrint();
        actualDataGet = response1.as(StudentGetResponse.class);


    }
    @Then("Student bilgileri dogrulanir\\(get)")
    public void student_bilgileri_dogrulanir_get() {
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



     */

}
