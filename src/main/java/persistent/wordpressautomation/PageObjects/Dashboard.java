package persistent.wordpressautomation.PageObjects;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends Wp_Admin_Bar{
	
	WebDriver driver;
	
//	@FindBy(xpath="/html/body/div[1]/div[5]/div/ul[2]/li[2]/a/span")
//	WebElement username;
//	
//	
//	@FindBy(how=How.XPATH,using="//*[text()='Sign Out']")
//	WebElement signout;
//	
//	@FindBy(partialLinkText="New Post")
//	WebElement newpost_link;
//	

	public Dashboard(WebDriver driver)
	{
		
		this.driver=driver;
	}// Dashboard

	public Login Logout()
	{
		DOMConfigurator.configureAndWatch("log4j.xml");
		log.info("Inside Logout");
		
		Actions act= new Actions(driver);
		
//		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/ul[2]/li[2]/a/span"));
		username.click();
		act.moveToElement(username).build().perform();
//		driver.findElement(By.xpath("//*[text()='Sign Out']")).click();
		signout.click();
		
//		return new Login(driver);
		return PageFactory.initElements(driver, Login.class);
		
	}// Logout
	
	public Post click_New_Post()
	{
//		WebElement newpost_link =driver.findElement(By.partialLinkText("New Post"));
		System.out.println("Inside click_New_Post");
		newpost_link.click();
//		return new Post(driver);
		return PageFactory.initElements(driver, Post.class);
		
	}

}
