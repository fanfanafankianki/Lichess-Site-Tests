Feature: Features to test footer buttons redirections

  Background: user is on home page
    Given browser is open
    And user is on home page

  @Play
  Scenario: Check Play -> Create a game option redirection
    When user hovers over Play and clicks on Create a game
    And user choose black pieces
    Then game page is opened
    And game board is displayed

  @Play
  Scenario: Check Play -> Arena tournaments option redirection
    When user hovers over Play and clicks on Arena tournaments
    Then user is navigated to the arena page
    And tournament section is displayed

  @Play
  Scenario: Check Play -> Swiss tournaments option redirection
    When user hovers over Play and clicks on Swiss tournaments
    Then user is navigated to the swiss tournaments page
    And swiss tournament section is displayed

  @Play
  Scenario: Check Play -> Simultaneous exhibitions option redirection
    When user hovers over Play and clicks on Simultaneous exhibitions
    Then user is navigated to the simultaneous exhibitions page
    And simultaneous exhibitions is displayed

  @Puzzles
  Scenario: Check Puzzles option redirection
    When user clicks on Puzzles
    Then user is navigated to the Puzzles page
    And puzzle gameboard is displayed

  @Puzzles
  Scenario: Check Puzzles -> Puzzles option redirection
    When user hovers over Puzzles and clicks on Puzzles
    Then user is navigated to the Puzzles page
    And puzzle gameboard is displayed

  @Puzzles
  Scenario: Check Puzzles -> Puzzle dashboard option redirection
    When user hovers over Puzzles and clicks on Puzzle dashboard
    Then user is navigated to the register page
    And register form is displayed

  @Puzzles
  Scenario: Check Puzzles -> Puzzle storm option redirection
    When user hovers over Puzzles and clicks on Puzzle storm
    Then user is navigated to the Puzzle storm page
    And puzzle storm gameboard is displayed

  @Puzzles
  Scenario: Check Puzzles -> Puzzle races option redirection
    When user hovers over Puzzles and clicks on Puzzle races
    Then user is navigated to the Puzzle races page
    And puzzle racer form is displayed

  @Learn
  Scenario: Check Learn option redirection
    When user clicks on Learn
    Then user is navigated to the Practice page
    And practice form is displayed

  @Learn
  Scenario: Check Learn -> Chess basics option redirection
    When user hovers over Learn and clicks on Chess basics
    Then user is navigated to the Chess basics page
    And learn chess form is displayed

  @Learn
  Scenario: Check Learn -> Practice option redirection
    When user hovers over Learn and clicks on Practice
    Then user is navigated to the Practice page
    And practice form is displayed

  @Learn
  Scenario: Check Learn -> Coordinates option redirection
    When user hovers over Learn and clicks on Coordinates
    Then user is navigated to the Coordinates page
    And Coordinates board is displayed

  @Learn
  Scenario: Check Learn -> Study option redirection
    When user hovers over Learn and clicks on Study
    Then user is navigated to the Study page
    And study form is displayed

  @Learn
  Scenario: Check Learn -> Coaches option redirection
    When user hovers over Learn and clicks on Coaches
    Then user is navigated to the Coaches page
    And coaches form is displayed
