Feature: US1004 kullanici parametre ile configuration file i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "rentUrl" sayfasinda
    And kullanici 3 sn bekler
    And url'nin "blue" icerdigini test eder
    Then sayfayi kapatir