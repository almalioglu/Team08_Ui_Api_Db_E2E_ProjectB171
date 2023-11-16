Feature: Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
  Background: Yetkili girisi
    Given "Dean" yetkisi ile giris yapilir

    Scenario: Dean Mesaj Olusturabilmeli
      Given Base URL duzenlenir
      And Payload duzenlenir
      When Request gonderilir response alinir
      Then Status code iki yüz oldugu dogrulanir
      And Body dogrulanir

      Scenario: Dean olusturulan mesaji gorebilmeli
        Given Get islemi icin base url duzenlenir
        When  Get request hazirligi gonderilir response alinir
        Then Status code iki yüz oldugu dogrulanir
        And  Get ile donen response body dogrulanir





