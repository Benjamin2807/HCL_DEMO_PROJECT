Feature: Testing the Login feature

  Scenario: Testing Login feature with valid credentials
   
    Given Open the Browser and navigate to LeafTaps
    When Enter the Username
    And Enter the  Password
    Then Verify Login Successful
