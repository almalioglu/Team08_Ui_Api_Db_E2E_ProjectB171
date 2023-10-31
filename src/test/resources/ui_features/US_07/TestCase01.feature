@08 @TC01
Feature:
  Background:
    Given Kullanici "pageUrl" sayfasina git
    When Login e tikla
    And Kullanici  Dean olarak  sisteme giris yapar
    And Dean kullanici bilgileri ile sisteme giris yapar



  Scenario:Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Given  Kullanici menu butonuna tıklar
    Then Contact get all secenegine tiklar
    And mesajlarin gorundugunu dogrular
    And secilen mesajda sil butonuna tiklanir
    And Kullanıcı,isim sütununun görünür olup olmadığını belirtir
    And User asserts that if tne email column is visible
    And User asserts that if tne date column is visible
    And User asserts that if tne message column is visible
    And User asserts that if tne message column is visible
    And secilen mesajlar silinir
    And secilen mesajin silindigi dogrulanir
