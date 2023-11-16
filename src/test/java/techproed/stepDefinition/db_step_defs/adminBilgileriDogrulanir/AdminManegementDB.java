package techproed.stepDefinition.db_step_defs.adminBilgileriDogrulanir;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.admin.getAdmin.AdminGetExpectedPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class AdminManegementDB {
    Connection connection;
    ResultSet resultSet;
    AdminGetExpectedPojo expected;

    @When("kayitli admin bilgisini almak icin query gonderilir")
    public void kayitli_admin_bilgisini_almak_icin_query_gonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet=statement.executeQuery("select * from admins where username='APIDENEME'");

    }
    @Then("kayitli admin bilgisi dogrulanir")
    public void kayitli_admin_bilgisi_dogrulanir() throws SQLException {
        expected=new AdminGetExpectedPojo(1166,"APIDENEME","751-65-8742","API","DENEME","1996-10-02","ADANA","458-972-2431","0",false);
        resultSet.next();
        assertEquals(expected.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(expected.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(expected.getGender(),resultSet.getString("gender"));
        assertEquals(expected.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(expected.getSsn(),resultSet.getString("ssn"));
        assertEquals(expected.getSurname(),resultSet.getString("surname"));
        assertEquals(expected.getUsername(),resultSet.getString("username"));

    }


    @Given("Admin icin database baglantisi kurulur")
    public void adminIcinDatabaseBaglantisiKurulur() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }
}
