package techproed.stepDefinition.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.dean.postViceDean.Response6Pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminViceDeanManagementDB {
    Connection connection;
    Response6Pojo payload;
    @Given("Database baglantisi kurulur_aeo")
    public void databaseBaglantisiKurulur_aeo() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("kayıtlı Admin Vice Dean bilgisini almak icin query gonderilir_aeo")
    public void kayıtlıAdminViceDeanBilgisiniAlmakIcinQueryGonderilir_aeo() {
      payload = new Response6Pojo("1999-09-10","Istanbul","FEMALE","Firdevs3","Mahmude1234","282-198-7778","222-99-6563","ORAL3", "Firdevs34");

    }

    @Then("kayitli admin vice dean bilgisi dogrulanir_aeo")
    public void kayitliAdminViceDeanBilgisiDogrulanir_aeo() {
    }

    @And("database baglantisi kesilir_aeo")
    public void databaseBaglantisiKesilir_aeo() {
    }
}
