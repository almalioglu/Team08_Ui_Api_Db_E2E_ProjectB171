package techproed.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import techproed.pages.HomePage;


import java.security.SecureRandom;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ReusableMethods {

    //HARD WAIT METHOD
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertprompt(String text) {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }

    //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
    public static void ddmVisibleText(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);
    }

    //DropDown Index
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value
    public static void ddmValue(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByValue(secenek);
    }

    //SwitchToWindow1
    public static void switchToWindow(int sayi) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
    }

    //SwitchToWindow2
    public static void window(int sayi) {
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
    }
    //EXPLICIT WAIT METHODS

    //Visible Wait
    public static void visibleWait(WebElement element, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    //VisibleElementLocator Wait
    public static WebElement visibleWait(By locator, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    //Alert Wait
    public static void alertWait(int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.alertIsPresent());

    }


    //WebTable
    public static void printData(int satir, int sutun) {
        WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
        System.out.println(satirSutun.getText());
    }

    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS Sayfa Sonu Scroll
    public static void scrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS Sayfa Başı Scroll
    public static void scrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //JS SendKeys
    public static void sendKeysJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    //JS SendAttributeValue
    public static void sendAttributeJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //JS GetAttributeValue
    public static void getValueByJS(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: = " + attribute_Value);
    }
    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void cleanByJs(WebElement element) {                      //zeliha
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].value = '';", element);
    }

    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void checkTextContains(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        WebElement elementName = wait.until(ExpectedConditions.visibilityOf(element));
        if (elementName.getText().trim().contains(text.trim())) {
            Assert.assertTrue(true);
        } else
            Assert.fail(text + " değerini içeren element bulunamadı. Element text :" + elementName.getText());
    }















































    //saadet password
    public static String randomPassword(int lower, int upper, int numeric) {
        String lowercharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String uppercharacters = "abcdefghijklmnopqrstuvwxyz";
        String numericcharacters = "0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < lower; i++) {
            int randomIndex1 = random.nextInt(lowercharacters.length());
            char randomLowerChar = lowercharacters.charAt(randomIndex1);
            password.append(randomLowerChar);
        }
        for (int i = 0; i < upper; i++) {
            int randomIndex2 = random.nextInt(uppercharacters.length());
            char randomUpperChar = uppercharacters.charAt(randomIndex2);
            password.append(randomUpperChar);
        }
        for (int i = 0; i < numeric; i++) {
            int randomIndex3 = random.nextInt(numericcharacters.length());
            char randomNumericChar = numericcharacters.charAt(randomIndex3);
            password.append(randomNumericChar);

        }
        return password.toString();
    }




    //İsmail
    public static void selectRandomlyFromDDM(WebElement ddmLocate){

        Select select = new Select(ddmLocate);

        List<String> optionsList = select.getOptions().stream()
                .map(WebElement::getText)
                .filter(text -> !text.contains("Choose"))
                .collect(Collectors.toList());

        ReusableMethods.ddmVisibleText(ddmLocate, optionsList.get(new Random().nextInt(optionsList.size())));

    }
    //Yukarıdaki metod ; locate’ini yazdığımız ddm’den rastgele bir seçenek seçiyor

    public static String getOptionsVisibleTextFromDDM(WebElement ddmLocate) {

        Select select = new Select(ddmLocate);

        List<String> optionsList = select.getOptions().stream()
                .map(WebElement::getText)
                .filter(text -> !text.contains("Choose"))
                .collect(Collectors.toList());

        return optionsList.get(new Random().nextInt(optionsList.size()));
    }
    //Yukarıdaki metdhod ; bir web sayfasındaki bir açılır menüdeki seçeneklerin rastgele birini seçmek için kullanılır.
    // Kod, bir WebElement öğesini parametre olarak alır ve bu öğenin içindeki açılır menüyü seçer.
    // Daha sonra, seçeneklerin metinlerini alır, “Choose” kelimesini içerenleri filtreler ve kalanları rastgele bir şekilde seçer.
    // Son olarak, seçilen metni döndürür.

    public static void addStudentInfoAgain() {
        HomePage usPage = new HomePage();

        ReusableMethods.bekle(1);
        ReusableMethods.ddmVisibleText(usPage.chooseLessonDDMenu_is, ReusableMethods.getOptionsVisibleTextFromDDM(usPage.chooseLessonDDMenu_is));
        ReusableMethods.bekle(1);
        ReusableMethods.ddmVisibleText(usPage.chooseStudentDDMenu_is, ReusableMethods.getOptionsVisibleTextFromDDM(usPage.chooseStudentDDMenu_is));

        usPage.studentNoteSubmitButton_is.click();
        ReusableMethods.bekle(2);
        if (usPage.infoAlert_is.getText().contains("Error: Student Info with")){
            ReusableMethods.addStudentInfoAgain();
        }
    }
    //Yukarıdaki method ; student info eklerken aynı bilgiler girildiyse hata veriyor kayıt yapmıyordu
    // burada o kontrol ediliyor eğer kayıt yapmamışsa öğrenci bilgilerini değiştiriyor tekrar kayıt yapmayı deniyor

}
