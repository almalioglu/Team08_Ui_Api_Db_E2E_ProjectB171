@08 @elif
Feature:US02 Admin Guest User List
  Background:
    Given Kullanici "pageUrl" sayfasina git
    Given login butonuna tikla

  Scenario:Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli ve silebilmeli
    Given Admin olarak Username kutusuna  username gir
    When Admin olarak Password kutusuna  password gir
    Then  Login butonuna tikla
    Then menu butonuna tikla
    Then Admin Guest User linkini tikla
    Then kullanici admin list bolumunde Name Number bilgisinin gorundugunu dogrular
    And kullanici admin list bolumunde Phone Number bilgisinin gorundugunu dogrular
    And kullanici admin list bolumunde SSN bilgisinin gorundugunu dogrular
    And kullanici admin list bolumunde User Name bilgisinin gorundugunu dogrular
    When kullanici admin list bolumunden kullaniciyi siler
    Then kullanici olusturulan kaydin silindigini dogrular