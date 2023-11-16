@DB
  Feature: Vice Dean bilgisi dogrulama
    Scenario:Olusturulan Vice Dean hesabinin bilgisini dogrulama testi
      Given Database baglantisi kurulur_ae
      And Vice Dean GetMeetById icin beklenen veriler düzenlenir_aeo
      When Kayitli Vice Dean bilgsini almak icin Query gonderilir_aeo
      Then Kayitli Vice Dean bilgisi dogrulanir_aeo
      And database baglantisi kesilir_ae


