package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US08_MyStepdefs {
    HomePage page = new HomePage();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici siteye gider")
    public void kullaniciSiteyeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
    }

    @And("giris bilgiler girilir")
    public void girisBilgilerGirilir() {
        page.UserNameTE.sendKeys("vicedeanjohn007");
        ReusableMethods.bekle(1);
        page.PasswordTE.sendKeys("qweasdzxcfF2", Keys.TAB,Keys.ENTER);
    }


    @And("Menu butonuna tıklaa")
    public void menuButonunaTıklaa() {
        ReusableMethods.visibleWait(page.MenuTE,3);
        page.MenuTE.click();
    }

    @Given("Lesson Management seçeneğine tıkla")
    public void lessonManagementSeçeneğineTıkla() {
        ReusableMethods.visibleWait(page.MenuTE,1) ;
        page.LessonManagementTE.click();
    }

    @And("Lesson yazısına tıkla")
    public void lessonYazısınaTıkla() {
        page.LessonsTE.click();
    }

    @And("Lesson Name kutusuna bir veri gir")
    public void lessonNameKutusunaBirVeriGir() {
        ReusableMethods.visibleWait(page.LessonNameTE,3) ;
        page.LessonNameTE.sendKeys(faker.name().firstName());
    }

    @Then("Lesson Name kutusuna veri girilebildigi dogrulanır")
    public void lessonNameKutusunaVeriGirilebildigiDogrulanır() {
        Assert.assertTrue(page.LessonNameTE.isDisplayed());
    }

    @Then("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }

    @And("Compulsory kutucuğunu işaretle")
    public void compulsoryKutucuğunuIşaretle() {
        page.CompulsoryTE.click();
    }

    @And("Credit Score kutusuna bir veri gir")
    public void creditScoreKutusunaBirVeriGir() {
        page.CreditScoreTE.sendKeys("11");
    }

    @And("Lesson Name kutusunu boş bırak")
    public void lessonNameKutusunuBoşBırak() {

    }

    @And("Submit butonuna tıkla")
    public void submitButonunaTıkla() {
        page.SubmitButtonTE.click();
    }

    @Then("Lesson Created yazısı görülmeli")
    public void lessonCreatedYazısıGörülmeli() {
        Assert.assertTrue(page.LessonCreatedyazisi.isDisplayed());
    }
}
