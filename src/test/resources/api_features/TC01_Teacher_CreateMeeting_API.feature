@meryemapı
  Feature: Teacher Create Meeting
    Scenario: Creating a meeting with a teacher user
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


    Scenario: Olusturulan meeti editleme





    Scenario: Olusturulan meeti delete etme
      Given meet delete icin url URL duzenlenir
      When meet delete icin request dönderilir ve response alinir
      Then HTTP status code should be 200



      #1 set the url url olustur
  #2 set the expected data  beklenen data
  #3 set the request get the response  sorguyu gönder cevabı al
  #4 do assertion doğrulama