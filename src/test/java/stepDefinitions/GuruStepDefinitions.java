package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
GuruPage guruPage=new GuruPage();




    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;
        //listemiz WebElementlerden olusuyor
        //dolayisiyla bu webelementlerden hangisi istenen sutun basligini tasiyor bilemeyiz


        int istenenBaslikIndexi=-3;  //test icin -3 yazdik cunku index eksi bir degerden baslamaz

        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1; //Cunku xpath seysinde index 1 den baslar
                break;
            }

        }

        /*
        For loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastirdim
        loop bittiginde basligin bulunup bulunamadigini kontrol etmek ve bulundu ise devam etmek istiyorum

         */


        if (istenenBaslikIndexi != -3){

            List<WebElement> istenenSutundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));

            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());

            }

        }else{
            System.out.println("istenen baslik bulunamadi");
        }





    }
}
