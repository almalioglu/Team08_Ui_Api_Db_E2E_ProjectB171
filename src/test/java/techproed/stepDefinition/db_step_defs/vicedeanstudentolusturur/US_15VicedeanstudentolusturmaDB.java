package techproed.stepDefinition.db_step_defs.vicedeanstudentolusturur;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.vicedean.postStudent.StudentPost;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US_15VicedeanstudentolusturmaDB {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    StudentPost expectedData;
    String phoneNumber;
    String ssn;
    String username;


    @Given("Vice dean icin database baglantisi kurulur")
    public void viceDeanIcinDatabaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }


    @When("kayitli student bilgisini almak icin query gonderilir")
    public void kayitliStudentBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student where id = '2567'");

    }

    @And("kayitli student bilgisi dogrulanir")
    public void kayitliStudentBilgisiDogrulanir() throws SQLException {
        expectedData = new StudentPost(1969, "1997-08-22", "izmir",
                "sadogkr4@gmaill.com", "ömercan", "FEMALE", "aysem", "Sude", "Asrasa97.", phoneNumber, ssn, "gokerrli", username);
        resultSet.next();
        assertEquals(expectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(expectedData.getBirthPlace(),resultSet.getString("birth_place"));
        //assertEquals(expectedData.getGender(),resultSet.getString("gender"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        //assertEquals(expectedData.getPassword(),resultSet.getString("password"));
        //assertEquals(expectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        //assertEquals(expectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(expectedData.getSurname(),resultSet.getString("surname"));
       // assertEquals(expectedData.getUsername(),resultSet.getString("username"));
       // assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        assertEquals(expectedData.getFatherName(),resultSet.getString("father_name"));
        assertEquals(expectedData.getMotherName(),resultSet.getString("mother_name"));







    }



    @Then("Database baglantisi kesilir")
    public void databaseBaglantisiKesilir() throws SQLException {
        connection.close();
    }
}