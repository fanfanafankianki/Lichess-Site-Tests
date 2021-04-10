Feature: Features to test footer buttons redirections

  Background: user is on home page
    Given browser is open
    And user is on home page

  @Play1
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

  @Watch
  Scenario: Check Watch option redirection
    When user clicks on Watch
    Then user is navigated to the TV page
    And TV form is displayed

  @Watch
  Scenario: Check Watch -> Lichess TV option redirection
    When user hovers over Watch and clicks on Lichess TV
    Then user is navigated to the TV page
    And TV form is displayed

  @Watch
  Scenario: Check Watch -> Current Games option redirection
    When user hovers over Watch and clicks on Current Games
    Then user is navigated to the games page
    And TV games form is displayed

  @Watch
  Scenario: Check Watch -> Streamers option redirection
    When user hovers over Watch and clicks on Streamers
    Then user is navigated to the Streamer page
    And streamer form is displayed

  @Watch
  Scenario: Check Watch -> Broadcasts option redirection
    When user hovers over Watch and clicks on Broadcasts
    Then user is navigated to the Broadcasts page
    And broadcasts form is displayed

  @Watch
  Scenario: Check Watch -> Video option redirection
    When user hovers over Watch and clicks on Video
    Then user is navigated to the Video page
    And Video form is displayed

  @Community
  Scenario: Check Community option redirection
    When user clicks on Community
    Then user is navigated to the Player page
    And player form is displayed

  @Community
  Scenario: Check Community -> Players option redirection
    When user hovers over Community and clicks on Players
    Then user is navigated to the Player page
    And player form is displayed

  @Community
  Scenario: Check Community -> Team option redirection
    When user hovers over Community and clicks on Teams
    Then user is navigated to the Teams page
    And Teams form is displayed

  @Community
  Scenario: Check Community -> Forum option redirection
    When user hovers over Community and clicks on Forum
    Then user is navigated to the Forum page
    And Forum form is displayed

  @Tools
  Scenario: Check Tools redirection
    When user clicks on Tools
    Then user is navigated to the Analysis page
    And Analysis form is displayed

  @Tools
  Scenario: Check Tools -> Analysis Board option redirection
    When user hovers over Tools and clicks on Analysis Board
    Then user is navigated to the Analysis page
    And Analysis form is displayed

  @Tools
  Scenario: Check Tools -> Opening explorer option redirection
    When user hovers over Tools and clicks on Opening explorer
    Then user is navigated to the Analysis page
    And Analysis form is displayed

  @Tools
  Scenario: Check Tools -> Board editor option redirection
    When user hovers over Tools and clicks on Board editor
    Then user is navigated to the Editor page
    And Editor form is displayed

  @Tools
  Scenario: Check Tools -> Import game option redirection
    When user hovers over Tools and clicks on Import game
    Then user is navigated to the Import page
    And Import form is displayed

  @Tools
  Scenario: Check Tools -> Advanced search option redirection
    When user hovers over Tools and clicks on Advanced search
    Then user is navigated to the Search page
    And Search form is displayed

  @Search
  Scenario: Check Search icon -> Text input option redirection
    When user clicks on Search icon
    And Text input is displayed
    And user type valid username and clicks enter
    Then user is navigated to account page
    And account form is displayed
