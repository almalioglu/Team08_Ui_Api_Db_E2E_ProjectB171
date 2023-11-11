Feature: US15 Vice Dean ogrenci olusturabilmeli.
  Scenario: TC001 Pozitive Scenario (Post)
    Given "vicedean" yetkisi ile giris yapilir
    When Studen eklemek icin post request hazirligi yapilir
    And Gonderilecek studen bilgileri hazirlanir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir
    #When Kayitli Student id ile cagirilir
    #Then Student bilgileri dogrulanir(get)

