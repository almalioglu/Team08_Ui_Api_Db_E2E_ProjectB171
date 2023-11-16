@US_17_18_DB
Feature: Student Info Mangement
  Scenario: Student Info dogrulama testi
    Given Database baglantisi kurulur_is
    When Student Info icin query gonderili_is
    Then Student Info icin gelen bilgiler dogrulanir_is
    And Database baglantisi kesilir_is


