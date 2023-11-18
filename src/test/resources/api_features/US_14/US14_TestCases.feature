@API
Feature:Vice Dean ogretmenleri gorebilmeli ve guncelleyebilmeli

  Background:
    Given Siteye "vicedean" ile giris yapilir

  @API @US14TC0102 @busraa
  Scenario: Vice Dean ogretmen bilgilerini görebilmeli ve güncelleyebilmeli (GET-PUT) (Choose Lessons, Name, Surname, Birth Place, e-mail, phone, is Advisor Teacher, Gender,  Date of Birth, SSN, User Name ve Password)

    Given Kayitli ogretmen bilgilerini guncellemek icin URL duzenlenir
    And Guncellenecek ogretmen verileri icin PAYLOAD hazirlanir
    When Kayitli ogretmen bilgilerini guncellemek icin request gonderilir ve response alinir
    Then HTTP status codeun 200 oldugu dogrulanir
    And Kayitli ogretmen guncellemek icin gelen BODY dogrulanir

