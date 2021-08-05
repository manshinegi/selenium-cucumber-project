Feature:  User creates a individual account

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


#  @SmokeTest
  Scenario: User should be able to create an individual account
    Given User is on select Account type page
    When User select individual account type
    And clicks on next button
    Then reminder page is populated
    And clicks on next button
    Then user detail page is populated
    When User enter its detail
    And clicks on next button
    Then User date of birth page is populated
    When user enters its DOB
    And clicks on next button
    Then User's Address page is Populated
    When User chosse entering address manually
    When User enters address detail
    And clicks on next button
    Then Id type for verification is populated
    When click on licence id option
    And clicks on next button
    Then User licence detail page is populated
    When User choose state and enters licence id no
    And clicks on next button
    Then take your photo of your id page is populated
    When user attach its id photo
    And clicks on next button
    Then enter your tax file number page is populated
    When user enters TFN
    And clicks on next button
    Then tax obligation outside australia page is populated
    When user chooses No option
    And clicks on next button
    Then politicaly exposed page is populated
    When user clicks on No
    When clicks on next button
    Then verify your detail page is populated
    When user clicks on confirm checkbox
    When user clicks on verify button
    When user details do not pass verification then user Recheck its details
    Then verify your detail page is populated
    When user clicks on verify button
    Then unverified page is populated
    When user clicks on skip
    Then choose term page is populated
    When user chooses three month
    And clicks on next button
    Then enter investment amount page is populated
    When user enter amount
    And clicks on next button
    Then do you have bonus code page is populated
    Then user bank account detail page is populated
    When user enter its bank detail
    And clicks on next button
    Then user account is created and user lands on dashboard





#    When clicks on next button
#    Then Dob page is populated
#    When User enters Dob
#    When clicks on next button


