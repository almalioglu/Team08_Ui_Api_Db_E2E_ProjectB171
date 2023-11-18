 @E2E
Feature:Dean olarak Vice Dean ekleyebilmeli
  Background:
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    And  Kullanici dean bilgileri ile oturum açar


  @08 @TC01
  Scenario Outline: TC01 Vice Dean Hesabı Oluşturma Pozitif Testi
    Given Kullanici anasayfaya gider.
    Then Kullanici Dean hesabi ile Sing in yapar.
    Then Kullanici "<Name>" alanina gecerli bir ad girer.
    And  Kullanici Name alaninin bos olmadigini test eder.
    Then Kullanici "<Surname>" alanina gecerli bir surname girer.
    And Kullanici Surname  alaninin bos olmadigini test eder.
    Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
    And Kullanici Birth Place alaninin bos olmadigini test eder.
    Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
    And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
    Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
    And Kullanici Phone kutusunun bos olmadigini test eder.
    Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer.
    And Kullanici Ssn kutusunun bos olmadigini test eder.
    Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
    And Kullanici User Name kutusunun bos olmadigini test eder.
    Then Kullanici "<Password>" kutusuna büyük harf, kücük harf ve rakam iceren  en az sekiz karakterli bir sifreyi girer.
    And Kullanici Password kutusunun bos olmadigini test eder.
    Then Kullanici Submit butonunu tiklar.
    And Kullanici basarili bir sekilde Vice Dean ekledigini dogrular.
    And Kullanici sayfayi kapatir.


    Examples:
      | Name           | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name      | Password        |
      | Ayse Ebrar     | Oral    | Istanbul    | 10.09.1999    | 555-444-2120 |545-55-8787  | AEBRAR         | Aebrar12       |


  Scenario: Vice Dean hesabi olusturabilmeli
    Given Vice Dean save icin URL duzenlenir_aeo
    And Vice Dean save icin payload duzenlenir_aeo
    When Vice Dean save icin post request gonderilir response alinir_aeo
    Then status kodun 200 oldugu dogrulanir_aeo
    And  Vice Dean save icin gelen body dogrulanir_aeo
    And olusturulan vice dean silinir

  Scenario:Olusturulan Vice Dean hesabinin bilgisini dogrulama testi
    Given Database baglantisi kurulur_ae
    When Vice Dean bilgisini gorebilmek icin Query bilgisi gonderilir
    Then Kayitli Vice Dean bilgisi dogrulanir_aeo
    And database baglantisi kesilir_ae






