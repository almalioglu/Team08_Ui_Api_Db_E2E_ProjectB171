@08 @06
<<<<<<< Updated upstream
Feature:Dean olarak Vice Dean ekleyebilmeli
   Background:
     Given Kullanici "pageUrl" sayfasina git
=======
  Feature:Dean olarak Vice Dean ekleyebilmeli
    Background:
      Given Kullanici "pageUrl" sayfasina git
>>>>>>> Stashed changes
      Then Login e tikla
      And  Kullanici dean bilgileri ile oturum açar


    @06 @TC01
<<<<<<< Updated upstream
   Scenario Outline: TC01 Vice Dean Hesabı Oluşturma Pozitif Testi
=======
    Scenario:TC01 Vice Dean Hesabı Oluşturma Pozitif Testi
>>>>>>> Stashed changes
      Given Kullanici anasayfaya gider.
      Then Kullanici Dean hesabi ile Sing in yapar.
      Then Kullanici "<Name>" alanina gecerli bir ad girer.
      And  Kullanici Name alaninin bos olmadigini test eder.
      Then Kullanici "<Surname>" alanina gecerli bir surname girer.
      And Kullanici Surname  alaninin bos olmadigini test eder.
      Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
      And Kullanici Birth Place alaninin bos olmadigini test eder.
      Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
      And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
      Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
      And Kullanici Phone kutusunun bos olmadigini test eder.
      Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer.
      And Kullanici Ssn kutusunun bos olmadigini test eder.
      Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
      And Kullanici User Name kutusunun bos olmadigini test eder.
      Then Kullanici "<Password>" kutusuna büyük harf, kücük harf ve rakam iceren  en az sekiz karakterli bir sifreyi girer.
      And Kullanici Password kutusunun bos olmadigini test eder.
      Then Kullanici Submit butonunu tiklar.
      And Kullanici basarili bir sekilde Vice Dean ekledigini dogrular.
      And Kullanici sayfayi kapatir.


     Examples:
       | Name           | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name      | Password        |
       | Vera           | Yilmaz  | Istanbul    | 10.09.1999    | 555-444-2120 |545-55-8787  | VERAYILMAZ     | Avera123        |

<<<<<<< Updated upstream


   @US06 @TC02
    Scenario Outline: TC02 Negatif test: SSN
     Given Kullanici anasayfaya gider.
=======
    @US06 @TC02
    Scenario:TC02 Negatif test "SSN"
      Given Kullanici anasayfaya gider.
>>>>>>> Stashed changes
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
        | Vera            | Yilmaz  | Istanbul    |10.09.1999     | 555-444-2121 | VERAYILMAZ           | Avera123         | 369 87 7410 | 369-87-74101 | 369-87-741 |


<<<<<<< Updated upstream
    @TC03
    Scenario Outline: TC03 Negatif TEST:Password en az 8 karakterden oluşmalıdır.
=======
    @US06 @TC03
    Scenario: TC03 Negatif TEST "Password en az 8 karakterden oluşmalıdır".
>>>>>>> Stashed changes
      Given Kullanici anasayfaya gider.
      Then Kullanici Dean hesabi ile Sing in yapar.
      Then Kullanici "<Name>" alanina gecerli bir ad girer.
      Then Kullanici "<Surname>" alanina gecerli bir surname girer.
      Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
      Then Kullanici Gender seçeneginden birini seçer.
      Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
      And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
      Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
      Then Kullanici "<Ssn>"girilmelidir.
      Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
      Then Kullanici "<Password>" kutusuna sekiz karakterden kucuk bir sifre girer.
      And Kullanici Submit butonunu tiklar.
      And Kullanici password icin eksik karakter girdigini dogrular.
      And Kullanici sayfayi kapatir.

      Examples:
        | Name            | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name       | Password |
        | Vera            | Yilmaz  | Istanbul    | 10.09.1999    | 555-444-2127 | 545-56-8789 | Afra123         |aAfra12   |


    @US06 @TC04
<<<<<<< Updated upstream
    Scenario Outline:TC04 Negatif TEST; Password büyük harf, küçük harf ve bir rakam içermelidir.
=======
    Scenario : TC04 Negatif TEST "Password büyük harf, küçük harf ve bir rakam içermelidir".
>>>>>>> Stashed changes
      Given Kullanici anasayfaya gider.
      Then Kullanici Dean hesabi ile Sing in yapar.
      Then Kullanici "<Name>" alanina gecerli bir ad girer.
      Then Kullanici "<Surname>" alanina gecerli bir surname girer.
      Then Kullanici "<Birth Place>" alanina gecerli bir değer girer.
      Then Kullanici Gender seçeneginden birini seçer.
      Then Kullanici "<Date Of Birth>" kutusuna geçerli bir doğum tarihi girer.
      And Kullanici Date Of Birth kutusunun bos olamdigini test eder.
      Then Kullanici "<Phone>" kutusuna gecerli bir telefon numarasi girer.
      Then Kullanici "<Ssn>" kutusuna gecerli bir SSN girer.
      Then Kullanici "<User Name>" kutusuna gecerli bir User Name girer.
      Then Kullanici "<Password>" kutusuna Büyük harf kullanmadan sifre girer.
      And Kullanici One uppercase character yazisini gordugunu dogrular.
      And Kullanici Password kutusun siler.
      Then Kullanici "<Password1>" kutusuna Kücük harf kullanmadan sifre girer.
      And Kullanici One lowercase character yazisini gordugunu dogrular.
      And Kullanici Password kutusun siler.
      Then Kullanici "<Password2>" kutusuna rakam kullanmadan sifre girer.
      And Kullanici One number yazisini gordugunu dogrular.
      And Kullanici sayfayi kapatir.


      Examples:
        | Name            | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name       | Password | Password1 | Password2 |
        | Vera            | Yilmaz  | Istanbul    | 10.09.1999    |  555-444-212 | 545-56-8787 | oytun           | oytun123 | OYTUN123  | Oytunerbas|





