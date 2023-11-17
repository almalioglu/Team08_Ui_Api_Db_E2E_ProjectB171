package techproed.stepDefinition.db_step_defs.vicedeanstudentolusturur.Us16_vicedeanmesajlarigorebilmelidir;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import techproed.pojos.vicedean.postContactGetAll.ContactGetAllPostPojo;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;
import static techproed.stepDefinition.api_step_defs.vicedean.US_16Api_ContactGetAllStepDef.emailContact;

public class US_16_VicedeanmesajlariGörebilmelidir {
    Connection connection;
    ResultSet resultSet;
    ContactGetAllPostPojo expectedData;
    Statement statement;
    @Then("mesajları görebilmek için query gonderlir")
    public void mesajlarıGörebilmekIçinQueryGonderlir() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
        Statement statement = connection.createStatement();
        resultSet= statement.executeQuery("select * from contact_message where message = 'ders'");

    }

    @And("Mesajlar için gelen bilgiler doğrulanır")
    public void mesajlarIçinGelenBilgilerDoğrulanır() throws SQLException {
        resultSet.next();
        expectedData=new ContactGetAllPostPojo(emailContact, "ders","saadet", "konu");
        //assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        assertEquals(expectedData.getMessage(),resultSet.getString("message"));
        assertEquals(expectedData.getSubject(),resultSet.getString("subject"));



    }
}
