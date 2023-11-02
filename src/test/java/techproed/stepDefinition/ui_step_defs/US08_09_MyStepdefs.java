package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;

public class US08_09_MyStepdefs {
    HomePage page = new HomePage();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici siteye gider")
    public void kullaniciSiteyeGider() {

        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
        Driver.getDriver().manage().window().maximize();
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
        ReusableMethods.visibleWait(page.LessonNameTE,1) ;
        page.LessonNameTE.sendKeys(faker.name().firstName());
    }

    @Then("Lesson Name kutusuna veri girilebildigi dogrulanır")
    public void lessonNameKutusunaVeriGirilebildigiDogrulanır() {
       // Assert.assertEquals(page.LessonNameTE.getText(),ConfigReader.getProperty("dersAdiTE"));
        Assert.assertTrue(page.LessonNameTE.isDisplayed());
        ReusableMethods.bekle(2);
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
        ReusableMethods.visibleWait(page.CreditScoreTE,3) ;
        page.CreditScoreTE.sendKeys(faker.number().digit());
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
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.LessonCreatedyazisi.isDisplayed());
    }

    @Then("Lesson Name kutusunun kırmızı olduğu ve altında Required yazdığı görülmeli")
    public void lessonNameKutusununKırmızıOlduğuVeAltındaRequiredYazdığıGörülmeli() {
    Assert.assertTrue(page.RequiredyazisiTE.isDisplayed());
    }

    @And("Credit Score kutusunu boş bırak")
    public void creditScoreKutusunuBoşBırak() {

    }

    @Then("Credit Score kutusunun kırmızı olduğu ve altında Required yazdığı görülmeli")
    public void creditScoreKutusununKırmızıOlduğuVeAltındaRequiredYazdığıGörülmeli() {
        Assert.assertTrue(page.RequiredyazisiCreditScoreTE.isDisplayed());

    }

    @Then("Compulsory kutucuğunun isaretlendigi görülmeli")
    public void compulsoryKutucuğununIsaretlendigiGörülmeli() {
        Assert.assertTrue(page.CompulsoryTE.isSelected());
    }

    @And("Sayfanın en altında bulunan sayfa sayısı kısmından son sayfaya gidilir")
    public void sayfanınEnAltındaBulunanSayfaSayısıKısmındanSonSayfayaGidilir() {
  //      WebElement silinecek = page.silmeTE;
  //      Select select = new Select(silinecek) ;
  //      List<WebElement> silinecekListesi = select.getOptions() ;
  //      for (WebElement ea: silinecekListesi) {
  //         ea.click();
  //      }
        //LessonManagementPage.submitButton.sendkeys(Keys.Page.DOWN, Keys.Page.DOWN);
        // page.submitbutton.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
       Actions actions = new Actions(Driver.getDriver());
       WebElement body = Driver.getDriver().findElement(By.tagName("body"));
       actions.moveToElement(body).sendKeys(Keys.PAGE_DOWN).build().perform();
       actions.moveToElement(body).sendKeys(Keys.PAGE_DOWN).build().perform();
       ReusableMethods.click(page.SonSayfaTE);

    }

    @And("Oluşturulan; Lesson Name,Compulsory ve Credit Score görülmeli")
    public void oluşturulanLessonNameCompulsoryVeCreditScoreGörülmeli() {

    }

    @And("Oluşturulan dersin en sağında bulunan kırmızı çöp kutusu simgesine tıklanır")
    public void oluşturulanDersinEnSağındaBulunanKırmızıÇöpKutusuSimgesineTıklanır() {
       // List<WebElement> silme = page.silmeTE;
      //  page.chooselessonbox.get(page.chooselessonbox.size() - 1).click();


    }
}
