@SAADETE2E2 @E2E
Feature:Web sitesine erişebilmeli ve siteye kayıtlı Admin hesabıyla giriş yaparak ogrenci kaydedebilmeli
  @08
  Scenario:admin, öğrenci oluşturabilmelidir.
    Given Web sayfaasına git
    When login butonuna tıkla
    And admin hesabıyla login ol
    And Menu butonuna tıkla
    And Açılan pencerede student management yazısına tıkla
    When Choose Teacher yazısına tıkla
    And Çıkan seçeneklerden teacher seç
    And name alanına geçerli veri gir
    And surname alanına geçerli veri gir
    And Birth Place alanına geçerli bir veri gir
    And Geçerli bir email adresi gir
    And geçerli bir phone number gir
    And gender seç
    And Date of Birth alanına tıkla  tarih seç
    And SSN number gir
    And Geçerli bir user name gir
    And father name alanına geçerli bir veri gir
    And mother name alanına geçerli bir veri gir
    And geçerli bir password gir
    And Admin submit butonuna tıklar
    And Student saved successfully mesajını doğrula
    And Student Listte son sayfaya git
    Then  Oluşturulan Studentin Student Number'inin otomatik geldiğini doğrula


  Scenario: Olusturulan ogrenci bilsisini alma testi
    Given "admin" yetkisi ile giris yapilir
    When Studen eklemek icin post request hazirligi yapilir
    And Gonderilecek studen bilgileri hazirlanir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir
    When Kayitli Student id ile cagirilir
    Then Student bilgileri dogrulanir(get)

  Scenario: Admin hesabi ile olusturulan studentin db testi
    Given admin icin database baglantisi kurulurSG
    When kayitli student bilgisini almak icin query gonderilirSG
    And Database baglantisi kesilirSG
    Then kayitli student bilgisi dogrulanirSG
