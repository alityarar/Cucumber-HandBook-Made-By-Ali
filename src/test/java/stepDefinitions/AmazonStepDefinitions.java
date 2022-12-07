package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon ana sayfasinda")
    public void kullanici_amazon_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
     }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String searchedSonuc="Nutella";
        Assert.assertTrue(actualSonuc.contains(searchedSonuc));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
     }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);


    }
    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String searchedSonuc="Java";
        Assert.assertTrue(actualSonuc.contains(searchedSonuc));

    }

    @Then("kullanici Iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Iphone"+ Keys.ENTER);

    }

    @And("sonuclarin Iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String searchedSonuc="Iphone";
        Assert.assertTrue(actualSonuc.contains(searchedSonuc));


    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+ Keys.ENTER);
        
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String searchedSonuc=istenenKelime;
        Assert.assertTrue(actualSonuc.contains(searchedSonuc));

    }

    @Given("kullanici {string} sayfasinda") //amazonUrl
    public void kullaniciSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));


    }

    @And("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
