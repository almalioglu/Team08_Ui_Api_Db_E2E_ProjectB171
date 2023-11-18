@SAADETE2E3 @E2E
Feature:Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  @08
  Scenario:Vice Dean kullanıcıların gönderdiği mesajları görebilmelidir
    When Web sayfaasına git
    And login butonuna tıkla
    And Vice dean hesabıyla login ol
    And Menu butonuna tıkla
    And Contact Get All bölümüne tıkla
    And Contact message bölümünde name bilgisinin göründüğünü doğrula
    And Contact message bölümünde email bilgisinin göründüğünü doğrula
    And Contact message bölümünde date bilgisinin göründüğünü doğrula
    And Contact message bölümünde subject bilgisinin göründüğünü doğrula
    And Contact message bölümünde message bilgisinin göründüğünü doğrula

  Scenario:  Kullanicilarin mesajlarni alma testi
    Given "vicedean" yetkisi ile giris yapilir
    And Mesaj eklemek icin post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir
    When Mesaj eklemek icin post request gonderilir
    Then Mesaj bilgileri dogrulanir


  Scenario:  Vice dean kullanici mesajlarini görür
    Given Vice dean icin database baglantisi kurulur
    Then mesajları görebilmek için query gonderlir
    And Mesajlar için gelen bilgiler doğrulanır
    Then Database baglantisi kesilir

