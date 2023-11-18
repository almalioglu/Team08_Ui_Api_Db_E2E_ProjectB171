package techproed.stepDefinition.db_step_defs.vicedeanstudentolusturur;


    import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static techproed.stepDefinition.api_step_defs.vicedean.US08_US09.object;

public class US08_US09TE {
        Connection connection;
        ResultSet resultSet;
        Statement statement;

        @Given("Database baglantisi kurulurrr")
        public void databaseBaglantisiKurulurrr() throws SQLException {
            connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        }

        @When("Kayitli Ders bilgisini almak icin Query gonderilirrr")
        public void kayitliDersBilgisiniAlmakIcinQueryGonderilirrr() throws SQLException {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from lesson where lesson_name='Algorithm 2'");
        }

        @Then("Kayitli Ders bilgisi dogrulanirrr")
        public void kayitliDersBilgisiDogrulanirrr() throws SQLException {
            resultSet.next();
            assertEquals(object.getCreditScore(), resultSet.getInt("credit_score"));
            assertEquals(object.isCompulsory(), resultSet.getBoolean("is_compulsory"));
            assertEquals(object.getLessonName(), resultSet.getString("lesson_name"));
        }

        @And("Baglanti kesildiii")
        public void baglantiKesildiii() throws SQLException {
            statement.close();
            connection.close();
        }
    }











