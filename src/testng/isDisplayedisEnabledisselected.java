package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


 
public class isDisplayedisEnabledisselected {
	private static final boolean facebook = false;
	WebDriver driver;
	
  @Test
  public void isDisplayed() {
	  driver.get("https://www.facebook.com/");
	  Boolean logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	 
	  if(logo==true)
	  {
		  System.out.println("facebook logo  is displayed ");
	  }
	  else
	  {
		  System.out.println("facebook logo  is not displayed");
	  }
  }
  
  @Test
  public void isEnabled() {
	  driver.get("https://www.facebook.com/");
	  Boolean login =driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
	  if (login==true)
	  {
		  System.out.println("login is enabled to enter username");
	  }
		
	  else
	  {
		  System.out.println("login is not enabled to enter username");
	  }
		  
  }
  @Test
  public void isSelected() {
	  driver.get("https://www.redmine.org/login");
	  driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	  Boolean checkbox=driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	  if (checkbox==true)
	  {
		  System.out.println("stay logged in is slected");
	  }
	  else
	  {
		  System.out.println("stay logged in  is not selected");
	  }
  }
  @Test
  public void isSelectedfac() {
	  driver.get("https://www.facebook.com/signup");
	  
	 Boolean dropdown=driver.findElement(By.xpath("//*[@id=\"day\"]")).isSelected();
	  if(dropdown==true)
	  {
		  System.out.println("dropdown is selected");
	  }
	  else
	  {
		  System.out.println("dropdown is not selected");
		  
	  }
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdiver.chrome.driver","C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
