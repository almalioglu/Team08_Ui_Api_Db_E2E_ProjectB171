@E2E @Elif
  Feature: US_01 Aday ogrenci sisteme kayit olabilmeli (Register)
   @08
    Scenario Outline: TC01 Basarili Kayit Islemi (UI Pozitif Test)
      Given Kullanici "pageUrl" sayfasina git
      Then kullanici 3 saniye bekler
      Then kullanici  Register butonuna tiklar
      Then kullanici  "<name>" "<Surname>" "<Birth_Place>" "<Phone>" "<Gender>" "<Date_Of_Birth>" "<Ssn>" "<User_Name>" "<Password>" bilgilerini girer
      Then kullanici 2 saniye bekler
      Then kullanici register yazisina tıklar
      Then kullanici 2 saniye bekler
      Then kullanici register isleminin basarili oldugunu dogrular
      And sayfayi kapat

      Examples:
        | name | Surname | Birth_Place | Phone        | Gender | Date_Of_Birth | Ssn         | User_Name | Password |
        | Ayla | Derman  | Bursa       | 505-321-6549 | Female | 12-09-2000    | 789-45-6123 | Sermin    | Ab123456 |


    Scenario: US_02 Guest User bilgilleri gorulur( Api Get)
      Given "admin" yetkisi ile giris yapilir
      Then admin get icin url duzenlenir
      And Get guest user icin beklenen veriler duzenlenir
      When  getAll request gonderilir response alinir
      Then  status kodun 200 oldugu dogrulanir_EB
      And   get ile gelen response dogrulanir

    Scenario:Guest User olusturulmus kayıtlari gorebilmeli (DB)
      Given Database bağlantisi kurulur
      And guestuser kayitlarini gorebilmek icin query sorgulamasi yapilir
      And guestUser dogrulamasi yapilir
      And  baglantisi kesilir

  #Scenario: Delete
   # And "admin" yetkisi ile giris yapilir
   # And eklenen guest user silinir


