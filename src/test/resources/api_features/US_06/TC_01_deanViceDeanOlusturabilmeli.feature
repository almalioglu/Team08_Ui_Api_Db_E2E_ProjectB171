@APIayse
  Feature: Dean, Vice Dean hesabı oluşturabilmelidir.
    Scenario: Vice Dean hesabi olusturabilmeli
        Given "Dean" yetkisi ile giris yapilir
        Given Vice Dean save icin URL duzenlenir_aeo
        And Vice Dean save icin payload duzenlenir_aeo
        When Vice Dean save icin post request gonderilir response alinir_aeo
        Then status kodun 200 oldugu dogrulanir_aeo
        And  Vice Dean save icin gelen body dogrulanir_aeo
        And olusturulan vice dean silinir


