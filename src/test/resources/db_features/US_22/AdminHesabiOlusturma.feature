
Feature: Olusturulmus admin hesabini dogrulama

  Scenario: Admin hesabi ile olusturulan admin hesabinin db testi
    Given Admin icin database baglantisi kurulur
    When kayitli admin bilgisini almak icin query gonderilir
    Then kayitli admin bilgisi dogrulanir