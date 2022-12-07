package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {
    String dosyayolu="src/test/resources/dunyada_ulkeler_listesi-1121j.xlsx";
    FileInputStream fis = new FileInputStream(dosyayolu);
    Workbook workbook= WorkbookFactory.create(fis);

    public ExcelStepDefinitions() throws IOException {
    }

    @Given("kullanici excel dosyasini kullaninlabilir hale getirir")
    public void kullanici_excel_dosyasini_kullaninlabilir_hale_getirir() throws IOException {
   /*   String dosyayolu="src/test/resources/dunyada_ulkeler_listesi-1121j.xlsx";
      FileInputStream fis = new FileInputStream(dosyayolu);
      Workbook workbook= WorkbookFactory.create(fis);
*/
    }
    @Then("{int}.satirdaki {int}.hucreye yazdirir")
    public void satirdaki_hucreye_yazdirir(Integer satir, Integer sutun) {
     String istenenHucreYazisi=workbook
             .getSheet("Sayfa1")
             .getRow(satir-1)
             .getCell(sutun-1)
             .toString();
        System.out.println(satir+".satir"+sutun+".sutundaki deger : "+istenenHucreYazisi);
   }

    @Then("Sirasi {int} olan ulke ismini yazdirir")
    public void sirasi_olan_ulke_ismini_yazdirir(Integer siraNo) {
        //for loop ile butun satirlari kontrol etmem gerekiyor.
        //bunun icin de satir sayisina ihtiyacim var
        int satirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i <=satirSayisi ; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).createCell(1).toString().equals("Antarktika\n")){
                System.out.println("istediginiz siraya sahip ulke : "+
                        workbook.getSheet("Sayfa1").getRow(i).createCell(1));
            }


        }

    }
    @Then("Ulke sayisini {int} oldugunu test eder")
    public void ulke_sayisini_oldugunu_test_eder(Integer int1) {

    }
    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @Then("{int}.Satir {int}.sutun bilgisini yazdirir")
    public void satir_sutun_bilgisini_yazdirir(Integer int1, Integer int2) {

    }
}
