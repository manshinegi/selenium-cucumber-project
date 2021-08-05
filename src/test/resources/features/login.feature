Feature:  login functionality
  Background: user lands on login page
    Given user is on sign up page
    When user clicks on login link
    Then login page is populated

  @SmokeTest
  Scenario: User should be able to login with valid credentials
    When user enter valid email id and vaild password
    And click on login button
    Then user should logged in

  @SmokeTest
    Scenario: User should not be able to login with invalid credentials
      When user enter invalid email id or invalid password
      And click on login button
      Then error msg flashes

