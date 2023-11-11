@Cihanapi
Feature: Vice Dean ders programını görebilmeli ve güncelleme yapabilmeli
  Scenario: Lesson, Day, Start Time, Stop Time görebilmeli
    Given "vicedean" yetkisi ile giris yapilir
    When Eklenen ders programini gorebilmek icin Get request hazirligi yapilir
    Then Ders program bilgilerini gormek icin Get request gonderilir
    Then Ders programi bilgileri dogrulanir