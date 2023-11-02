@08
  Feature:Dean olarak Vice Dean ekleyebilmeli
    Background:
      Given Kullanici "pageUrl" sayfasina git
      Then Login e tikla
      And Dean kullanici bilgileri ile sisteme giris yapar
      And login butona tiklar ve sayfaya giris yaptigini dogrular




    @ayseebrar
    Scenario:Dean, Vice Dean hesabı oluşturabilmeli
        Given kullanici name kutusuna "Ayse" girer
        Then kullanici surname kutusuna "Oral" girer
