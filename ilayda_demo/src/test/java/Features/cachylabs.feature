Feature:  CatchyLabs


  @Login;
  Scenario: Login to catchylabs
    Given User goes to catchylabs login page
    When Write username
    When Write password
    When Click Login
    Then Check the homepage

  @Login-with-invalid-username;
  Scenario: Login to catchylabs
    Given User goes to catchylabs login page
    When Write invalid username
    When Write password
    When Click Login
    Then Check the error message


  @Login-with-invalid-password;
  Scenario: Login to catchylabs
    Given User goes to catchylabs login page
    When Write username
    When Write invalid password
    When Click Login
    Then Check the error message












