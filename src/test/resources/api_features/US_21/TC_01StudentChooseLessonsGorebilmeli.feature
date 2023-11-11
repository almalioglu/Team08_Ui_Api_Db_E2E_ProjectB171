Feature: Student Choose Lessons Gorebilmeli

  Background: Ortak adimlar
    Given "student" yetkisi ile giris yapilir

  @API @TC01 @mehmet1
  Scenario:TC01 Student kullanicisi ile choose lessons gorulebilmeli
    And student icin URL duzenlenir
    When choose lessons gorebilmek icin Get request gonderilir ve response alinir
    #* status kodun 200 oldugu dogrulanir
    And   choose lessonsda start time ve stop time gorulabildigi dogrulanir
    And  choose lessonsda teacher bilgilerinin goruldugu dogrulanir
    And  choose lessonsda day bilgilerinin goruldugu dogrulanir

  @API @TC02 @mehmet1
  Scenario: TC02 Student kullanicisi ders secebilmeli
    Given student icin ders secme URL duzenlenir
    And student choose lessonsdan ders secebilmek icin payload olusturulur
    When students choose lessons post icin request gonderilir payload alinir
    Then dersin eklendigi dogrulanir

    #delete olmadıgı görünüyor o yüzden delete işlemi yapılmadı

  Scenario: TC03 Student
