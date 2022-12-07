package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
   POM'de Driver icin TestBase Class'ina extends etmek yerine
   Driver classindan static methodlar kullanarak
   driver olusturup ilgili ayarlarin yapilmasi ve en sonda
   driver in kapatilmasi tercih edilmistir


   POM'de Driver classindaki getDriver()'in obje olusturularak
   kullanilmasini engellemek icin Singleton pattern kullanimi benimsenmistir

   Singleton Patter; tekli kullanim,bir classin farkli classlardan obje
   olusturularak kullanimini engellemek icin kullanilir

   Bunu saglamak icin yapmamiz gereken sey oldukca basit. Obje olusturmak
   icin kullanilan constructor i private yaptigimizda baska classlarda
   Driver class'indan obje olusturulmasi mumkun olmaz



    */
    private Driver(){ //Priv Constructor obje olusumunu engeller

    }
    static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){

            switch (ConfigReader.getProperty("browser")){
                case"chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                default:WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }


            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();

        }


        return driver;
    }

    public static void closeDriver(){

        if (driver!=null){
            driver.close();
            driver=null;
        }



    }
}
