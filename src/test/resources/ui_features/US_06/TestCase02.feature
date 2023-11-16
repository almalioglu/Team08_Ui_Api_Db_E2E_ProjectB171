@US06 @TC02
Scenario Outline: TC02 Negatif test: SSN
     Given Kullanici "<Name>" alanina gecerli bir ad girer.

    @US06 @TC02
    Scenario:TC02 Negatif test "SSN"
      Given Kullanici anasayfaya gider.
      Then Kullanici Dean hesabi ile Sing in yapar.
      Then Kullanici "<Name>" alanina gecerli bir ad girer.

      Then Kullanici "<Surname>" alanina gecerli bir surname girer.
      Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
      Then Kullanici Gender seçeneginden birini seçer.
      Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
      And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
      Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
      Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
      Then Kullanici "<Password>" kutusuna büyük harf, kücük harf ve rakam iceren  en az sekiz karakterli bir sifreyi girer.
      Then Kullanici "<Ssn>"girilmelidir.
      And Kullanici Submit butonunu tiklar.
      And Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular.
      And Kullanici Ssn kutusunu siler.
      Then Kullanici "<Ssn1>" kutusuna -dokuz- karakterden fazla  bir SSN girer.
      And Kullanici Submit butonunu tiklar.
      And Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular.
      And Kullanici Ssn kutusunu siler.
      Then Kullanici "<Ssn2>" kutusuna -dokuz- karakterden az bir SSN girer.
      And Kullanici Submit butonunu tiklar.
      And Kullanici eksik karakter girdigini dorular.
      And Kullanici sayfayi kapatir.

     Examples:
      | Name            | Surname | Birth Place | Date Of Birth | Phone        | User Name            | Password         | Ssn         | Ssn1         | Ssn2       |
      | Ayse Ebrar      | Oral    | Istanbul    |10.09.1999     | 555-444-2121 |   AEBRAR            | Aebrar12         | 369 87 7410 | 369-87-74101 | 369-87-741 |

