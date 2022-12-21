package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.AfterTest;

public class scrollupdown {
	WebDriver driver;
	
 @Test 
  public void srolldown() {
	  driver.get("https://www.selenium.dev/");
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,1000)");
	
  }
 @Test 
 public void srollup() {
	 driver.get("https://www.selenium.dev/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scroll(1000,0)");

}
 @Test 
 public void selectWebElement() {
	 driver.get("https://www.selenium.dev/projects/");
	 WebElement element = (WebElement)driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div[1]/p[4]"));
	 Coordinates coordinates = ((Locatable)element).getCoordinates();
	 coordinates.onPage();
	 coordinates.inViewPort();
	 
	 
	 
	 
	 
	 
 }
@BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
