package persistent.wordpressautomation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import persistent.wordpressautomation.PageObjects.Dashboard;
import persistent.wordpressautomation.PageObjects.EditPost;
import persistent.wordpressautomation.PageObjects.Login;
import persistent.wordpressautomation.PageObjects.Post;
import persistent.wordpressautomation.PageObjects.ViewPost;

public class PageObject_TC {
  
	WebDriver driver;
	Login login;
	Dashboard dash;
	Post post;
	EditPost editpost;
	ViewPost viewpost;
	
	private static Logger log = Logger.getLogger(PageObject_TC.class);
	
@Test
  public void TestCase1() {
	// Appender
	DOMConfigurator.configureAndWatch("log4j.xml");
	
	log.info("Starting Logging");
	
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("https://wordpress.com/wp-login.php");
//	login =new Login(driver);	  
	login=PageFactory.initElements(driver,Login.class);
	
	dash= login.login_sucess("pr.deshmukh1@gmail.com","%%#Boron5#%%");
	post=dash.click_New_Post();
	editpost=post.Addnew_Post("My Title Here","My Desc Here");
	viewpost= editpost.click_view_post();
	log.info("End of Logging");
	login = viewpost.Logout();
	
	
	
  }
}
