package techproed.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.HomePage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US14_ViceDeanTeacherGorebilmeliGuncelleyebilmeli {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Teacher List basligini gorur")
    public void teacher_list_basligini_gorur() {
        actions.scrollByAmount(0,300).perform();
        Assert.assertTrue(homePage.teacherListTitleBI.isDisplayed());
    }
    @Then("Listedeki bir öğretmenin Name bilgisinin görüldüğünü doğrula")
    public void listedeki_bir_öğretmenin_name_bilgisinin_görüldüğünü_doğrula() {
       homePage.nameTeacherListTitleBI.isDisplayed();
    }
    @Then("Aynı öğretmenin Phone Number bilgisinin görüldüğünü doğrula")
    public void aynı_öğretmenin_phone_number_bilgisinin_görüldüğünü_doğrula() {
        Assert.assertTrue(homePage.phoneNumberTeacherListTitleBI.isDisplayed());
    }
    @Then("Aynı öğretmenin SSN bilgisinin görüldüğünü doğrula")
    public void aynı_öğretmenin_ssn_bilgisinin_görüldüğünü_doğrula() {
        Assert.assertTrue(homePage.ssnTeacherListTitleBI.isDisplayed());
    }
    @Then("Aynı öğretmenin User Name bilgisinin görüldüğünü doğrula")
    public void aynı_öğretmenin_user_name_bilgisinin_görüldüğünü_doğrula() {
        Assert.assertTrue(homePage.usernameTeacherListTitleBI.isDisplayed());
    }

    @Then("Listedeki bir öğretmenin bilgilerinin bulunduğu satırda Edit sekmesine tıkla")
    public void listedeki_bir_öğretmenin_bilgilerinin_bulunduğu_satırda_edit_sekmesine_tıkla() {
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        homePage.editListPageEndButtonBI.click();
        ReusableMethods.bekle(1);
        ReusableMethods.click(homePage.editListButtonPencilBI);
        ReusableMethods.bekle(1);

    }
    @Then("Açılan sayfada Choose Lessons menüsünden bir ders seç")
    public void açılan_sayfada_choose_lessons_menüsünden_bir_ders_seç() {
        ReusableMethods.click(homePage.editChooseLessondDMBI);
        String lesson = "SeleniumBI";
        homePage.editChooseLessondDMBI.sendKeys(lesson, Keys.TAB,Keys.TAB);
        ReusableMethods.bekle(2);

    }
    @Then("Açılan sayfada Name kutusuna farklı bir veri gir")
    public void açılan_sayfada_name_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListNameBI);
        homePage.editListNameBI.clear();
        homePage.editListNameBI.sendKeys(faker.name().firstName());
    }
    @Then("Açılan sayfada Surname kutusuna farklı bir veri gir")
    public void açılan_sayfada_surname_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListSurnameBI);
        homePage.editListSurnameBI.clear();
        homePage.editListSurnameBI.sendKeys(faker.name().lastName());
    }
    @Then("Açılan sayfada Birt Place kutusuna farklı bir veri gir")
    public void açılan_sayfada_birt_place_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListBirthPlaceBI);
        homePage.editListBirthPlaceBI.clear();
        homePage.editListBirthPlaceBI.sendKeys(faker.address().city());
    }
    @Then("Açılan sayfada Email kutusuna farklı bir veri gir")
    public void açılan_sayfada_email_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListEmailBI);
        homePage.editListEmailBI.clear();
        homePage.editListEmailBI.sendKeys(faker.internet().emailAddress());

    }
    @Then("Açılan sayfada Phone kutusuna farklı bir veri gir")
    public void açılan_sayfada_phone_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListPhoneBI);
        homePage.editListPhoneBI.clear();
        homePage.editListPhoneBI.sendKeys(faker.numerify("###-###-####"));


    }
    @Then("Açılan sayfada SSN kutusuna farklı bir veri gir")
    public void açılan_sayfada_ssn_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListSsnBI);
        homePage.editListSsnBI.clear();
        homePage.editListPhoneBI.sendKeys(faker.numerify("###-##-####"));
    }
    @Then("Açılan sayfada Gender bölümünden farklı bir cinsiyete tıkla")
    public void açılan_sayfada_gender_bölümünden_farklı_bir_cinsiyete_tıkla() {

        if (!homePage.editListFemaleRadioBI.isSelected()) {
            ReusableMethods.click(homePage.editListFemaleRadioBI);
        }else {
            ReusableMethods.click(homePage.editListMaleRadioBI);
        }
        ReusableMethods.bekle(1);

    }
    @Then("Açılan sayfada Date of Birth kutusuna farklı bir veri gir")
    public void açılan_sayfada_date_of_birth_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListDateOfBirthBI);
        homePage.editListDateOfBirthBI.clear();
        homePage.editListDateOfBirthBI.sendKeys("10.10.1995");
    }
    @Then("Açılan sayfada User Name kutusuna farklı bir veri gir")
    public void açılan_sayfada_user_name_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListUsernameBI);
        homePage.editListUsernameBI.clear();
        homePage.editListUsernameBI.sendKeys(faker.name().username());
    }
    @Then("Açılan sayfada Password kutusuna farklı bir veri gir")
    public void açılan_sayfada_password_kutusuna_farklı_bir_veri_gir() {
        ReusableMethods.click(homePage.editListPasswordBI);
        homePage.editListPasswordBI.sendKeys(ReusableMethods.randomPassword(1,1,6));
        ReusableMethods.bekle(1);
        ReusableMethods.click(homePage.editListSubmitBI);
        ReusableMethods.bekle(1);
    }


    @Then("{string} yazısının çıktığını doğrula")
    public void yazısının_çıktığını_doğrula(String string) {
        String alertEditSuccessfulText = "Teacher updated Successful";
        //Assert.assertEquals(alertEditSuccessfulText,);

    }


}
