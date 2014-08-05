package persistent.wordpressautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import persistent.wordpressautomation.Page;

public class Wp_Admin_Bar extends Page{
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/ul[2]/li[2]/a/span")
	WebElement username;
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Sign Out']")
	WebElement signout;
	
	@FindBy(partialLinkText="New Post")
	WebElement newpost_link;
	
	
//	public Wp_Admin_Bar(WebDriver driver)
//	{
//		this.driver=driver;
//	}// Wp_Admin_Bar
	

}
