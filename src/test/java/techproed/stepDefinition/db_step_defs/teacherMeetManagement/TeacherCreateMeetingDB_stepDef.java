package techproed.stepDefinition.db_step_defs.teacherMeetManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static techproed.stepDefinition.api_step_defs.teacherMeetManagement.TeacherCreateMeetingAPI_stepDef.object;


public class TeacherCreateMeetingDB_stepDef {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Database baglantisi kurulur")
    public void databaseBaglantisiKurulur() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");

    }

    @When("kayıtlı meet bilgsini almak icin query gonderilir")
    public void kayıtlıMeetBilgsiniAlmakIcinQueryGonderilir() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from meet where description= 'acil ve onemli'");
    }

    @Then("kayitli meet bilgisi dogrulanir")
    public void kayitliMeetBilgisiDogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(object.getDate(),resultSet.getString("date"));
        assertEquals(object.getDescription(),resultSet.getString("description"));
        //assertEquals(object.getStartTime(),resultSet.getString("start_time"));
        //assertEquals(object.getStopTime(),resultSet.getString("stop_time"));
        //assertEquals(object.getAdvisorTeacherId(),resultSet.getInt("advistor_teacher_id"));

    }

    @And("database baglantisi kesilir")
    public void databaseBaglantisiKesilir() throws SQLException {
        statement.close();
        connection.close();

    }
}
