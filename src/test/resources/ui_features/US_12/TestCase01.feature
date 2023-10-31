@08
  Feature:Vice Dean öğretmene ders atayabilmelidir. (Lesson Program - Lesson Program Assignment)
    Scenario: Vice Dean öğretmene ders atayabilmelidir
      Given Kullanici "pageUrl" sayfasina git
      Then Login e tikla
      Then Dean olarak User name gir
      Then Password u gir ve enter a tikla
      Then Lesson Program a tikla
      Then Chose Lessons da ders sec
      Then Choose Education Term de donemi sec
      Then Choose Day den gun sec
      Then Start Time dan baslangıc saatini sec
      Then Stop Time dan bitis saatini sec
      Then Submit butonuna tikla
      Then Secilen ders Lesson Program Assignment da oldugunu dogrula
      Then Lesson Program Assignment bolumunde Chose Lesson u sec
      Then Lesson Program Assignment bolumunde Chose Teacher ı sec
      Then Assignment Submit butonuna tikla
      Then Lesson added to teacher yazısı gorulmeli