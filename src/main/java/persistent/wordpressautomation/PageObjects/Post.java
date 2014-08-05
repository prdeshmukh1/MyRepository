package persistent.wordpressautomation.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post {
	WebDriver driver;
	
	
	@FindBy(id="title")
	WebElement post_title;
	
	@FindBy(id="tinymce")
	WebElement desc_text;
	
	@FindBy(id="publish-button")
	WebElement btn_publish;
	
	
	public Post(WebDriver driver)
	{
		this.driver=driver;
		
	}// Post
	
	public EditPost Addnew_Post(String Title, String Desc)
	{
		 
		  
//		  WebElement post_title =driver.findElement(By.id("title"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Inside Addnew_Post");
		  post_title.click();
		  post_title.sendKeys(Title);
		  String Parenthandel= driver.getWindowHandle();
//		  WebElement frame=driver.findElement(By.id("edit-content_ifr"));
		  driver.switchTo().frame("edit-content_ifr");
//		  WebElement desc_text=driver.findElement(By.id("tinymce"));
		  desc_text.sendKeys(Desc);	  
		  driver.switchTo().window(Parenthandel);  
		  
//		  WebElement btn_publish=driver.findElement(By.id("publish-button"));
		  btn_publish.click();
//		return new Dashboard(driver);  	
		  return PageFactory.initElements(driver, EditPost.class);
		  
	}// Addnewpost

}
