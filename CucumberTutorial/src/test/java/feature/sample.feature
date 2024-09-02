Feature: Verfiying the Facebook Page

  @smoke
  Scenario: Verifying the Facebook Page Title and URL
    Then User gets Page Title and URL

  @sanity
  Scenario: Verifying the Facebook Page Links Count
    And User gets the Links Count

  @sanity
  Scenario: Verifying the Facebook Page Links
    And User gets all links text and attribute

  @regression
  Scenario Outline: Verifying the Facebook Page login with vaild data
    Then User enters the username as "<username>" and password as "<password>"
    And User clicks login button

    Examples: 
      | username           | password      |
      | admin@mail.com     | Admin@123     |
