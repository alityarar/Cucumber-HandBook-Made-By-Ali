@Guru @paralel2

Feature: US1011 Web tablosundaki istenen sutunu yazdirma
  Scenario: TC16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruTable" sayfasinda
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
