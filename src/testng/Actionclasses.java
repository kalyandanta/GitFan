package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actionclasses {
	WebDriver driver;
	
  @Test
  public void rightClick() throws InterruptedException {
	  driver.get("http://www.techlearn.in/");
	  Thread.sleep(3000);
	  Actions a = new Actions(driver);
	  a.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-200\"]/a"))).build().perform();
  }
  @Test
  public void dragAndDrop() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(3000);
	  Actions kk=new Actions(driver);
	  WebElement j=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement k=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  kk.dragAndDrop(j, k).build().perform();
	
  }
  @Test
  public void dobleClick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/double-click");
	  Actions j=new Actions(driver);
	  j.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	Thread.sleep(3000);
  }
	  
	  
	  @Test
	  public void mouseHover() throws InterruptedException {
		  driver.get("http://www.techlearn.in/");
		  Thread.sleep(5000);
		  
		  Actions j=new Actions(driver);
		  j.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-200\"]/a"))).build().perform();
		  j.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-381\"]/a"))).click().perform();
	 
	  }
	  @Test
	  public void actionKeyboard() throws InterruptedException {
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(2000);
		  Actions j=new Actions(driver);
		j.sendKeys(Keys.TAB).build().perform();
		
		  
		  
		  
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
