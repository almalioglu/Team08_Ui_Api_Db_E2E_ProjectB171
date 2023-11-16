@API
Feature:
Scenario: US_02 Guest User bilgilleri gorulur(Get)
      Given "admin" yetkisi ile giris yapilir
      Then admin get icin url duzenlenir
      And Get guest user icin beklenen veriler duzenlenir
      When  getAll request gonderilir response alinir
      Then  status kodun 200 oldugu dogrulanir_EB
      And   get ile gelen response dogrulanir
