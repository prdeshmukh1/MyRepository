package persistent.wordpressautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewPost extends Wp_Admin_Bar {
	
	WebDriver driver;

	
//	@FindBy(xpath="/html/body/div[1]/div[5]/div/ul[2]/li[2]/a/span")
//	WebElement username;	
//	@FindBy(how=How.XPATH,using="//*[text()='Sign Out']")
//	WebElement signout;
	
	public ViewPost(WebDriver driver)
	{
		this.driver=driver;
	}// ViewPost
	
	public Login Logout()
	{
		Actions act= new Actions(driver);
		
//		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/ul[2]/li[2]/a/span"));
		username.click();
		act.moveToElement(username).build().perform();
//		driver.findElement(By.xpath("//*[text()='Sign Out']")).click();
		signout.click();
		
//		return new Login(driver);
		return PageFactory.initElements(driver, Login.class);
		
	}// Logout

}
