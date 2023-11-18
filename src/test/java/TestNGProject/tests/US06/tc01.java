package TestNGProject.tests.US06;

import TestNGProject.pages.AllowerCommerce;
import TestNGProject.utilites.ConfigReader;
import TestNGProject.utilites.Driver;
import TestNGProject.utilites.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.crypto.KeyAgreementSpi;

public class tc01 {
    @Test
    public void test01() {
        ReusableMethods.extentReport("chrome","Allower Commerce Report");
        ReusableMethods.extentTest=ReusableMethods.extentReports.createTest("ExtentReport","Test Raporu");

        Driver.driverGet().get(ConfigReader.getProperty("pageUrl"));
        ReusableMethods.extentTest.info("AllowerCommerce sitesine gidildi");

        AllowerCommerce page=new AllowerCommerce();
        page.signInButton.click();
        ReusableMethods.extentTest.info("Sign in butonuna tıklandı");

        page.username.sendKeys(ConfigReader.getProperty("username"), Keys.TAB,ConfigReader.getProperty("password"),Keys.ENTER);
        ReusableMethods.extentTest.info("Username ve password girilerek giriş yapıldı");
        ReusableMethods.bekle(10);
        Driver.driverGet().navigate().refresh();

        ReusableMethods.bekle(2);
        page.searchBox.sendKeys("card",Keys.ENTER);
        ReusableMethods.extentTest.info("Arama kutusunda kitap aratıldı");
        ReusableMethods.bekle(2);

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(page.sonucYazisi.getText().contains("card"));
        ReusableMethods.extentTest.info("Arama seçenekleri yazısının kitap içerdiği doğrulandı");

        Actions actions=new Actions(Driver.driverGet());
        actions.moveToElement(page.sepeteEkleButton).click().perform();
        ReusableMethods.bekle(5);
        ReusableMethods.extentTest.info("İstenen ürün sepete eklendi");

        page.cartButton.click();
        ReusableMethods.extentTest.info("Cart butonuna tıklandı");
        ReusableMethods.bekle(2);
        page.viewCartButton.click();
        ReusableMethods.extentTest.info("View cart butonuna tıklandı");

        softAssert.assertTrue(page.sepettekiUrun.isDisplayed());
        ReusableMethods.extentTest.info("Ürünün sepette olduğu görüldü");

        page.plusButton.click();
        page.updateCartButton.click();
        ReusableMethods.bekle(5);
        softAssert.assertTrue(page.plusDogrulama.getText()=="2");

        page.minusButton.click();
        page.updateCartButton.click();
        ReusableMethods.bekle(5);
        softAssert.assertTrue(page.minusDogrulama.getText()=="1");
        softAssert.assertAll();








    }
}
