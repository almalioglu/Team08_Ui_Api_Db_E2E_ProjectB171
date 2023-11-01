@08 @Cihan
  Feature:Vice Dean öğretmene ders atayabilmelidir. (Lesson Program - Lesson Program Assignment)
    Scenario:TC_01 Vice Dean öğretmene ders atayabilmelidir
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
      Then Lesson Program Assignment bolumunde Chose Teacher ı sec
      Then Lesson Program Assignment bolumunde Chose Lesson u sec
      Then Assignment Submit butonuna tikla
      Then Lesson added to teacher yazısı gorulmeli


      #Olumsuz Seneryo
    Scenario:TC02_Lesson Program Assignment de Chose Teacher secilmeden ogretmen atanamamalı
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
      Then Lesson Program Assignment bolumunde Chose Teacher i boş birak
      Then Lesson Program Assignment bolumunde Chose Lesson u sec
      Then Assignment Submit butonuna tikla
      Then The given id must not be null yazısı gorulmeli