Feature: Test Guru99 Application

  Scenario: Test on Register page guru99
    Given open the Guru99 url
    When enter the valid first name and last name and phone and email
    And enter the valid address and city and state and postal code and country
    And enter valid username and password and confpassword
    Then click on submit button
