Feature: US016 Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
  Scenario:  Vice dean kullanici mesajlarini görür
    Given Vice dean icin database baglantisi kurulur
    Then mesajları görebilmek için query gonderlir
    And Mesajlar için gelen bilgiler doğrulanır
    Then Database baglantisi kesilir
