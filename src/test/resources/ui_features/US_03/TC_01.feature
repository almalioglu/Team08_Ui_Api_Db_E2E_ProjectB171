@08 @elif
Feature: US03 Kullanıcılar sayfadan mesaj gönderebilmelidir (Contact)

  Background:
    Given Kullanici "pageUrl" sayfasina git
    Then kullanici 3 saniye bekler
    And kullanici Contact butonuna tiklar

  Scenario Outline: TC01 Contact (Pozitif Test)
    Given kullanici "<name>" "<email>" "<subject>" "<message>" bilgilerini girer
    When kullanici 2 saniye bekler
    Then kullanici Send Message butonuna tiklar
    Then kullanici 2 saniye bekler
    Then kullanici mesaji gonderdigini dogrular
    And sayfayi kapat

    Examples:
      | name   | email            | subject | message      |
      | serpil | serpil@gmail.com | test    | Message1234? |


  @elif
  Scenario Outline: TC02 Contact (Negatif Test)
    Given kullanici "<name>" "<email>" "<subject>" "<message>" bilgilerini girer
    When kullanici 2 saniye bekler
    Then kullanici Send Message butonuna tiklar
    Then kullanici 2 saniye bekler
    Then kullanici email @ ve . karakteri olmadiginda message'in gonderilemedigini dogrular
    Examples:
      | name   | email           | subject | message      |
      | serpil | serpilgmail.com | test    | message1234? |


    #BUG:emailde  nokta karakteri olmadığında da mesaj gönderilebiliyor
