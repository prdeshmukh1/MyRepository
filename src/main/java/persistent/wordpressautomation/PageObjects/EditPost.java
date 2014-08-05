package persistent.wordpressautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPost extends Wp_Admin_Bar{
	WebDriver driver;
	
	@FindBy(partialLinkText="View Post")
	WebElement view_post;
	
	public EditPost(WebDriver driver)
	{
		this.driver=driver;
	}// EditPost
	
	public ViewPost click_view_post()
	{
		view_post.click();
		return PageFactory.initElements(driver, ViewPost.class);
		
	}// click_view_post
	

}
