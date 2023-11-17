@API
Feature:Vice Dean ogretmenleri gorebilmeli ve guncelleyebilmeli

  Background:
    Given Siteye "vicedean" yetkisi ile giris yapilir

  @API @US14TC01 @busraa
  Scenario: Vice Dean ogretmen bilgilerini görebilmeli (GET) ( Name, Phone Number, SSN, User Name  )
    Given Kayitli ogretmenin id nosu alinir
    And Teacher userid icin URL duzenlenir
    And Teacher userid icin beklenen veriler duzenlenir
    When Teacher userid icin request gonderilir ve response alinir
    Then HTTP status code 200 oldugu dogrulanir
    And userid icin gelen response BODY dogrulanir


  @API @US14TC02 @busraa
  Scenario: Vice Dean öğretmen bilgilerini güncelleyebilmeli (PUT) (Choose Lessons, Name, Surname, Birth Place, e-mail, phone, is Advisor Teacher, Gender,  Date of Birth, SSN, User Name ve Password)
    Given Kayitli ogretmen bilgilerini guncellemek icin URL duzenlenir
    And Guncellenecek ogretmen verileri icin PAYLOAD hazirlanir
    When Kayitli ogretmen bilgilerini guncellemek icin request gonderilir ve response alinir
    Then HTTP status code 200 oldugu dogrulanir
    And Kayitli ogretmen guncellemek icin gelen BODY dogrulanir

    #1 set the url url olustur
   #2 set the expected data  beklenen data
   #3 set the request get the response  sorguyu gönder cevabı al
   #4 do assertion doğrulama
