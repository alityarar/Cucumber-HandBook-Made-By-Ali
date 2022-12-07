package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorDatatablesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class EditorDatatablesStep {
    EditorDatatablesPage editorPage=new EditorDatatablesPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newEditor.click();
    }


    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String isim) throws InterruptedException {
        editorPage.namedenItibaren.sendKeys(isim);
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB).perform();
    }

    @And("lastname bolumune {string} girer")
    public void lastnameBolumuneGirer(String lastname) {
        actions.sendKeys(lastname).
                sendKeys(Keys.TAB).perform();
    }

    @And("position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(position).sendKeys(Keys.TAB);
    }

    @And("office bolumune {string} girer")
    public void officeBolumuneGirer(String office) {
        actions.sendKeys(office).sendKeys(Keys.TAB);
    }

    @And("extention bolumune {string} girer")
    public void extentionBolumuneGirer(String extention) {
        actions.sendKeys(extention).sendKeys(Keys.TAB);
    }

    @And("startdate bolumune {string} girer")
    public void startdateBolumuneGirer(String startdate) {
        actions.sendKeys(startdate).sendKeys(Keys.TAB).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(salary).sendKeys(Keys.TAB).perform();
    }

    @Then("create tusuna basar")
    public void createTusunaBasar() {
        editorPage.createTusu.click();
    }

    @Then("search kutusuna tiklar")
    public void searchKutusunaTiklar() {
        editorPage.searchTusu.click();
    }

    @And("ismi girer {string}")
    public void ismiGirer(String searchGiris) {
        editorPage.searchTusu.sendKeys(searchGiris);
    }



    @Then("ismin {string} bolumde gorundugunu dogrular")
    public void isminBolumdeGorundugunuDogrular(String Ilkisim) {
        Assert.assertTrue(editorPage.ilkSatirLocate.getText().contains(Ilkisim));
    }
}
