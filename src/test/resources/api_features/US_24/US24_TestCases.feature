@API
Feature: Admin Teacher Ekleyebilmeli

  Background:
    Given Siteye "admin" yetkisi ile giris yapilir

  @API @US24TC01 @busraa
  Scenario: Admin ogretmen kaydi olusturulabilmeli (POST)
    And Teacher eklemek icin POST request hazirligi yapilir(admin)
    And Gonderilecek Teacher bilgileri hazirlanir(admin)
    When Teacher eklemek icin post request gonderilir(admin)
    Then Teacher bilgileri dogrulanir(admin)
