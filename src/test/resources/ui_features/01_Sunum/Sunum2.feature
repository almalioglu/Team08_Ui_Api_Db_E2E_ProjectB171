Feature: Tum Sitenin Tanitimi
  Scenario: Butun kullanıcilar ile giriş yap
    Given Kullanici "pageUrl" sayfasina git
    Then  Login e tikla
    #Admin girişi
    When  Admin username ve Password girilip login olunur
    Then  Menu butonuna tıklaa
    Then  Vice Dean Managemente tikla
    Then ViceDean ogretmen olusturur