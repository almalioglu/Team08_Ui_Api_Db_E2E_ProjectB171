@08 @Cihan
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

     #Olumsuz Seneryo
  Scenario: TC_02 Choose Lessons seçilmeden ders progrmı oluşturulamamalı
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    Then Dean olarak User name gir
    Then Password u gir ve enter a tikla
    Then Lesson Program a tikla
    Then Chose Lessons da dersi bos birak
    Then Choose Education Term de donemi sec
    Then Choose Day den gun sec
    Then Start Time dan baslangıc saatini sec
    Then Stop Time dan bitis saatini sec
    Then Submit butonuna tikla
    Then Full authentication is required to access this resource yazısını gör


    #Olumsuz Seneryo
  Scenario: TC_03 Choose Education Term  seçilmeden ders progrmı oluşturulamamalı
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    Then Dean olarak User name gir
    Then Password u gir ve enter a tikla
    Then Lesson Program a tikla
    Then Chose Lessons da ders sec
    Then Choose Education Term i bos birak
    Then Choose Day den gun sec
    Then Start Time dan baslangıc saatini sec
    Then Stop Time dan bitis saatini sec
    Then Submit butonuna tikla
    Then Full authentication is required to access this resource yazısını gör


    #Olumsuz Seneryo
  Scenario: TC_04 Choose Day seçilmeden ders progrmı oluşturulamamalı
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    Then Dean olarak User name gir
    Then Password u gir ve enter a tikla
    Then Lesson Program a tikla
    Then Chose Lessons da ders sec
    Then Choose Education Term de donemi sec
    Then Choose Day i bos birak
    Then Start Time dan baslangıc saatini sec
    Then Stop Time dan bitis saatini sec
    Then Submit butonuna tikla
    Then Full authentication is required to access this resource yazısını gör





