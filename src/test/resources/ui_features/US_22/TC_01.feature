@08 @mehmet
Feature: Students, choose lesson, grades and announcement


  Background: Ortak adımlar
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    And Admin username ve Password girilip login olunur

  @08 @mehmetUS22 @US22TC1
  Scenario:TC01 Admin iligli alanlar doldurularak eklenebilmeli
    Given Admin hesabinda login olduktan sonra ilgili alanlar doldurulur ve submit butonuna tıklanır
    Then Admin hesabinin eklendigi dogrulanir
    #* sayfayi kapat

  @08 @mehmetUS22 @US22TC2
  Scenario:TC02 Admin Name kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Name bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir
    * sayfayi kapat

  @08 @mehmetUS22 @US22TC3
  Scenario:TC03 Admin SurName kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin SurName bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir
    * sayfayi kapat

  @08 @mehmetUS22 @US22TC4
  Scenario:TC04 Admin Birt Place kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Birt Place bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir
    * sayfayi kapat

  @08 @mehmetUS22 @US22TC5
  Scenario:TC05 Admin Gender kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Gender bolumu bos birakilarak eklenmemeli
    * kullanici 2 saniye bekler
    Then Gender bolumu bos birakilarak admin eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC6
  Scenario:TC06 Admin Date Of Birth kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Date Of Birth bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC7
  Scenario:TC07 Admin Phone kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Phone bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC8
  Scenario:TC08 Admin SSN kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin SSN bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC9
  Scenario:TC09 Admin User Name kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin User Name bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC10
  Scenario:TC10 Admin Password kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Password bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin Password girilmeden eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC11
  Scenario:TC11 Admin 7 Karakterli Password ile oluşturulmamalı
    Given Yeni admin Yedi Karakterli Password ile eklenmemeli
    Then Admin hesabinin Yedi karakterli Password ile eklenmedigi dogrulanir

  @08 @mehmetUS22 @US22TC12
  Scenario:TC12 Admin Phone Kutusuna tireler girilmeden oluşturulmamalı
    Given Yeni admin Phone kutusuna tireleri eklemeden eklenmemeli
    Then Admin hesabinin Phone kutusuna yanlis veri girilerek eklenmedigi dogrulanir