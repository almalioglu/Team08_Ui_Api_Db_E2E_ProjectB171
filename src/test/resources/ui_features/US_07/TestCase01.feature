@08 @07
Feature:  US07 | Dean Mesajlari Goruntuler
  Background:
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    And Kullanici  Dean olarak  sisteme giris yapar
    And Dean kullanici bilgileri ile sisteme giris yapar


  @07 @TC01
  Scenario:Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Given  Kullanici menu butonuna tiklar
    Then Contact get all secenegine tiklar
    And mesajlarin gorundugunu dogrular
    And silme butonunun gorunur olup olmadigini belirtir
    And Kullanici,isim sutununun gorunur olup olmadigini belirtir
    And Kullanici e-posta sutununun gorunur olup olmadigini belirtir
    And Kullanici, tarih sutununun gorunur olup olmadiğini iddia eder
    And Kullanici, subject sutununun gorunur olup olmadigini test eder
    And Kullanici, mesaj sutununun gorunur olup olmadigini belirtir
    And secilen mesajda sil butonuna tiklanir
    And secilen mesajlar silinir
    And secilen mesajin silindigi dogrulanir
