@08 @elif
Feature: US03 Kullanıcılar sayfadan mesaj gönderebilmelidir (Contact)

  Background:
    Given Kullanici "pageUrl" sayfasina git
    Then kullanici 3 saniye bekler
    And kullanici Contact butonuna tiklar

  Scenario Outline: TC01 Contact
    And kullanici "<name>" "<email>" "<subject>" "<message>" bilgilerini girer
    Then kullanici 3 saniye bekler
    #And kullanici Send Message butonuna tiklar
    #Then kullanici mesaji gonderdigini dogrular

    Examples:
      | name   | email            | subject | message     |
      | serpil | serpil@gmail.com | test    | message1234 |


