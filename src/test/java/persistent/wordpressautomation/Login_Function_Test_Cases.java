package persistent.wordpressautomation;

import org.testng.annotations.Test;

public class Login_Function_Test_Cases {
  	// dependsOnMethods="Verify_Invalid_Login",
	@Test(groups="functest")
	public void Verify_Login_Sucessful() 
	{
		System.out.println("Inside Verify_Login_Sucessful ");
	}
	
	@Test
	public void Verify_Invalid_Login() 
	{
		System.out.println("Inside Verify_Invalid_Login ");
	}
	
	@Test
	public void Verify_Forgot_Password() 
	{
		System.out.println("Inside Verify_Forgot_Password ");
	}
	
}
