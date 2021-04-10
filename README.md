# Lichess-Site-Tests-
Test of lichess site made with Selenium, Java and Cucumber.

To run tests you will need:
1. Maven
2. Cucumber Java Plugin (such as "Cucumber Eclipse Plugin" which you can find in Eclipse IDE in Marketplace)

To run test you have to:
1. Open command prompt
2. Change directory to project
3. Run command "mvn test" - if you want to run all tests or command "mvn test -Dcucumber.filter.tags="@TAGNAME"
4. Available @TAGNAMES are = @Play, @Puzzles, @Learn, @Watch, @Community, @Tools, @Search, @HomeMain, @Login.

Project tree:.
│   .classpath
│   .gitignore
│   .project
│   pom.xml
│
├───.settings
│       org.eclipse.jdt.core.prefs
│       org.eclipse.m2e.core.prefs
│
├───HtmlReports
│       HtmlReport
│
├───src
    ├───main
    │   ├───java
    │   └───resources
    └───test
        ├───java
        │   ├───pages
        │   │       AccountPage.java
        │   │       AnalysisPage.java
        │   │       ArenaPage.java
        │   │       BasePage.java
        │   │       BroadcastPage.java
        │   │       ChessBasicsPage.java
        │   │       CoachesPage.java
        │   │       CoordinatesPage.java
        │   │       EditorPage.java
        │   │       ForumPage.java
        │   │       FriendGamePage.java
        │   │       GamePage.java
        │   │       HomePage.java
        │   │       ImportPage.java
        │   │       LearnPage.java
        │   │       LoginPage.java
        │   │       PatronPage.java
        │   │       PlayerPage.java
        │   │       PracticePage.java
        │   │       PuzzlePage.java
        │   │       PuzzleRacePage.java
        │   │       PuzzleStormPage.java
        │   │       SearchPage.java
        │   │       SignupPage.java
        │   │       SimultaneousExhibitionsPage.java
        │   │       StreamersPage.java
        │   │       StudyPage.java
        │   │       SwagStorePage.java
        │   │       SwissTournamentsPage.java
        │   │       TeamsPage.java
        │   │       TrainingDailyPage.java
        │   │       TvGamesPage.java
        │   │       TvPage.java
        │   │       VideoPage.java
        │   │
        │   ├───Runners
        │   │       TestHomePageFooter.java
        │   │       TestHomePageMain.java
        │   │       TestRunner_Login.java
        │   │
        │   └───StepDefinitions
        │       │   Utility.java
        │       │
        │       ├───FooterButtons
        │       │       Community_Forum.java
        │       │       Community_Players.java
        │       │       Community_Teams.java
        │       │       Home_CreateAGame.java
        │       │       Home_LeftBoard.java
        │       │       Home_Patron.java
        │       │       Home_PlayWithComputer.java
        │       │       Home_PlayWithFriend.java
        │       │       Home_RightBoard.java
        │       │       Home_SwagStore.java
        │       │       Learn_ChessBasics.java
        │       │       Learn_Coaches.java
        │       │       Learn_Coordinates.java
        │       │       Learn_Practice.java
        │       │       Learn_Study.java
        │       │       Play_ArenaLichess.java
        │       │       Play_CreateAGame.java
        │       │       Play_SimultaneousExhibitions.java
        │       │       Play_SwissTournaments.java
        │       │       Puzzles_Dashboard.java
        │       │       Puzzles_Puzzles.java
        │       │       Puzzles_Racer.java
        │       │       Puzzles_Storm.java
        │       │       Search_Input.java
        │       │       Tools_Analysis.java
        │       │       Tools_BoardEditor.java
        │       │       Tools_Import.java
        │       │       Tools_Search.java
        │       │       Watch_Broadcasts.java
        │       │       Watch_CurrentGames.java
        │       │       Watch_LichessTV.java
        │       │       Watch_Streamers.java
        │       │       Watch_Video.java
        │       │
        │       └───LoginStepDefinitions
        │               LoginStepsLichess.java
        │
        └───resources
            ├───Browser_Drivers
            │       chromedriver.exe
            │
            └───Cucumber Features
                    HomePageFooter.feature
                    HomePageMain.feature
                    loginLichess.feature
 
