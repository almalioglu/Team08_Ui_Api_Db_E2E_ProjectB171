@API
  Feature: Guest User Gorulur (Get)
    Background: Ortak adımlar
      Given "admin" yetkisi ile giris yapilir

    Scenario: TC01 Guest User bilgilleri girilir
      Given admin get icin url duzenlenir
      When  get request gonderilir ve response alinir
      Then  Status kodun 200 oldugu dogrulanir
      And   get ile gelen response dogrulanir






