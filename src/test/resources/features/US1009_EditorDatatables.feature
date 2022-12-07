
Feature: US1010 kullanici data ekleyebilmeli
  @sirali
  Scenario Outline: TC14 stepleri olusturup 5 farkli kayit ekle 
    When kullanici "editorUrl" sayfasinda
    And new butonuna basar
    And isim bolumune "<name>" girer
    And lastname bolumune "<lastname>" girer
    And position bolumune "<position>" girer
    And office bolumune "<office>" girer
    And extention bolumune "<extention>" girer
    And startdate bolumune "<startdate>" girer
    And salary bolumune "<salary>" girer
    Then create tusuna basar
    Then search kutusuna tiklar
    And ismi girer "<name>"
    Then ismin "<name>" bolumde gorundugunu dogrular
    Then sayfayi kapatir





    Examples:
    |name|lastname|position|office|extention|startdate|salary|
    |ali |kaya    |pozisyonsuz|ofis yok|ext yok|2022-11-10|100000|
    |burak |kilic    |pozisyonsuz|ofis yok|ext yok|2022-11-11|200000|
    |ahmet |ates    |pozisyonsuz|ofis yok|ext yok|2022-11-12|300000|
    |mehmet |oguz    |pozisyonsuz|ofis yok|ext yok|2022-11-13|400000|
