@08
Feature: Tum Sitenin Tanitimi
  Scenario: Butun kullanıcilar ile giriş yap
    Given Kullanici "pageUrl" sayfasina git
    Then  Login e tikla
    #Admin girişi
    When  Admin username ve Password girilip login olunur
    Then  Menu butonuna tıklaa
    Then Logout butonuna tikla
    #Dean girişi
    When Kullanici  Dean olarak  sisteme giris yapar
    And Dean kullanici bilgileri ile sisteme giris yapar
    Then  Menu butonuna tıklaa
    Then Dean Logout butonuna tikla
    #ViceDean girişi
    When Dean olarak User name gir
    Then Password u gir ve enter a tikla
    Then  Menu butonuna tıklaa
    Then ViceDean Logout butonuna tiklar
    #Teacher Girişi
    When  Teacher olarak login yap
    Then  Menu butonuna tıklaa
    Then Dean Logout butonuna tikla
    #Student Girişi
    When Ogrenci name ve password girilir
    Then  Menu butonuna tıklaa
    Then Dean Logout butonuna tikla



