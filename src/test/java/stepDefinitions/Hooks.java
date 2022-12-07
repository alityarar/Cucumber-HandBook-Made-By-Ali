package stepDefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber'da extends testBase dememize gerek kalmadan step definition package'i
    @before,@after gibi bir notasyon varsa, her scenario'dan once ve/veya sonra bu methodlar
    calisacaktir

    Bu da bizim isteyecegimiz bir durum degilidr

    Cucumber'da @before,@after kullanma ihtiyacimiz olursa bunu
    stepdef. package'i altinda olusturacagimiz hooks classina koyariz

    biz her scenario dan sonra test sonucunu kontrol edip failed olan scenariolar icin
    screenshot almasi amaciyla @after method kullanacagiz
     */


    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshots");
        }
        Driver.closeDriver();
    }



}
