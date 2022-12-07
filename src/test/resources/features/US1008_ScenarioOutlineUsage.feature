Feature: US1009 Hotel My Camp Login

  Scenario Outline: TC13 kullanici gecerli bilgilerle giris yapar
    Given kullanici "hotelUrl" sayfasinda
    Then Log in yazisina tiklar
    Then "<userNamee>" username girer
    Then "<passsword>" password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
    |userNamee|passsword|
    |Manager5 |Manager5!|
    |Manager6 |Manager6!|
    |Manager7 |Manager7!|
    |Manager8 |Manager8!|
    |Manager9 |Manager9!|
