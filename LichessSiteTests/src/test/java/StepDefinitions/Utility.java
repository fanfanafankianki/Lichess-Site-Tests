package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AccountPage;
import pages.AnalysisPage;
import pages.ArenaPage;
import pages.BroadcastPage;
import pages.ChessBasicsPage;
import pages.CoachesPage;
import pages.CoordinatesPage;
import pages.EditorPage;
import pages.ForumPage;
import pages.GamePage;
import pages.HomePage;
import pages.ImportPage;
import pages.LearnPage;
import pages.LoginPage;
import pages.PatronPage;
import pages.PlayerPage;
import pages.PracticePage;
import pages.PuzzlePage;
import pages.PuzzleRacePage;
import pages.PuzzleStormPage;
import pages.SearchPage;
import pages.SignupPage;
import pages.SimultaneousExhibitionsPage;
import pages.StreamersPage;
import pages.StudyPage;
import pages.SwagStorePage;
import pages.SwissTournamentsPage;
import pages.TeamsPage;
import pages.TrainingDailyPage;
import pages.TvGamesPage;
import pages.TvPage;
import pages.VideoPage;

//Class for dependency injection
public class Utility {
	
	public WebDriver driver;
	
	public AccountPage account;
	public AnalysisPage analysis;
	public ArenaPage arena;
	public BroadcastPage broadcast;
	public ChessBasicsPage chessbasics;
	public CoachesPage coaches;
	public CoordinatesPage coordinates;
	public EditorPage editor;
	public ForumPage forum;
	public GamePage game;
	public HomePage home;
	public ImportPage imppage;
	public LearnPage learn;
	public LoginPage login;
	public PatronPage patron;
	public PlayerPage player;
	public PracticePage practice;
	public PuzzlePage puzzle;
	public PuzzleRacePage puzzlerace;
	public PuzzleStormPage puzzlestorm;
	public SearchPage search;
	public SignupPage signup;
	public SimultaneousExhibitionsPage silumtaneousexhibitions;
	public StreamersPage streamers;
	public StudyPage study;
	public SwagStorePage swagstore;
	public SwissTournamentsPage swisstournaments;
	public TeamsPage teams;
	public TrainingDailyPage trainingdaily;
	public TvGamesPage tvgames;
	public TvPage tv;
	public VideoPage video;
	
	//Driver methods 
	public WebDriver getDriver() {
	       if (driver == null) {
	    	//Chromedriver path in system
	   		String projectPath = System.getProperty("user.dir");
	   		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Browser_Drivers/chromedriver.exe");
	   		System.out.println("Initializing driver");
	   		
	   		//WebDriverManager keeps chromedriver version up to date
	   		WebDriverManager.chromedriver().setup();
	   		
	   		// initialize the driver
	   		driver = new ChromeDriver(); 
	   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   		driver.manage().window().maximize();
	   		return driver;
	       }
		return driver;
	      }
	
	public void driverTeardown(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
	//Methods for page objects creation 

	public AccountPage getAccountPage() throws InterruptedException{
	      return (account == null) ? account = new AccountPage(driver) : account;
	      }
	
	public AnalysisPage getAnalysisPage() throws InterruptedException{
	      return (analysis == null) ? analysis = new AnalysisPage(driver) : analysis;
	      }
	
	public ArenaPage getArenaPage() throws InterruptedException{
	      return (arena == null) ? arena = new ArenaPage(driver) : arena;
	      }
	
	public BroadcastPage getBroadcastPage() throws InterruptedException{
	      return (broadcast == null) ? broadcast = new BroadcastPage(driver) : broadcast;
	      }
	
	public ChessBasicsPage getChessBasicsPage() throws InterruptedException{
	      return (chessbasics == null) ? chessbasics = new ChessBasicsPage(driver) : chessbasics;
	      }
	
	public CoachesPage getCoachesPage() throws InterruptedException{
	      return (coaches == null) ? coaches = new CoachesPage(driver) : coaches;
	      }
	
	public CoordinatesPage getCoordinatesPage() throws InterruptedException{
	      return (coordinates == null) ? coordinates = new CoordinatesPage(driver) : coordinates;
	      }
	
	public EditorPage getEditorPage() throws InterruptedException{
	      return (editor == null) ? editor = new EditorPage(driver) : editor;
	      }
	
	public ForumPage getForumPage() throws InterruptedException{
	      return (forum == null) ? forum = new ForumPage(driver) : forum;
	      }
	
	public GamePage getGamePage() throws InterruptedException{
	      return (game == null) ? game = new GamePage(driver) : game;
	      }
	
	public HomePage getHomePage() throws InterruptedException{
	      return (home == null) ? home = new HomePage(driver) : home;
	      }
	public ImportPage getImportPage() throws InterruptedException{
	      return (imppage == null) ? imppage = new ImportPage(driver) : imppage;
	      }
	
	public LearnPage getLearnPage() throws InterruptedException{
	      return (learn == null) ? learn = new LearnPage(driver) : learn;
	      }
	
	public LoginPage getLoginPage() throws InterruptedException{
	      return (login == null) ? login = new LoginPage(driver) : login;
	      }
	
	public PatronPage getPatronPage() throws InterruptedException{
	      return (patron == null) ? patron = new PatronPage(driver) : patron;
	      }
	
	public PlayerPage getPlayerPage() throws InterruptedException{
	      return (player == null) ? player = new PlayerPage(driver) : player;
	      }
	
	public PracticePage getPracticePage() throws InterruptedException{
	      return (practice == null) ? practice = new PracticePage(driver) : practice;
	      }
	
	public PuzzlePage getPuzzlePage() throws InterruptedException{
	      return (puzzle == null) ? puzzle = new PuzzlePage(driver) : puzzle;
	      }
	
	public PuzzleRacePage getPuzzleRacePage() throws InterruptedException{
	      return (puzzlerace == null) ? puzzlerace = new PuzzleRacePage(driver) : puzzlerace;
	      }
	
	public PuzzleStormPage getPuzzleStormPage() throws InterruptedException{
	      return (puzzlestorm == null) ? puzzlestorm = new PuzzleStormPage(driver) : puzzlestorm;
	      }
	
	public SearchPage getSearchPage() throws InterruptedException{
	      return (search == null) ? search = new SearchPage(driver) : search;
	      }
	
	public SignupPage getSignupPage() throws InterruptedException{
	      return (signup == null) ? signup = new SignupPage(driver) : signup;
	      }
	
	public SimultaneousExhibitionsPage getSilumtaneousExhibitionsPage() throws InterruptedException{
	      return (silumtaneousexhibitions == null) ? silumtaneousexhibitions = new SimultaneousExhibitionsPage(driver) : silumtaneousexhibitions;
	      }
	
	public StreamersPage getStreamersPage() throws InterruptedException{
	      return (streamers == null) ? streamers = new StreamersPage(driver) : streamers;
	      }
	
	public StudyPage getStudyPage() throws InterruptedException{
	      return (study == null) ? study = new StudyPage(driver) : study;
	      }
	
	public SwagStorePage getSwagStorePage() throws InterruptedException{
	      return (swagstore == null) ? swagstore = new SwagStorePage(driver) : swagstore;
	      }
	
	public SwissTournamentsPage getSwissTournamentsPage() throws InterruptedException{
	      return (swisstournaments == null) ? swisstournaments = new SwissTournamentsPage(driver) : swisstournaments;
	      }
	
	public TeamsPage getTeamsPage() throws InterruptedException{
	      return (teams == null) ? teams = new TeamsPage(driver) : teams;
	      }
	
	public TrainingDailyPage getTrainingDailyPage() throws InterruptedException{
	      return (trainingdaily == null) ? trainingdaily = new TrainingDailyPage(driver) : trainingdaily;
	      }
	
	public TvGamesPage getTvGamesPagePage() throws InterruptedException{
	      return (tvgames == null) ? tvgames = new TvGamesPage(driver) : tvgames;
	      }
	
	public TvPage getTvPage() throws InterruptedException{
	      return (tv == null) ? tv = new TvPage(driver) : tv;
	      }
	
	public VideoPage getVideoPage() throws InterruptedException{
	      return (video == null) ? video = new VideoPage(driver) : video;
	      }

	

}
