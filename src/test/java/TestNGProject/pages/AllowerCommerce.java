package TestNGProject.pages;

import TestNGProject.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllowerCommerce {

    public AllowerCommerce() {
        PageFactory.initElements(Driver.driverGet(),this);
    }

    @FindBy(xpath = "(//*[text()='Sign In'])[1]") public WebElement signInButton;
    @FindBy(xpath = "(//*[@id='username'])[1]") public WebElement username;
    @FindBy(xpath = "(//*[@type='search'])[1]") public WebElement searchBox;





















































    //Gülcan-70

















































    //Hatice-120
    @FindBy(xpath = "//*[@class='breadcrumb-container container']") public WebElement sonucYazisi;
    @FindBy(xpath = "(//*[text()='Add to cart'])[1]") public WebElement sepeteEkleButton;
    @FindBy(xpath = "(//*[text()='Cart'])[1]") public WebElement cartButton;
    @FindBy(xpath = "//*[text()='View cart']") public WebElement viewCartButton;
    @FindBy(xpath = "//*[text()='16 ” MacBook Pro']") public WebElement sepettekiUrun;
    @FindBy(xpath = "//*[@title='Plus']") public WebElement plusButton;
    @FindBy(xpath = "//*[text()='Update cart']") public WebElement updateCartButton;
    @FindBy(xpath = "(//*[@value='2'])[2]") public WebElement plusDogrulama;
    @FindBy(xpath = "//*[@title='Minus']") public WebElement minusButton;
    @FindBy(xpath = "(//*[@value='1'])[2]") public WebElement minusDogrulama;







































    //Sümeyye-170

















































    //Niyazi-220

















































    //Merve-270

















































    //Adnan-320

















































    //Muhammet-370

















































    //Birgül-420





































































    //mehmet490

}
