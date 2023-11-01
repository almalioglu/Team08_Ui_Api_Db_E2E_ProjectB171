@08 @US17
Feature: Not bilgisi ekleme senaryosu

  Background: Teacher, Student Info Management sayfasina gider
  Scenario: tc02
   Given Kullanici "pageUrl" sayfasina git
   Then Teacher olarak login yap
   And Student Info Management sayfasinda oldugunu dogrula

#  Scenario: TC01 Teacher,"geçerli bilgileri" girerek öğrencilere not verebilmeli
#    Then Teacher ogrenci not bilgilerini doldurur_is
#    And Ogrenciye not verilebildigi dogrulanir_is
#    And sayfa kapatilir_is

#  Scenario: TC02 Teacher,"ders" seçmeden öğrenci bilgisi girememelidir
#  Scenario: TC03 Teacher,"öğrenci" seçmeden öğrenci bilgisi girememelidir
#  Scenario: TC04 Teacher,educationterm seçmeden öğrenci bilgisi girememelidir
#  Scenario: TC05 "Not ekleme" işlemi yapılırken "devamsızlık" girilebilmelidir
#  Scenario: TC06 Teacher, "Absentee" kutusunu boş bırakamamalıdır
#  Scenario: TC07 Teacher, "Midterm Exam" kutusunu boş bırakamamalıdır
#  Scenario: TC08 Teacher, "Final Exam" kutusunu boş bırakamamalıdır
#  Scenario: TC09 Teacher,"Info Note" kutusunu boş bırakamamalıdır
#  Scenario: TC10_13 "Midterml Exam" ve "Final Exam" notu "0-100" arasında herhangi bir deger girildiğinde eklenebilmelidir
#  Scenario: TC11_14 "Midterml Exam" ve "Final Exam" notu, "0 dan az "  bir deger girildiğinde eklenememelidir
#  Scenario: TC12_15 "Midterml Exam" ve "Final Exam" notu, "100 den fazla "  bir deger girildiğinde eklenememelidir
#  Scenario: TC16 Teacher, "Info Note" kısmına harf,rakam ve özel karakter içeren bir not girebilmeli

