package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test1 {
	WebDriver driver;
	
  @Test
  public void google() {
		driver.get("https://www.google.com");
	  
  }
  @Test
  public void twitter() {
	  driver.get("https://twitter.com/");
	  
  }
	  @Test
	  public void gmail() {
		  driver.get("https://www.gmail.com/");
		  
	  }
		  @Test
		  public void facebook() {
			  driver.get("https://www.facebook.com/");
		  }	  
		  @Test
		  public void flipkart() {
			  driver.get("https://www.flipkart.com/");
		  }
		  @Test
		  public void myntra() {
			  driver.get("https://www.myntra.com/");
		  }
 
  
  
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
