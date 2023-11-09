@saadet
Feature: US15 Vice Dean ogrenci olusturabilmeli.

  Scenario: TC1 Pozitive Scenario (Post)
    Given Studen eklemek icin post request hazirligi yapilir
    And Gonderilecek studen bilgileri hazirlanir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir
    When Kayitli Student id ile cagirilir
    Then Student bilgileri dogrulanir(get)
