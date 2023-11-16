package techproed.stepDefinition.db_step_defs.teacherMeetManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.teacher.PostStudentInfo.ObjectPojo;
import techproed.pojos.teacher.PostStudentInfo.StudentResponsePojo;

import java.sql.*;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class US_17_18StudentInfoNote_DB {

    Connection connection;
    ResultSet resultSet;
    StudentResponsePojo studentResponse;
    ObjectPojo expectedData;

    @Given("Database baglantisi kurulur_is")
    public void databaseBaglantisiKurulur_is() throws SQLException {
       connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("Student Info icin query gonderili_is")
    public void studentInfoIcinQueryGonderili_is() throws SQLException {
        Statement statement=connection.createStatement();
        resultSet= statement.executeQuery("select * from student_info where id=4703");
    }

    @Then("Student Info icin gelen bilgiler dogrulanir_is")
    public void studentInfoIcinGelenBilgilerDogrulanir_is() throws SQLException {
        studentResponse = new StudentResponsePojo(2326, "Fiksberra","Berra",
                "Fiks", "1986-01-19", "Mars", "545-341-9010",
                "FEMALE", 1429,"Alime", "Alim", "birch.lamarion@forkshape.com", true);
        expectedData = new ObjectPojo(4703, 70.0, 80.0, 3, "Basarilarini devamini dilerim.",
                "Chemisch ", 1940, 10, 15, 76.0,
                studentResponse, false, "BA");
        resultSet.next();
        assertEquals(expectedData.getMidtermExam(),resultSet.getDouble("midterm_exam"));
        assertEquals(expectedData.getFinalExam(),resultSet.getDouble(4));
        assertEquals(expectedData.getAbsentee(),resultSet.getInt(2));
        assertEquals(expectedData.getInfoNote(),resultSet.getString(5));
    }

    @When("Database baglantisi kesilir_is")
    public void databaseBaglantisiKesilir_is() throws SQLException {
        connection.close();
    }
}
