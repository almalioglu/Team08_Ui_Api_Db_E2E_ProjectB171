@08 @US04
Feature: US_04

  Background: Ortak adımlar
    Given Admin Dean Management sayfasina gider

  @TC04_01
  Scenario: Admin Dean ekleyebilmeli

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    When Dean saved mesajınin görüntülendigini dogrular
    Then Logout yapar ve sayfayi kapatir

  @TC04_02
  Scenario: Name textbox boş bırakılamaz

    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar

  @TC04_03
  Scenario: Surname textbox boş bırakılamaz


    Then Name text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_04
  Scenario: Birth Place textbox boş bırakılamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_05
  Scenario: Gender seçilmelidir boş bırakılamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular
    Then Date Of Birth text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_06
  Scenario: Date Of Birth  textbox boş bırakılamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_07
  Scenario: Phone textbox bos birakilamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_08
  Scenario: SSN textbox bos birakilamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_09
  Scenario: User Name textbox bos birakilamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_10
  Scenario: Password textbox boş bırakılamaz

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    When Required uyarısı aldigini dogrular
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_11
  Scenario:Birth Of Date'e gelecekten bir tarih girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth of date text boxına gelecekten bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    When Hata mesaji goruntulendigini dogrular
    Then Logout yapar ve sayfayi kapatir


  @TC04_12
  Scenario:  telefon numarası 12 karakterden az girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına gerekli bilgileri girer
    When Minimum character uyarisinin goruntulendigini dogrular
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_13
  Scenario:Telefon numarası geçerli bir şekilde girilmelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına invalid ozel karakter iceren değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    When Hata mesaji goruntulendigini dogrular
    Then Logout yapar ve sayfayi kapatir


  @TC04_14
  Scenario:Telefon numarası geçersiz bir şekilde girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına invalid harf iceren değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    When Hata mesaji goruntulendigini dogrular
    Then Logout yapar ve sayfayi kapatir

  @TC04_15
  Scenario:SSN numarası 11 karakterden az girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına on karakterli bir değer girer
    When Minimum character uyarı mesajinin goruntulendigini dogrular
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_16
  Scenario:Geçerli biçimde SSN numarası girilmelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına ozel karakterli bir değer girer
    When Minimum character uyarı mesajinin goruntulendigini dogrular
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir

  @TC04_17
  Scenario:11 karakterden fazla SSN numarası girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına onbir karekterden fazla bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    When Uyarı mesajı çıkmalıdır
    Then Logout yapar ve sayfayi kapatir

  @TC04_18
  Scenario:Gecersiz SSN numarasi girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına harf iceren bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına valid bir değer girer
    Then Submit butonuna tıklar
    When Uyarı mesajı çıkmalıdır
    Then Logout yapar ve sayfayi kapatir

  @TC04_19
  Scenario:8 karakterden az password girilmemelidir

    Then Name text boxına valid bir değer girer
    Then Surname text boxına valid bir değer girer
    Then Birth Place text boxına valid bir değer girer
    Then Gender alaninin goruntulendigini dogrular Female butonuna tıklar
    Then Date Of Birth text boxına valid bir değer girer
    Then Phone text boxına valid bir değer girer
    Then SSN text boxına valid bir değer girer
    Then User name text boxına valid bir değer girer
    Then Password text boxına invalid bir değer girer
    When uyarı mesajı görünür olmalidir
    Then Submit butonuna tıklar
    Then Logout yapar ve sayfayi kapatir


