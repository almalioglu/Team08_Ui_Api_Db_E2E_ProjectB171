package techproed.stepDefinition.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.dean.postViceDean.ObjectPojo;
import techproed.pojos.dean.postViceDean.Response6Pojo;
import java.sql.*;
import static junit.framework.TestCase.assertEquals;


public class DeanViceDeanManagementDB {
    Connection connection;
    ResultSet resultSet;
    ObjectPojo expectedData;
    Statement statement;

    @Given("Database baglantisi kurulur_ae")
    public void databaseBaglantisiKurulur_ae() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("Vice Dean GetMeetById icin beklenen veriler düzenlenir_aeo")
    public void viceDeanGetMeetByIdIcinBeklenenVerilerDüzenlenir_aeo() {

        expectedData=new ObjectPojo("ORAL1","Ayşe Ebrar","Oral","1999-09-10","044-33-2222","İstanbul","505-886-2626","1");
    }


    @When("Vice Dean bilgisini gorebilmek icin Query bilgisi gonderilir")
    public void viceDeanBilgisiniGorebilmekIcinQueryBilgisiGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet=statement.executeQuery("select*from vice_dean Where id='1654'");

    }
    @Then("Kayitli Vice Dean bilgisi dogrulanir_aeo")
    public void kayitliViceDeanBilgisiDogrulanir_aeo() throws SQLException {
        resultSet.next();
        expectedData=new ObjectPojo("ORAL1","Ayşe Ebrar","Oral","1999-09-10","044-33-2222","İstanbul","505-886-2626","1");
        assertEquals(expectedData.getUsername(),resultSet.getString("username"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        assertEquals(expectedData.getSurname(),resultSet.getString("surname"));
        assertEquals(expectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(expectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(expectedData.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(expectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(expectedData.getGender(),resultSet.getString("gender"));

    }

    @And("database baglantisi kesilir_ae")
    public void databaseBaglantisiKesilir_ae() throws SQLException {
        statement.close();
        connection.close();

    }


}
