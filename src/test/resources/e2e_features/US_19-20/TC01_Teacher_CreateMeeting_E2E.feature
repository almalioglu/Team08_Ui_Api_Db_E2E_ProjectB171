@meryeme2e
  Feature: Teacher meet creative
    Scenario: siteye git teacher hesabina gir
      And siteye git
      Given login butonuna tikla
      And username box a username yaz, password box a password yaz,login butonuna tikla
      And menu butonuna tikla
      And sol tarafta acılan menu sekmesinde Meet Management seceneğine tıkla
      When Choose Students select menusunden ogrenci secimini yap
      And Date Of Meet den bir tarih sec
      And toplantı baslangıc saati  olarak "1000" sec
      And toplantı bitis saati olarak "1100" sec
      And description box'a "mutlaka gel" yaz
      And submit butonuna tıkla
      Then Meet Saved Successfully mesajinin cıktığını doğrula
      And sayfayi kapat

    Scenario: Olusturulan toplantıyı userId ile cağırma
      Given Kayitli meet in ID nosu alinir
      And Teacher Meet GetMeetById icin URL duzenlenir
      And Teacher Meet GetMeetById icin beklenen veriler düzenlenir
      When Teacher Meet GetMeetById icin request gönderilir response alınır
      Then HTTP status code should be 200
      And GetMeetById icin gelen response body dogrulanır

    Scenario: oluturulan meet bilgisni doğrulama
      Given Database baglantisi kurulur
      And Teacher Meet GetMeetById icin beklenen veriler düzenlenir
      When kayıtlı meet bilgsini almak icin query gonderilir
      Then kayitli meet bilgisi dogrulanir
      And database baglantisi kesilir

    Scenario: Delete a meeting
      Given meet delete icin url URL duzenlenir
      When meet delete icin request dönderilir ve response alinir
      Then HTTP status code should be 200
      And toplanti delete isleminde gelen body dogrulanir
