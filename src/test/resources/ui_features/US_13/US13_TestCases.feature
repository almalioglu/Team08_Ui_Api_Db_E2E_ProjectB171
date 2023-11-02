@08 @busra
Feature: ViceDean ogretmen kaydi olusturabilmeli

#Background: Kullanici ViceDean hesabiyla siteye login olur
#  Given web sitesine gider
#  When login sekmesine tiklar
#  And username kutusuna kayitli username girer
#  And password kutusuna kayitli password girer ve login olur
#  When menu sekmesine tiklar
#  And soldaki menuden Teacher Management sekmesine tiklar
#  Then Add Teacher basligini gorur

  @busra01
  Scenario: TCO1_Vice Dean tüm alanları doldurarak öğretmen kaydı oluşturabilmeli
    Given web sitesine gider
    When login sekmesine tiklar
    And username kutusuna kayitli username girer
    And password kutusuna kayitli password girer ve login olur
    When menu sekmesine tiklar
    And soldaki menuden Teacher Management sekmesine tiklar
    Then Add Teacher basligini gorur
    When select Lesson sekmesine tiklar ve bir ders secer
    And name kutusuna veri girer
    And Surname kutusuna veri girer
    And Birth Place kutusuna veri girer
    And Email kutusuna veri girer
    And Phone kutusuna veri girer
    And Is Advisor Teacher basliginin solundaki checkbox tiklar
    And Gender basliginin altindaki radio buttondan cinsiyet secer
    And Date of Birth kutusuna veri girer
    And SSN kutusuna veri girer
    And User Name kutusuna veri girer
    And Password kutusuna password girer
    And Submit butonuna tiklanir
    And 'Teacher saved successfully.' yazisinin ciktigini dogrula



