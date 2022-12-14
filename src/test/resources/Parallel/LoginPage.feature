Feature: OrangeHRM page

  @login1
  Scenario: Validate OrangeHRM
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM


      