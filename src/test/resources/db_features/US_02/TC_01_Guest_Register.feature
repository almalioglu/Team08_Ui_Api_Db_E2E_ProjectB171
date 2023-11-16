Feature:US_02 Oluşturulmus Regiter kaydini gorebilme (DB)
  Scenario:Guest User olusturulmus kayıtlari gorebilmeli
    Given Database bağlantisi kurulur
    And guestuser kayitlarini gorebilmek icin query sorgulamasi yapilir
    And guestUser dogrulamasi yapilir
    And  baglantisi kesilir







