Feature: Features to test Play button hovered

  Background: user is on home page
    Given browser is open
    And user is on home page

  Scenario: Check Play button hovered options redirections
    When user hovers over Play and clicks on Create a game
    And user choose black pieces
    Then game page is opened
    And game board is displayed
    
  Scenario: Check tournament button hovered options redirections
    When user hovers over Play and clicks on Arena tournaments
    Then user is navigated to the arena page
    And tournament section is displayed
    
    #When user hovers over Play and clicks on Swiss tournaments
    #Then user is navigated to the swiss tournaments page
    #And swiss tournament section is displayed
    #
    #When user hovers over Play and clicks on Simultaneous exhibitions
    #Then user is navigated to the simultaneous exhibitions page
    #And simultaneous exhibitions is displayed
