@SAADET1
Feature: US15 Vice Dean ogrenci olusturabilmeli.
  Scenario: Olusturulan ogrenci bilsisini alma testi
    Given "admin" yetkisi ile giris yapilir
    When Studen eklemek icin post request hazirligi yapilir
    And Gonderilecek studen bilgileri hazirlanir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir
    When Kayitli Student id ile cagirilir
    Then Student bilgileri dogrulanir(get)

  Scenario: kaydedilen ögrenciyi silme
    Given "admin" yetkisi ile giris yapilir
    When Student icin Delete  URL duzenlenir
    And Student Info Delete icin request gönderilir ve response alınır.
    Then status kodun ikiyuz oldugu dogrulanirSG
