Feature:  User creates a joint account

  Background: user registration
    Given user is on sign up page
    When User registers using email id
    And clicks on continue
    Then create password page is populated
    When User creates password
    And clicks on continue
    Then register mobile page is populated
    When user select country code and enters mobile no
    And clicks on continue
    Then verify mobile number page is populated
    When user enter otp
    And clicks on continue
    Then terms and condition page is populated
    When user accept terms and condition
    And clicks on continue
    Then select account type page is populated.


  Scenario: User should be able to create an individual account
    Given User is on select Account type page
    When User select on joint  account
    And clicks on next button
    Then reminder page is populated
    And clicks on next button
    Then no of individual page  is populated
    When user select no of individual
    And clicks on next button
    Then user fill individuals details
