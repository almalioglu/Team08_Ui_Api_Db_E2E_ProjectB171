@08
Feature: US_05

  @TC05_01
  Scenario:Admin Dean listteki bilgileri goruntuledigini dogrular

    Given Admin Dean Management sayfasina gider
    When Dean Listin görüntülendiğini doğrular
    When Namein görüntülendiğini doğrular
    When Genderın görüntülendiğini doğrular
    When Phone Numberın görüntülendiğini doğrular
    When SSN Numberın görüntülendiğini doğrular
    When User Namein görüntülendiğini doğrular

  @TC05_02
  Scenario:Admin Deanleri silebilmeli

    Given Admin Dean Management sayfasina gider
    When Admin Dean Listin görüntülendiğini doğrular
    When Admin Deani Listede bulur ve silme butonunun görüntülendiğini doğrular
    Then silme butonuna tıklar ve deani siler
    When Silindigine dair mesajin goruntulendigini dogrular

  @TC05_03
  Scenario:Admin Name'i güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    When edit sayfasının açıldığını doğrular
    Then Name text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_04
  Scenario:Admin Surname'i güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Surname text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_05
  Scenario:Admin Birth Place'i güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Birth Place text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_06
  Scenario:Admin Date Of Birth'ü güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Date of Birth text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_07
  Scenario:Phone'u güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Phone text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_08
  Scenario:SSN'i güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then SSN text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_09
  Scenario:Username'i güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Username text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_10
  Scenario:Password'ü güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Password text boxına değiştirmek istediği valid değeri girer
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular

  @TC05_11
  Scenario:Admin Gender'ı güncelleyebilmeli

    Given Admin Dean Management sayfasina gider
    Then edit butonuna tıklar
    Then Genderı seçer
    Then Submit butonuna tıklar
    When Dean Updates Succesfull mesajının goruntulendigini dogrular