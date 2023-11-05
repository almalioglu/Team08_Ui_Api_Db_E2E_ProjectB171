@API
  Feature: Teacher Create Meeting
    Scenario: Creating a meeting with a teacher user
      Given URL is edited to create a meeting.
      #toplantı olusturmak için url düzenlenir
      And Payload is arranged to create a meeting
      #toplantı olusturmak için payload düzenlenir
      When A request is sent to create a meeting and a response is received.
      #toplantı olusturmak için request gönderilir response alınır
      Then HTTP status code should be 200
      And response body is validated
      #Toplantı olusturmak icin gelen body dogrulanır













      #1 set the url url olustur
  #2 set the expected data  beklenen data
  #3 set the request get the response  sorguyu gönder cevabı al
  #4 do assertion doğrulama