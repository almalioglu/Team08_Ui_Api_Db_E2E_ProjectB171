package techproed.stepDefinition.db_step_defs.studentLessonsChoose;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.config.ConnectionConfig;
import techproed.pojos.student.meetList.MeetResponsePojo;
import techproed.pojos.student.meetList.StudentsPojo;
import techproed.pojos.student.studentInfoList.ContentPojo;
import techproed.pojos.student.studentInfoList.StudentResponsePojo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentChooseLesson {
    Connection connection;
    ResultSet resultSet;
    MeetResponsePojo expectedDataMeet;
    List<StudentsPojo> list;

    @Given("Student icin database baglantisi kurulur")
    public void studentIcinDatabaseBaglantisiKurulur() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("student ders notlarini gorebilmek için query gonderilir")
    public void studentDersNotlariniGorebilmekIçinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet=statement.executeQuery("select * from student_info where student_id=2000");
    }

    @Then("kayitli ders notlari dogrulanir")
    public void kayitliDersNotlariDogrulanir() throws SQLException {
        StudentResponsePojo studentData=new StudentResponsePojo(2000,"mehmet321","mehmet","erçik","1996-10-10","adana","145-845-6244","MALE",1170,"deneme","deneme","deneme123@gmail.com",true);
        ContentPojo studentExpected=new ContentPojo(3952,100,100,3,"Good Work!","xray",1847,11,15,100,studentData,true,"AA");
        resultSet.next();

        assertEquals("100",resultSet.getString("midterm_exam"));
        assertEquals("100",resultSet.getString("final_exam"));
        assertEquals(studentExpected.getNote(),resultSet.getString("letter_grade"));


    }

    @When("student meeting leri gorebilmek icin query gonderilir")
    public void studentMeetingLeriGorebilmekIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet=statement.executeQuery("select * from meet where id='1183'");
    }

    @Then("kayitli meeting bilgileri dogrulanir")
    public void kayitliMeetingBilgileriDogrulanir() throws SQLException {
        expectedDataMeet=new MeetResponsePojo("2023-11-06","123-85-7412",1313,"Kamil","apiTest",list,"03:50:00","04:20:00",1183);
        resultSet.next();
        assertEquals(expectedDataMeet.getDescription(),resultSet.getString("description"));
        assertEquals(expectedDataMeet.getStartTime(),resultSet.getString("start_time"));
        assertEquals(expectedDataMeet.getStopTime(),resultSet.getString("stop_time"));


    }

    @When("ogrencinin almis oldugu dersleri gorebilmek icin query gonderilir")
    public void ogrencininAlmisOlduguDersleriGorebilmekIcinQueryGonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet=statement.executeQuery("select * from student_lessonprogram where student_id=2000");

    }

    @Then("aldıgı ders bilgileri dogrulanir")
    public void aldıgıDersBilgileriDogrulanir() throws SQLException {
        List<String> programId=new ArrayList<>(List.of("1965","1422","1403","1747","1549","1548"));
        for (int i = 0; i < programId.size(); i++) {
            resultSet.next();
            assertEquals(programId.get(i),resultSet.getString("lesson_program_id"));
        }

    }
}
