@APIayse
  Feature: Dean, Vice Dean hesabı oluşturabilmelidir.
    Background: Yetkili girisi
      Given "Dean" yetkisi ile giris yapilir

      Scenario: Vice Dean hesabi olusturabilmeli
        Given Vice Dean olusturabilmek icin URL duzenlenir
        And Vice Dean olusturabilmek icin payload kismi duzenlenir
        When Vice Dean olusturabilmek icin request gonderilir response alinir
       # Then Status code iki yüz oldugu dogrulanir
        And Vice Dean olusmasi icin gelen body dogrulanir
        And Olusturulan vice dean silinir

