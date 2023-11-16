@DB
  Feature:Admin,Vice Dean bilgisi dogrulama
    Scenario:Olusturulan Vice Dean hesabinin bilgisini dogrulama testi
      Given  Database baglantisi kurulur_aeo
      And Teacher Meet GetMeetById icin beklenen veriler düzenlenir
      When kayıtlı Admin Vice Dean bilgisini almak icin query gonderilir
      Then kayitli admin vice dean bilgisi dogrulanir
