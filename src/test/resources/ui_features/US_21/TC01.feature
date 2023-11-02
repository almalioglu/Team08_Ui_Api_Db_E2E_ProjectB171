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
    * sayfayi kapat


    @mehmet @08
    Scenario:Ogrenci Choose Lesson listesinde istedigi ders veya dersi seçebilmeli
      #Açılan Choose Lesson table'dan Random iki ders seçilir
      #Submit butonuna tıklanır
      #Lesson added to Student yazısının görüldügü dogrulanır
    Given Acilan Chooese Lesson tablosundan random iki ders secilir
      And Submit butonuna tıklanir
      Then Derslerin seçildigi dogrulanir

