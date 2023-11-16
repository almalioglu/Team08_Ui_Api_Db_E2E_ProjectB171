@APIayse
Feature:Vice Dean Management
  Background: Yetkili girisi
    Given "admin" yetkisi ile giris yapilir

  Scenario:Admin Vice Dean oluşturabilmeli
    Given Admin Vice Dean save icin URL duzenlenir_aeo
    And   Admin Vice Dean save icin payload duzenlenir_aeo
    When Admin Vice Dean save icin post request gonderilir response alinir_aeo
    Then Admin status kodun 200 oldugu dogrulanir_aeo
    And  Admin Vice Dean save icin gelen body dogrulanir_aeo
    And  Admin vice dean silinir
