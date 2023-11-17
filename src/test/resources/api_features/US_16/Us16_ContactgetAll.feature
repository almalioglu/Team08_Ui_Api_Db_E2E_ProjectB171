@SAADET2
Feature: US016 Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  Scenario:  Kullanicilarin mesajlarni alma testi
    Given "vicedean" yetkisi ile giris yapilir
    And Mesaj eklemek icin post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir
    When Mesaj eklemek icin post request gonderilir
    Then Mesaj bilgileri dogrulanir

  Scenario: TC002 Vice Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir (Get)
    Given "vicedean" yetkisi ile giris yapilir
    And Mesaj cagirmak icin get request hazirligi yapilir
    When Mesaj eklemek icin get request gonderilir
    Then Mesaj bilgileri dogrulanir(get)
