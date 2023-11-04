@08
Feature: Tum Sitenin Tanitimi

  Scenario: Butun kullanıcilar ile giriş yap
    Given Kullanici "pageUrl" sayfasina git
    Then  Login e tikla
    #Admin girişi
    When  Admin username ve Password girilip login olunur
    Then  Menu butonuna tıklaa
    Then  Vice Dean Managemente tikla
    #ViceDean olusturma
    Given ViceDean olusturulur
    Then  Menu butonuna tıklaa
    Then Logout butonuna tikla
    When Dean olarak User name gir
    Then Password u gir ve enter a tikla
    Then  Menu butonuna tıklaa
    Then  Teacher managemente tikla

    #Ogretmen oluşturma
    When select Lesson sekmesine tiklar ve bir ders secerr
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
    Then  Menu butonuna tıklaa
    Then ViceDean Logout butonuna tiklar
    #Teacher giriş
    When  Teacher olarak login yap_is
    # Ogrenciye not verme
    Then Not icin gerekli tum bilgiler eklenir_is







