@API
  Feature:Admin ile  Guest User Controller
    Scenario: US_01 Guest User bilgileri girilir
      Given register islemi icin url düzenlenir
      And register payload düzenlenir
      And register icin post request gönderilir ve respons alinir
      Then status kodun 200 oldugu dogrulanir_EB
      And register icin gelen response bady dogrulanilir
      And "admin" yetkisi ile giris yapilir
      And eklenen guest user silinir


