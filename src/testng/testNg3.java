package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testNg3 {
	WebDriver driver;
	
  @Test
  public void   verifygoogletitle() {
	  driver.get("https://www.google.com");
		
		String exp = "Google";
		
		String act = driver.getTitle();	
		
		Assert.assertEquals(act, exp);		
	
	  
	  
  }
  @Test
  public void redminetitle() {
	  driver.get("https://www.redmine.org/");
	  String exp1="Overview - Redmine";
	  String act1=driver.getTitle();
	  Assert.assertEquals(act1, exp1);
	  
	  
	  
  }
  @Test
  public void twitter() {
	  driver.get("https://twitter.com/");
	  
	  String expt="Explore - Twitter";
	  System.out.println("E: "+expt);
	  String actt=driver.getTitle();
	  System.out.println("A: "+actt);
	  Assert.assertEquals(actt, expt);
	
  }
  @Test
  public void   facebooktext() {
	  driver.get("https://www.facebook.com/");
	  String exp="Facebook helps you connect and share with the people in your life.";
	  String act=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText();
	  Assert.assertEquals(act, exp);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dshan\\\\OneDrive\\\\Documents\\\\Lib\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
