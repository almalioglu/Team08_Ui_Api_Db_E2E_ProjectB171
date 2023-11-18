 @US_17_18_E2E @E2E
Feature: Student Info Management E2E testi
  @08
  Scenario: TC01 Teacher,"geçerli bilgileri" girerek öğrencilere not verebilmeli_UI
    Given Kullanici "pageUrl" sayfasina git
    Then Teacher olarak login yap_is
    And Student Info Management sayfasinda oldugunu dogrula_is
    Then Not icin gerekli tum bilgiler eklenir_is
    And Ogrenciye not verilebildigi dogrulanir_is

   @API
  Scenario:Teacher olarak Olusturulan Sdutent info bilgisini alma testi
    Given "teacher" yetkisi ile giris yapilir
    And Kayitli Sdutent info bilgisinin ID nosu alinir_is
    And Sdutent info get icin URL duzenlenir_is
    And Sdutent info icin beklenen veriler duzenlenir_is
    When Sdutent info icin GET Request gonderilir ve Response alinir_is
    Then status kodun 200 oldugu dogrulanir_is
    And Sdutent info icin gelen Response body dogrulanir_is
   @DB
  Scenario: Student Info dogrulama testi
    Given Database baglantisi kurulur_is
    When Student Info icin query gonderili_is
    Then Student Info icin gelen bilgiler dogrulanir_is
    And Database baglantisi kesilir_is

