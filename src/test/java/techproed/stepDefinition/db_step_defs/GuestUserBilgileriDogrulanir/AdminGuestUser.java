package techproed.stepDefinition.db_step_defs.GuestUserBilgileriDogrulanir;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import techproed.pojos.Register.ObjectPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class AdminGuestUser {
    ResultSet resultSet;
    ObjectPojo object;
    Connection connection;

    Statement statement;
    @Given("Database bağlantisi kurulur")
    public void databaseBağlantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

    }

    @And("guestuser kayitlarini gorebilmek icin query sorgulamasi yapilir")
    public void guestuserKayitlariniGorebilmekIcinQuerySorgulamasiYapilir() throws SQLException {

        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from guest_user where username='Demetnurr'");
    }

    @And("guestUser dogrulamasi yapilir")
    public void guestuserDogrulamasiYapilir() throws SQLException {
            object= new ObjectPojo(2545,"Demetnurr","Sena","Karye","2000-02-02","123-32-4567",
                    "Mersin","569-456-7845","FEMALE");
        resultSet .next();
        assertEquals(object.getUsername(),resultSet.getString("username"));
        assertEquals(object.getUsername(),resultSet.getString("ssn"));

    }

    @And("baglantisi kesilir")
    public void baglantisiKesilir() throws SQLException {
      //  statement.close();
       // connection.close();
    }
}

