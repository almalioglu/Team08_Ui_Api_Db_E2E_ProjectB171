#@08
  Feature:
    Background:
    Given Kullanici "pageUrl" sayfasina git
      When Login e tikla
      And Kullanici  Dean olarak  sisteme giris yapar
      And Dean kullanici bilgileri ile sisteme giris yapar



    Scenario:Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
      When kullanici menu butonuna tiklar
      Then Contact get all secenegine tiklar
      And mesajlarin gorundugunu dogrular
      And secilen mesajda sil butonuna tiklanir
      And secilen mesajlar silinir
      And secilen mesajin silindigi dogrulanir
