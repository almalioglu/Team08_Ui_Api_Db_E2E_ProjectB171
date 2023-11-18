@API
Feature: Admin Teacher Ekleyebilmeli

  Background:
    Given Siteye "admin" yetkisi ile giris yapilir

  @API @US24TC01 @busraa
  Scenario: Admin ogretmen kaydi olusturabilmeli  (POST)
    And Teacher eklemek icin URL duzenlenir(admin)
    And Teacher eklemek icin PAYLOAD duzenlenir(admin)
    When Teacher eklemek icin request gonderilir ve response alinir(admin)
    Then HTTP status code 200 oldugunu kontrol edilir
    And Teacher bilgileri dogrulanir (admin)



