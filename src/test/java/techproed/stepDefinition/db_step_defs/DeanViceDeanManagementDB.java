package techproed.stepDefinition.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.dean.postViceDean.Response6Pojo;

import java.sql.*;

public class DeanViceDeanManagementDB {
    Connection connection;
    ResultSet resultSet;
    Response6Pojo response6Pojo;
    @Given("Database baglantisi kurulur_ae")
    public void databaseBaglantisiKurulur_ae() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("Vice Dean GetMeetById icin beklenen veriler düzenlenir_aeo")
    public void viceDeanGetMeetByIdIcinBeklenenVerilerDüzenlenir_aeo() {
        response6Pojo = new Response6Pojo("1999-09-10","Istanbul","FEMALE","Firdevs3","Mahmude123",
                "188-198-7878","222-33-6163", "ORAL3","Firdevs333");

    }

    @When("Kayitli Vice Dean bilgsini almak icin Query gonderilir_aeo")
    public void kayitliViceDeanBilgsiniAlmakIcinQueryGonderilir_aeo() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet=statement.executeQuery("select * from vice_dean id='1606'");
    }

    @Then("Kayitli Vice Dean bilgisi dogrulanir_aeo")
    public void kayitliViceDeanBilgisiDogrulanir_aeo() {

    }

    @And("database baglantisi kesilir_ae")
    public void databaseBaglantisiKesilir_ae() {
    }
}
