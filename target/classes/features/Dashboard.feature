Feature: user can see dashboard

  Background: user should be logged in
    Given user is on sign up page
    When user clicks on login link
    Then login page is populated
    When user enter valid email id and vaild password
    And click on login button
    Then user should logged in

#  @SmokeTest
  Scenario:user should able to see correct data of its account on dashborad
    When  user is on dashboard
    Then user should be able to see its name and emailId

#  @SmokeTest
  Scenario:user should able to see its Earnr account summary
    When user click on navigation button
    Then user should be able to see account summary

#   @SmokeTest
  Scenario:user should able to be able to logout
    When user click on logout button
    Then user should be logged out

#  @SmokeTest
  Scenario:user should able to be see its profile
    When user click on profile button
    Then user should able to see its profile

#  @SmokeTest
  Scenario:user should able to see account detail
    When user click on account button
    Then user should able to see its account detail

#  @SmokeTest
  Scenario:user should able to see its Balance and returns of its different platform
    When user click on navigation button
    Then user should be able to its earnr balance and returns
    And should be able to see bank account returns
    And should be able to see stock returns
    And should be able to see lazy money returns


