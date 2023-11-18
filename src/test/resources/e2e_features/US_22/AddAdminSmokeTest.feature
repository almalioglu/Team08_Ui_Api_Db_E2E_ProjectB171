@mehmet @E2EAPI
Feature: Add Admin


  Scenario: Admin kullanicisi API ile yeni bir admin hesabi olusturur
    Given "admin" yetkisi ile giris yapilir
    Given admin save icin URL duzenlenir
    And admin save icin payload duzenlenir
    When admin save icin post request gonderilir ve response alinir
    Then status kodun 200 oldugu dogrulanir
    And admin save icin gelen response body dogrulanir

  Scenario: API ile olusturulan admin hesabi
    Given "admin" yetkisi ile giris yapilir
    And admin get icin URL duzenlenir
    And admin get expected data duzenlenir
    When admin get request gonderilir ve response alinir
    Then status kodun 200 oldugu dogrulanir
    And admin get ile gelen response dogrulanir

  Scenario: API ile olusturulan admin hesabi silinir
    Given "admin" yetkisi ile giris yapilir
    And admin delete icin URL duzenlenir
    When admin delete request gonderilir ve response alinir
    Then status kodun 200 oldugu dogrulanir
    And admin delete islemi yapildigi dogrulanir

  Scenario: Database ile admin hesabi dogrulanir
    Given Admin icin database baglantisi kurulur
    When kayitli admin bilgisini almak icin query gonderilir
    Then kayitli admin bilgisi dogrulanir