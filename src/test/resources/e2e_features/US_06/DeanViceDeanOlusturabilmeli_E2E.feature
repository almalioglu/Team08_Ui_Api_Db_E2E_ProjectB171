
 
 
 
 
 
 
 
 


    Examples:
      | Name           | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name      | Password        |
      | Ayse Ebrar     | Oral    | Istanbul    | 10.09.1999    | 555-444-2120 |545-55-8787  | AEBRAR         | Aebrar12       |

  Scenario: Vice Dean hesabi olusturabilmeli
    Given "dean" yetkisi ile giris yapilirr
    Given Vice Dean save icin URL duzenlenir_aeo
    And Vice Dean save icin payload duzenlenir_aeo
    When Vice Dean save icin post request gonderilir response alinir_aeo
    Then status kodun 200 oldugu dogrulanir_aeo
    And  Vice Dean save icin gelen body dogrulanir_aeo
    And olusturulan vice dean silinir


  Scenario:Olusturulan Vice Dean hesabinin bilgisini dogrulama testi
    Given Database baglantisi kurulur_ae
    When Vice Dean bilgisini gorebilmek icin Query bilgisi gonderilir
    Then Kayitli Vice Dean bilgisi dogrulanir_aeo
    And database baglantisi kesilir_ae






