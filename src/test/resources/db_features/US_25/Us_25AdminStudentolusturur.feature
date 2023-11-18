Feature:Olusturulmus studenti dogrulama
  Scenario: Admin hesabi ile olusturulan studentin db testi
    Given admin icin database baglantisi kurulurSG
    When kayitli student bilgisini almak icin query gonderilirSG
    And Database baglantisi kesilirSG
    Then kayitli student bilgisi dogrulanirSG
