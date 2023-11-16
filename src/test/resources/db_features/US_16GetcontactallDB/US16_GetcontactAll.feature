Feature: US016 Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
  Scenario:  Vice dean kullanici mesajlarini görür
    Given Vice dean icin database baglantisi kurulur
    And Mesaj eklemek icin post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir