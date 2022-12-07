Feature: US1012 kullanici register yapabilmeli

  Scenario: TC17 kullanici uygun datalarla register yapabilmeli

    @aut
    Given kullanici "automationUrl" sayfasinda
    And user sign in linkine tiklar
    And user create and account bolumune email adresini girer
    And create and account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrular