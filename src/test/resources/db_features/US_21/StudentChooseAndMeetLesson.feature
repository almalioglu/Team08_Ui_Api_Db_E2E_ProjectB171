
Feature: Olusturulmus admin hesabini dogrulama

  Scenario: Student verilen ders notlarini gorebilmeli
    Given Student icin database baglantisi kurulur
    When student ders notlarini gorebilmek için query gonderilir
    Then kayitli ders notlari dogrulanir

    Scenario: Student kendisi icin olusturulan meeting toplantilarini gorebilmeli
      Given Student icin database baglantisi kurulur
      When student meeting leri gorebilmek icin query gonderilir
      Then kayitli meeting bilgileri dogrulanir


      Scenario: Student sectigi dersleri gorebilmeli
        Given Student icin database baglantisi kurulur
        When ogrencinin almis oldugu dersleri gorebilmek icin query gonderilir
        Then aldıgı ders bilgileri dogrulanir