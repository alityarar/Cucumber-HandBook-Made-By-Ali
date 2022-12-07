@tumu
Feature: US1001 Amazon Search

  @nutella @sirali @paralel1
  Scenario: TC01 kullanici amazonda kelime aratir


     Given kullanici amazon ana sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir


    @java @paralel2
    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon ana sayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir

      @iphone @paralel1
  Scenario: TC03 kullanici amazonda Iphone aratir
    Given kullanici amazon ana sayfasinda
    Then kullanici Iphone icin arama yapar
    And sonuclarin Iphone icerdigini test eder
    And sayfayi kapatir

