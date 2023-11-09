@meryemapı
  Feature: Teacher Create Meeting
    Background:Yetkili girisi
      Given "teacher" yetkisi ile giris yapilir

    Scenario: Creating a meeting
      Given toplantı olusturmak için url düzenlenir
      And toplantı olusturmak için payload düzenlenir
      When toplantı olusturmak için request gönderilir response alınır
      Then HTTP status code should be 200
      And Toplantı olusturmak icin gelen body dogrulanır

    Scenario: Olusturulan toplantıyı userId ile cağırma
      Given Kayitli meet in ID nosu alinir
      And Teacher Meet GetMeetById icin URL duzenlenir
      And Teacher Meet GetMeetById icin beklenen veriler düzenlenir
      When Teacher Meet GetMeetById icin request gönderilir response alınır
      Then HTTP status code should be 200
      And GetMeetById icin gelen response body dogrulanır

    Scenario: Update a meeting
      Given toplanti editlemek icin url duzenlenir
      And toplanti editlemek icin payload duzenlenir
      When toplanti editlemek icin request gonderilir response alinir
      Then HTTP status code should be 200
      And toplanti editlemek icin gelen body dogrulanir

#    Scenario: Delete a meeting
#      Given meet delete icin url URL duzenlenir
#      When meet delete icin request dönderilir ve response alinir
#      Then HTTP status code should be 200
#      And toplanti delete isleminde gelen body dogrulanir


   #1 set the url url olustur
  #2 set the expected data  beklenen data
  #3 set the request get the response  sorguyu gönder cevabı al
  #4 do assertion doğrulama