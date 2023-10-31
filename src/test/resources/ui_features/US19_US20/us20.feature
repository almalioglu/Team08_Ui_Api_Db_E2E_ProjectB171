@x
Feature: US20 Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
  Background:Background: siteye git teacher hesabina gir
    And siteye git
    Given login butonuna tikla
    And username box a username yaz, password box a password yaz,login butonuna tikla
    And menu butonuna tikla
    And sağ tarafta acılan menu sekmesinde Meet Management seceneğine tıkla
    And toplantilari gormek icin sayfayi kaydir

    Scenario: TC01 Toplantıların, Date, Start Time, Stop Time ve Description görülmeli
      Then Toplantıların, Date, Start Time, Stop Time ve Description gör
      And sayfayi kapat

    Scenario: TC02 Toplantıları güncelleyebilmeli, "Choose Students" box inda ki öğrenciyi değistirilince gücelleme yapilabilmeli
      And meet List cercevesindenki  Edit butonuna tıkla
      And Choose Students box inda ki öğrenciyi "Leyla Kara" ile  değistir
      And Editsubmit butonuna tıkla
      Then Meet Updated Successfully mesajının cıktığını doğrula
      And sayfayi kapat

    Scenario: TC03 Toplantıları güncelleyebilmeli,"Date Of Meet" box inda tarihi degistirilince güncelleme yapılabilmeli
       And meet List cercevesindenki  Edit butonuna tıkla
       And Date Of Meet box inda "01022027" degistir
       And Editsubmit butonuna tıkla
       Then  Meet Updated Successfully mesajının cıktığını doğrula
       And sayfayi kapat

    # Scenario: TC4-TC5 DE BUG VAR

    Scenario: TC06 Toplantıları güncelleyebilmeli,"Desciription" box indaki msj degistirilince güncelleme yapılabilmeli
       And meet List cercevesindenki  Edit butonuna tıkla
       And Description kısmınıdaki mesajı "acilveönemli" olarak değistir
       And Editsubmit butonuna tıkla
       Then Meet Updated Successfully mesajının cıktığını doğrula
       And sayfayi kapat

    Scenario: TC07 Toplantıları silebilmeli
      And meet List cercevesindenki  cöp kutusu görseline tıkla
      And Meet Delete Successfully mesajının cıktığını doğrula
      And sayfayi kapat







