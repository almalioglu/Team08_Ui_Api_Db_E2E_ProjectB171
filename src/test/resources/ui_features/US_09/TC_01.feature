Feature: Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir. (Lessons - Lesson List)

  Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.
    Given Kullanici siteye gider
    Then kullanici 1 saniye bekler
    Then Login e tikla
    And giris bilgiler girilir
    And Menu butonuna tıklaa
    And kullanici 1 saniye bekler
    Given Lesson Management seçeneğine tıkla
    And Lesson yazısına tıkla
    And Lesson Name kutusuna bir veri gir
    And Compulsory kutucuğunu işaretle
    And Credit Score kutusuna bir veri gir
    And Submit butonuna tıkla
    And Sayfanın en altında bulunan sayfa sayısı kısmından son sayfaya gidilir
    And Oluşturulan; Lesson Name,Compulsory ve Credit Score görülmeli

    Scenario: Ders silebilmelidir
      Given Kullanici siteye gider
      Then kullanici 1 saniye bekler
      Then Login e tikla
      And giris bilgiler girilir
      And Menu butonuna tıklaa
      And kullanici 1 saniye bekler
      Given Lesson Management seçeneğine tıkla
      And Lesson yazısına tıkla
      And Lesson Name kutusuna bir veri gir
      And Compulsory kutucuğunu işaretle
      And Credit Score kutusuna bir veri gir
      And Submit butonuna tıkla
      And Sayfanın en altında bulunan sayfa sayısı kısmından son sayfaya gidilir
      And Oluşturulan dersin en sağında bulunan kırmızı çöp kutusu simgesine tıklanır

