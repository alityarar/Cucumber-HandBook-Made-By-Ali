package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HmcPage;
import utilities.ConfigReader;

public class HmcStepDefinitions {
    HmcPage hmcpage=new HmcPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmcpage.logOn.click();


    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcpage.userName.sendKeys(ConfigReader.getProperty("hotelUser"));

    }
    @Then("gecerli password girer")

    public void gecerli_password_girer() {
        hmcpage.password.sendKeys(ConfigReader.getProperty("hotelPass"));

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcpage.lastlogin.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcpage.hotelManagement.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcpage.password.sendKeys(ConfigReader.getProperty("hotelNoPass"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcpage.lastlogin.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcpage.userName.sendKeys(ConfigReader.getProperty("hotelNoUser"));
    }

    @Then("{string} username girer")
    public void usernameGirer(String userString) {
        hmcpage.userName.sendKeys(userString);
    }

    @Then("{string} password girer")
    public void passwordGirer(String passString) {
        hmcpage.password.sendKeys(passString);
    }
}
