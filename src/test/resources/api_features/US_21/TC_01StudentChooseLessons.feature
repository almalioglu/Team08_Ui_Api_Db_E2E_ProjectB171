Feature: Student Choose Lessons Gorebilmeli

  Background: Ortak adimlar
    Given "student" yetkisi ile giris yapilir

  @API @TC01 @mehmet
  Scenario:TC01 Student kullanicisi ile choose lessons gorulebilmeli
    Given student icin URL duzenlenir
    When choose lessons gorebilmek icin Get request gonderilir ve response alinir
    #* status kodun 200 oldugu dogrulanir
    And   choose lessonsda start time ve stop time gorulabildigi dogrulanir
    And  choose lessonsda teacher bilgilerinin goruldugu dogrulanir
    And  choose lessonsda day bilgilerinin goruldugu dogrulanir


    Scenario: TC02 Student kullanicisi ders secebilmeli
      Given student icin ders secme URL duzenlenir




