@SAADETDB
Feature:Olusturulmus studenti dogrulama
  Scenario: Vice dean hesabi ile olusturulan studentin db testi
    Given Vice dean icin database baglantisi kurulur
    When kayitli student bilgisini almak icin query gonderilir
    And Database baglantisi kesilir
    Then kayitli student bilgisi dogrulanir

