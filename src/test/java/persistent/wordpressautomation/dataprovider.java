package persistent.wordpressautomation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	
	
  @Test(dataProvider="moviedata")
  public void f(String moviename,String actor, String actress) {
	  
	  
	  System.out.println("Movie is: "+moviename+"Actor: "+actor+"Actress: "+actress);
  }
  
  
  @DataProvider
  public Object[][] moviedata()
  {
	  Object[][] movieList =new Object[2][3];
	  movieList[0][0]="Titanic";
	  movieList[0][1]="De";
	  movieList[0][2]="Kate";
	  
	  movieList[1][0]="Die Anotherday";
	  movieList[1][1]="james Bond";
	  movieList[1][2]="helly";
	  
	  
	return movieList;
	  
	  
  }
}
