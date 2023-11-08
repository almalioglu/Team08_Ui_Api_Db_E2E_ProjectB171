@meryemdb
  Feature: Meet Bilgisi Dogrulama
    Scenario: oluturulan meet bilgisni doğrulama
      Given Database baglantisi kurulur
      And Teacher Meet GetMeetById icin beklenen veriler düzenlenir
      When kayıtlı meet bilgsini almak icin query gonderilir
      Then kayitli meet bilgisi dogrulanir
      And database baglantisi kesilir
