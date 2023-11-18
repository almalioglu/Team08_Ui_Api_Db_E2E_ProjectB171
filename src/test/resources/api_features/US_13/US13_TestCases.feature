@API
Feature: Vice Dean Teacher Ekleyebilmeli

  Background:
    Given Siteye "vicedean" yetkisi ile giris yapilir

  @API @US13TC01 @busra
  Scenario: Vice Dean ogretmen kaydi olusturabilmeli  (POST)
    And Teacher eklemek icin URL duzenlenir
    And Teacher eklemek icin PAYLOAD duzenlenir
    When Teacher eklemek icin request gonderilir ve response alinir
    Then HTTP status code 200 oldugu kontrol edilir
    And Teacher bilgileri dogrulanir


