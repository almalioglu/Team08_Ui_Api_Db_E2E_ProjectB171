@08 @US18
Feature: US18_Teacher, ogrenciye verdigi notları, gorebilmeli ve guncelleyebilmelidir

  Background: Teacher, Student Info Management sayfasina gider
    Given Kullanici "pageUrl" sayfasina git
    Then Teacher olarak login yap_is
    And Student Info Management sayfasinda oldugunu dogrula_is

#  @US18 @TC_01
#  Scenario: Teacher, öğrenciye verdiği notları, görebilmelidir
#    And Ogrenci notunun gorundugunu dogrula_is

  @US18 @TC_02
  Scenario: Teacher, öğrencinin aldığı "dersi" güncelleyebilmelidir
    Then Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is
    And Ders bilgisi guncellenir_is
    And Edit ekrani kapatilir_is
    Then Ders bilgisinin guncellendigi dogrulanir_is
    And sayfa kapatilir_is

  @US18 @TC_03
  Scenario: Teacher, öğrencinin "ders dönemini" güncelleyebilmelidir
    Then Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is
    And Ders donemi bilgisi guncellenir_is
    Then Ders donemi bilgisinin guncellendigi dogrulanir_is
    And Edit ekrani kapatilir_is
    And sayfa kapatilir_is

  @US18 @TC_04
  Scenario: Teacher, öğrencinin "Absentee" bilgisini güncelleyebilmelidir
    Then Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is
    And Absentee bilgisi guncellenir_is
    And Edit ekrani kapatilir_is
    Then Absentee bilgisinin guncellendigi dogrulanir_is
    And sayfa kapatilir_is

  @US18 @TC_05
  Scenario: Teacher, öğrenciye verdiği "midterm exam" notunu güncelleyebilmelidir
    Then Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is
    And Midterexam bilgisi guncellenir_is
    And Edit ekrani kapatilir_is
    Then Midtermexam bilgisinin guncellendigi dogrulanir_is
    And sayfa kapatilir_is

  @US18 @TC_06
  Scenario: Teacher, öğrenciye verdiği "final exam" notunu güncelleyebilmelidir
    Then Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is
    And Finalexam bilgisi guncellenir_is
    And Edit ekrani kapatilir_is
    Then Finalexam bilgisinin guncellendigi dogrulanir_is
    And sayfa kapatilir_is

  @US18 @TC_07
  Scenario: Teacher, öğrenciye verdiği "Info Note" bilgisini güncelleyebilmelidir
    Then Ogrenci bilgilerini guncellemek icin edit butonu tiklanir_is
    And infonote bilgisi guncellenir_is
    And Edit ekrani kapatilir_is
    Then infonote bilgisinin guncellendigi dogrulanir_is
    And sayfa kapatilir_is

  @US18 @TC_08
  Scenario: Teacher, öğrencinin "not bilgisini" silebilmeli
    And Not bilgisini silmek icin delete butonu tiklanir_
    Then Ogrencinin listeden silindigi dogrulanir_is
    And sayfa kapatilir_is






