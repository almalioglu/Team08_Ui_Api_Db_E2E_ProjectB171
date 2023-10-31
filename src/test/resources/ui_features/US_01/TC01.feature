@08 @elif
Feature: US_01 Aday ogrenci sisteme kayit olabilmeli (Register)

  Background:
    Given Kullanici "pageUrl" sayfasina git
    Then kullanici 3 saniye bekler
    Then kullanici  Register butonuna tiklar

  Scenario Outline: TC01 Basarili Kayit Islemi (Pozitif Senaryo)
    Given kullanici  "<name>" "<Surname>" "<Birth_Place>" "<Phone>" "<Gender>" "<Date_Of_Birth>" "<Ssn>" "<User_Name>" "<Password>" bilgilerini girer
    Then kullanici 2 saniye bekler
    Then kullanici register yazisina tıklar
    Then kullanici 2 saniye bekler
    Then kullanici register isleminin basarili oldugunu dogrular

    Examples:
      | name | Surname | Birth_Place | Phone        | Gender | Date_Of_Birth | Ssn         | User_Name | Password |
      | Ayla | Derman  | Bursa       | 505-321-6549 | Female | 12-09-2000    | 789-45-6123 | Sermin    | Ab123456 |

