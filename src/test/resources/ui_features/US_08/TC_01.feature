@taha
Feature: Vice Dean ders oluşturabilmelidir.  (Lessons - Add Lesson)

  Background: ortak adimlar
    Given Kullanici siteye gider
    Then kullanici 1 saniye bekler
    Then Login e tikla
    And giris bilgiler girilir
    And Menu butonuna tıklaa
    And kullanici 1 saniye bekler


  Scenario: Lesson Name ismini girebilmelidir
    Given Lesson Management seçeneğine tıkla
    And Lesson yazısına tıkla
    And Lesson Name kutusuna bir veri gir
    Then Lesson Name kutusuna veri girilebildigi dogrulanır
    Then sayfayi kapat


  Scenario: Dersin, zorunlu (Compulsory) olup olmadığını işaretleyebilmelidir.
     Given Lesson Management seçeneğine tıkla
     And Lesson yazısına tıkla
     And Lesson Name kutusuna bir veri gir
     And Compulsory kutucuğunu işaretle
     Then Compulsory kutucuğunun isaretlendigi görülmeli
  Then sayfayi kapat

  Scenario: Credit Score girebilmelidir
      Given Lesson Management seçeneğine tıkla
      And Lesson yazısına tıkla
      And Lesson Name kutusuna bir veri gir
      And Compulsory kutucuğunu işaretle
      And Credit Score kutusuna bir veri gir
      And Submit butonuna tıkla
     Then Lesson Created yazısı görülmeli
  Then sayfayi kapat


  Scenario: Lesson Name ismi girilmeden ders oluşturulamamalı
      Given Lesson Management seçeneğine tıkla
      And Lesson yazısına tıkla
      And Lesson Name kutusunu boş bırak
      And Compulsory kutucuğunu işaretle
      And Credit Score kutusuna bir veri gir
      And Submit butonuna tıkla
      Then Lesson Name kutusunun kırmızı olduğu ve altında Required yazdığı görülmeli
    Then sayfayi kapat

  Scenario: Credit Score girilmeden ders oluşturulamamalı
    Given Lesson Management seçeneğine tıkla
    And Lesson yazısına tıkla
    And Lesson Name kutusuna bir veri gir
    And Compulsory kutucuğunu işaretle
    And Credit Score kutusunu boş bırak
    And Submit butonuna tıkla
    Then Credit Score kutusunun kırmızı olduğu ve altında Required yazdığı görülmeli
  Then sayfayi kapat



