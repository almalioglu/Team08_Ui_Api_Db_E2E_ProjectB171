@08 @busra
  Feature:

    Background: Kullanici ViceDean hesabiyla siteye login olur
      Given web sitesine gider
      When login sekmesine tiklar
      And username kutusuna kayitli username girer
      And password kutusuna kayitli password girer ve login olur
      When menu sekmesine tiklar
      And soldaki menuden Teacher Management sekmesine tiklar
      Then Teacher List basligini gorur

    @08 @busra @US14T1
    Scenario:TC01_Öğretmenin Name, Phone Number, SSN, User Name bilgileri görülebilmeli (Vice Dean)
    Then Listedeki bir öğretmenin Name bilgisinin görüldüğünü doğrula
    Then Aynı öğretmenin Phone Number bilgisinin görüldüğünü doğrula
    Then Aynı öğretmenin SSN bilgisinin görüldüğünü doğrula
    Then Aynı öğretmenin User Name bilgisinin görüldüğünü doğrula

    @08 @busra @US14T2
    Scenario:TC02_Vice Dean olarak Teacher Listteki öğretmen bilgileri güncellenebilmeli (Choose Lessons, Name, Surname, Birth Place,
      e-mail, phone, is Advisor Teacher, Gender,  Date of Birth, SSN, User Name ve Password)
      Then Listedeki bir öğretmenin bilgilerinin bulunduğu satırda Edit sekmesine tıkla
      And Açılan sayfada Choose Lessons menüsünden bir ders seç
      And Açılan sayfada Name kutusuna farklı bir veri gir
      And Açılan sayfada Surname kutusuna farklı bir veri gir
      And Açılan sayfada Birt Place kutusuna farklı bir veri gir
      And Açılan sayfada Email kutusuna farklı bir veri gir
      And Açılan sayfada Phone kutusuna farklı bir veri gir
      And Açılan sayfada SSN kutusuna farklı bir veri gir
      And Açılan sayfada Gender bölümünden farklı bir cinsiyete tıkla
      And Açılan sayfada Date of Birth kutusuna farklı bir veri gir
      And Açılan sayfada User Name kutusuna farklı bir veri gir
      And Açılan sayfada Password kutusuna farklı bir veri gir
      And Submit butonuna tıkla
   # Then "Teacher updated Successful" yazısının çıktığını doğrula

