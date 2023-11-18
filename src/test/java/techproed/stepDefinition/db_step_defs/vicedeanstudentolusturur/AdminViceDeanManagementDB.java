package techproed.stepDefinition.db_step_defs.vicedeanstudentolusturur;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.dean.postViceDean.ExpectedDataPojo;
import techproed.pojos.dean.postViceDean.ObjectPojo;
import techproed.pojos.dean.postViceDean.Response6Pojo;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;

public class AdminViceDeanManagementDB {
    Connection connection;
    ObjectPojo expectedData;
    Statement statement;
    ResultSet resultSet;

    @Given("Database baglantisi kurulur_aeo")
    public void databaseBaglantisiKurulur_aeo() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("kayıtlı Admin Vice Dean bilgisini almak icin query gonderilir_aeo")
    public void kayıtlıAdminViceDeanBilgisiniAlmakIcinQueryGonderilir_aeo() throws SQLException {
     Statement statement = connection.createStatement();
     resultSet = statement.executeQuery("select * from vice_dean where id =2162");
    }

    @Then("kayitli admin vice dean bilgisi dogrulanir_aeo")
    public void kayitliAdminViceDeanBilgisiDogrulanir_aeo() throws SQLException {
        expectedData = new ObjectPojo("Firdevs34", "Firdevs3", "ORAL3", "1999-09-10", "222-99-6563", "Istanbul", "282-198-7778", "1");
        resultSet.next();
        assertEquals(expectedData.getUsername(), resultSet.getString("username"));
        assertEquals(expectedData.getName(), resultSet.getString("name"));
        assertEquals(expectedData.getSurname(), resultSet.getString("surname"));
        assertEquals(expectedData.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(expectedData.getSsn(), resultSet.getString("ssn"));
        assertEquals(expectedData.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(expectedData.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(expectedData.getGender(), resultSet.getString("gender"));
    }
    @And("database baglantisi kesilir_aeo")
    public void databaseBaglantisiKesilir_aeo() throws SQLException {
        statement.close();
        connection.close();

    }
}
