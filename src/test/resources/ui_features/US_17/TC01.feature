@08 @US17
Feature: Not bilgisi ekleme senaryosu

  Background: Teacher, Student Info Management sayfasina gider
    Given Kullanici "pageUrl" sayfasina git
    Then Teacher olarak login yap_is
    And Student Info Management sayfasinda oldugunu dogrula_is

  @US17 @TC01_is
  Scenario: TC01 Teacher,"geçerli bilgileri" girerek öğrencilere not verebilmeli
    Then Not icin gerekli tum bilgiler eklenir_is
    And Ogrenciye not verilebildigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC02_is
  Scenario: TC02 Teacher,"ders" seçmeden öğrenci bilgisi girememelidir
    Then Choos lesson menusu haric tum bilgiler eklenir_is
    And  Ders secilmeden ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC03_is
  Scenario: TC03 Teacher,"öğrenci" seçmeden öğrenci bilgisi girememelidir
    Then Choose Student menusu bos birakilip diger tum bilgiler eklenir_is
    And Ogrenci secilmeden ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC04_is
  Scenario: TC04 Teacher,"educationterm" seçmeden öğrenci bilgisi girememelidir
    Then Education Term menusu bos bırakılıp diger tum bilgiler eklenir_is
    And Education term secilmeden ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC05_is
  Scenario: TC05 "Not ekleme" işlemi yapılırken "devamsızlık" girilebilmelidir
  Then Absentee menusu dahil tum bilgiler eklenir_is
  And Not bilgilerinde devamsizlik oldugu dogrulanir_is
  And sayfa kapatilir_is

  @US17 @TC06_is
  Scenario: TC06 Teacher, "Absentee" kutusunu boş bırakamamalıdır
    Then Absentee menusu haric tüm bilgiler eklenir_is
    And Absentee bilgisi bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC07_is
  Scenario: TC07 Teacher, "Midterm Exam" kutusunu boş bırakamamalıdır
    Then Midterm Exam kutusu haric tum bilgiler eklenir_is
    And Midterm Exam kutusu bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
  And sayfa kapatilir_is

  @US17 @TC08_is
  Scenario: TC08 Teacher, "Final Exam" kutusunu boş bırakamamalıdır
    Then Final Exam bilgisi haric tum ogrenci bilgileri eklenir_is
    And Final Exam kutusu bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC09_is
  Scenario: TC09 Teacher,"Info Note" kutusunu boş bırakamamalıdır
    Then Info note bilgisi haric tum bilgiler eklenir_is
    And Info note kutusu bosken ogrenci bilgilerinin kaydedilmedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC10_13_is
  Scenario: TC10_13 "Midterml Exam" ve "Final Exam" notu "0-100" arasında herhangi bir deger girildiğinde eklenebilmelidir
   Then Midtermexam ve finalexam notu sifirveyuzarsi olup tum bilgiler eklenir_is
   And Midtermexam ve finalexam notu eklendigi dogrulanir_is
   And sayfa kapatilir_is

  @US17 @TC11_14_is
  Scenario: TC11_14 "Midterml Exam" ve "Final Exam" notu, "0 dan az "  bir deger girildiğinde eklenememelidir
    Then Midtermexam ve finalexam notu sifirdanaz olup tum bilgiler eklenir_is
    And Sifirdan az iken Midtermexam ve finalexam notu eklenemedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC12_15_is
  Scenario: TC12_15 "Midterml Exam" ve "Final Exam" notu, "100 den fazla "  bir deger girildiğinde eklenememelidir
    Then Midtermexam ve finalexam notu yuzdenfazla olup tum bilgiler eklenir_is
    And  Yuzden fazla iken Midtermexam ve finalexam notu eklenemedigi dogrulanir_is
    And sayfa kapatilir_is

  @US17 @TC16_is
  Scenario: TC16 Teacher, "Info Note" kısmına harf,rakam ve özel karakter içeren bir not girebilmeli
    Then Info note kutusu harf rakam ozelkarakter icerecek sekilde diger tum bilgiler eklenir_is
    And Info note bilgisi eklendigi dogrulanir_is
    And sayfa kapatilir_is



