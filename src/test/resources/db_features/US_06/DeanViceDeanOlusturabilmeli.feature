@DB
  Feature: Vice Dean bilgisi dogrulama
    Scenario:Olusturulan Vice Dean hesabinin bilgisini dogrulama testi
      Given Database baglantisi kurulur_ae
      When Vice Dean bilgisini gorebilmek icin Query bilgisi gonderilir
      Then Kayitli Vice Dean bilgisi dogrulanir_aeo
      And database baglantisi kesilir_ae

