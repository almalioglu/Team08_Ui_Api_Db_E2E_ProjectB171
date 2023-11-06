@08 @saadet1
Feature:Web sitesine erişebilmeli ve siteye kayıtlı Admin hesabıyla giriş yapabilmeli

  Background:Ortak adımlar
    Given Web sayfaasına git
    When login butonuna tıkla
    And admin hesabıyla login ol
    And Menu butonuna tıkla
    And Açılan pencerede student management yazısına tıkla

  @08 @saadet1
  Scenario:admin, öğrenci oluşturabilmelidir.
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
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin, öğrenci oluşturamamalı
    And Choose Teacher yazısına tıkla
    And Çıkan seçeneklerden teacher seç
    And Admin submit butonuna tıklar
    And Required yazısını doğrula(Name)
    And Required yazısını doğrula(Surname)
    And Required yazısını doğrula(Birth Place)
    And Required yazısını doğrula(Email)
    And Required yazısını doğrula(Phone Number)
    And Required yazısını doğrula(Date of Birth)
    And Required yazısını doğrula(Ssn)
    And User name alanını sil
    And Required yazısını doğrula(Username)
    And Password alanını sil
    Then Enter your password yazısını doğrula
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin, öğrenci oluşturamamalı. /gender seçilmez
    And Choose Teacher yazısına tıkla
    And Çıkan seçeneklerden teacher seç
    And name alanına geçerli veri gir
    And surname alanına geçerli veri gir
    And Birth Place alanına geçerli bir veri gir
    And Geçerli bir email adresi gir
    And geçerli bir phone number gir
    And gender seçme
    And Date of Birth alanına tıkla  tarih seç
    And SSN number gir
    And Geçerli bir user name gir
    And  father name alanına geçerli bir veri gir
    And mother name alanına geçerli bir veri gir
    And geçerli bir password gir
    And submit butonuna tıkla
    Then you have entered an invalid value Valid values are MALE,FEMALE mesajı görülür
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin, öğrenci oluşturamamalı./ choose teacherdan teacher seçilmeden kayıt işlemi gerçekleşmesin
    And Choose Teacher yazısına tıkla
    And Çıkan seçeneklerden teacher seçme
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
    Then öğrencinin kaydedilemediğini doğrula
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin öğrenci kaydı oluştururken SSN; 3. ve 5. rakamdan sonra "-" içermeden girilen 9 rakamla kayıt edilememeli
    And SSN girilir fakat 3 ve 5 inci rakamlardan sonra bosluk birak konıulmaz
    And SSN kutusunun altında Minimum 11 character (XXX XX XXXX) yazısının çıktığı görülür ve doğrulanır
    And SSN alanı temizlenir
    And SSN alanına dokuz tane rakam gir
    Then SSN kutusunun altında Minimum 11 character (XXX XX XXXX) yazısının çıktığı görülür ve doğrulanır
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin öğrenci kaydı oluştururken Password en az 8 karakterden oluşmalı
    And password alanına sekiz karakterden az password gir
    Then Password kutusunun altında At least 8 characters yazısının çıktığını doğrula
    * sayfayi kapat

  @O8 @saadet1
  Scenario:Admin, öğrenci kaydı oluştururken Password büyük harf içermeli ve en az 8 karakterden oluşmalı
    And Password alanına sekiz karakterli büyük harf içermeyen password gir
    Then one uppercase mesajının göründüğünü doğrula
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin, öğrenci kaydı oluştururken Password küçük harf içermeli ve en az 8 karakterden oluşmalı
    And Password alanına 8 karakterli küçük harf içermeyen password gir
    Then One lowercase character mesajının göründüğünü doğrula
    * sayfayi kapat

  @08 @saadet1
  Scenario:Admin öğrencikaydı oluştururken Password küçük harf içermeli ve en az 8 karakterden oluşmalı
    And Password alanına 8 karakterli rakam içermeyen bir password gir
    Then One number mesajının göründüğünü doğrula
    * sayfayi kapat



