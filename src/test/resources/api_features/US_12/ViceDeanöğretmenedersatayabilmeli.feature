@Cihanapi
Feature: Vice Dean öğretmene ders atayabilmelidir.
  Scenario: Vice Dean ögretmene ders atar
    Given "vicedean" yetkisi ile giris yapilir
    When ogretmene ders atamak için URL hazıranır
    Then ogretmene ders atamak post reguest goderilir ve response alinir
    Then ogretmen ders bilgileri dogrulanır