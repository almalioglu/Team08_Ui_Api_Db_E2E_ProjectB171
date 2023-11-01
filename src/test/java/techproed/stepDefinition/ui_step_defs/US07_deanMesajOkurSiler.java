package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import techproed.pages.HomePage;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US07_deanMesajOkurSiler {

    HomePage homePage = new HomePage();

    @And("Kullanici  Dean olarak  sisteme giris yapar")
    public void kullaniciDeanOlarakSistemeGirisYapar() {
            homePage.loginUserName.sendKeys("AEBRAR");
            homePage.loginPassword.sendKeys("Aebrar12");
        }


    @And("Dean kullanici bilgileri ile sisteme giris yapar")
    public void deanKullaniciBilgileriIleSistemeGirisYapa() {
        homePage.loginEkraniLoginButton.click();
    }

    @Given("Kullanici menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        homePage.menuButton.click();
    }

    @Then("Contact get all secenegine tiklar")
    public void contactGetAllSecenegineTiklar() {
        homePage.contactGetAllButton.click();
    }

    @And("mesajlarin gorundugunu dogrular")
    public void mesajlarinGorundugunuDogrular() {
        assertTrue(homePage.contactMassageButton.isDisplayed());
    }
    @And("silme butonunun gorunur olup olmadigini belirtir")
    public void silmeButonununGorunurOlupOlmadiginiBelirtir() {

    }


    @And("Kullanici,isim sutununun gorunur olup olmadigini belirtir")
    public void kullaniciIsimSutunununGorunurOlupOlmadiginiBelirtir() {
            assertTrue(homePage.nameColumn.isDisplayed());
        }


    @And("Kullanici e-posta sutununun gorunur olup olmadigini belirtir")
    public void kullaniciEPostaSutunununGorunurOlupOlmadiginiBelirtir() {
                assertTrue(homePage.emailColumn.isDisplayed());
            }


    @And("Kullanici, tarih sutununun gorunur olup olmadiğini iddia eder")
    public void kullaniciTarihSutunununGorunurOlupOlmadiğiniIddiaEder() {
                assertTrue(homePage.dateColumn.isDisplayed());
            }



    @And("Kullanici, subject sutununun gorunur olup olmadigini test eder")
    public void kullaniciSubjectSutunununGorunurOlupOlmadiginiTestEder() {
                assertTrue(homePage.subjectColumn.isDisplayed());
            }


    @And("Kullanici, mesaj sutununun gorunur olup olmadigini belirtir")
    public void kullaniciMesajSutunununGorunurOlupOlmadiginiBelirtir() {
            assertTrue(homePage.messageColumn.isDisplayed());
        }

    @And("secilen mesajda sil butonuna tiklanir")
    public void secilenMesajdaSilButonunaTiklanir() {

    }


    @And("secilen mesajlar silinir")
    public void secilenMesajlarSilinir() {

    }

    @And("secilen mesajin silindigi dogrulanir")
    public void secilenMesajinSilindigiDogrulanir() {

    }


}
    
    

















