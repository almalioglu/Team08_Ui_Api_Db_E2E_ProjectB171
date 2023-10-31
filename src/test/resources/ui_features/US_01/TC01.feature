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

  Scenario Outline: TC02 Basarisiz kayit islemi (Negatif Senaryo)
    And kullanici "<name>" "<Surname>" "<Birth Place>" "<Gender>" "<Date Of Birth>" "<Phone>" "<Ssn>" "<User Name>" "<Password>" bilgilerini doldurur
    Then kullanici name bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici surname bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici birth place bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici date of birth bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici phone bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici ssn bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici user name bos birakildiginde Required uyari yazisi geldigini dogrular
    Then kullanici password bos birakildiginde Enter your password uyari yazisi geldigini dogrular
    And sayfayi kapat
    Examples:
      | name | Surname | Birth Place | Gender | Date Of Birth | Phone | Ssn | User Name | Password |
      |      |         |             |        |               |       |     |           |          |


  Scenario Outline: TC03 Basarisiz kayit islemi (Negatif Seneryo)
    And Kullanici "<name>" "<Surname>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgileri girer
    Then kullanici Ssn hatali girilince Minimum onbir character  uyari yazisi geldigini dogrular
    And sayfayi kapat
    Examples:
      | name | Surname | Birth Place | Phone        | Gender | Date Of Birth | Ssn      | User Name | Password |
      | Ayla | Derman  | Bursa       | 505-321-6549 | Female | 12-09-2000    | 78945612 | Sermin    | Ab123456 |


  Scenario Outline: TC04 Basarisiz kayit islemi (Negatif Seneryo)
    And Kullanici "<name>" "<Surname>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgileri girer
    Then kullanici kucuk harf icermeyen password girince One lowercase character uyari yazisi geldigini dogrular
    And sayfayi kapat
    Examples:
      | name | Surname | Birth Place | Phone        | Gender | Date Of Birth | Ssn         | User Name | Password |
      | Ayla | Derman  | Bursa       | 505-321-6549 | Female | 12-09-2000    | 789-45-6123 | Sermin    | AB123456 |


  Scenario Outline: TC05 Basarisiz kayit islemi (Negatif Seneryo)
    And Kullanici "<name>" "<Surname>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgileri girer
    Then kullanici rakam icermeyen password girince One number uyari yazisi geldigini dogrular
    And sayfayi kapat
    Examples:
      | name | Surname | Birth Place | Phone        | Gender | Date Of Birth | Ssn         | User Name | Password |
      | Ayla | Derman  | Bursa       | 505-321-6549 | Female | 12-09-2000    | 789-45-6123 | Sermin    | ABcDEFGH |


  Scenario Outline: TC06 Basarisiz kayit islemi (Negatif Seneryo)
    And Kullanici "<name>" "<Surname>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgileri girer
    Then kullanici buyuk harf, kucuk harf ve rakam iceren yedi karakterli password girince At least sekiz characters uyari yazisi geldigini dogrular
    And sayfayi kapat
    Examples:
      | name | Surname | Birth Place | Phone        | Gender | Date Of Birth | Ssn         | User Name | Password |
      | Ayla | Derman  | Bursa       | 505-321-6549 | Female | 12-09-2000    | 789-45-6123 | Sermin    | Ab12345  |
