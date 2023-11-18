package techproed.stepDefinition.db_step_defs.US_25_AdminstudentOlusturur;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.vicedean.postStudent.StudentPost;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US_25_AdminstudentOlustururDB {
    Connection connection;
    ResultSet resultSet;
    StudentPost expectedData;
    String phoneNumber;
    String ssn;
    String username;

    @Given("admin icin database baglantisi kurulurSG")
    public void adminIcinDatabaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }
    @When("kayitli student bilgisini almak icin query gonderilirSG")
    public void kayitliStudentBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student where id = '2567'");

    }
    @Then("kayitli student bilgisi dogrulanirSG")
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
    @And("Database baglantisi kesilirSG")
    public void databaseBaglantisiKesilir() throws SQLException {
        connection.close();
    }

}
