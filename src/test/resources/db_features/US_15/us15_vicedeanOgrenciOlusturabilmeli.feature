@SAADETDB
Feature:Olusturulmus studenti dogrulama
  Scenario: Vice dean hesabi ile olusturulan studentin db testi
    Given Vice dean icin database baglantisi kurulur
    And Gonderilecek studen bilgileri hazirlanir
    When kayitli student bilgisini almak icin query gonderilir
    And kayitli student bilgisi dogrulanir
    Then Database baglantisi kesilir

