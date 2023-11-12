#@08 @US_15_SG
#Feature: Student Info Management
#
#  Scenario: vicedean olarak ogrenci ekleme testi
#    Given "vicedean" yetkisi ile giris yapilir
#    And Sdutent save icin URL duzenlenir_SG
#    And Sdutent  save icin payload duzenlenir_SG
#    When Sdutent info save icin POST Request gonderilir ve Reponse alinir_SG
#    Then status kodun 200 oldugu dogrulanir_SG
#    And Sdutent  save icin gelen Response body dogrulanir_SG
#
#  Scenario: vicedean olarak Olusturulan Student bilgisini silme testi
#    Given "vicedean" yetkisi ile giris yapilir
#    Given  Student Delete icin URL duzenlenir_SG
#    When Student icin DELETE Request gonderilir ve Response alinir_SG
#    Then status kodun 200 oldugu dogrulanir_SG
#    And Student Info Delete icin gelen Response body dogrulanir_SG
