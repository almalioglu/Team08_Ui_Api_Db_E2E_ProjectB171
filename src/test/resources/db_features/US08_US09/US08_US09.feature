@DB_US08_US09
Feature: Ders Bilgisi Dogrulama
  Scenario: Kayitli Ders bilgisini dogrulama testi
    Given Database baglantisi kurulurrr
    And Lesson getAllLessonByLessonId icin beklenen veriler duzenlenir
    When Kayitli Ders bilgisini almak icin Query gonderilirrr
    Then Kayitli Ders bilgisi dogrulanirrr
    And Baglanti kesildiii