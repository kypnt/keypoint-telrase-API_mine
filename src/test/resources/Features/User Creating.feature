  #candidate/client/partner create için register senaryosundan token getirme yolunu seçtik
  #bu yüzden Backround altına onkoşul olarak register senaryosunu koyduk. Register senaryosu için @service9001 anotation koyduk.
  #bu yüzden candidate create senaryosu için create classında ki methodumuzda post içine http://54.194.180.243:9002/api/ yani @service9002 yi elle ekledik.
@service9001
Feature: User Creating

  Background: Register
    Given Sending request with valid information

    #tüm create senaryoları ön koşul olarak register senaryosunu koşturmasını istedik
@candidate #candidate create
  Scenario: a user should be able to be a candidate
    Given user should be able to be "candidate"
@client #client create
  Scenario: a user should be able to be a client
    Given user should be able to be "client"
@partner #partner create
  Scenario: a user should be able to be a partner
    Given user should be able to be "partner"