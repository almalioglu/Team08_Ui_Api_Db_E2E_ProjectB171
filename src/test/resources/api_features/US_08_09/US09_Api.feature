@API_US09
Feature: US09 Vice Dean ders listesini görebilmeli
  Scenario:Vice Dean kullanicisi ile ders listesi görülebilmeli
    Given Vice Dean yetkisi ile giris yapilirr
    And Vice Dean lessons get all için name alınır
    When Vice Dean lessons get Lesson by name için URL duzenlenir
    And Vice Dean lessons get Lesson by name için Expected Data duzenlenir
    And Vice Dean lessons get Lesson by name için Request gonderilir ve Response alinir
    And Vice Dean lessons get Lesson by name için gelen Response body dogrulanir
