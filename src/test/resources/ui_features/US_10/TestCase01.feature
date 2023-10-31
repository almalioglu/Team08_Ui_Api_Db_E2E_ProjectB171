@08
Feature: Vice Dean ders programı oluşturabilmelidir.(Lesson Program - Add Lesson Program)

  Scenario: TC_01 Vice Dean ders programı oluşturabilmelidir.
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    Then Dean olarak User name gir
    Then Password u gir ve enter a tikla
    Then Lesson Program a tikla
    Then Chose Lessons da ders sec
    Then Choose Education Term de donemi sec
    Then Choose Day den gun sec
    Then Start Time dan baslangıc saatini sec
    Then Stop Time dan bitis saatini sec
    Then Submit butonuna tikla
    Then Created Lesson Program yazisini gor





