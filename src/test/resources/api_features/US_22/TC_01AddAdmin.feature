@API
Feature: Add Admin

  Background: Ortak adimlar
    Given "admin" yetkisi ile giris yapilir

  @API @TC01 @mehmet
  Scenario:TC01 Admin Kullanicisi ile Admin hesabi olusturma testi
    Given admin save icin URL duzenlenir
    And admin save icin payload duzenlenir
    When admin save icin post request gonderilir ve response alinir
    Then status kodun 200 oldugu dogrulanir
    And admin save icin gelen response body dogrulanir

  @API @TC02 @mehmet
  Scenario: TC02 Admin kullanicisi ile olusturulan admin hesabi gorulur(get)
    Given admin get icin URL duzenlenir
    And admin get expected data duzenlenir
    When admin get request gonderilir ve response alinir
    Then status kodun 200 oldugu dogrulanir
    And admin get ile gelen response dogrulanir

  @API @TC02 @mehmet
  Scenario: TC03 Admin kullanicisi ile olusturulan admin hesabi silinir(delete)
    Given admin delete icin URL duzenlenir
    When admin delete request gonderilir ve response alinir
    Then status kodun 200 oldugu dogrulanir
    And admin delete islemi yapildigi dogrulanir




