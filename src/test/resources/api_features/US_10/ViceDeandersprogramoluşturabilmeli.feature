@Cihanapi
  Feature: Vice Dean ders programı oluşturabilmelidir.
    Scenario: Ders programı oluşmalı
      Given "vicedean" yetkisi ile giris yapilir
      When ders programi olusturmak icin POST request hazirlanir
      Then gonderilecek ders programi bilgileri hazirlanir
      Then ders programi olusturmak icin POST request gonderilir
      #Then status kodun 200 oldugu dogrulanir
      Then olusturulan ders programi bilgileri dogrulanir

    Scenario:Oluşturulan ders silinmeli
      Given "vicedean" yetkisi ile giris yapilir
