@08 @saadet
Feature: ViceDean ogrenci olusturabilmeli
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
     #NEGATİVE TEST
  @08 @SGNTC1
  Scenario:Hicbir deger girilmeden submit yapılamaz
    When Web sayfaasına git
    And login butonuna tıkla
    And Vice dean hesabıyla login ol
    And Menu butonuna tıkla
    And Açılan pencerede student management yazısına tıkla
    #And Choose Teacher yazısına tıkla
    #And Çıkan seçeneklerden teacher seç
    And Vice dean submit Butonuna tıklar
    And Required yazısını doğrula(Name)
    And Required yazısını doğrula(Surname)
    And Required yazısını doğrula(Birth Place)
    And Required yazısını doğrula(Email)
    And Required yazısını doğrula(Phone Number)
    And Required yazısını doğrula(Date of Birth)
    And Required yazısını doğrula(Ssn)
   # And User name alanını sil
    And Required yazısını doğrula(Username)
    #And Password alanını sil
    Then Enter your password yazısını doğrula
  Scenario: @08 @SGNTC2
    When Web sayfaasına git
    And login butonuna tıkla
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
   # And gender seçme
    And Date of Birth alanına tıkla  tarih seç
    And SSN number gir
    And Geçerli bir user name gir
    And father name alanına geçerli bir veri gir
    And mother name alanına geçerli bir veri gir
    And geçerli bir password gir
    And Vice dean submit Butonuna tıklar
    And you have entered an invalid value Valid values are MALE,FEMALE mesajı görülür



