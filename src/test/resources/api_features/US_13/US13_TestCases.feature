@API
Feature: Vice Dean Teacher Ekleyebilmeli

  Background:
    Given Siteye "vicedean" yetkisi ile giris yapilir

  @API @US13TC01 @busraa
  Scenario: Vice Dean ogretmen kaydi olusturulabilmeli  (POST)
    And Teacher eklemek icin post request hazirligi yapilir
    And Gonderilecek Teacher bilgileri hazirlanir
    When Teacher eklemek icin post request gonderilir
    Then Teacher bilgileri dogrulanir
