@E2E
Feature: Students Smoke Test

  @08
  Scenario: Ogrenci Choose Lesson Table'da Teacher,Day,Start,Stop time goruldugu dogrulanir
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    And Ogrenci name ve password girilir
    And Choose Lesson Table'da Teacher sutununda ogretmen bilgilerinin goruldugu dogrulanır
    And Lesson Tableda Day sutununda ders gunlerinin goruldugu dogrulanır
    And Lesson Tableda Start Time sutununda baslangic saatinin goruldugu dogrulanir
    And Lesson Tableda Stop Time sutununda baslangic saatinin goruldugu dogrulanir
    #And Choose Lesson tablosundan random bir ders seçilir
    #And Submit butonuna tiklanir ve derslerin seçildigi dogrulanir
    #And Derslerin Lesson Program List e eklendigi dogrulanir
    * kullanici 3 saniye bekler
    #And Aynı derslerin tekrardan seçilemedigi dogrulanir
    And Grades and Announcemenents sayfasina gidilir
    And Student Info List tablosunda ders notlarinin goruldugu dogrulanir
    And Meet List tablosunda toplantilarin goruldugu dogrulanir


  Scenario: Ogrenci kullanılarak Ders seçebilmeli dersleri gorebilmeli API
    Given "student" yetkisi ile giris yapilir
    And student icin URL duzenlenir
    When choose lessons gorebilmek icin Get request gonderilir ve response alinir
    And   choose lessonsda start time ve stop time gorulabildigi dogrulanir
    And  choose lessonsda teacher bilgilerinin goruldugu dogrulanir
    And  choose lessonsda day bilgilerinin goruldugu dogrulanir

  Scenario: TC02 Student kullanicisi ders secebilmeli API
    Given "student" yetkisi ile giris yapilir
    Given student icin ders secme URL duzenlenir
    And student choose lessonsdan ders secebilmek icin payload olusturulur
    When students choose lessons post icin request gonderilir payload alinir
    Then dersin eklendigi dogrulanir

  Scenario: TC03 Student kullanicisi kendisi için yapılan meet'leri görebilmeli API
    Given "student" yetkisi ile giris yapilir
    Given student icin meet URL duzenlenir
    And meet list gorebilmek icin Get request gonderilir ve response alinir
    Then meet listin goruldugu dogrulanir


  Scenario: TC04 Student kullanicisi verilen ders notlarini gorebilmeli API
    Given "student" yetkisi ile giris yapilir
    Given  student icin ders notlarini gorme URL duzenlenir
    And ders notlarini gorebilmek icin GET request gonderilir ve response alinir
    Then donen response dogrulanir


  Scenario: Student verilen ders notlarini gorebilmeli DB
    Given Student icin database baglantisi kurulur
    When student ders notlarini gorebilmek için query gonderilir
    Then kayitli ders notlari dogrulanir

  Scenario: Student kendisi icin olusturulan meeting toplantilarini gorebilmeli DB
    Given Student icin database baglantisi kurulur
    When student meeting leri gorebilmek icin query gonderilir
    Then kayitli meeting bilgileri dogrulanir


  Scenario: Student sectigi dersleri gorebilmeli DB
    Given Student icin database baglantisi kurulur
    When ogrencinin almis oldugu dersleri gorebilmek icin query gonderilir
    Then aldıgı ders bilgileri dogrulanir
