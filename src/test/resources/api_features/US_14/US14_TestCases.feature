@API
Feature:Vice Dean ogretmenleri gorebilmeli ve guncelleyebilmeli

  Background:
    Given Siteye "vicedean" yetkisi ile giris yapilir

  @API @US14TC01 @busraa
  Scenario: Vice Dean öğretmen bilgilerini görebilmeli (GET) ( Name, Phone Number, SSN, User Name  )
    And Kayitli ogretmen bilgilerinin GET request hazirligi yapilir
    When Kayitli ogretmen id ile cagirilir
    Then Kayitli ogretmen bilgileri dogrulanir


  @API @US14TC02 @busraa
  Scenario: Vice Dean öğretmen bilgilerini güncelleyebilmeli (PUT) (Choose Lessons, Name, Surname, Birth Place, e-mail, phone, is Advisor Teacher, Gender,  Date of Birth, SSN, User Name ve Password)
    And Kayitli ogretmen bilgilerinin PUT request hazirligi yapilir
    And Guncellenecek ogretmen verileri hazirlanir
    When Kayitli ogretmen id ile guncellenir
    Then Guncellenen ogretmen bilgileri dogrulanir
    #And Ogretmen verileri silinir (DELETE)

