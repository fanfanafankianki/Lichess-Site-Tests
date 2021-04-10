Feature: Features to test Home Page main contents redirections 

  Background: user is on home page
    Given browser is open
    And user is on home page

  @HomeMain
  Scenario: Check Create a game -> Choose black option redirection
    When user clicks create a game button
    And user choose black pieces
    Then game page is opened
    And game board is displayed

  @HomeMain
    Scenario: Check Play with friend -> Choose black option redirection
    When user clicks Play with friend button
    And user choose black pieces in play with friend form
    Then friend game page is opened
    And friend game invite form is displayed

  @HomeMain
    Scenario: Check Play with the computer -> Choose black option redirection
    When user clicks Play with computer button
    And user choose black pieces in play with computer form
    Then game page is opened
    And game board is displayed
    
  @HomeMain
    Scenario: Check leftside gameboard redirection
    When user clicks on left gameboard
    Then user is navigated to the TV page
    And TV form is displayed
    
  @HomeMain
    Scenario: Check Donate option redirection
    When user scroll donate button into view
    And user clicks on donate button
    Then user is navigated to the patron page
    And patron form is displayed
    
  @HomeMain
    Scenario: Check Swag Store option redirection
    When user scroll Swag Store button into view
    And user clicks on Swag Store button
    Then user is navigated to the Swag Store page
    And Swag Store form is displayed
    
    
