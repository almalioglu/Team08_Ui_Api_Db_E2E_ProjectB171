package techproed.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Random;
public class Us17_TeacherOgrenciNotBilgisiEkler {

    HomePage page = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    Random random = new Random();

    String studentName;
    String lessonName;
    String midTermNote = String.valueOf(random.nextInt(101));
    String finalNote = String.valueOf(random.nextInt(101));
    String absentee = String.valueOf(random.nextInt(19));
    List<String> infoNotesList = List.of("Başarilarinin devamini dilerim", "Zahmetini cekmediğin şey senin degildir", "Tekrar 180 kere de olsa güzeldir",
            "Aklin yolu 1 dir..", "Geçmişe kader geleceğe irade.,?", "Önümüzdeki 3 maça bakicaz", "Ümitvar olunuz..2024+", "All is well..!");
    String infoNote = infoNotesList.get(random.nextInt(infoNotesList.size()));



    @Then("Teacher olarak login yap_is")
    public void teacherOlarakLoginYap_is() {
        page.loginButton.click();
        page.loginUserName.sendKeys(ConfigReader.getProperty("username_is1"));
        page.loginPassword.sendKeys(ConfigReader.getProperty("passwordTeacher"));
        page.loginEkraniLoginButton.click();

    }

    @And("Student Info Management sayfasinda oldugunu dogrula_is")
    public void studentInfoManagementSayfasindaOldugunuDogrula_is() {
        Assert.assertEquals("Student Info Management", page.studentInfoManagment_is.getText());
    }

    @Then("Not icin gerekli tum bilgiler eklenir_is")
    public void notIcinGerekliTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        lessonName = new Select(page.chooseLessonDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        studentName = new Select(page.chooseStudentDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
        ReusableMethods.bekle(2);
        if (page.infoAlert_is.getText().contains("Error: Student Info with")){
            ReusableMethods.addStudentInfoAgain();
        }

    }


    @And("Ogrenciye not verilebildigi dogrulanir_is")
    public void ogrenciyeNotVerilebildigiDogrulanir_is() {
        Assert.assertEquals("Student Info saved Successfully", page.infoAlert_is.getText());
        actions.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.tableRows_is.get(1).getText().contains(studentName + " " + lessonName + " "
                + absentee + " " + midTermNote + " " + finalNote));

    }

    @And("sayfa kapatilir_is")
    public void sayfaKapatilir_is() {Driver.closeDriver();}


    @Then("Choos lesson menusu haric tum bilgiler eklenir_is")
    public void choosLessonMenusuHaricTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
    }


    @And("Ders secilmeden ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void dersSecilmedenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        String secilenDers = new Select(page.chooseLessonDDMenu_is).getFirstSelectedOption().getText();
        Assert.assertEquals("Choose Lesson", secilenDers);
        ReusableMethods.bekle(2);
        Assert.assertEquals("Please select lesson", page.infoAlert_is.getText());
        ReusableMethods.bekle(2);
    }


    @Then("Choose Student menusu bos birakilip diger tum bilgiler eklenir_is")
    public void chooseStudentMenusuBosBirakilipDigerTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
    }

    @And("Ogrenci secilmeden ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void ogrenciSecilmedenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        String secilenOgrenci = new Select(page.chooseStudentDDMenu_is).getFirstSelectedOption().getText();
        Assert.assertEquals("Choose Student", secilenOgrenci);
        ReusableMethods.bekle(2);
        Assert.assertEquals("Please select student", page.infoAlert_is.getText());
        ReusableMethods.bekle(2);
    }

    @Then("Education Term menusu bos bırakılıp diger tum bilgiler eklenir_is")
    public void educationTermMenusuBosBırakılıpDigerTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
    }

    @And("Education term secilmeden ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void educationTermSecilmedenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        String secilenEdTerm = new Select(page.chooseEdTermDDMenu_is).getFirstSelectedOption().getText();
        Assert.assertEquals("Choose Education Term", secilenEdTerm);
        ReusableMethods.bekle(2);
        Assert.assertEquals("Please select education term", page.infoAlert_is.getText());
    }


    @Then("Absentee menusu dahil tum bilgiler eklenir_is")
    public void absenteeMenusuDahilTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        lessonName = new Select(page.chooseLessonDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        studentName = new Select(page.chooseStudentDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
        ReusableMethods.bekle(2);
        if (page.infoAlert_is.getText().contains("Error: Student Info with")){
            ReusableMethods.addStudentInfoAgain();
        }
    }

    @And("Not bilgilerinde devamsizlik oldugu dogrulanir_is")
    public void notBilgilerindeDevamsizlikOlduguDogrulanir_is() {
        Assert.assertEquals("Student Info saved Successfully", page.infoAlert_is.getText());
        actions.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.tableRows_is.get(1).getText().contains(studentName + " " + lessonName + " "
                + absentee + " " + midTermNote + " " + finalNote));
    }

    @Then("Absentee menusu haric tüm bilgiler eklenir_is")
    public void absenteeMenusuHaricTümBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);
        page.midtermExamBox_is.sendKeys(midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);
        page.studentNoteSubmitButton_is.click();
    }

    @And("Absentee bilgisi bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void absenteeBilgisiBoskenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.requiredInfo_is.isDisplayed());
    }


    @Then("Midterm Exam kutusu haric tum bilgiler eklenir_is")
    public void midtermExamKutusuHaricTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
    }

    @And("Midterm Exam kutusu bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void midtermExamKutusuBoskenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.requiredInfo_is.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Final Exam bilgisi haric tum ogrenci bilgileri eklenir_is")
    public void finalExamBilgisiHaricTumOgrenciBilgileriEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();

    }

    @And("Final Exam kutusu bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void finalExamKutusuBoskenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.requiredInfo_is.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Info note bilgisi haric tum bilgiler eklenir_is")
    public void ınfoNoteBilgisiHaricTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote);

        page.studentNoteSubmitButton_is.click();
    }

    @And("Info note kutusu bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is")
    public void ınfoNoteKutusuBoskenOgrenciBilgilerininKaydedilmedigiDogrulanir_is() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.requiredInfo_is.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Midtermexam ve finalexam notu sifirveyuzarsi olup tum bilgiler eklenir_is")
    public void midtermexamVeFinalexamNotuSifirveyuzarasiOlupTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        lessonName = new Select(page.chooseLessonDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        studentName = new Select(page.chooseStudentDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
        ReusableMethods.bekle(2);
        if (page.infoAlert_is.getText().contains("Error: Student Info with")){
            ReusableMethods.addStudentInfoAgain();
        }

    }

    @And("Midtermexam ve finalexam notu eklendigi dogrulanir_is")
    public void midtermexamVeFinalexamNotuEklendigiDogrulanir_is() {
        Assert.assertEquals("Student Info saved Successfully", page.infoAlert_is.getText());
        actions.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.tableRows_is.get(1).getText().contains(studentName + " " + lessonName + " "
                + absentee + " " + midTermNote + " " + finalNote));
    }

    @Then("Midtermexam ve finalexam notu sifirdanaz olup tum bilgiler eklenir_is")
    public void midtermexamVeFinalexamNotuSifirdanazOlupTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, "-5", Keys.TAB, "-8", Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
    }

    @And("Sifirdan az iken Midtermexam ve finalexam notu eklenemedigi dogrulanir_is")
    public void sifirdanAzIkenmidtermexamVeFinalexamNotuEklenemedigiDogrulanir_is() {
        ReusableMethods.bekle(2);
        Assert.assertEquals("'0.0' değerinden büyük yada eşit olmalı", page.infoAlert_is.getText());
    }

    @Then("Midtermexam ve finalexam notu yuzdenfazla olup tum bilgiler eklenir_is")
    public void midtermexamVeFinalexamNotuYuzdenfazlaOlupTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, "101", Keys.TAB, "103", Keys.TAB, infoNote);

        page.studentNoteSubmitButton_is.click();
    }

    @And("Yuzden fazla iken Midtermexam ve finalexam notu eklenemedigi dogrulanir_is")
    public void yuzdenFazlaIkenMidtermexamVeFinalexamNotuEklenemedigiDogrulanir_is() {
        ReusableMethods.bekle(2);
        Assert.assertEquals("'100.0' değerinden küçük yada eşit olmalı", page.infoAlert_is.getText());
    }

    @Then("Info note kutusu harf rakam ozelkarakter icerecek sekilde diger tum bilgiler eklenir_is")
    public void ınfoNoteKutusuHarfRakamOzelkarakterIcerecekSekildeDigerTumBilgilerEklenir_is() {
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseLessonDDMenu_is);
        lessonName = new Select(page.chooseLessonDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseStudentDDMenu_is);
        studentName = new Select(page.chooseStudentDDMenu_is).getFirstSelectedOption().getText();
        ReusableMethods.bekle(1);
        ReusableMethods.selectRandomlyFromDDM(page.chooseEdTermDDMenu_is);

        page.absenteeNote_is.sendKeys(absentee, Keys.TAB, midTermNote, Keys.TAB, finalNote, Keys.TAB, "Harfler1234567.,!?");

        page.studentNoteSubmitButton_is.click();
        ReusableMethods.bekle(2);
        if (page.infoAlert_is.getText().contains("Error: Student Info with")){
            ReusableMethods.addStudentInfoAgain();
        }
    }

    @And("Info note bilgisi eklendigi dogrulanir_is")
    public void ınfoNoteBilgisiEklendigiDogrulanir_is() {
        Assert.assertEquals("Student Info saved Successfully", page.infoAlert_is.getText());
    }
}
