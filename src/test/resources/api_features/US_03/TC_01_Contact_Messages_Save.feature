@API
  Feature: Contact Message Controller (Post)
    Scenario: US03 Contact message bilgileri girilir
      Given contact islemi icin url düzenlenir
      And contact payload düzenlenir
      And contact icin post request gönderilir ve respons alinir
      Then status kodun 200 oldugu dogrulanir_EB
      And contact icin gelen response bady dogrulanilir