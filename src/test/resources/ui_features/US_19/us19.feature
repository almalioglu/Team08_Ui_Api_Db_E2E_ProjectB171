@08
Feature: US19 Teacher öğrenciler ile toplantı düzenleyebilmeli

  Background: siteye git teacher hesabina gir
    And siteye git
    Given login butonuna tikla
    And username box a username yaz, password box a password yaz,login butonuna tikla
    And menu butonuna tikla
    And sol tarafta acılan menu sekmesinde Meet Management seceneğine tıkla

    Scenario: TC01 "Choose Students" öğrenci seçilebilmeli
    When Choose Students select menusunden ogrenci secimini yap
    Then Choose Students menusunden ogrenci secildigini dogrula
    And sayfayi kapat

#    Scenario: TC02 "Choose Students" öğrenci seçilebilmeli. ögrenci secilmeyince toplantı olusturulamamalı
# BUG VAR

  Scenario: TC03 "Date Of Meet" toplantı zamanı seçilebilmeli. Geçmiş tarih girilmemeli.
  When Choose Students select menusunden ogrenci secimini yap
  And Date of Meet box a geçmis tarih olarak "01012020" tarihini gir
  And toplantı baslangıc saati  olarak "10000" sec
  And toplantı bitis saati olarak "1100" sec
  And description box'a "mutlaka gel" yaz
  And submit butonuna tıkla
  Then ileri bir tarih olmalı  mesajinin cıktığını doğrula
    And sayfayi kapat

Scenario: TC04 "Date Of Meet" toplantı zamanı seçilebilmeli. ileri bir tarih seçilerek meet olusturulabilmeli
  When Choose Students select menusunden ogrenci secimini yap
  And Date Of Meet den bir tarih sec
  And toplantı baslangıc saati  olarak "1000" sec
  And toplantı bitis saati olarak "1100" sec
  And description box'a "mutlaka gel" yaz
  And submit butonuna tıkla
  Then Meet Saved Successfully mesajinin cıktığını doğrula
  And sayfayi kapat


Scenario: TC05 "Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmeden toplantı olusturulamamalı
  And Choose Students select menusunden ogrenci secimini yap
  And Date Of Meet den bir tarih sec
  And description box'a "mutlaka gel" yaz
  And submit butonuna tıkla
  Then StartTime box altında Requried uyarisi ciktigini dogrula
  And sayfayi kapat

  Scenario: TC06 "Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmel; baslama saati bitis saatine esit olmamalı
  And Choose Students select menusunden ogrenci secimini yap
  And Date Of Meet den bir tarih sec
  And toplantı baslangıc saati  olarak "1000" sec
  And toplantı bitis saati olarak "1000" sec
  And description box'a "mutlaka gel" yaz
  And submit butonuna tıkla
  Then Error: start time must not be greater than or equal to stop time mesajinin cıktığını doğrula
    And sayfayi kapat

Scenario: TC07 "Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmel; baslama saati bitis saatinden kücük olmamalı
  And Choose Students select menusunden ogrenci secimini yap
  And Date Of Meet den bir tarih sec
  And toplantı baslangıc saati  olarak "1100" sec
  And toplantı bitis saati olarak "1000" sec
  And description box'a "mutlaka gel" yaz
  And submit butonuna tıkla
  Then Error: start time must not be greater than or equal to stop time mesajinin cıktığını doğrula
  And sayfayi kapat

Scenario: TC08 Description girilebilmeli. girilmediğinde toplantı olusturulamamalı
  And Choose Students select menusunden ogrenci secimini yap
  And Date Of Meet den bir tarih sec
  And toplantı baslangıc saati  olarak "1000" sec
  And toplantı bitis saati olarak "1100" sec
  And submit butonuna tıkla
  Then Desciription  box inin altında Required uyarısı cıktığını doğrula
  And sayfayi kapat