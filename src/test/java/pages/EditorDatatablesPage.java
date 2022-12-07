package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.EditorDatatablesStep;
import utilities.Driver;

public class EditorDatatablesPage {
    public EditorDatatablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id=\"example_wrapper\"]/div[1]/button[1]")
    public WebElement newEditor;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement namedenItibaren;

    @FindBy(xpath="/html/body/div[9]/div/div/div/div[1]/div[4]/div[3]/button")
    public WebElement createTusu;

    @FindBy(xpath="//*[@id=\"example_filter\"]/label/input")
    public WebElement searchTusu;

    @FindBy(xpath="//td[@class='sorting_1']")
    public WebElement ilkSatirLocate;

}
