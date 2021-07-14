# Lichess-Site-Tests-
Functional tests of lichess site made with Selenium, Java and Cucumber.

To run tests you will need:
1. Maven
2. Cucumber Java Plugin (such as "Cucumber Eclipse Plugin" which you can find in Eclipse IDE in Marketplace)

To run test you have to:
1. Open command prompt
2. Change directory to project
3. Run command "mvn test" - if you want to run all tests or command "mvn test -Dcucumber.filter.tags="@TAGNAME"
4. Available @TAGNAMES are =  @HomeMain, @Login, @Play, @Puzzles, @Learn, @Watch, @Community, @Tools, @Search.
