@08 @saadet1
Feature:Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

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
  #Then Delete ikonuna tıkla