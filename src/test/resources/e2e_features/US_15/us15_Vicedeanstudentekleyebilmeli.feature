 @SAADETE2E @E2E
Feature: ViceDean ogrenci olusturabilmeli

  @08
  Scenario: Oluşturulan Studentin Student Number'inin otomatik geldiğini doğrular
    Given Web sayfaasına git
    When login butonuna tıkla
    And Vice dean hesabıyla login ol
    And Menu butonuna tıkla
    And Açılan pencerede student management yazısına tıkla
    And Choose Teacher yazısına tıkla
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
    And Vice dean submit Butonuna tıklar
    And Student saved successfully mesajını doğrula
    And Student Listte son sayfaya git
    Then Oluşturulan Studentin Student Number'inin otomatik geldiğini doğrula

@API
  #Scenario: Olusturulan ogrenci bilsisini alma testi
  #  Given "vicedean" yetkisi ile giris yapilir
  #  When Studen eklemek icin post request hazirligi yapilir
  #  And Gonderilecek studen bilgileri hazirlanir
  #  When Student eklemek icin post request gonderilir
  #  Then Student bilgileri dogrulanir
  #  When Kayitli Student id ile cagirilir
  #  Then Student bilgileri dogrulanir(get)
@DB
  Scenario: Vice dean hesabi ile olusturulan studentin db testi
    Given Vice dean icin database baglantisi kurulur
    And Gonderilecek studen bilgileri hazirlanir
    When kayitli student bilgisini almak icin query gonderilir
    And kayitli student bilgisi dogrulanir
    Then Database baglantisi kesilir