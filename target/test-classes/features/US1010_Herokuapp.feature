@heroku

Feature:  US1010 herokuapp delete testi
@sirali @paralel1
  Scenario: TC15 herokuapp delete butonu calismali 
    Given kullanici "herokuappUrl" sayfasinda
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna basar
    And sayfayi kapatir