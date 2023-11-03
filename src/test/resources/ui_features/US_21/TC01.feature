@08
Feature: Students, choose lesson, grades and announcement


  Background: Ortak adımlar
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    And Ogrenci name ve password girilir

  @mehmet @08
  Scenario: Ogrenci Choose Lesson Table'da Teacher,Day,Start,Stop time goruldugu dogrulanir
    Given Choose Lesson Table'da Teacher sutununda ogretmen bilgilerinin goruldugu dogrulanır
    And Lesson Tableda Day sutununda ders gunlerinin goruldugu dogrulanır
    And Lesson Tableda Start Time sutununda baslangic saatinin goruldugu dogrulanir
    And Lesson Tableda Stop Time sutununda baslangic saatinin goruldugu dogrulanir
    And Choose Lesson tablosundan random bir ders seçilir
    #And Submit butonuna tiklanir ve derslerin seçildigi dogrulanir
    And Derslerin Lesson Program List e eklendigi dogrulanir
    * kullanici 3 saniye bekler
    #And Aynı derslerin tekrardan seçilemedigi dogrulanir
    And Grades and Announcemenents sayfasina gidilir
    #And Student Info List tablosunda ders notlarinin goruldugu dogrulanir
    And Meet List tablosunda toplantilarin goruldugu dogrulanir

