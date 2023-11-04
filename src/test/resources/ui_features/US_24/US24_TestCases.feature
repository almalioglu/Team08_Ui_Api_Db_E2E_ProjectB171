@08 @busra
Feature: Admin tüm alanları doldurarak öğretmen kaydı oluşturabilmeli

  Background: Kullanici ViceDean hesabiyla siteye login olur
    Given web sitesine gider
    When login sekmesine tiklar
    And username kutusuna admin olarak kayitli username girer
    And password kutusuna admin olarak kayitli password girer ve login olur
    When menu sekmesine tiklar
    And soldaki menuden Teacher Management sekmesine tiklar
    Then Add Teacher basligini gorur

  @08 @busra @US13T1
  Scenario: TCO1_Admin tüm alanları doldurarak öğretmen kaydı oluşturabilmeli
    #Pozitif Senaryo
    When select Lesson sekmesine tiklar ve bir ders secer
    And name kutusuna veri girer
    And Surname kutusuna veri girer
    And Birth Place kutusuna veri girer
    And Email kutusuna veri girer
    And Phone kutusuna veri girer
    And Is Advisor Teacher basliginin solundaki checkbox tiklar
    And Gender basliginin altindaki radio buttondan cinsiyet secer
    And Date of Birth kutusuna veri girer
    And SSN kutusuna veri girer
    And User Name kutusuna veri girer
    And Password kutusuna password girer
    And Submit butonuna tiklanir
    Then "Teacher saved successfully." yazisinin ciktigini dogrular
    And web sayfasini kapatir

  @08 @busra @US13T2
  Scenario: TCO2_Admin öğretmen kaydı oluştururken ders seçmeden kayıt edilememeli
  #Negatif Senaryo
    And Choose Lessons başlık altındaki Select Lesson sekmesine tıklanmadığını doğrula
    And name kutusuna veri girer
    And Surname kutusuna veri girer
    And Birth Place kutusuna veri girer
    And Email kutusuna veri girer
    And Phone kutusuna veri girer
    And Is Advisor Teacher basliginin solundaki checkbox tiklar
    And Gender basliginin altindaki radio buttondan cinsiyet secer
    And Date of Birth kutusuna veri girer
    And SSN kutusuna veri girer
    And User Name kutusuna veri girer
    And Password kutusuna password girer
    And Submit butonuna tiklanir
    Then "Uyari" yazisin ciktigini dogrular
    And web sayfasini kapatir

  @08 @busra @US13T3
  Scenario: TCO3_Admin öğretmen kaydı oluştururken Name alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Name kutusunun boş olduğunu doğrular
    Then Name kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T4
  Scenario: TCO4_Admin öğretmen kaydı oluştururken Surname alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Surname kutusunun boş olduğunu doğrular
    Then Surname kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T5
  Scenario: TCO5_Admin öğretmen kaydı oluştururken Birth Place alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Birth Place kutusunun boş olduğunu doğrular
    Then Birth Place kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T6
  Scenario: TCO6_Admin öğretmen kaydı oluştururken Email alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Email kutusunun boş olduğunu doğrular
    Then Email kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T7
  Scenario: TCO7_Admin öğretmen kaydı oluştururken Phone alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Phone kutusunun boş olduğunu doğrular
    Then Phone kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T8
  Scenario: TCO8_Admin öğretmen kaydı oluştururken Gender alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Gender kutusunun boş olduğunu doğrular
    Then "You have entered an invalid value. Valid values are: MALE, FEMALE" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T9
  Scenario: TCO9_Admin öğretmen kaydı oluştururken Date Of Birth alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Date Of Birth kutusunun boş olduğunu doğrular
    Then Date Of Birth kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T10
  Scenario: TC10_Admin öğretmen kaydı oluştururken SSN alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then SSN kutusunun boş olduğunu doğrular
    Then SSN kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T11
  Scenario: TC11_Admin öğretmen kaydı oluştururken SSN; 3. ve 5. rakamdan sonra "-" içermeden girilen 9 rakamla kayıt edilememeli
  #Negatif Senaryo
    Then SSN kutusuna 9 tane rakam girer
    Then SSN kutusunun altında "Minimum 11 character (XXX-XX-XXXX)" yazısının çıktığını doğrula
    And web sayfasini kapatir

  @08 @busra @US13T12
  Scenario: TC12_Admin öğretmen kaydı oluştururken User Name alanı doldurulmadan kayıt edilememeli
  #Negatif Senaryo
    Then Username kutusunun boş olduğunu doğrular
    Then Username kutusunun altında "Required" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T13
  Scenario: TC13_Admin öğretmen kaydı oluştururken Password en az 8 karakterden oluşmalı
  #Negatif Senaryo
    Then Password kutusuna 8den az sayıda adet karakter girer
    Then Password kutusunun altında "At least 8 characters" yazısının çıktığını doğrular
    And web sayfasini kapatir

  @08 @busra @US13T14
  Scenario: TC14_Admin öğretmen kaydı oluştururken Password küçük harf içermeli ve en az 8 karakterden oluşmalı
  #Negatif Senaryo
    Then Password kutusuna 8 tane rakam gir
    Then Password kutusunun altında "One lowercase character" yazısının çıktığını doğrula
    And web sayfasini kapatir

  @08 @busra @US13T15
  Scenario: TC15_Admin öğretmen kaydı oluştururken Password küçük harf, büyük harf içermeli ve en az 8 karakterden oluşmalı
  #Negatif Senaryo
    Then Password kutusuna 1 küçük harf ve 8 tane rakam girer
    Then Password kutusunun altinda "One uppercase character" yazisinin ciktigini dogrular
    And web sayfasini kapatir