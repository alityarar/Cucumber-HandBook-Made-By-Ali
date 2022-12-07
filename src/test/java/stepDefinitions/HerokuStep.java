package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStep {
    HerokuPage herokuPage=new HerokuPage();
    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addElementButonu.click();
    }

    @Then("delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuPage.deleteButonu));

    }

    @And("delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }

    @Then("delete butonuna basar")
    public void deleteButonunaBasar() {
        herokuPage.deleteButonu.click();
    }

}
