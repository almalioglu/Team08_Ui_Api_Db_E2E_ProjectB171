@E2E
Feature: Vice Dean ders ekleyebilmeli

  @08
  Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.
    Given Kullanici siteye gider
    Then kullanici 1 saniye bekler
    Then Login e tikla
    And giris bilgiler girilir
    And Menu butonuna tıklaa
    And kullanici 1 saniye bekler
    Given Lesson Management seçeneğine tıkla
    And Lesson yazısına tıkla
    And Lesson Name kutusuna veri gir
    And Compulsory kutucuğunu işaretle
    And Credit Score kutusuna bir veri gir
    And Submit butonuna tıklaaa
    And Sayfanın en altında bulunan sayfa sayısı kısmından son sayfaya gidilir
    And Oluşturulan; Lesson Name,Compulsory ve Credit Score görülmeli
    And sayfayi kapat

  @08
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
    And Submit butonuna tıklaaa
    And Sayfanın en altında bulunan sayfa sayısı kısmından son sayfaya gidilir
    And Oluşturulan dersin en sağında bulunan kırmızı çöp kutusu simgesine tıklanır
    And Lesson Deleted yazısı görülmeli
    And sayfayi kapat


  Scenario:Vice Dean kullanicisi ile ders listesi görülebilmeli
    Given Kayitli ders bilgisinin ID nosu alinirrr
    And Lesson getAllLessonByLessonId icin URL duzenlenirrr
    And Lesson getAllLessonByLessonId icin beklenen veriler duzenlenir
    When Lesson getAllLessonByLessonId icin GET Request gonderilir ve Response alinir
    Then status kodun 200 oldugu dogrulanirr
    And Lesson getAllLessonByLessonId icin gelen Response body dogrulanir

  Scenario: Kayitli Ders bilgisini dogrulama testi
    Given Database baglantisi kurulurrr
    And Lesson getAllLessonByLessonId icin beklenen veriler duzenlenir
    When Kayitli Ders bilgisini almak icin Query gonderilirrr
    Then Kayitli Ders bilgisi dogrulanirrr
    And Baglanti kesildiii