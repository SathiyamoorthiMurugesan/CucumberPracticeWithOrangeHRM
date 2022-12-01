Feature: This feature is to test login functionality of OrangeHRM page

  @LoginWithValidCredentials
  Scenario: Validate OrangeHRM with valid credentials
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters username and password and clicks on login button
    Then user able to see home page of OrangeHRM

  @loginWithDifferentCredentials
  Scenario Outline: Validate OrangeHRM with different valid inputs
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters "<username>" and "<password>" and clicks on login button
    #When user enters "Admin1" and "admin123" and clicks on login button
    Then user able to see home page of OrangeHRM

    Examples: 
      | username | password |
      | Admin    | admin123 |
      
    @loginWithDifferentCredentialsWithoutUsingExamples
  Scenario: Validate OrangeHRM with different valid inputs
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters "Admin" and "admin123" and clicks on login button
    Then user able to see home page of OrangeHRM


  @loginWithInvalidCredentials
  Scenario Outline: Validate OrangeHRM with different valid inputs
    Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters "<username>" and "<password>" and clicks on login button
    Then validate user is not logged into Orange HRM

    Examples: 
      | username | password |
      | Admin1   | admin123 |
      | Admin    | admin    |
      | Admin    |  |
      |     | admin123 |

      
      @Required
      Scenario Outline: Validate required text is showing when username or password left blank
      Given user launches OrangeHRM page
    Then validate user is on login page
    When user enters "<username>" and "<password>" and clicks on login button
    Then validate user is able to see required text
     
     Examples: 
      | username | password |
      | Admin    |  |
      |     | admin123 |