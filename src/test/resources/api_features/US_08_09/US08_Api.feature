@API_US08
Feature: US08 Vice Dean ders oluşturabilmelidir
  Scenario: Vice Dean kullanicisi ile ders olusturma testi
    Given Vice Dean yetkisi ile giris yapilirr
    And Vice Dean lessons save icin URL düzenlenir
    When Vice Dean lessons save Request gonderilir ve Response alinir
    Then status kodun 200 oldugu dogrulanirr
    And Vice Dean lessons save icin gelen Response body dogrulanir

