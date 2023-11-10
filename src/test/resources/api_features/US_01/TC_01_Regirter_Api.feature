@API
  Feature:Admin ile  Guest User Controller
    Scenario: TC01 Guest User bilgileri girilir
      Given register islemi icin url düzenlenir
      And register payload düzenlenir
      And register icin post request gönderilir ve respons alinir
      Then register post islemi icin status code 200 oldugu dogrulanir
      And register icin gelen response bady dogrulanilir
