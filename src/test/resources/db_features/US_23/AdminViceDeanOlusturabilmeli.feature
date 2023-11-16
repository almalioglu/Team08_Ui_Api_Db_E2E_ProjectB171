@DB
  Feature:Admin,Vice Dean bilgisi dogrulama
    Scenario:Olusturulan Vice Dean hesabinin bilgisini dogrulama testi
      Given Database baglantisi kurulur_aeo
      When kayıtlı Admin Vice Dean bilgisini almak icin query gonderilir_aeo
      Then kayitli admin vice dean bilgisi dogrulanir_aeo
      And database baglantisi kesilir_aeo