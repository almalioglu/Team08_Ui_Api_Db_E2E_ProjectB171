@Cihanapi
  Feature: Vice Dean ders programı oluşturabilmelidir.

    Background: Ortakk Adimlar
      Given "vicedean" yetkisi ile giris yapilir

    Scenario: Ders programı olusmalı

      When ders programi olusturmak icin POST request hazirlanir
      Then gonderilecek ders programi bilgileri hazirlanir
      Then ders programi olusturmak icin POST request gonderilir
      #Then status kodun 200 oldugu dogrulanir
      Then olusturulan ders programi bilgileri dogrulanir

    Scenario:Oluşturulan ders silinmeli

      Then silinecek des icin URL duzenlenir
      And silinecek ders icin DELETE Request gonderilir ve Response alinir
      And gelen Response body dogrulanir


