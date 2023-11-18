package techproed.stepDefinition.db_step_defs.vicedeanteacherdb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.vicedean.postTeacher.vice.post.ResponsePojo;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;

public class TeacherAdminDB {

    Connection connection;
    ResultSet resultSet;
    @Given("database baglantisi kurulur bi")
    public void databaseBaglantisiKurulurBi() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("kayitli teacher bilgisi almak icin query gonderilir")
    public void kayitliTeacherBilgisiAlmakIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet= statement.executeQuery("select * from teacher where username='TeacherSheldon'");
    }

    @Then("kayitli teacher bilgisi dogrulanir")
    public void kayitliTeacherBilgisiDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(ResponsePojo.getObject().getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(ResponsePojo.getObject().getEmail(),resultSet.getString("email "));
        assertEquals(ResponsePojo.getObject().getName(),resultSet.getString("name"));
        assertEquals(ResponsePojo.getObject().getGender(),resultSet.getString("gender"));
        assertEquals(ResponsePojo.getObject().getSurname(),resultSet.getString("surname"));
        assertEquals(ResponsePojo.getObject().getSsn(),resultSet.getString("ssn"));
        assertEquals(ResponsePojo.getObject().getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(ResponsePojo.getObject().getUsername(),resultSet.getString("username"));
        assertEquals(ResponsePojo.getObject().getPhoneNumber(),resultSet.getString("phoneNumber"));
    }
}
