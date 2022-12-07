package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//a[@href='/Account/Logon'])")
    public WebElement logOn;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement lastlogin;

    @FindBy(id = "menuYonetim")
    public WebElement menuYonetim;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addUser;

    @FindBy(id="UserName")
    public WebElement userEnter;

    @FindBy(id="btnSubmit")
    public WebElement save;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement country;

    @FindBy(name = "BirthDate")
    public WebElement birthDate;

    @FindBy(xpath = "//input[@id='Approved']")
    public WebElement approved;

    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;


}
