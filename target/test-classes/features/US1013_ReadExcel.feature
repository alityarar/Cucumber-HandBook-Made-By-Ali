Feature: US1013 kullanici excel bilgilerine ulasir

  Scenario: TC18 kullanici excel bilgilerini kullanir

    Given kullanici excel dosyasini kullaninlabilir hale getirir

    Then 10.satirdaki 3.hucreye yazdirir
    And Sirasi 67 olan ulke ismini yazdirir
    And Ulke sayisini 167 oldugunu test eder
    And Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder
    Then 3.Satir 2.sutun bilgisini yazdirir