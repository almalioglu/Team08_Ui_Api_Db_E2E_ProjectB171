package TestNGProject.tests.US19;

import TestNGProject.pages.AllowerCommerce;
import TestNGProject.utilites.ConfigReader;
import TestNGProject.utilites.Driver;
import TestNGProject.utilites.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

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

        page.searchBox.sendKeys("resim29",Keys.ENTER);
        ReusableMethods.extentTest.info("Arama kutusunda resim29 aratıldı");
        ReusableMethods.bekle(2);





    }
}
