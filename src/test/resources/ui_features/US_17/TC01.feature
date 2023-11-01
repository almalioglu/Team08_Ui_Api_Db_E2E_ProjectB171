@08 @US17
Feature: Not bilgisi ekleme senaryosu

  @08
  Scenario: Öğrenciye not bilgisi ekleme
  Given Kullanici "pageUrl" sayfasina git
  Then Teacher adina login yap
  And Choose Lesson menusunden ders sec
 # And "Choose Student" menüsünden "ögrenci" sec
 # And "Choose Education Term" menüsünden "dönem" sec
  #And "Absentee" kutusuna bir sayı gir
  #And "Midterm Exam" kutusuna bir sayı gir
  #And "Final Exam" kutusuna bir sayı gir
  #And "Info Note" kutusuna  "harf,rakam ve özel karakter de içerebilen en az 10 karakterli bir veri gir"
  #When "Submit" butonuna tıkla
  #Then Geçerli bilgilerle ögrenciye not bilgisi eklendiğini doğrula
