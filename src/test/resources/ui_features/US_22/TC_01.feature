@08
Feature: Students, choose lesson, grades and announcement


  Background: Ortak adımlar
    Given Kullanici "pageUrl" sayfasina git
    Then Login e tikla
    And Admin username ve Password girilip login olunur

  @mehmet
  Scenario:TC01 Admin iligli alanlar doldurularak eklenebilmeli
    Given Admin hesabinda login olduktan sonra ilgili alanlar doldurulur ve submit butonuna tıklanır
    Then Admin hesabinin eklendigi dogrulanir
    #* sayfayi kapat

  @mehmet
  Scenario:TC02 Admin Name kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Name bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir
    * sayfayi kapat

  @mehmet
  Scenario:TC03 Admin SurName kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin SurName bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir
    * sayfayi kapat

  @mehmet
  Scenario:TC04 Admin Birt Place kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Birt Place bolumu bos birakilarak eklenmemeli
    Then Admin hesabinin eklenmedigi dogrulanir
    * sayfayi kapat

  @mehmet
  Scenario:TC05 Admin Gender kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Gender bolumu bos birakilarak eklenmemeli
    Then Gender bolumu bos birakilarak admin eklenmedigi dogrulanir

  @mehmet
  Scenario:TC06 Admin Date Of Birth kutusu bos bırakılarak oluşturulmamalı
    Given Yeni admin Date Of Birth bolumu bos birakilarak eklenmemeli
    Then Gender bolumu bos birakilarak admin eklenmedigi dogrulanir