@API
Feature: Dean Controller

  Scenario: Teacher olarak ogrencilere not verme testi
    Given "Teacher" yetkisi ile giris yapilir
    And Sdutent info save icin URL duzenlenir_is
    And Sdutent info save icin payload duzenlenir_is
    When Sdutent info save icin POST Request gonderilir ve Reponse alinir_is
    Then Status kodun 200 oldugu dogrulanir_is
    And Sdutent info save icin gelen Response body dogrulanir_is

  Scenario: Olusturulan Sdutent info bilgisini alma testi
    Given "Teacher" yetkisi ile giris yapilir
    And Kayitli Sdutent info bilgisinin ID nosu alinir_is
    And Sdutent info get icin URL duzenlenir_is
    And Sdutent info icin beklenen veriler duzenlenir_is
    When Sdutent info icin GET Request gonderilir ve Response alinir_is
    Then Status kodun 200 oldugu dogrulanir_is
    And Sdutent info icin gelen Response body dogrulanir_is
