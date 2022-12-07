Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

  @hmcNegative
  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "hotelUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir


  Scenario: TC10 yanlis username ile giris yapilamaz
    Given kullanici "hotelUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC11 yanlis username ve sifre ile giris yapilamaz
    Given kullanici "hotelUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir