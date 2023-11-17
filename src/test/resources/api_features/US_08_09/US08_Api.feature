@API_US08
Feature: US08 Vice Dean ders oluşturabilmelidir
  Scenario: Vice Dean kullanicisi ile ders olusturma testi
    Given Vice Dean yetkisi ile giris yapilirr
    And Vice Dean lessons save icin URL düzenlenir
    When Vice Dean lessons save Request gonderilir ve Response alinir
    Then status kodun 200 oldugu dogrulanirr
    And Vice Dean lessons save icin gelen Response body dogrulanir

  @API_US09
  Scenario:Vice Dean kullanicisi ile ders listesi görülebilmeli
    Given Kayitli ders bilgisinin ID nosu alinirrr
    And Lesson getAllLessonByLessonId icin URL duzenlenirrr
    And Lesson getAllLessonByLessonId icin beklenen veriler duzenlenir
    When Lesson getAllLessonByLessonId icin GET Request gonderilir ve Response alinir
    Then status kodun 200 oldugu dogrulanirr
    And Lesson getAllLessonByLessonId icin gelen Response body dogrulanir