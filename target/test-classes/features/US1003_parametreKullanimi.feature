Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre @paralel2
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon ana sayfasinda
    And kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder
    Then sayfayi kapatir