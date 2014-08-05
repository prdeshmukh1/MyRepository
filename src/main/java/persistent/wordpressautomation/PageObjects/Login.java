package persistent.wordpressautomation.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(id="user_login")
	WebElement uname;
	
	@FindBy(id="user_pass")
	WebElement password;
	
	@FindBy(id="wp-submit")
	WebElement signinbtn;
	
	
	 public Login(WebDriver driver)
	 {
		 this.driver=driver;		 
	 }
	 
	public Dashboard login_sucess(String username,String passwd)
	{
		
		// This method will be used to login
//		WebElement uname =driver.findElement(By.id("user_login"));
		uname.click();
		uname.sendKeys(username);
		 
//		WebElement password =driver.findElement(By.id("user_pass"));
		password.click();
		password.sendKeys(passwd);
		
//		WebElement signinbtn =driver.findElement(By.id("wp-submit"));
		signinbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
//		return new Dashboard(driver);
		return PageFactory.initElements(driver, Dashboard.class);
		
	}// login
	
	
	public void invalidlogin()
	{
		
	}// invalidlogin
	
	public void Forget_Password(String emailid)
	{
	
	}// Forget_Password

}
