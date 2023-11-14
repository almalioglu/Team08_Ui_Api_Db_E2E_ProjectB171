@API
  Feature: Contact Message Controller (Post)
    Scenario: US03 Contact message bilgileri girilir
      Given contact islemi icin url duzenlenir
      And contact payload duzenlenir
      And contact icin post request gonderilir ve respons alinir
      Then status kodun 200 oldugu dogrulanirEB
      And contact icin gelen response bady dogrulanilir